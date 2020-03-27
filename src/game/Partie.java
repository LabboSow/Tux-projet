package game;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author valleta
 */
public class Partie {
    
    private String date;
    private String mot;
    private int niveau;
    
    // le % de lettres trouvees a la fin de la partie
    private int trouve;
    // le temps en secondes qu'a duré la partie
    private int temps;
    
    public Partie(String date, String mot, int niveau){
        this.date = date;
        this.mot = mot;
        this.niveau = niveau;
    }
    
    // reinitialisation d'une partie deja faite issue du XML
    public Partie(Element partieElt){
        
    }
    
    // cree le bloc XML a partie de doc
    public Element getPartie(Document doc)
    {
        return null;
    }
    
    public void setTrouve(int LettresRestantes)
    {
        int tailleMot = mot.toCharArray().length;
        int lettresTrouvees = tailleMot - LettresRestantes;
        System.out.print("taille du mot = " + tailleMot + "\n");
        System.out.print("trouve du mot = " + lettresTrouvees + "\n");
          System.out.print("pourcentage du mot = " +lettresTrouvees/tailleMot + "\n");

    }
    
    public void setTemps(int temps)
    {
        this.temps = temps;
    }
    
    public int getNiveau()
    {
        return niveau;
    }
   
    public String getMot(){
    return this.mot;
    }
    public String toString(){
        return "Partie : [Mot = " + this.mot + "] [Temps = "+ temps + "]  [niveau  = " + this.niveau + "] [date = " + this.date + "] [% =  "+this.trouve + "]";
    }
}
