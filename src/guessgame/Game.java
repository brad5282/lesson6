
package guessgame;

public class Game {
    private int number;
    private int numguess;
    public int myguess;
    
    public Game(){
        numguess = 0;
        number =(int)(Math.random()*100 +1);
        myguess=0;
    }
    
    public boolean setGuess(int number){
        if(number>100|| number<0)
            return false;
        myguess = number;
        System.out.println("Guess is set to "+ myguess);
        numguess++;
        return true;
    }
    
    public String giveResult(){
        if(myguess==number) return "You got it!";
        else if (myguess > number ) return "Your guess, " + myguess+ " is too high, guess lower";
        else return "Your guess, " +myguess+ " is Too low, guess higher"; 
    }
    
    public int getNumGuesses(){
        return numguess;
    }
}
