package Day15.java;

public class EcommerceApplication
{
    String name;
    public EcommerceApplication(String name)
    {
        this.name = name;
        System.out.println("Name: " + name);
    }
    public EcommerceApplication login()
    {
        System.out.println("Login into Application");
        return this;
    }

    public EcommerceApplication login(String un, String pwd)
    {
        System.out.println("Login into Application using " + un + " and " + pwd);
        return this;
    }

    public EcommerceApplication doSearch(String productName)
    {
        System.out.println("Searching product using " +productName);
        return this;
    }

    public EcommerceApplication doSearch(String productName, int price)
    {
        System.out.println("Searching product using product name as " +productName + " and Price as :" + price );
        return this;
    }

    public EcommerceApplication addToCart(String productName)
    {
        System.out.println("Adding mentioned product to the cart " +productName );
        return new EcommerceApplication("Kerrie");
    }

    public EcommerceApplication doPayment(String cc, int cvv)
    {
        System.out.println("Make payment using Credit card as :" + cc + " with CVV number as : " + cvv );
        return this;
    }

    public EcommerceApplication doPayment(String upi)
    {
        System.out.println("Make payment using UPI as :" + upi);
        return this;
    }

    public EcommerceApplication doPayment(String paypalId, String password)
    {
        System.out.println("Make payment using Paypal id as :" + paypalId + " and Password as : " + password);
        return this;
    }

    public EcommerceApplication generateOrderId()
    {
        System.out.println("Your order id is: " + 12435);
        return this;
    }

    public EcommerceApplication logOut()
    {
        System.out.println("Logging out of application......");
        return this;
    }
}
