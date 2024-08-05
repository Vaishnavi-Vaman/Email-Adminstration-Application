/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

public class EmailApp {
    public static void main(String[] args){
        Email em1=new Email("Vaishnavi","Sirsat");
        
       // em1.setAlternateEmail("vaish@gmail.com");
       // System.out.println(em1.getAlternateEmail());
       //now it generates automaticly no need of above 2 lines code
       System.out.println(em1.showInfo());
    }
}

