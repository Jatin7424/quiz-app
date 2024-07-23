
import java.util.List;

public class Question {
    private String questionText;
    private List<String> choices;
    private String answer;
    
    public Question(String questionText,List<String> choices,String answer)
    {
        this.questionText=questionText;
        this.choices=choices;
        this.answer=answer;
    }
    
    public String getQues(){
    return questionText;
    }
    
    public List<String> getChoices(){
        return choices;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public boolean correct(String ans){
        return answer.equalsIgnoreCase(ans);
    }
}
