import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {
        //====================================save
        /*Customer c1 = new Customer(
                "C-001",
                "Kamal",
                "Kandy",
                25000);
        if(saveCustomer(c1)){
            System.out.println("Saved..");
        }*/

        //====================================find
        /*Customer customer = findCustomer("C-001");
        System.out.println(customer);*/

        //====================================findAll
        findAllCustomers().stream().forEach(e-> System.out.println(e));

    }
    private static boolean saveCustomer(Customer c){
        try(Session session = HibernateUtil.getSession()){
            Transaction transaction = session.beginTransaction();
            session.save(c);
            transaction.commit();
            return true;
        }
    }

    private static Customer findCustomer(String id){
        try(Session session = HibernateUtil.getSession()){
            return session.find(Customer.class,id);
        }
    }

    private static List<Customer> findAllCustomers(){
        try(Session session = HibernateUtil.getSession()){
            Query query = session.createQuery("FROM Customer",Customer.class);
            return query.list();
        }
    }
}
