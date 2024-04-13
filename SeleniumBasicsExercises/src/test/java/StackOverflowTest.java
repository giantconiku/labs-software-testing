import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
    🟠 Write a script so that it displays https://stackoverflow.com/
    page title in the console.

    🟡 Modify the test above to check that the StackOverflow page has the title:
    Stack Overflow - Where Developers Learn, Share, & Build Careers.
*/

public class StackOverflowTest {

    WebDriver driver;

    @BeforeEach
    public void init() {

        System.out.println("Executing method init();");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @Test
    public void pageTitleDisplayed() {

        driver.get("https://stackoverflow.com/");
        System.out.println(driver.getTitle());
        Assertions.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers",
                driver.getTitle());
    }

    @AfterEach
    public void tearDown() {

        System.out.println("Executing method tearDown();");
        driver.close();
    }
}
