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
public class Persona {
    private String nome;
    private String cognome;
    private String titolo;
    private String professione="disoccupato";
    
    public Persona(String nome,String cognome,String titolo,String professione)
    {
       this.nome=nome;
       this.cognome=cognome;
       this.titolo=titolo;
       this.professione=titolo;
    }
    
    public Persona(String nome, String cognome)
    {
            this.nome=nome;
            this.cognome=cognome;
    
    
}
   public String getInfoPersona()
   {
       return nome+" "+cognome+" "+titolo+" "+professione;
       
   }
   public void setTitolo(String titolo)
   {
      this.titolo=titolo; 
   }
   public void setProfessione(String professione)
   {
      this.professione=professione;
   }
   
   