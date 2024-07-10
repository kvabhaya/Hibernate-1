import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer c1 = new Customer("C-001","Kamal","Kandy",25000);
        if(saveCustomer(c1)){
            System.out.println("Saved..");
        }
    }
    private static boolean saveCustomer(Customer c){
        try(Session session = HibernateUtil.getSession()){
            Transaction transaction = session.beginTransaction();
            session.save(c);
            transaction.commit();
            return true;
        }
    }
}
