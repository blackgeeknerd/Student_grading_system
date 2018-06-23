//import the scanner package from the java util library using import
import java.util.*;  //this imports basically everything from the java util library

//import javax.lang.model.util.ElementScanner6;

public class student_marks {

    public static void main(String[] args) {
        //Assigning if subject  and final score variables
        int maths, physics, chemistry, english, computersc;
        double finalscore;
        boolean result;

        //Create an object for creating input
        Scanner marks =  new Scanner(System.in);
        //the do while loop
        do
        {
            System.out.println("Enter Marks for Maths");
            //take an input from the user
            maths = marks.nextInt();
            // this is to make sure our mathsscore is not greater than 100 or less than 0
            while ( (maths > 100 ) || (maths < 0) )
            {
                System.out.println("Invalid Score, score between 1-100");
                System.out.println("Enter Marks for Maths again");
                maths = marks.nextInt();
            }
            System.out.println("Enter Marks for Chemistry");
            //take an input from the user
            chemistry = marks.nextInt();

            // this is to make sure our mathsscore is not greater than 100 or less than 0
            while ( (chemistry > 100 ) || (chemistry < 0) )
            {
                System.out.println("Invalid Score, score between 1-100");
                System.out.println("Enter Marks for Chemistry again");
                chemistry = marks.nextInt();
            }
            System.out.println("Enter Marks for Physics");
            //take an input from the user
            physics = marks.nextInt();
            // this is to make sure our physics score is not greater than 100 or less than 0
            while ( (physics > 100 ) || (physics < 0) )
            {
                System.out.println("Invalid Score, score between 1-100");
                System.out.println("Enter Marks for Physics again");
                physics = marks.nextInt();
            }
            System.out.println("Enter Marks for English");
            //take an input from the user
            english = marks.nextInt();
             // this is to make sure our English score is not greater than 100 or less than 0
            while ( (english > 100 ) || (english < 0) )
            {
                System.out.println("Invalid Score, score between 1-100");
                System.out.println("Enter Marks for English again");
                english = marks.nextInt();
            }
            System.out.println("Enter Marks for Computer Science");
            //take an input from the user
            computersc = marks.nextInt();
              // this is to make sure our Computer sci score is not greater than 100 or less than 0
              while ( (computersc > 100 ) || (computersc < 0) )
              {
                  System.out.println("Invalid Score, score between 1-100");
                  System.out.println("Enter Marks for Computer Science again");
                  english = marks.nextInt();
              }

            //compute final score and divide by 5
            finalscore = (maths + english + chemistry + physics + computersc) / 5;

            //assign the grade
            if(finalscore > 90)
            {
                System.out.println("Excellent");
            }
            else if(finalscore > 80)
            {
                System.out.println("Very Good");
            }
            else if(finalscore > 60)
            {
                System.out.println("Good");
            }
            else if(finalscore > 40)
            {
                System.out.println("Average");
            }
            else
            {
                System.out.println("Poor");
            }
            System.out.println("Any more student?(true or false)"); //this checks if there is anymore student marks to be calculated

        result = marks.nextBoolean(); //the next boolean value that is input should be stored in result
        } while (result); // till the time my result is false keep executing this program
    }
    
} 