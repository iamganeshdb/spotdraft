package Script10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotdraft 
{

public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Raghu\\eclipse-workspace\\Selenium10\\new1\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("https://www.goodreads.com/");
driver.findElement(By.xpath("//a[.='Sign In']")).click();
driver.findElement(By.xpath("//button[@class='gr-button gr-button--dark gr-button--auth authPortalConnectButton authPortalSignInButton']")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("imganeshdb@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9731@Ganesh");
driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
driver.findElement(By.xpath("//input[@class='searchBox__input searchBox__input--navbar']")).sendKeys("psychology of money");
driver.findElement(By.xpath("//button[@class='searchBox__icon--magnifyingGlass gr-iconButton searchBox__icon searchBox__icon--navbar']")).click();
driver.findElement(By.xpath("(//button[@class='wtrToRead'])[1]")).click();
driver.findElement(By.xpath("(//a[.='My Books'])[2]")).click();
driver.findElement(By.xpath("//img[@title='Remove from my books']")).click();
Alert a=driver.switchTo().alert();
a.accept();
driver.findElement(By.xpath("(//img[@class='circularIcon circularIcon--border'])[1]")).click();
driver.findElement(By.xpath("(//a[.='Sign out'])[1]")).click();
}}