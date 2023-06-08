/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhea260522;

/**
 *
 * @author WIN10PC
 */
public class Student extends Person 
{ 
 public Student(){
     super ();
     super.name="anna";
     super.address="padang";
     
    System.out.println("Inside Student:Constructor"); 
    //beberapa kode di sini 
    } 
 
 @Override
     public String getName(){
        System.out.println("Student: getName");
        return name;
    }
     
    // beberapa kode di sini 
    public static void main( String[] args ){ 
    Student anna = new Student(); 
    System.out.println("Nama "+ anna.getName());
    System.out.println("Alamat "+ anna.getAddress());
     }
    
    }
