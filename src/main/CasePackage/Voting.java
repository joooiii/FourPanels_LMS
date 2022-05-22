package CasePackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static validation.Ensurer.ensureNonBlank;


public class Voting
{
    private String question;
    private List<String> answers;
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
        this.question =ensureNonBlank(question, "question");
    }

    public List<String> getAnswers()
    {
        return answers;
    }

    public void setAnswers()
    {
        this.answers = new ArrayList<>();
    }

    public void answerType(boolean answerType)
    {

    }

    public void addAnswers(String answer)
    {
        answers.add(answer);

    }

    public HashMap<String, Double> getResults()
    {
        return results;
    }

    public void setResults(HashMap<String, Double> results)
    {
        this.results= results;
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
