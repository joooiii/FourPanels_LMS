package CasePackage;

import UserPackage.Score;
import UserPackage.ScoreEvent;
import UserPackage.User;
import validation.Ensurer;

import javax.swing.*;
import java.sql.Array;
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
    private HashMap<User, Integer> votedUsers; // key is User  und value is die Antwort

    private Score score;

    public Voting(String question, LocalDateTime endsAt)
    {
        this.question = ensureNonBlank(question, "question");
        this.endsAt = ensureValidEndDateTime(endsAt);
        this.answers = new ArrayList<>();
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

    public void voting(User user, int answernumber, Case cases)
    {
        // If voting is before endTime
        boolean voteOnTime = (endsAt.isAfter(LocalDateTime.now()));
        // Is User memeber
        checkState(cases.getMembers().contains(user), "U are not member");
        // Is User alredy voted
        checkState(!votedUsers.containsKey(user), "U have already voted");
        if (voteOnTime)
        {
            checkState(!(answernumber > answers.size()), "U can vote from 0 to" + answers.size());

            for (Answer answer : answers)
            {
                if (answernumber == answer.getAnswerID())
                {

                    results.put(answer.getAnswerText(), results.get(answer.getAnswerText()) + 1);
                    votedUsers.put(user, answernumber);
                    ScoreEvent sE = new ScoreEvent(5, false, "Thanks you for voting on:  " + cases.getContent().getTitle(), "Voting Points");
                    user.getScore().addScore(sE);

                }
            }
            if (answernumber == 0)
            {
                System.out.println("Add new Answer");
                Scanner input = new Scanner(System.in);
                String newAnswer = input.nextLine();
                Answer d = new Answer(newAnswer);
                answers.add(d);
                results.put(newAnswer, 1.0);
                votedUsers.put(user, answernumber);
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

    public List<String> mostVotedAnswer()
    {
        List<String> list = new ArrayList<>();

        Double max = Collections.max(results.values());
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Double> entry : results.entrySet())
        {

            if (max == 0.0)
            {
                list.add("no correct answer");
                return list;
            }
            if (entry.getValue() == max)
            {
                keys.add(entry.getKey());
            }

        }
        return keys;

    }

    public void corectAnswersList()
    {
        for (Map.Entry result : results.entrySet())
        {
            String key = (String) result.getKey();
            double value = Math.round((double) result.getValue() * 100 / berechneSummeResults());
            System.out.println((key + ": " + value + "%"));
        }

    }


    public String toString()
    {
        return "Question: " + getQuestion() + "\n" +
                "Ends at: " + endsAt + "\n"
                + "Answers with Scores: " + getResults() + "\n" +
                "-".repeat(20) + "\n" +
                "Voted " + berechneSummeResults() + " People " + "\n" +
                "-".repeat(20) + "\n" +
                "Maximum votes have answer: " + mostVotedAnswer() +
                "\n" + "-".repeat(20);
    }

    public HashMap<User,Integer> getVotedUsers()
    {
        return votedUsers;
    }
    // Uberprufen ob dass stimmt
    // to how user give ich scores
    public void addScoreForRightAnswer(int answerNumber, User user, Case c)
    {
        if (user == c.getOwner())
        {
            for (Map.Entry votedUser : votedUsers.entrySet())
            {
                if ((int) votedUser.getValue() == answerNumber)
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
