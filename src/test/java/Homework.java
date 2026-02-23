import net.bytebuddy.implementation.bytecode.Throw;
import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class Homework {

    WebDriver webDriver;
    PageLogin pageLogin;

    @BeforeEach
    void setup() {
        webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.ru/qa-auto/forms");

        pageLogin = new PageLogin(webDriver);
    }

    @Test

    void loginTest() throws InterruptedException {

        pageLogin.field("Олег");
        Thread.sleep(1500);
        pageLogin.field1("Геев");
        Thread.sleep(1500);
        pageLogin.field2("gay@gmail.com");
        Thread.sleep(1500);
        pageLogin.gender();
        Thread.sleep(1000);
        pageLogin.phoneNum("79027070105");
        Thread.sleep(1500);
        pageLogin.dateHim();
        Thread.sleep(1000);
        pageLogin.dateHim1();
        Thread.sleep(2000);
        pageLogin.hobbieHim();
        Thread.sleep(1000);
        /*pageLogin.pictureHim();*/
        Thread.sleep(1000);
        pageLogin.field3("Улица ебаната тупого д.3");
        Thread.sleep(1500);
        pageLogin.stateHim("Гейская область");
        Thread.sleep(1000);
        pageLogin.cityHim("Гей");
        Thread.sleep(2000);
        pageLogin.button();
        System.out.println("апдзцудп");
    }
    @AfterEach
    void tearDown() {
        webDriver.quit();
    }

}
