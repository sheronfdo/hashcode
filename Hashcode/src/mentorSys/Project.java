/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentorSys;

import java.util.ArrayList;

public class Project {
      String pname;
      ArrayList<SkillAndLevel> skillandlevel = new ArrayList<SkillAndLevel>();

    public Project() {        
    }

    public String getPName() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
    
    public ArrayList<SkillAndLevel> getSkillandlevel() {
        return skillandlevel;
    }
    
    
    public void setSkillandlevel(ArrayList<SkillAndLevel> skillandlevel) {
        this.skillandlevel = skillandlevel;
    }
    
      
}
