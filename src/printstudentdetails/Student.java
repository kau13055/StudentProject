/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printstudentdetails;

/**
 *student is an entity: it means they have some state behavior, properties
 * model class: raw data for student, talks about entity of the class
 * encapsulation : private , getter and setter methods- protecting variables from other class from direct access.
 * variables are encapsulated by getter and setter. No other class can touch the variables. 
 * refactor:
 * @author DELL
 */
public class Student 
{
    private String name;
    private int s_id;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the s_id
     */
    public int getS_id() {
        return s_id;
    }

    /**
     * @param s_id the s_id to set
     */
    public void setS_id(int s_id) {
        this.s_id = s_id;
    }
}
