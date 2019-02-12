package bindings;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SockDefinition
{
    public WebDriver driver;
    static String driverPath = "/Users/khalidshaheen/Desktop/Automation Testing/chromedriverMac";
    private String baseURL;

    @Given("^that i am on the amazon website$")
    public void that_i_am_on_the_amazon_website() throws Exception
    {
        baseURL = "https://www.amazon.co.uk/";

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.get(baseURL);

        //Wait for 2000 ms
        Thread.sleep(2000);
    }

    @When("^i enter 'socks' in search$")
    public void i_enter_socks_in_search() throws Exception
    {
        //Wait for 2000 ms
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("socks");
    }

    @And("^i submit search$")
    public void i_submit_search() throws Exception
    {

        //Wait for 2000 ms
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
        //driver.findElement(By.xpath("//*[contains(@id,'nav-search')]")).click();
    }

    @And("^i click on the first item listed$")
    public void i_click_on_the_first_item_listed() throws Exception
    {
        //Wait for 2000 ms
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//*[@id='result_0']/div/div[2]/div/a/img")).click();
        driver.findElement(By.xpath("//li[contains(@id,'result_0')]")).click();
    }

    @Then("^i can validate that I am on the selected item page$")
    public void i_can_validate_that_I_am_on_the_selected_item_page() throws Exception
    {
        //Wait for 2000 ms
        Thread.sleep(2000);

        WebElement selectedSocks = driver.findElement(By.xpath("//*[@id='productTitle']"));
        Assert.assertEquals(true, selectedSocks.isDisplayed());
    }

    @After
    public void closeBrowser()
    {
        System.out.println("Entered in close browser method");
        driver.quit();
    }

}
