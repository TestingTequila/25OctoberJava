package Day20.java;

public class ChromiumDriver extends  RemoteWebDriver implements HasAuthentication
{

    @Override
    public void authenticateApp() {
        System.out.println("authenticateApp");
    }

    public  void getScriptId()
    {
        System.out.println("ChromiumDriver : getScriptId");
    }
}
