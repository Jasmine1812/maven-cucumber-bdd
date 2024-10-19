package cucumberOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import pages.commons.GlobalConstants;

public class Hooks {
    // Run for many thread
    private static WebDriver driver;
//    private static final Logger log = Logger.getLogger(Hooks.class.getName());

    @Before // synchronized = handle đồng bộ
    public synchronized static WebDriver openAndQuitBrowser() {
        // Run by Maven command line
        String browser = System.getProperty("BROWSkER");
        System.out.println("Browser name run by command line = " + browser);

        // Check driver đã được khởi tạo hay chưa?
        if (driver == null) {

            // Happy path case
            try {
                // Kiem tra BROWSER = null -> gan = chrome/ firefox (browser default for project)
                if (browser == null) {
                    // Get browser name from Environment Variable in OS
                    browser = System.getenv("BROWSER");
                    if (browser == null) {
                        // Set default browser
                        browser = "chrome";
                    }
                }

                switch (browser) {
                    case "chrome":
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        driver = new FirefoxDriver();
                        break;
                    case "edge":
                        driver = new EdgeDriver();
                        break;
                    default:
                        driver = new ChromeDriver();
                        break;
                }
                // Browser crash/ stop
            } catch (UnreachableBrowserException e) {
                driver = new ChromeDriver();
                // Driver crash
            } catch (WebDriverException e) {
                driver = new ChromeDriver();
            }
            // Code này luôn luôn được chạy dù pass hay fail
            finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }

            driver.get(GlobalConstants.URL);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public static void close() {
        try {
            if (driver != null) {
                openAndQuitBrowser().quit();
            }
        } catch (UnreachableBrowserException e) {
            System.out.println("Can not close the browser");
        }
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            close();
        }
    }

}
