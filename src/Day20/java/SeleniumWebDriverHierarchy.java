package Day20.java;

public class SeleniumWebDriverHierarchy
{
    public static void main(String[] args) {
        // new SearchContext();  We cannot create object of an interface
        //new WebDriver();       We cannot create object of an interface
        //RemoteWebDriver driver =new RemoteWebDriver(); We can create object of a class
        // ChromiumDriver driver = new ChromiumDriver(); We can create object of a class
        //ChromeDriver driver=new ChromeDriver();We can create object of a class
        // EdgeDriver driver =new EdgeDriver();  We can create object of a class
        //ChromiumDriver driver =new ChromeDriver(); Can be top casted as they share P-C relationship
        //driver.authenticateApp();
        //driver.getScriptId();

        //ChromiumDriver driver =new EdgeDriver();Can be top casted as they share P-C relationship
        //driver.authenticateApp();
        //driver.getScriptId();

       // WebDriver driver =new ChromeDriver();

        String browserType= "Edge";
        WebDriver driver;
        switch (browserType)
        {
            case "Chrome":
                 driver = new ChromeDriver();
                break;
            case "Firefox":
                 driver = new FireFoxDriver();
                break;
            case "Edge":
                 driver= new EdgeDriver();
                break;
            default:
                System.out.println("Enter Valid Browser Type");
                break;
        }



    }
}
