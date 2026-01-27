/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author thong
 */
import java.util.Scanner;
class Requirements
{   
    String name;
    int age;
    String sex ;
    double weight;
    double hemoglobin_level;
    
    public Requirements(String name,int age, String sex, double weight, double hemoglobin_level)
    {  
       this.name=name;
       this.age = age;
       this.sex = sex;
       this.weight = weight;
       this.hemoglobin_level = hemoglobin_level;
    }
    //checking basic requirement
    public void get_requirement(){
    if(age >= 18 && age <= 65){
       if(weight>=50)
    {    
        System.out.println("You are pass phase1 requirement");
    } else{
      System.out.println("You are not eligible");
       }
    }
}   
    //checking hemoglobin level
    public void get_hemoglobin(){
    if(sex.equalsIgnoreCase("Male")){
        if(hemoglobin_level>=13.0){
    System.out.println("You have passed secound phases");
        }else{
         System.out.println("Not eligible: Hemoglobin too low for men.");
         }
    }
    else if(sex.equalsIgnoreCase("Female")){
    if(hemoglobin_level>=12.5){
     System.out.println("You have passed the secound phases");
         }
        }
        else{
         System.out.println("Not eligible: Hemoglobin too low for women.");
        }
      }
    }
   

public class BloodDonationRequirement {

    
    public static void main(String[] args) {
        Scanner person1 = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = person1.nextLine();
        
        System.out.println("Input your age: ");
        int age = person1.nextInt();
        
        System.out.println("Input your sex: " );
        String sex = person1.nextLine();
        
        person1.nextLine(); 
        
        System.out.println("Input your weight here: ");
        double weight = person1.nextDouble();
        
        System.out.println("Input your hemoglobin level here: ");
        double hemoglobin_level = person1.nextDouble();
        
        //calling methods
        Requirements donor = new Requirements(name, age, sex, weight, hemoglobin_level);
        
       
        //display the result
        System.out.println("Name: "+name);
        System.out.println("Name: "+age);
        System.out.println("Sex:"+sex);
        System.out.println("Name: "+weight+" kg");
        System.out.println("Hemoglobin level: "+hemoglobin_level+ "g/dl");
        
        //calling methods
        donor.get_requirement();
        donor.get_hemoglobin();
        
      
        
    }
    
}
