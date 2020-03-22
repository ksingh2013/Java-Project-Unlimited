import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "persons.csv")

public class Person {
    @Id
    @GeneratedValue
    private Long id;
}

public class Person {
@Column(name = "First Name")
    private String firstName;

@Column(name = "Middle Initial")
    private String middleInitial;

@Column(name = "Last Name")
    private String lastName;

@Column(name = "Email")
    private String email;

@Column(name = "Email2")
    private String email2;
}
