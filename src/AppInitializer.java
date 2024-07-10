public class AppInitializer {
    public static void main(String[] args) {
        Customer c1 = new Customer("C-001","Kamal","Kandy",25000);
        saveCustomer(c1);
    }
    private static boolean saveCustomer(Customer c){
        session.save(c);
    }
}
