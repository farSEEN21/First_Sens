public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd= new ChromeDriver();
        wd.navigate().to("w3school.com/css/css_table.asp");
    }

    @Test
    public void testcss(){


        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.cssSelector("[href^='/log']"));
        wd.findElement(By.cssSelector("[href$='in']"));



    }


    @AfterTest
    public void teardown(){wd.quit();}

}
