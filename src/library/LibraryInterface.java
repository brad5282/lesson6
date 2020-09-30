/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author brad5282
 */
public class LibraryInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1, b2, b3, b4, b5;
        b1 = new Book("Greg Hines","From Russia wwith Love");
        b2 = new Book("Rita Langill","Living Smart");
        b3 = new Book( "Harry Conner","Singing in the Rain");
        b4 = new Book("Pat Burns","Good Housekeeping");
        b5 = new Book("Lisa Lahey","To Be A Model");
        System.out.println("Here are the books available: ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        Patron p = new Patron("Miles Davis");
        System.out.println("Lending 4 books to " + p.getName());
        if(p.Borrow(b1)) System.out.println(b1.getTitle() + " successfully borrowed.");
        else System.out.println(b1.getTitle()+"could not be borrowed");
        
        if(p.Borrow(b2)) System.out.println(b1.getTitle() + " successfully borrowed.");
        else System.out.println(b2.getTitle()+"could not be borrowed");
        
        if(p.Borrow(b3)) System.out.println(b1.getTitle() + " successfully borrowed.");
        else System.out.println(b3.getTitle()+"could not be borrowed");
        
        if(p.Borrow(b4)) System.out.println(b1.getTitle() + " successfully borrowed.");
        else System.out.println(b4.getTitle()+"could not be borrowed");
        
        if(p.Borrow(b5)) System.out.println(b1.getTitle() + " successfully borrowed.");
        else System.out.println(b5.getTitle()+"could not be borrowed");
        
        //returning books
        System.out.println("-------\nAttempting to return the first book:\n-------------");
        if(p.returnBook(b1)) System.out.println(b1.getTitle()+ " successfully returned.");
        else    System.out.println(b1.getTitle() + " was not borrowed out.");
        System.out.println("---------\nHere is a list of books currently lent to "+ p.getName() + "\n--------");
        if(p.returnBook(b2)) System.out.println(b2);
        if(p.returnBook(b3)) System.out.println(b3);
        if(p.returnBook(b4)) System.out.println(b4);
        if(p.returnBook(b5)) System.out.println(b5);
    }
    
}
