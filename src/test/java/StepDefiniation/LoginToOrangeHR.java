package StepDefiniation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginToOrangeHR {
    WebDriver driver;

    @Given("User is in Login page")
    public void Login() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions op=new ChromeOptions();
        op.addArguments("--remote-allow-origns=*");
         driver=new ChromeDriver(op);
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();

    }

    @When("User enter valid <username> and <password>")
    public void userEnterValidUsernameAndPassword() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

    }

    @And("Clicks on Login button")
    public void LoginButton() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    }

    @Then("Home page is displayed with valid title")
    public void HomePage() {
        driver.getTitle();

    }

    }