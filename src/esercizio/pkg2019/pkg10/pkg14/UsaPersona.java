/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg2019.pkg10.pkg14;

/**
 *
 * @author LAB-INFORM-1 PC16
 */
public class UsaPersona {
    
   private String persona1;
   private String persona2;
   
   
           public static void main(String[] args) {
        // TODO code application logic here
   {
       Persona persona1 = new Persona("Roberto","Marelli","nulla","Insegnante");
       Persona persona2 = new Persona("Marco ","Redaelli");
       
       System.out.println(persona1.getInfoPersona());
       System.out.println(persona2.getInfoPersona());
       persona1.setTitolo("sig");
       persona1.setProfessione("macchinista");
       System.out.println(persona1.getInfoPersona());
   }
}
}
