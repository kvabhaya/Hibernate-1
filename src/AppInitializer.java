public class AppInitializer {
    public static void main(String[] args) {
        saveCustomer();
    }
    private static boolean saveCustomer(Customer c){
        session.save(c);
    }
}
