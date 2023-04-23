import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CompareClearlistXpathText {

        protected static WebDriver driver;
        public static void main(String[] args) {
            //open chrome browser
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //open nopdemocommerce url
            driver.get("https://demo.nopcommerce.com/");
            //click on Add to compare list on HTC One M8 Android L5.0 Lollipop
            driver.findElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]")).click();
            //click on Add to compare list on $25 Virtual Gift Card
            driver.findElement(By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']")).click();
            //driver.findElement(By.xpath("//button[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/43\"),!1']")).click();
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[2]/button[2]")).click();
            //click on product comparison list
            driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")).click();
            String name1 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a")).getText();
            System.out.println("First Product is: " + name1);
            String name2 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/a")).getText();
            System.out.println("Second Product is: " + name2);
            driver.findElement(By.className("clear-list")).click();
            String message = driver.findElement(By.className("no-data")).getText();
            System.out.println(message);
        }}