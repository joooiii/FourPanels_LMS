package CasePackage;

import UserPackage.Score;
import UserPackage.ScoreEvent;
import UserPackage.User;

import java.time.LocalDateTime;
import java.util.*;

import static validation.Ensurer.*;

public class Voting
{
    // add Antwort als Voting...
    private String question;
    private HashMap<Answer, Double> results;
    private LocalDateTime endsAt;
    private HashMap<User, Answer> votedUsers; // key is User  und value is die Antwort

    private Score score;

    public Voting(String question, LocalDateTime endsAt)
    {
        this.question = ensureNonBlank(question, "question");
        this.endsAt = ensureValidEndDateTime(endsAt);
        this.results = new HashMap<>();
        this.votedUsers = new HashMap<>();

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
            results.put(a, 0.0);

    }

    public HashMap<Answer, Double> getResults()

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

    public void voting(User user, Answer a, Case cases)
    {
        // If voting is before endTime
        boolean voteOnTime = (endsAt.isAfter(LocalDateTime.now()));
        // Is User memeber
        checkState(cases.getMembers().contains(user), "U are not member");
        // Is User alredy voted
        checkState(!votedUsers.containsKey(user), "U have already voted");
        if (voteOnTime)
        {
            checkState(results.containsKey(a) || a==null, "That answer doesnt exist");

            for (Map.Entry result : results.entrySet())
            {
                if (a == result.getKey())
                {
                    results.put(a, results.get(a) + 1);
                    votedUsers.put(user, a);
                    ScoreEvent sE = new ScoreEvent(5, false, "Thanks you for voting on:  " + cases.getContent().getTitle(), "Voting Points");
                    user.getScore().addScore(sE);

                }
            }
            if (a == null)
            {

                System.out.println("Add new Answer");
                Scanner input = new Scanner(System.in);
                String newAnswer = input.nextLine();
                Answer d = new Answer(newAnswer);
                results.put(d, 1.0);
                votedUsers.put(user, d);
                // to hom user is dises score gegeben?
                ScoreEvent sE = new ScoreEvent(7, false, "Thanks for adding an answer", "Added Answer");
                user.getScore().addScore(sE);
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

    public String mostVotedAnswer()
    {
        String mostedVotedAnswer= "";
        String list = "There is no right answer";
        Double max = Collections.max(results.values());
        List<String>keys = new ArrayList<>();
        for (Map.Entry<Answer, Double> entry : results.entrySet())
        {
            if (max == 0.0)
            {
                return list;
            }
            if (entry.getValue() == max)
            {
                mostedVotedAnswer=  entry.getKey().getAnswerText();
            }
        }
        return mostedVotedAnswer;
    }

    public void corectAnswersList()
    {
        for (Map.Entry result : results.entrySet())
        {
            Answer key = (Answer) result.getKey();
            double value = Math.round((double) result.getValue() * 100 / berechneSummeResults());
            System.out.println( (key.getAnswerText() + ": " + value + "%"));

        }
        System.out.println("-".repeat(20));

    }


    public String toString()
    {
        return "Question: " + getQuestion() + "\n" +
                "Ends at: " + endsAt + "\n"
                 + "\n" +
                "-".repeat(20) + "\n" +
                "Voted " + berechneSummeResults() + " People " + "\n" +
                "-".repeat(20) + "\n" +
                "Maximum votes have answer: " + mostVotedAnswer() +
                "\n" + "-".repeat(20);
    }

    public HashMap<User,Answer> getVotedUsers()
    {
        return votedUsers;
    }
    // Uberprufen ob dass stimmt
    // to how user give ich scores
    public void addScoreForRightAnswer(Answer a, User user, Case c)
    {
        if (user == c.getOwner())
        {
            for (Map.Entry votedUser : votedUsers.entrySet())
            {
                if ( votedUser.getValue() == a)
                {
                    ScoreEvent se = new ScoreEvent(50, true, "Your such a brain! Your answer was correct", "ExpertScore");
                    User habschi = (User) votedUser.getKey();
                    habschi.getScore().addScore(se);
                    //votedUser.getKey().
                }

            }

        }
    }
}
