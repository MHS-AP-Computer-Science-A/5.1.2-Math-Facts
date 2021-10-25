import java.util.Scanner;

public class MathFacts
{
    public static void main(String[] args)
    {
        //Welcome
        System.out.println("Welcome to Addition Facts Practice!");
        int right = 0, wrong = 0;
        
        //Prepare for user answers
        Scanner scan = new Scanner(System.in);
   
        //Loop for at least 10 problems, but keep going until
        //user has attained 80% correct
        while(right + wrong < 10 || getCurrentPercent(right, wrong) < 80){
            
            //Display a problem and save the correct answer
            //that is returned from the method
            int correctAnswer = generateProblem();
            
            //Get user's answer
            int userAnswer = scan.nextInt();
            
            //Check answer and add to totals
            if(userAnswer == correctAnswer){
                right++;
                System.out.print("> Right! ");
            }
            else{
                wrong++;
                System.out.print("> Wrong. ");
            }
            //Display current percentage
            System.out.println("Current percent: " + getCurrentPercent(right, wrong) + "\n\n");
            
        }
        
        //Display total number of questions and final percentage
        displayFinalResults(right, wrong);
    }
    
    
    //TODO: generateProblem

    
    //TODO: getCurrentPercent

    
    //TODO: displayFinalResults

    
    
}