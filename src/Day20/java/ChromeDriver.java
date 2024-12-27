package Day20.java;

public class ChromeDriver extends  ChromiumDriver
{
    public ChromeDriver() {
        System.out.println("Launching Chrome Browser.....");
    }

    public  void generateExecutor()
    {
        System.out.println("ChromeDriver: generateExecutor: ");
    }

    public  void builder()
    {
        System.out.println("ChromeDriver: builder");
    }
}
