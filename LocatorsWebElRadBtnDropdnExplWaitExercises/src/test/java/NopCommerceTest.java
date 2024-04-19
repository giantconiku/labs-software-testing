import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NopCommerceTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void init() {

        System.out.println("Executing method init();");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void successfulTest() throws InterruptedException {

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement loginMenu = driver.findElement(By.xpath("//a[@href='/login?returnUrl=%2F']"));
        loginMenu.click();

        WebElement registerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("register-button")));
        registerButton.click();

        System.out.println("The title of the page is: " + wait.until(ExpectedConditions.titleIs("nopCommerce demo store. Register")));

        WebElement genderRadioButton = driver.findElement(By.id("gender"));
        genderRadioButton.click();

        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
        firstNameInput.sendKeys("Gjigand");

        WebElement lastNameInput = driver.findElement(By.id("LastName"));
        lastNameInput.sendKeys("Çoniku");

        Select dateOfBirthDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dateOfBirthDay.selectByValue("21");

        Select dateOfBirthMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        dateOfBirthMonth.selectByValue("11");

        Select dateOfBirthYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        dateOfBirthYear.selectByValue("2015");

        WebElement emailInput = driver.findElement(By.id("Email"));
        emailInput.sendKeys("gigaconiku@mail.com");

        WebElement companyInput = driver.findElement(By.id("Company"));
        companyInput.sendKeys("Lufthansa");

        WebElement passwordInput = driver.findElement(By.id("Password"));
        passwordInput.sendKeys("g1G@Gi@nt");

        WebElement confirmPasswordInput = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordInput.sendKeys("g1G@Gi@nt");

        WebElement formRegisterButton = driver.findElement(By.id("register-button"));
        formRegisterButton.click();

        WebElement registrationSuccessDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result")));
        Assertions.assertEquals("Your registration completed", registrationSuccessDiv.getText());

        WebElement loginMenuAfterRegistration = driver.findElement(By.className("ico-login"));
        loginMenuAfterRegistration.click();

        WebElement loginEmailInput = driver.findElement(By.id("Email"));
        loginEmailInput.sendKeys("gigaconiku@mail.com");

        WebElement loginPasswordInput = driver.findElement(By.id("Password"));
        loginPasswordInput.sendKeys("g1G@Gi@nt");

        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();

        WebElement welcomeHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".topic-block-title>h2")));
        WebElement logoutMenu = driver.findElement(By.className("ico-logout"));
        Assertions.assertTrue(welcomeHeader.getText().equals("Welcome to our store") && logoutMenu.isDisplayed());

        logoutMenu.click();
    }

    @AfterEach
    public void tearDown() {

        System.out.println("Executing method tearDown();");
        driver.close();
    }
}
