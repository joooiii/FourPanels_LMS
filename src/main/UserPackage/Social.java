package UserPackage;

import UserPackage.Relationship;

import java.beans.beancontext.BeanContextSupport;
import java.util.HashMap;

public class Social
{
    private HashMap<Integer, Relationship> contacts;

    public Social(HashMap<Integer, Relationship> contacts)
    {
        this.contacts = contacts;
    }

    public HashMap<Integer, Relationship> getContacts()
    {
        return contacts;
    }

    public void setContacts(HashMap<Integer, Relationship> contacts)
    {
        this.contacts = contacts;
    }
}
