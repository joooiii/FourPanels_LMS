import java.time.LocalDate;

public class Personal
{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String title;

    public Personal(String firstName, String lastName, LocalDate birthday, String title)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.title = title;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(LocalDate birthday)
    {
        this.birthday = birthday;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}
