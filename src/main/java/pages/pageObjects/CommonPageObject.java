package pages.pageObjects;

import org.openqa.selenium.WebDriver;
import pages.commons.BaseActions;
import pages.commons.BasePage;
import pages.interfaces.pageUIs.admin.CommonPageUI;
import pages.interfaces.pageUIs.admin.PersonalDetailsPageUI;

public class CommonPageObject  extends BaseActions {
    private WebDriver driver;
    public CommonPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterToDynamicTextboxByName(String fieldName, String valueToSend){
        waitForElementVisible(CommonPageUI.TEXTBOX_DYNAMIC_BY_NAME, fieldName);
        sendKeyToElement(CommonPageUI.TEXTBOX_DYNAMIC_BY_NAME,valueToSend,fieldName);
    }
    public void enterToDynamicTextboxByLabel(String fieldName, String valueToSend){
        waitForElementVisible(CommonPageUI.TEXTBOX_DYNAMIC_BY_LABEL, fieldName);
        sendKeyToElement(CommonPageUI.TEXTBOX_DYNAMIC_BY_LABEL,valueToSend,fieldName);
    }

    public void enterToDynamicDatePicker(String fieldName, String valueToSend) {
        waitForElementVisible(CommonPageUI.DATE_DYNAMIC_BY_LABEL,fieldName);
        sendKeyToElement(CommonPageUI.DATE_DYNAMIC_BY_LABEL,valueToSend, fieldName);
    }

    public void selectToDynamicDropdown(String fieldName, String valueToSend) {
        selectItemInCustomDropdown(CommonPageUI.DROPDOWN_PARENT_DYNAMIC_BY_LABEL, CommonPageUI.DROPDOWN_CHILD_DYNAMIC_BY_LABEL, valueToSend, fieldName);
    }

    public String getDynamicDropdownSelectedText(String fieldName) {
        return getElementText(CommonPageUI.DROPDOWN_SELECT_DYNAMIC_BY_LABEL, fieldName);
    }

}