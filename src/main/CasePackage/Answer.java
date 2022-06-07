package CasePackage;

import java.util.concurrent.atomic.AtomicInteger;

import static validation.Ensurer.ensureNonBlank;

public class Answer
{
    private String answerText;




    public Answer(String answerText)
    {
        this.answerText=ensureNonBlank(answerText,"answer");



    }




    public String getAnswerText()
    {
        return answerText;
    }

    public void setAnswerText(String answerText)
    {
        this.answerText =ensureNonBlank(answerText, "answer");

    }



}
