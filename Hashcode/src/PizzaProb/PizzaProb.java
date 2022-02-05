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
import java.util.ArrayList;

/**
 *
 * @author Jamit
 */
public class PizzaProb {

    private int clientsCount = 0;
    private int likePreferences = 0;
    private int dislikePreferences = 0;
    private String[] likeArray;
    private String dislikeArray[];
    static File myObj;

    public static void main(String[] args) {
        openFile();
    }

    private static void openFile() {
        try {
            myObj = new File("a_an_example.in.txt");
            Scanner myReader = new Scanner(myObj);
            int n = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //int i = Integer.parseInt(data);
                n++;
                if (n == 1) {
                    //int clientsCount = Integer.parseInt(data);
                    System.out.println("Number of customers " + data);
                } else if (n % 2 == 0) {
                    String likeArray = new String();

                    likeArray = data;

                    System.out.println("like array " + likeArray);

                } else if (n % 2 == 1) {
                    String dislikeArray = new String();

                    dislikeArray = data;

                    System.out.println("Dislike array " + dislikeArray);
                }
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PizzaProb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
