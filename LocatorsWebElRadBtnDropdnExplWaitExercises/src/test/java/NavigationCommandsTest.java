import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsTest {

    @Test
    public void navigate() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.navigate().to("http://qatechhub.com");
        matches(driver.getTitle());

        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com/");
        System.out.println("Current page URL: " + driver.getCurrentUrl());

        Thread.sleep(3000);

        driver.navigate().back();
        System.out.println("Current page URL: " + driver.getCurrentUrl());

        Thread.sleep(3000);

        driver.navigate().forward();
        System.out.println("Current page URL: " + driver.getCurrentUrl());

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.quit();
    }

    public static void matches(String title) {
        if(title.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub"))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}
