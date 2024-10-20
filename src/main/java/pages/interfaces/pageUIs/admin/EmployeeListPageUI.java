package pages.interfaces.pageUIs.admin;

public class EmployeeListPageUI {

    public static final String ADD_EMPLOYEE_LINK = "xpath=//a[text()='Add Employee']";
    public static final String EMPLOYEE_ID = "xpath=//label[text()='Employee Id']/parent::div//following-sibling::div/input";
    public static final String EMPLOYEE_NAME = "xpath=//label[text()='Employee Name']/parent::div//following-sibling::div//input";
    public static final String SEARCH_BUTTON = "xpath=//button[contains(string(),'Search')]";
    public static final String NO_RECORDS_MESSAGE = "xpath=//div[contains(@class,'orangehrm-vertical-padding')]";
    public static final String TOTAL_RECORD = "xpath=//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span";

}
