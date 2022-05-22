package CasePackage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static validation.Ensurer.ensureNonBlank;


public class Voting
{
    private String question;
    private List<String> answers;
    private HashMap<String, Double> results;

    private LocalDateTime endsAt;
    private boolean answerType;


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

    public void answerTypeSingleChoice(boolean answerType)
    {
        this.answerType=answerType;


    }

    public void addAnswers(String answer)
    {
        answers.add(answer);

    }

    public double berechneSummeResults()
    {
        double sum=0;
        for (double values : results.values())
        {
            sum += values;
        }
        return sum;

    }


    public HashMap<String,Double> getResults()
    {
        return results;
    }

    public void setHashMap()
    {
         results= new HashMap<String, Double>();
         for (int i=0; i<answers.size(); i++)
         {
             results.put(answers.get(i), Double.valueOf(0));
         }

    }

    public void voting()
    {
        boolean voteOnTime = (Instant.from(endsAt)).isBefore(Instant.now());
        if (voteOnTime)
        {

            if (answerType == false)
            {
                for (int i = 0; i < answers.size(); i++)
                {
                    System.out.println("Multiple Choice: Vote for correct answers by puting 1 if it is correct, or 0 if it's not");
                    System.out.println(answers.get(i));
                    Scanner input = new Scanner(System.in);

                    double vote = input.nextDouble();
                    while (vote != 0 || vote != 1)
                    {
                        System.out.println("You can vote only with 1 or 0");
                        vote = input.nextDouble();
                    }

                    results.put(answers.get(i), results.get(answers.get(i) + vote));

                }
            } else
            {
                System.out.println("Singel choice: Add number of right answer.");
                for (int i = 0; i < answers.size(); i++)
                {
                    System.out.println(answers.get(i));
                }
                Scanner input = new Scanner(System.in);

                int voteForKey = (int) input.nextInt();

                while (!(voteForKey < answers.size()))
                {
                    System.out.println("U can add number betwen 0 and " + answers.size());
                    voteForKey = input.nextInt();
                }

                results.put(answers.get(voteForKey), results.get(answers.get(voteForKey) + 1));

            }
        }
        else
        {
            System.out.println("Sorry, u can not vote, times up...");
        }
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
