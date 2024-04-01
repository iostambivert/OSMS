public class OSMSTester {
    public void tester(){
        Product p1 = new Product();
        p1.setProduct("Ticket To Ride");
        p1.setPrice("120 Gel");

        Product p2 = new Product();
        p2.setProduct("Catan");
        p2.setPrice("150 gel");

        OSMS osms = new OSMS();

        osms.addProduct(p1);
        osms.addProduct(p1);
        osms.addProduct(p2);

        osms.removeProduct(p1);
        osms.printStorage();
    }
}

