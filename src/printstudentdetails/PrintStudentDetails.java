/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *store and print student details
 * view class- User interaction class
 * @author DELL
 */
public class PrintStudentDetails {

    /**
     * dataType of array is  class name
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Student[] list = new Student[3]; // store objects of student class 
       Student s1 = new Student();   
       Student s2 = new Student();
       Student s3 = new Student();
       
       // setting the value for the variables using setter method
       
       s1.setName("Peter");
       s1.setS_id(12);
       
       s2.setName("Jaspreet");
       s2.setS_id(13);
       
       s3.setName("Navneet");
       s3.setS_id(14);
       
       // store objects in an array -- array of objects
       
       list[0]=s1;
       list[1]=s2;
       list[2]=s3;
       
       for(int i=0;i<list.length;i++)
       {
           System.out.println(list[i].getName() + " " + list[i].getS_id());
       }
       
       
       
    }
    
}
