package Day20.java;

public interface WebDriver extends  SearchContext
{
    @Override
    public void findElement(String webElement);

    @Override
    public void findElements(String[] webElement);

    public void get(String url);
    public String getPageTitle(String title);
    public void getCurrentUrl(String url);
    public  void getPageSource();
}
