import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class Voting
{
    private String question;
    private List<Answer> answers;
    private HashMap<String, Double> results;
    private LocalDateTime endsAt;


    public Voting()
    {
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public List<Answer> getAnswers()
    {
        return answers;
    }

    public void setAnswers(List<Answer> answers)
    {
        this.answers = answers;
    }

    public HashMap<String, Double> getResults()
    {
        return results;
    }

    public void setResults(HashMap<String, Double> results)
    {
        this.results = results;
    }

    public LocalDateTime getEndsAt()
    {
        return endsAt;
    }

    public void setEndsAt(LocalDateTime endsAt)
    {
        this.endsAt = endsAt;
    }
}
