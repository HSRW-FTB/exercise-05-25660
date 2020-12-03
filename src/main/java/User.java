import java.util.Date;

public class User {
    
    private String id;
    private String lastname;
    private String firstname;
    private Date birthdate;
    private Domain domain;

    protected User() {}

    protected User(String id, Domain domain, String firstname, String lastname)
    {
        this.id = id;
        this.domain = domain;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    protected User(String id, Domain domain, String firstname, String lastname, Date birthdate)
    {
        this.id = id;
        this.domain = domain;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String getFirstName()
    {
        return firstname;
    }

    public void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastName()
    {
        return lastname;
    }

    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }

    public String getID()
    {
        return id;
    }

    public Date getBirthDate()
    {
        return birthdate;
    }

    public void setBirthDate(Date birthdate)
    {
        this.birthdate = birthdate;
    }

    public Domain getDomain()
    {
        return domain;
    }

    public String getFQUN()
    {
        switch(domain)
        {
            case STAFF: return getID() + "@staff.hsrw";
            case STUDENT: return getID() + "@student.hsrw";
            default: return "invalid email";
        }
    }
}
