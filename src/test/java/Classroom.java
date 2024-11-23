import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Classroom {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");


            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");


            driver = new ChromeDriver(options);


            driver.get("https://www.google.com");


            System.out.println("Page title is: " + driver.getTitle());


        } catch (Exception e) {
            System.err.println("Test failed: " + e.getMessage());
            e.printStackTrace();
        } finally {

            if (driver != null) {
                driver.quit();
            }
        }
    }
}git
