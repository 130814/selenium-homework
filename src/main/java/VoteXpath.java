import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VoteXpath {
    protected static WebDriver driver;

    public static void main(String[] args) {


        // get browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //to open Browser
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.id("pollanswers-2")).click();
        driver.findElement(By.xpath("//button[@id='vote-poll-1']")).click();
        String a = driver.findElement(By.xpath("//div[@class='poll-vote-error']")).getText();
        System.out.println(a);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div"));
        String b = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[6]/div[2]/div[2]")).getText();
        System.out.println(b);

    }
}
