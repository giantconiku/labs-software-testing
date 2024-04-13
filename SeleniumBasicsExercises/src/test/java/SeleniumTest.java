import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
    🟠 Doing things with Selenium :)
*/

public class SeleniumTest {

    WebDriver driver;

    @BeforeEach
    public void init() {

        System.out.println("Executing method init();");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @Test
    public void firstSeleniumTest() throws InterruptedException {

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);

        Assertions.assertEquals("Google", currentTitle);

        System.out.println(driver.getCurrentUrl());

        Assertions.assertEquals("https://www.google.com/", driver.getCurrentUrl());

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.navigate().to("https://mvnrepository.com/");
    }

    @AfterEach
    public void tearDown() {

        System.out.println("Executing method tearDown();");
        driver.close();
    }
}
