import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class AddtocartXpathText {

    // protected static WebDriver driver;
    //  public static void main(String[] args) {

    //  driver = new ChromeDriver();
    //   driver.get("https://demo.nopcommerce.com/");
    protected static WebDriver driver;
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open the browser
        driver.get("https:/demo.nopcommerce.com/");
        driver.findElement(By.xpath("(//a[@title='Show products in category Electronics'])[1]")).click();
        driver.findElement(By.xpath("(//a[@title='Show products in category Camera & photo'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]")).click();
        String name1 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).getText();
        System.out.println(name1);
        driver.findElement(By.className("cart-label")).click();
        String name = driver.findElement(By.className("product-name")).getText();
        System.out.println(name);

    }
}

