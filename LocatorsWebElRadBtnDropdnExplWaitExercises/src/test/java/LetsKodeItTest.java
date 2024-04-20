import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LetsKodeItTest {

    @Test
    public void find() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement letsKodeItPracticeLink = driver.findElement(By.linkText("https://www.letskodeit.com/practice"));
        letsKodeItPracticeLink.click();

        Thread.sleep(2000);

        WebElement pythonProgrammingLangCoursePriceTd = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[@class='price']"));
        System.out.println("Price of Python Programming Language Course: " + pythonProgrammingLangCoursePriceTd.getText());

        Thread.sleep(2000);

        WebElement courseThatCosts25Td = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[4]/td[2]"));
        System.out.println("Course that costs 25: " + courseThatCosts25Td.getText());

        Thread.sleep(2000);

        driver.close();
    }
}
