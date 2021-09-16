package SeliniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyRegister {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware09082021\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Reshma");
        driver.findElement(By.name("LastName")).sendKeys("Shaik");
        driver.findElement(By.id("Email")).sendKeys("Shaik.Reshma@ibm.com");
        driver.findElement(By.name("Password")).sendKeys("Shaik.123");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Shaik.123");
        
        driver.findElement(By.xpath("//input[@id='register-button']")).click();


        driver.close();

}

}