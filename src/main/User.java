import java.time.Instant;
import java.util.HashSet;

public class User
{
    private String userID;
    private String eMail;
    private String password;
    private Instant createdAt;
    private Instant updatedAt;
    private Personal personal;
    private Social social;
    private Score score;

    public User(String userID, String eMail, String password, Instant createdAt, Instant updatedAt, Personal personal, Social social, Score score)
    {
        this.userID = userID;
        this.eMail = eMail;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.personal = personal;
        this.social = social;
        this.score = score;
    }

    public String getUserID()
    {
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    public String geteMail()
    {
        return eMail;
    }

    public void seteMail(String eMail)
    {
        this.eMail = eMail;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Instant getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt)
    {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Personal getPersonal()
    {
        return personal;
    }

    public void setPersonal(Personal personal)
    {
        this.personal = personal;
    }

    public Social getSocial()
    {
        return social;
    }

    public void setSocial(Social social)
    {
        this.social = social;
    }

    public Score getScore()
    {
        return score;
    }

    public void setScore(Score score)
    {
        this.score = score;
    }
}

