package CasePackage;

import javax.swing.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static validation.Ensurer.checkState;
import static validation.Ensurer.ensureNonBlank;


public class Voting
{
    private String question;
    private List<Answer> answers;
    private HashMap<String, Double> results;


    private LocalDateTime endsAt;


    public Voting(String question, LocalDateTime endsAt)
    {
        this.question = ensureNonBlank(question, "question");

        this.endsAt = endsAt;
        answers = new ArrayList<>();
        results = new HashMap<>();

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

    }

    public List<Answer> getAnswers()
    {
        return answers;
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

    public HashMap<String, Double> getResults()
    {
        return results;
    }

    public void setHashMap()
    {

        for (Answer a : answers)
        {
            results.put(a.getAnswerText(), (double) 0);

        }
//        checkState(answers.size() < 2, "Minimum is 2 answers");

    }


    // how to make 1 user to vote...
   /* public void userThatVotet()
    {
        ArrayList<Integer> userThatVoted= new ArrayList<Integer>();

    }*/


    public void voting(int answernumber)
    {
//        boolean voteOnTime = (Instant.from(endsAt)).isBefore(Instant.now());
//        if (voteOnTime)
        {
      /*
                for (Answer a : answers)
                {
                    System.out.println("Multiple Choice: Vote for correct answers by puting 1 if it is correct, or 0 if it's not");
                    System.out.println(results);
                    Scanner input = new Scanner(System.in);

                    double vote = input.nextDouble();
                    while (vote != 0 || vote != 1)
                    {
                        System.out.println("You can vote only with 1 or 0");
                        vote = input.nextDouble();
                    }

                    results.put(a.getAnswerText(), results.get(a.getAnswerText()) + vote);

                }
            else*/

            /*    System.out.println("Singel choice: Add number of right answer.");
               for(Answer a : answers)
               {
                   System.out.println(a.getAnswerID() + a.getAnswerText());;
               }
                Scanner input = new Scanner(System.in);

                int answernumber = input.nextInt();*/

            if ((answernumber < answers.size()))
            {
                for (Answer a : answers)
                {
                    if (answernumber == a.getAnswerID())
                    {
                        results.put(a.getAnswerText(), results.get(a.getAnswerText() + 1));
                    }
                }

            } else
            {
                System.out.println("U can add number betwen 0 and " + answers.size());

            }
        }
//        else
//        {
//            System.out.println("Sorry, u can not vote, times up...");
//        }
    }

    public LocalDateTime getEndsAt()
    {
        return endsAt;
    }

    public void setEndsAt(LocalDateTime endsAt)
    {
        this.endsAt = endsAt;
    }
// need to chek it...
    public void corectAnswers()
    {
        Double max = Collections.max(results.values());

        results.entrySet().stream().filter(results -> results.getValue() == max)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

    }

    public List<String> corectAnswers2()
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

}
