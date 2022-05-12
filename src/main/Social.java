import java.util.HashMap;

public class Social
{
    private HashMap<String, User> contacts;

    public Social(HashMap<String, User> contacts)
    {
        this.contacts = contacts;
    }

    public HashMap<String, User> getContacts()
    {
        return contacts;
    }

    public void setContacts(HashMap<String, User> contacts)
    {
        this.contacts = contacts;
    }
}
