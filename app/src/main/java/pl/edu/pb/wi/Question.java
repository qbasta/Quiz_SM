package pl.edu.pb.wi;

public class Question {

    private int QuestionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer)
    {

        this.QuestionId = questionId;
        this.trueAnswer = trueAnswer;
    }

    public int getQuestionId()
    {
        return QuestionId;
    }

    public boolean isTrueAnswer()
    {
        return trueAnswer;
    }

};
