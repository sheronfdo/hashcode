/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaProb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jamit
 */
public class PizzaProb {
    private int clientsCount = 0;
    private int likePreferences = 0;
    private int dislikePreferences = 0;
    private String likeArray[];
    private String dislikeArray[];
    static File myObj;
    
    public static void main(String[] args) {
        openFile();
    }
    
    private static void openFile(){
        try {
            myObj = new File("a_an_example.in.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PizzaProb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
