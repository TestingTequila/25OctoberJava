package day10.java;

public class BrowserType
{
    String browserName = null;
    public  String BrowserUsed(String browser)
    {
        switch (browser)
        {
            case "Chrome":
                browserName = "Chrome BROWSER";
                break;
            case "Edge":
                browserName = "Edge BROWSER";
                break;
            case "Firefox":
                browserName = "Firefox BROWSER";
                break;
            case "Safari":
                browserName = "Safari BROWSER";
                break;
            default:
                browserName = "Enter a valid Browser";
                break;
        }
        return browserName;
    }

}
