import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

  @Test
    public void testcss(){

//wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));
      System.out.println(wd.findElements(By.cssSelector("#customers tr")).size());
      System.out.println(wd.findElements(By.cssSelector("#customers th")).size());
      System.out.println(wd.findElements(By.cssSelector("#customers tr:nth-child(3)")).size());
      System.out.println(wd.findElements(By.cssSelector("#customers td:last-child")).size());

    }


    @AfterTest
    public void teardown(){wd.quit();}

}
