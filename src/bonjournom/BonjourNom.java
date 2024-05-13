/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bonjournom;

/**
 *
 * @author basma
 */
import aleatoire.Person;

public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person(args[0],args[1],20);
// TODO code application logic here
               // System.out.println("Hello world");
        System.out.printf("Bonjour %s %s!Vous avez %d ans.\n", p.getFirstName(),p.getLastName(),p.getAge());
    }
    
}
