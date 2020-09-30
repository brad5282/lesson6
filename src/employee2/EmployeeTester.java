
package employee2;

import java.util.Scanner;


public class EmployeeTester {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee e;
        String name;
        int type;
        double rate;
        int hours;
        String prompt;
        do{
        while(true){
            e = new Employee();
            System.out.print("Enter name, " + e.getNameRules() + ": ");
            name = s.nextLine();
            if(e.setName(name)) break;
            
        }
        
        while(true){
            System.out.print("Enter type, " + e.getTypeRules()+":");
            type = s.nextInt();
            if(e.setType(type))break;
        }
        
        while(true){
            System.out.print("Enter hours, " + e.getHourRules()+":");
            hours = s.nextInt();
            if(e.setHours(hours))break;
        }
        
        while(true){
            System.out.print("Enter rate, " + e.getRateRules()+":");
            rate = s.nextDouble();
            if(e.setRate(rate))break;
        }
        System.out.println("----------------------------------");
        System.out.println("Pay this week for " + e.getName());
        System.out.println("$" + e.getPay());
        System.out.println("\nEnter another? y or n: ");
        prompt = s.next();
        s.nextLine();//clear scanner for next empoyee
    }while(prompt.equals("y")||prompt.equals("Y"));
        System.out.println("Goodbye");
    }
    
}
