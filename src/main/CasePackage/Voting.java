package CasePackage;

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

    public Voting(String question, LocalDateTime endsAt)
    {
        this.question = ensureNonBlank(question, "question");
        this.endsAt = ensureValidEndDateTime(endsAt);
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
        for (Answer ans : answers)
        {
            results.put(ans.getAnswerText(), 0.0);

        }

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


    // how to make 1 user to vote...
   /* public void userThatVotet()
    {
        ArrayList<Integer> userThatVoted= new ArrayList<Integer>();

    }*/

    public void voting(int answernumber)
    {
        boolean voteOnTime = (endsAt.isAfter(LocalDateTime.now()));
         if (voteOnTime)
         {
             if ((answernumber < answers.size()))
             {
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
                 }
             } else
             {
                 System.out.println("U can add number betwen 0 and " + answers.size());

             }
         }
         else
         {
             System.out.println("U are too late for vote");
         }


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
        this.endsAt = ensureValidEndDateTime(endsAt);
    }
// need to chek it...
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

}
