
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*
    🟠 Write a test that performs the following steps:
    1️⃣ Go to https://opensource-demo.orangehrmlive.com/
    2️⃣ In the field 'Username' enter: Admin
    3️⃣ In the 'Password' field enter: admin123
    4️⃣ Click the Login button
    5️⃣ Make sure the user has logged in
*/

public class OrangeHRMTest {

    WebDriver driver;

    @BeforeEach
    public void init() {

        System.out.println("Executing method init();");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @Test
    public void successfulLoginTest() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(3000);

        WebElement usernameField = driver.findElement(By.cssSelector("input[data-v-1f99f73c][name='username']"));
//        WebElement usernameField = driver.findElement(By.xpath("//input[@data-v-1f99f73c and @name='username']"));
        usernameField.sendKeys("Admin");

        Thread.sleep(3000);

        WebElement passwordField = driver.findElement(By.cssSelector("input[data-v-1f99f73c][name='password']"));
//        WebElement passwordField = driver.findElement(By.xpath("//input[@data-v-1f99f73c and @name='password']"));
        passwordField.sendKeys("admin123");

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.cssSelector("button[data-v-10d463b7][data-v-0af708be].orangehrm-login-button"));
//        WebElement loginButton = driver.findElement(By.xpath("//button[@data-v-10d463b7 and @data-v-0af708be and contains(@class, 'orangehrm-login-button')]"));
        loginButton.click();

        Assertions.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
                driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {

        System.out.println("Executing method tearDown();");
        driver.close();
    }
}
