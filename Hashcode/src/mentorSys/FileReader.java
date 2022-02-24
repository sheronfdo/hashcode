/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentorSys;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mentorSys.MentorSys.myObj;

/**
 *
 * @author Kaveesha FDO
 */
public class FileReader {

    int contributorCount = 0;
    int projectCount = 0;

    public static void main(String[] args) {
        readCondributor();
    }

    private static void readCondributor() {
        try {
            myObj = new File("a_an_example.in.txt");
            Scanner myReader = new Scanner(myObj);

//                String data = myReader.nextLine();
//                System.out.println(data);
       

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MentorSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
