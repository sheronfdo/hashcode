/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentorSys;

import java.util.ArrayList;

/**
 *
 * @author Jamit
 */
public class Contributor {
    String name;
    ArrayList<SkillAndLevel> skillandlevel = new ArrayList<SkillAndLevel>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SkillAndLevel> getSkillandlevel() {
        return skillandlevel;
    }

    public void setSkillandlevel(ArrayList<SkillAndLevel> skillandlevel) {
        this.skillandlevel = skillandlevel;
    }
    
}
