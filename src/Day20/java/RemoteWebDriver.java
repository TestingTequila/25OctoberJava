package Day20.java;

public class RemoteWebDriver implements WebDriver, JavaScriptExecutor, TakeScreenshot
{

    @Override
    public void findElement(String webElement) {
        System.out.println("findElement: " + webElement);
    }

    @Override
    public void findElements(String[] webElement) {
        System.out.println("findElements: " + webElement.length);
    }

    @Override
    public void get(String url) {
        System.out.println("get: " + url);
    }

    @Override
    public String getPageTitle(String title) {
        return "getPageTitle : Page Title - " + title;
    }

    @Override
    public void getCurrentUrl(String url) {
        System.out.println("getCurrentUrl" + url);
    }

    @Override
    public void getPageSource() {
        System.out.println("getPageSource: ");
    }

    @Override
    public void executeScript(String script) {
        System.out.println("executeScript: " + script);
    }

    @Override
    public void executeAsyncScript(int syncTime, String script) {
        System.out.println("executeAsyncScript: " + "Time: " + syncTime + " SCRIPT: " + script);
    }

    @Override
    public void getScreenshotAs(String pageImage) {
        System.out.println("getScreenshotAs: " + pageImage);
    }

    public  void setLogLevel()
    {
        System.out.println("RemoteWebDriver: setLogLevel");
    }

    public  void populateWebDriverException()
    {
        System.out.println("RemoteWebDriver: populateWebDriverException");
    }
}
