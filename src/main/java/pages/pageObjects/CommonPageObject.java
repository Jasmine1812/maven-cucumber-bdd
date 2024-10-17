package pages.pageObjects;

import org.openqa.selenium.WebDriver;
import pages.commons.BaseActions;
import pages.commons.BasePage;

public class CommonPageObject  extends BaseActions {
    private WebDriver driver;
    public CommonPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterToTextboxByID(String textboxID, String valueToSend){
        waitForElementVisible(BaseElementUI.TEXTBOX_DYNAMIC_BY_ID, textboxID);
        sendkeyToElement(BaseElementUI.TEXTBOX_DYNAMIC_BY_ID,valueToSend, textboxID);
    }
    public void clickToHeaderLinkByText(String headerLink){
        waitForElementClickable(BaseElementUI.HEADER_LINK_DYNAMIC_BY_TEXT, headerLink);
        clickToElement(BaseElementUI.HEADER_LINK_DYNAMIC_BY_TEXT,headerLink);
    }

    public void clickToButtonByText(String buttonText){
        waitForElementClickable(BaseElementUI.BUTTON_DYNAMIC_BY_TEXT, buttonText);
        clickToElement(BaseElementUI.BUTTON_DYNAMIC_BY_TEXT,buttonText);
    }

    public String getTextboxAttributeByID(String textboxID){
        waitForElementVisible(BaseElementUI.TEXTBOX_DYNAMIC_BY_ID, textboxID);
        return getElementAttribute(BaseElementUI.TEXTBOX_DYNAMIC_BY_ID,"value",textboxID);
    }
}