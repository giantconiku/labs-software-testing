import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import java.util.List;

public class DemoQAPractiseFormTest {

    @Test
    public void fillOutTheForm() {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("Gjigand");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Çoniku");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("gigaconiku@mail.com");

        WebElement genderRadioLabel = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        genderRadioLabel.click();

        WebElement mobileNumberInput = driver.findElement(By.id("userNumber"));
        mobileNumberInput.sendKeys("0691234567");

        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();

        Select dateOfBirthMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        dateOfBirthMonth.selectByValue("10");

        Select dateOfBirthYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        dateOfBirthYear.selectByVisibleText("2015");

        WebElement dateOfBirthDay = driver.findElement(By.cssSelector("div[class*='021']"));
        dateOfBirthDay.click();

        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("co");
        subjectsInput.sendKeys(Keys.ENTER);

        subjectsInput.sendKeys("ar");
        subjectsInput.sendKeys(Keys.ENTER);

        List<WebElement> hobbiesRadioButtons = driver.findElements(By.cssSelector("label[for^='hobbies-checkbox']"));
        for (WebElement hobbiesRadioButton : hobbiesRadioButtons) {
            hobbiesRadioButton.click();
        }

        WebElement currentAddressTextArea = driver.findElement(By.id("currentAddress"));
        currentAddressTextArea.sendKeys("Everywhere");

        WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
        stateInput.sendKeys("n");
        stateInput.sendKeys(Keys.ENTER);

        WebElement cityInput = driver.findElement(By.id("react-select-4-input"));
        cityInput.sendKeys("g");
        cityInput.sendKeys(Keys.ENTER);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement confirmationDiv = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assertions.assertEquals("Thanks for submitting the form", confirmationDiv.getText());

        driver.close();
    }
}
