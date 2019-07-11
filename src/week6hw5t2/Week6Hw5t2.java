package week6hw5t2;

import java.util.Scanner;

public class Week6Hw5t2 {
    public static void main(String[] args) {
        Scanner keyIn =new Scanner(System.in);
        double speed = -1;
        int time = 0;
        double distanceTravel;
        
        while(speed < 0){
            System.out.println("Enter the speed of the vehicle.");
            speed = keyIn.nextDouble();
        }
        while (time < 1){
            System.out.println("Enter the number of hours the vehicle traveled?");
            time = keyIn.nextInt();
        }
        
        System.out.println("Hour \t Distance \n---- \t --------");
        for(int hour = 1; hour <= time; hour++){
            distanceTravel = (hour * speed);
            System.out.println( hour + "\t" + distanceTravel);
            
        }
    }
    
}
