package CasePackage;

import java.util.concurrent.atomic.AtomicInteger;

import static validation.Ensurer.ensureNonBlank;

public class Answer
{
    private Integer answerID;
    private String answerText;
    private static final AtomicInteger count = new AtomicInteger(0);
    private boolean answerType;

    public Answer(String answerText)
    {
        this.answerText=ensureNonBlank(answerText,"answer");
        this.answerID=count.incrementAndGet();
    }

    public Integer getAnswerID()
    {
        return answerID;
    }

    public void setAnswerID()
    {
        this.answerID = count.incrementAndGet();

    }

    public String getAnswerText()
    {
        return answerText;
    }

    public void setAnswerText
            (String answerText)
    {
        this.answerText =ensureNonBlank(answerText, "answer");

    }

}
