import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        /*Benefit benefit = new Benefit();

        benefit.setName("Health Insurance");
        benefit.setVendor("Cigna Texas");
        benefit.setMonetaryLimit(3000.50f);
        benefit.getExpiryDate();
        benefit.getDetails();

        System.out.println(benefit.getDetails());*/

        //System.out.println("Welcome to IT Company system. Please enter name of your company.");
        String inputCompanyName = "Solvd";
        Company company = new Company(inputCompanyName);
        System.out.println("Welcome to " + company.getCompanyName());

        System.out.println("\nExploring Services\n");
        Service service1 = new Service(1,"Software Development");
        System.out.println(service1.getServiceDetails());
        Service service2 = new Service(2,"Mobile Development");
        System.out.println(service2.getServiceDetails());

        System.out.println("\n\nExploring Products\n");

        Product product1 = new Product(1,"Library Management System");
        System.out.println(product1.getProductDetails());

        Product product2 = new Product(1,"Attendance Management System");
        System.out.println(product2.getProductDetails());



    }
}