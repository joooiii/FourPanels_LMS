package CasePackage;

import java.util.concurrent.atomic.AtomicInteger;

import static validation.Ensurer.ensureNonBlank;

public class Answer
{
    private String answerText;
    private Integer answerID;
    private static AtomicInteger countAnswer = new AtomicInteger(0);


    public Answer(String answerText)
    {
        this.answerText=ensureNonBlank(answerText,"answer");
        this.answerID=countAnswer.incrementAndGet();


    }

    public void setCountAnswer()
    {
        countAnswer=new AtomicInteger(0);
    }


    public String getAnswerText()
    {
        return answerText;
    }

    public void setAnswerText(String answerText)
    {
        this.answerText =ensureNonBlank(answerText, "answer");

    }

    public void setAnswerID()
    {
        this.answerID= countAnswer.incrementAndGet();
    }

    public Integer getAnserID()
    {
        return answerID;
    }

}
