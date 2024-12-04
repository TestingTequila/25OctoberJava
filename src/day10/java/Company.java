package day10.java;

public class Company {
    String[] devices = null;

    public String[] getDevices(String name) {
        if (name.equals("Sherry")) {
            devices = new String[]{"macbook pro", "ipad", "iph13"};

        } else if (name.equals("Kerrie")) {
            devices = new String[]{"Windows 10", "samsungs10"};

        } else if (name.equals("John")) {
            devices = new String[]{"Windows 10", "Samsung s11", "iph13", "Vodafone SIM"};

        } else if (name.equals("Rashmi")) {
            devices = new String[]{"iph13", "Vodafone SIM"};

        } else {
            System.out.println("Not an employee of this organization");
        }
        return devices;
    }
}
