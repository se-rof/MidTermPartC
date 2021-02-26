/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 * @author Joshua
 * Student ID: 991598983
 * Student Name: Raphael Joshua Fortes
 */
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserProfile userID = new UserProfile();
        
        System.out.print("Enter Name: ");
        String userName = input.nextLine();
        
        
        System.out.println("List of genres: Comedy, Drama, Action, Mystery");
        System.out.print("Favourite Genre: ");
        String userGenre = input.nextLine();
    }
    
}
