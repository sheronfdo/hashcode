/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentorSys;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mentorSys.MentorSys.myObj;

/**
 *
 * @author Kaveesha FDO
 */
public class FileReader {

    static int contributorCount = 0;
    static int projectCount = 0;
    static ArrayList<Contributor> contributor = new ArrayList<Contributor>();
 
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        try {
            myObj = new File("a_an_example.in.txt");
            Scanner myReader = new Scanner(myObj);

            String data = myReader.nextLine();
            contributorCount = Integer.parseInt(data.split(" ")[0]);
            projectCount = Integer.parseInt(data.split(" ")[1]);
            
            for (int i = 0; i < contributorCount; i++) {
                data = myReader.nextLine();
                String name = data.split(" ")[0];
                int skillCount = Integer.parseInt(data.split(" ")[1]);
                ArrayList<SkillAndLevel> skillandlevel = new ArrayList<SkillAndLevel>();
                for (int j = 0; j < skillCount; j++) {
                    data = myReader.nextLine();
                    String skillName = data.split(" ")[0];
                    int skillLevel = Integer.parseInt(data.split(" ")[1]);
                    skillandlevel.add(new SkillAndLevel(skillName,skillLevel));
                }
                contributor.add(new Contributor(name,skillandlevel));
            }
            

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
