package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    private static final Logger log = Logger.getLogger(AddCustomerPage.class);

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;

    public void clickOnAddCustomer() {
        log.info("Click on add customer " + addCustomer.toString());
        clickOnElement(addCustomer);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement addName;

    public void addFirstName(String name) {
        log.info("Add first name: " + addName.toString());
        sendTextToElement(addName, name);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement addLastName;

    public void setAddLastName(String lastName) {
        log.info("Add last name: " + addLastName.toString());
        sendTextToElement(addLastName, lastName);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement addpost;

    public void enterPostCode(String postCode) {
        log.info("Enter postcode: " + addpost.toString());
        sendTextToElement(addpost, postCode);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    public void clickOnAddCustomerButton() {
        log.info("Click on add customer " + addCustomer.toString());
        clickOnElement(addCustomer);
    }

    // verify the message in popup Alert
    public String verifyMessageInPopupWindow() {
        return getTextFromAlert();

    }

    //	popup display
    public void popupDisplay() {
        switchToAlert();
    }

    public void clickOnOkButtInPopup() {
        switchToAcceptAlert();
    }
}
