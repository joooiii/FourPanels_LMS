package UserPackage;

import UserPackage.Relationship;

import java.beans.beancontext.BeanContextSupport;
import java.util.HashMap;
import java.util.Map;

import static UserPackage.Relationship.relationshipType.*;

public class Social
{
    private HashMap<User, Relationship.relationshipType> contacts;

    public Social(HashMap<User, Relationship.relationshipType> contacts)
    {
        this.contacts = contacts;
    }

    public HashMap<User, Relationship.relationshipType> getContacts()
    {
        return contacts;
    }

    public void setContacts(HashMap<User, Relationship.relationshipType> contacts)
    {
        this.contacts = contacts;
    }

    public String toString(String type, Relationship.relationshipType value)
    {
//        return "Friends: " + contacts.containsValue(friended) + "\n" +
//                "Incoming Requests: " + contacts.containsValue(incoming) + "\n" +
//                "Outgoing Requests: " + contacts.containsValue(outgoing);
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        for (Map.Entry <User, Relationship.relationshipType> entry : contacts.entrySet())
        {
            if (entry.getValue() == value)
            {
                sb.append(entry.getKey().getFirstName(entry.getKey().getUserID())).append(" ").append(entry.getKey().getLastName(entry.getKey().getUserID())).append("/");
            }

        }
        sb.deleteCharAt(sb.length()-1);
        String t = String.valueOf(sb);
          return t;
    }
}
