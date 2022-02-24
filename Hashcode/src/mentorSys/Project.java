/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentorSys;

import java.util.ArrayList;

public class Project {

    String projectName;
    int numberOfDays;
    int scoreAward;
    int bestBefore;
    int numberOfRole;
    ArrayList<SkillAndLevel> roleandlevel = new ArrayList<SkillAndLevel>();

    public Project(String projectName, int numberOfDays, int scoreAward, int bestBefore, ArrayList<SkillAndLevel> skillandlevel) {
        this.projectName = projectName;
        this.numberOfDays = numberOfDays;
        this.scoreAward = scoreAward;
        this.bestBefore = bestBefore;
        this.roleandlevel = skillandlevel;
        this.numberOfRole = roleandlevel.size();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getScoreAward() {
        return scoreAward;
    }

    public void setScoreAward(int scoreAward) {
        this.scoreAward = scoreAward;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

    public int getNumberOfRole() {
        return numberOfRole;
    }

    public void setNumberOfRole(int numberOfRole) {
        this.numberOfRole = numberOfRole;
    }

    public ArrayList<SkillAndLevel> getSkillandlevel() {
        return roleandlevel;
    }

    public void setSkillandlevel(ArrayList<SkillAndLevel> skillandlevel) {
        this.roleandlevel = skillandlevel;
    }
    
}
