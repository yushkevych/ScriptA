import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverScriptA {
  public static void main(String[] args) {

    WebDriver driver = getDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
    WebElement loginEmail = driver.findElement(By.id("email"));
    loginEmail.sendKeys("webinar.test@gmail.com");

    WebElement loginPassword = driver.findElement(By.id("passwd"));
    loginPassword.sendKeys("Xcg7299bnSmMuRLp9ITw");

    WebElement submitButton = driver.findElement(By.name("submitLogin"));
    submitButton.click();

    WebElement dropdownImage = driver.findElement(By.id("employee_infos"));
    dropdownImage.click();

    WebElement logoutBtn = driver.findElement(By.id("header_logout"));
    logoutBtn.click();

    driver.quit();


  }
  public static WebDriver getDriver() {
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//resources//chromedriver.exe");
    return new ChromeDriver();
  }
}
