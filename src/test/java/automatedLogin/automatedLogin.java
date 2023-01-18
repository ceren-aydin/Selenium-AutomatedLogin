package automatedLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;
public class automatedLogin {
    public static void main(String[] args) throws Exception {
        test();
    }
    public static void test() throws Exception {

        for (int i = 1; i < 11; i++) {

            System.out.println( i + ".GİRİŞ" );

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            driver.get("https://tr.linkedin.com/");

            // E-posta kutusunun locate edilmesi ve e-postanın yazılması
            WebElement username = driver.findElement(By.id("session_key"));
            username.sendKeys("XXX");

            // Şifre kutusunun locate edilmesi ve şifrenin yazılması
            WebElement password = driver.findElement(By.id("session_password"));
            password.sendKeys("XXX");

            // Oturum Açın butonunun locate edilmesi ve butonu tıklanması
            WebElement loginButton = driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']"));
            loginButton.click();

            driver.close();

            long start = System.currentTimeMillis();

            // 10 saniye bekleme
            Thread.sleep(10000);
        }
    }
}