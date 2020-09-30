
package employee2;

import java.util.Scanner;


public class TheoryExample {

    
    public static void main(String[] args) {
        //recall you can use && and || and ! in boolean expressions 
        //                   and    or     not
        
        int x = 12, y=17;
        System.out.println(x!=y);//true
        System.out.println(x >= y || x <15); //true due to or statement
        System.out.println(x >= y && x < 10);//false
        
        //sample programme 
        //write 2 tests to see if you can be a manager, supervisor or clerk
        //Manager = both scores > 90
        //supervisor, 1 score > 90, cant be below 50
        //clerk, 1 over 70 and none <50
        
        int score1, score2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter test score 1: ");
        score1 = s.nextInt();
        System.out.println("Enter test score 2: ");
        score2 = s.nextInt();
        
        //if(score > 90 && score 2 > 90)
        //(score 1 > 90 or score 2 > 90 && !(score1,50 && score2 <50))
        boolean bo90 = score1>=90 && score2>=90;
        boolean al190 = score1>=90 || score2>=90;
        boolean f = score1 <=50 || score2<=50;
        boolean atl70 = score1>=70 || score2>=70;
        
        if(bo90)
            System.out.println("Manager");
        else if (al190 && !f)
            System.out.println("Supervisor");
        else if (atl70 && !f)
            System.out.println("clerk");
        else
            System.out.println("dummy");
        
    }
    
}
