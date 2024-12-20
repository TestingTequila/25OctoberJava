package Day15.java;

import com.sun.security.jgss.InquireSecContextPermission;

public class ExecutingECommerce
{
    public static void main(String[] args) {
        EcommerceApplication eca = new EcommerceApplication("Jason");
//        eca.login();
//        eca.doSearch("MacBook pro");
//        eca.addToCart("MacBook pro");
//        eca.doPayment("BOA", 3453);
//        eca.generateOrderId();
//        eca.logOut();

//          eca.login().doSearch("IPhone").
//                  addToCart("IPhone").
//                  doPayment("BOA", 3453).
//                  generateOrderId().
//                  logOut();
//
//          eca.login("ashish.mishra.sse@gmail.com", "test@1234")
//                  .doSearch("Samsung Laptop")
//                  .logOut();
//
//        eca.login("ashish.mishra.sse@gmail.com", "test@1234")
//                .doSearch("Samsung Laptop").addToCart("Samsung Laptop");

        User u1 = new User("Rahul", 33, "Toronto" );
        System.out.println(u1.name + ", " +u1.age + ", " + u1.city);
    }
}
