import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLImageElement;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class EmailXpathText {


    protected static WebDriver driver;
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open the browser
        driver.get("https:/demo.nopcommerce.com/");    //
        driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]")).click();
        //click on send email
        driver.findElement(By.xpath("//button[@class='button-2 email-a-friend-button']")).click();
        //type friend's email
        driver.findElement(By.className("friend-email")).sendKeys("friends123@gmail.com");
        // type your email
        driver.findElement(By.className("your-email")).sendKeys("myemail@gmail.com");
        // click on send email
        driver.findElement(By.name("send-email")).click();
        //v
        String s = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")).getText();
        // System.out.println(s);}


    }
}
