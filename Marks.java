import java.util.Scanner;

/**
 * Write a description of class Marks here.
 *
 * @author (David Penaloza)
 * @version (V1.0)
 */
public class Marks
{
    // instance variables - replace the example below with your own
    //public int x;

    /**
     * Constructor for objects of class Marks
     */
    public static void main(String[] args)
    {
        int numberOfStudents = 10;
        float[] mark = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give marks to 5 students");
        //Code for avoid the loop from the use the sentence "continue". 
        //The user needs to write the adequate value. When users execute the true value according the problem condition. 
        //Then, they can entered the next value. Otherwise a message will be displayed: "invalide mark, please enter again"

        for(int i=0; i<numberOfStudents; i++){
            
            float temp;

            do{
                temp = scanner.nextFloat();
                if(temp<0 || temp>10){
                   
                    System.out.println("Invalide marks,please enter again");    
                }
                } while (temp<0 || temp>10);
                mark[i] = temp;
            
            }
      
        System.out.println("Entered marks");
        for(int i=0; i<numberOfStudents; i++){
            System.out.println(mark[i]);
            
        }
        
        float total = 0;
        for(int i = 0; i<numberOfStudents; i++){
            total = total + mark[i];
        
        }
        float mean =0;
        mean = total / numberOfStudents;
        System.out.println("The mean value of total Mark is: " + mean);
        
        float sumdiff;
        for(int i =0; i<numberOfStudents; i++) {
            sumdiff = (mark[i]-mean)*(mark[i]-mean);
            sumdiff = sumdiff / numberOfStudents;
            System.out.println(sumdiff);
        
        }
        float totalsumdiff =0;
        for(int i = 0; i<numberOfStudents; i++){
            totalsumdiff = totalsumdiff + (mark[i]-mean)*(mark[i]-mean)/numberOfStudents;
        
        }
        float Markmax=0;
        for(int i=0; i < numberOfStudents; i++){
            if (mark[i] > Markmax) {
                Markmax = mark[i];
            
            } 
        }
        
        float Markmin = mark[0];
        for(int i=0; i < numberOfStudents; i++){
            if (mark[i] < Markmin) {
                Markmin = mark[i];
            
            } 
        }
        
        System.out.println("Variance: " +totalsumdiff);
        System.out.println("The maximun value of Mark is: " + Markmax);
        System.out.println("The minimun value of Mark is: " + Markmin);

    }
}
