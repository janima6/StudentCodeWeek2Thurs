/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author mehta
 */
public class StudentDemo {

    private String name;
    private int ID;
   private int MaxCourse;

    //constructor
    public StudentDemo(String givenName)
    {
        name=givenName;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int giveID) {
        this.ID = giveID;
    }

    /**
     * @return the MaxCourse
     */
    public int getMaxCourse() {
        return MaxCourse;
    }

    /**
     * @param givenMaxCourse the MaxCourse to set
     */
    public void setMaxCourse(int givenMaxCourse) {
        this.MaxCourse = givenMaxCourse;
    }
    
    
}
