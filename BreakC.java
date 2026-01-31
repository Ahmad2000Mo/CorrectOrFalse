import java.util.Scanner;
public class BreakC{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        float CorrectAnswer=55;
        float userAnswer;

        boolean isCorrect = false;

        System.out.println("test yout self");
        System.out.println("what is '5+10/2*10 = ?'");
        for(int i = 1 ; i <= 3 ; i++){
            System.out.println("Chance #" +i+ ": ");
            userAnswer = in.nextFloat();
            
            if(userAnswer==CorrectAnswer){
                isCorrect = true;
                break;
            }else if(userAnswer != CorrectAnswer){
                System.out.println("Try again");
                System.out.println("Chance #" + i + ": ");

            }
    }
    if(isCorrect)
            System.out.println("nice");
    else
            System.out.println("not good");
        
    }
}