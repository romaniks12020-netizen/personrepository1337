import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.Date;

public class PageLogin {
    By textboxLogin = By.xpath("//input [@placeholder='Имя']");
    By textboxLogin1 = By.xpath("//input [@placeholder='Фамилия']");
    By textboxLogin2 = By.xpath("//input [@placeholder='name@example.com']");
    By gender = By.xpath("//*[@id=\"gender-male\"]");
    By phone = By.xpath("//input[@id='mobile']");
    By date = By.xpath("//button[@type='button' and contains(@class, 'inline-flex') and contains(@class, 'justify-start')]");
    By date1 = By.xpath("//button[not(contains(@class, 'opacity-50')) and not(@disabled) and normalize-space()!='']");
    By hobbie = By.xpath("//*[@id=\"hobby-sports\"]");
    /*By picture = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div[2]/form/div[7]/div/div/button");*/
    By textboxLogin3 = By.xpath("//*[@id=\"currentAddress\"]");
    By state = By.xpath("//*[@id=\"state\"]");
    By city = By.xpath("//*[@id=\"city\"]");
    By last = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div[2]/form/button");
    WebDriver webDriver;
    public PageLogin(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void field (String text){
        WebElement driver = webDriver.findElement(textboxLogin);
        driver.sendKeys(text);
    }
    public void field1 (String text1){
        WebElement driver = webDriver.findElement(textboxLogin1);
        driver.sendKeys(text1);
    }
    public void field2(String text2){
        WebElement driver = webDriver.findElement(textboxLogin2);
        driver.sendKeys(text2);
    }
    public void gender (){
        WebElement driver = webDriver.findElement(gender);
        driver.click();
    }
    public void phoneNum (String text2){
        WebElement driver = webDriver.findElement(phone);
        driver.sendKeys(text2);
    }
    public void dateButtonChoice (){
        WebElement driver = webDriver.findElement(date);
        driver.click();
    }
    public void dateChoice (Date date) {
        WebElement driver = webDriver.findElement(date1);
        driver.sendKeys(date.toString());
    }
    public void hobbieHim(){
        WebElement driver = webDriver.findElement(hobbie);
        driver.click();
    }
    /*public  void pictureHim(){
        WebElement driver = webDriver.findElement(picture);
        driver.click();
        String path = new File("src/test/resources/image1.png").getAbsolutePath();
        driver.sendKeys(path);
    }*/
    public void field3 (String text3){
        WebElement driver = webDriver.findElement(textboxLogin3);
        driver.sendKeys(text3);
    }
    public void stateHim (String text4){
        WebElement driver = webDriver.findElement(state);
        driver.sendKeys(text4);
    }
    public void cityHim(String text5) {
        WebElement driver = webDriver.findElement(city);
        driver.sendKeys(text5);
    }
    public void button (){
        WebElement driver = webDriver.findElement(last);
        driver.click();
    }


}
