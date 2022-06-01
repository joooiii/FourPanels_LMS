package UserPackage;

import validation.Ensurer;

import java.time.LocalDate;

public class Personal
{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String title;

    public Personal(String firstName, String lastName, LocalDate birthday, String title)
    {
        this.firstName = Ensurer.ensureNonBlank(firstName, "first name");
        this.lastName = Ensurer.ensureNonBlank(lastName, "last name");
        this.birthday = birthday;
        this.title = Ensurer.ensureNonBlank(title, "title");
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = Ensurer.ensureNonBlank(firstName, "first name");
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = Ensurer.ensureNonBlank(lastName, "last name");
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
        this.title = Ensurer.ensureNonBlank(title, "title");
    }

    @Override
    public String toString()
    {
        return
                "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Birthday: " + birthday + "\n" +
                "Title: " + title;
    }
}
