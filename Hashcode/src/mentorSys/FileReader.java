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
    static ArrayList<Project> project = new ArrayList<Project>();

    public static void main(String[] args) {
        readFile();
        doneProject();
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
                    skillandlevel.add(new SkillAndLevel(skillName, skillLevel));
                }
                contributor.add(new Contributor(name, skillandlevel));
            }
            for (int i = 0; i < projectCount; i++) {
                data = myReader.nextLine();
                String[] arr = data.split(" ");
                String name = arr[0];
                int numberOfDays = Integer.parseInt(arr[1]);
                int scoreAward = Integer.parseInt(arr[2]);
                int bestBefore = Integer.parseInt(arr[3]);
                int role = Integer.parseInt(arr[4]);
                ArrayList<SkillAndLevel> roleandlevel = new ArrayList<SkillAndLevel>();
                for (int j = 0; j < role; j++) {
                    data = myReader.nextLine();
                    String skillName = data.split(" ")[0];
                    int skillLevel = Integer.parseInt(data.split(" ")[1]);
                    roleandlevel.add(new SkillAndLevel(skillName, skillLevel));
                }
                project.add(new Project(name, numberOfDays, scoreAward, bestBefore, roleandlevel));
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    ArrayList<Contributor> eligibleContribute = new ArrayList<Contributor>();
    private static void doneProject(){
        for (int i = 0; i < project.size(); i++) {
            Project proj = project.get(i);
            int rolesize= proj.getNumberOfRole();
            ArrayList<SkillAndLevel> arrli=  proj.getSkillandlevel();
            for (int j = 0; j < rolesize; j++) {
                SkillAndLevel skillAndLevel = arrli.get(i);
                String skill = skillAndLevel.getSkillName();
                int level = skillAndLevel.getSkillLevel();
                
                
                for (int k = 0; k < contributor.size(); k++) {
                    Contributor contr = contributor.get(k);
                    ArrayList<SkillAndLevel> arraylis = contr.getSkillandlevel();
                    for (int l = 0; l < arraylis.size(); l++) {
                        if (arraylis.get(l).getSkillName().equals(skill)) {
                            if((arraylis.get(l).getSkillLevel() > level) && (arraylis.get(l).getSkillLevel() > level) ){
                                
                            }
                        }
                    }
                }
                
                
            }
        }
    }
}
