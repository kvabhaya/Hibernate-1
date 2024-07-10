import javax.persistence.*;
import java.util.List;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @ManyToMany(mappedBy = "product")
    private List<CustomerOrder> orders;
}
