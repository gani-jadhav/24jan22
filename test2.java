import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
   @Test
    public void login_test()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        String Title=driver.getTitle();
        Assert.assertEquals(Title,"Yahoo");
    }
}
