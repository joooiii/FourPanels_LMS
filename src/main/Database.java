import CasePackage.Case;
import UserPackage.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static validation.Ensurer.checkState;

public class Database
{



    private List<Case> cases = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Database()
    {

    }

    public void aufnehmenUser(User u)
    {
        Objects.requireNonNull(u, "User ist null");
        checkState(!users.contains(u), "Du bist schon Fourpanels Mitglied");
        users.add(u);
    }

    public void aufnehmenCase(Case c)
    {
        Objects.requireNonNull(c, "Case ist null");
        checkState(!cases.contains(c), "Dieser Case existiert bereits");
        cases.add(c);
    }

    public void saveUsers(String pathToFile) throws IOException
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathToFile)))
        {
            oos.writeObject(users);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new FileNotFoundException();

        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new IOException();
        }

    }


    public void loadUsers(String pathToFile) throws IOException, ClassNotFoundException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathToFile)))
        {
            List<User> users = (List<User>) ois.readObject();
            for (User user : users)
            {
                aufnehmenUser(user);
            }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new FileNotFoundException();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new IOException();
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new ClassNotFoundException();
        }
    }

    public void saveCases(String pathToFile) throws IOException
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathToFile)))
        {
            oos.writeObject(cases);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new FileNotFoundException();

        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new IOException();
        }

    }


    public void loadCases(String pathToFile) throws IOException, ClassNotFoundException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathToFile)))
        {
            List<Case> cases = (List<Case>) ois.readObject();
            for (Case case1: cases)
            {
                aufnehmenCase(case1);
            }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new FileNotFoundException();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new IOException();
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            throw new ClassNotFoundException();
        }
    }




}
