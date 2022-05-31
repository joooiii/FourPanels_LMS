package CasePackage;

import UserPackage.ScoreEvent;
import validation.Ensurer;

import javax.swing.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static validation.Ensurer.*;

public class Voting
{
    // add Antwort als Voting...
    private String question;
    private List<Answer> answers;
    private HashMap<String, Double> results;
    private LocalDateTime endsAt;
    private HashMap<Integer, Integer> votedUsers; // key is User ID und value is die Antwort
    private Case cases;
    ScoreEvent scoreEvent;

    public Voting(String question, LocalDateTime endsAt)
    {
        this.question = ensureNonBlank(question, "question");
        this.endsAt = ensureValidEndDateTime(endsAt);
        answers = new ArrayList<>();
        results = new HashMap<>();
        votedUsers=new HashMap<>();

    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = ensureNonBlank(question, "question");
    }

    public void setAnswers(Answer a)
    {
        answers.add(a);
        for (Answer ans : answers)
        {
            results.put(ans.getAnswerText(), 0.0);

        }

    }
    public List<Answer> getAnswers()
    {
        return answers;
    }


    public HashMap<String, Double> getResults()

    {
        return results;
    }


    public LocalDateTime getEndsAt()
    {
        return endsAt;
    }

    public void setEndsAt(LocalDateTime endsAt)
    {
        this.endsAt = ensureValidEndDateTime(endsAt);
    }

    // how to make 1 user to vote...
   /* public void userThatVotet()
    {
        ArrayList<Integer> userThatVoted= new ArrayList<Integer>();

    }*/

    public void voting( Integer userId, int answernumber, Case cases)
    {
        // If voting is before endTime
        boolean voteOnTime = (endsAt.isAfter(LocalDateTime.now()));
        // Is User memeber
        checkState(cases.getMembers().containsKey(userId), "U are not member");
        // Is User alredy voted
        checkState(!votedUsers.containsKey(userId), "U have alredy voted");
                if (voteOnTime)
                {
                    checkState(!(answernumber >answers.size()),"U can vote from 0 to" + answers.size());

                        for (Answer a : answers)
                        {
                            if (answernumber == a.getAnswerID())
                            {
                                results.put(a.getAnswerText(), results.get(a.getAnswerText()) + 1);
                            }
                        }
                        if (answernumber == 0)
                        {
                            System.out.println("Add new Answer");
                            Scanner input = new Scanner(System.in);
                            String newAnswer = input.nextLine();
                            results.put(newAnswer, 1.0);
                            votedUsers.put(userId,answernumber);
                            // to hom user is dises score gegeben?
                            this.scoreEvent= new ScoreEvent(5,false, "Score Message", "title");

                        }
                } else
                {
                    System.out.println("U are too late for vote");
                }
        }




    public double berechneSummeResults()
    {
        double sum = 0;
        for (double values : results.values())
        {
            sum += values;
        }
        return sum;

    }

    public List<String> corectAnswer()
    {
        Double max = Collections.max(results.values());
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Double> entry : results.entrySet())
        {
            if (entry.getValue()==max)
            {
                keys.add(entry.getKey());
            }
        }
        return  keys;
    }

    public void corectAnswersList()
    {
        for (Map.Entry result : results.entrySet())
        {
            String key= (String)result.getKey();
             double value = (double) result.getValue() *100/ berechneSummeResults() ;
            System.out.println(key +": " + value + "%");
        }
    }

    // Uberprufen ob dass stimmt
    public void addScoreForRightAnswer()
    {
        if (votedUsers.containsValue(answers.indexOf(corectAnswer())))
        {
            if (endsAt.isAfter(LocalDateTime.now()))
            {
                this.scoreEvent = new ScoreEvent(5, false, "Score Message", "title");
            }
        }

    }

}
