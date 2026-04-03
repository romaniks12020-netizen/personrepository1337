import com.github.javafaker.Faker;
import groovyjarjarantlr4.v4.codegen.model.ThrowEarlyExitException;
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
        Faker faker = new Faker();

        pageLogin.field(faker.name().firstName());
        pageLogin.field1(faker.name().lastName());
        pageLogin.field2(faker.internet().emailAddress());
        pageLogin.gender();
        pageLogin.phoneNum(faker.phoneNumber().phoneNumber());
        pageLogin.dateButtonChoice();
        Thread.sleep(2222);
        pageLogin.dateChoice(faker.date().birthday());
        Thread.sleep(5555);

        pageLogin.hobbieHim();
        Thread.sleep(1000);
        //pageLogin.pictureHim();
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
