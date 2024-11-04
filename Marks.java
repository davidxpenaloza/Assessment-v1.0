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
        int numberOfStudents = 5;
        float[] mark = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give marks to 5 students");
        
        for(int i=0; i<numberOfStudents; i++){
            
            float temp = scanner.nextFloat();
            
            if(temp<0 || temp>30){
            
                System.out.println("Invalide marks,please enter again");
                continue;
            
            }
            
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
            //System.out.println("The total summ of Mark is: " +totalsumdiff);
        
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
