import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuizClass {
    private final List<Question> questions;
    int point=0;
    
   public QuizClass(){
       questions=new ArrayList<>();
       questionLoad();
   }
   
  private void questionLoad(){
       List<String> choice1=List.of("A. Rabindranath tagore","B. Dr.B.R.Ambedkar", "C. Mahatma gandhi","D. Shubhas Chandra Bosh");
       questions.add(new Question(" 1.Name the Father of the Indian Constitution?",choice1,"B")); 
       
        List<String> choice2=List.of("A. APJ Abdul Kalam and Arun Tiwari","B. Jawaharlal Nehru", "C. Mahatma gandhi","D. William Shekspeare");
       questions.add(new Question("2.Who penned the book 'Wings of Fire'? ",choice2,"A")); 
       
        List<String> choice3=List.of("A. Atlantic Ocean","B. Indian Ocean", "C. Arctic Ocean ","D. Pacific Ocean");
       questions.add(new Question(" 3.Name the deepest ocean in the world?",choice3,"D")); 
   }
  
  public void check(){
       Scanner s=new Scanner(System.in);
       for(Question ques:questions){
           System.out.println(ques.getQues());
           for(String choice:ques.getChoices()){
               System.out.println(choice);
           }
           System.out.print("Enter your choice (A, B, C, D): ");
            String ans = s.nextLine().toUpperCase();
            if(ques.correct(ans))
            {
                System.out.println("CORRECT!");
                point++;
            }
            else{
                System.out.println("WRONG!,The correct answer is:"+ques.getAnswer());
            }
            System.out.println("     ---------------------------------------------");
       }
       System.out.println("Quiz is finished and your points are"+point+"/"+questions.size());
  }
}
