import javax.persistence.Embeddable;
import java.util.Objects;

public class Person {
    @Convert(converter = UnitedStatesConverter.class)
@Column(name = "Country Id")
    private boolean UnitedStates
}

public class Student {
    @Convert(converter = PamFinkBooleanConverter.class)
@Column(name = "ScannedBy")
    private boolean PamFink;
}

public class Student {
    @Convert(converter = QualifiedUnqualifiedBooleanConverter.class)
@Column(name = "Qualified/Disqualified")    
private boolean qualified;
}


public class Person {
@Column(name = "Company Name")
    private String companyName;

@Column(name = "Job Title")
    private String jobtitle;

@Column(name = "Phone Number")
    private String phoneNumber;

@Column(name = "Phone 2 Number")
    private String phone2Number;

@Column(name = "Fax Number")
    private String faxNumber;

@Column(name = "Question")
    private String question;

@Column(name = "Response")
    private String response;

@Column(name = "Note")
    private String note;

@Column(name = "Collateral")
    private String collateral;

@Column(name = "Qualified/Disqualified")
    private boolean qualified;

@Column(name = "ScannedBy")
    private boolean PamFink;

@Column(name = "Country Id")
    private boolean UnitedStates;
}

@Embeddable
public class Address {
    private String Address1;
    private String Address2;
    private String Address3;
private String StateId;
private String Zip;
private String CountryId;
}

public class Person {
@AttributeOverrrides {(
    @AttributeOverride(name = "Address1", column = @Column(name = "Address1"))
    @AttributeOverride(name = "Address2", column = @Column(name = "Address2"))
    @AttributeOverride(name = "Address3", column = @Column(name = "Address3"))
    @AttributeOverride(name = "StateId", column = @Column(name = "State Id"))
    @AttributeOverride(name = "Zip", column = @Column(name = "Zip"))
    @AttributeOverride(name = "CountryId", column = @Column(name = "Country Id"))
    })
    private Address address;
}
 
