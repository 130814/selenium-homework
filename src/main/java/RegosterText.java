import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegosterText {

    protected static WebDriver driver;

    public static void main(String[] args) {

        // get browser
        driver = new ChromeDriver();
        //to open Browser
        driver.get("https://demo.nopcommerce.com/");
    }
}