package com.appium.reto;

import bean.SearchBean;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search extends AppiumConnection {

    public void searching(SearchBean searchBean) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("co.com.fincaraiz.app:id/btnSearch")));

        MobileElement optionVenta = (MobileElement) driver.findElementById("co.com.fincaraiz.app:id/btnVenta");
        optionVenta.click();

        MobileElement categoryElement = (MobileElement) driver.findElementById("co.com.fincaraiz.app:id/txtCategories");
        categoryElement.sendKeys(searchBean.getCategory());

        MobileElement placeElement = (MobileElement) driver.findElementById("co.com.fincaraiz.app:id/txtPlace");
        placeElement.sendKeys(searchBean.getPlace());

        MobileElement buttonSearch = (MobileElement) driver.findElementById("co.com.fincaraiz.app:id/btnSearch");
        buttonSearch.click();
    }

    public boolean getSearchResult(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait. until(ExpectedConditions.visibilityOfElementLocated(By.id("co.com.fincaraiz.app:id/lyMenuBarOrder")));

        MobileElement buttonDrawer =(MobileElement) driver.findElementById("co.com.fincaraiz.app:id/btnDrawer");
        return buttonDrawer.isDisplayed();
    }

}