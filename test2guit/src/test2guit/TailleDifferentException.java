/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2guit;

/**
 * <p> Cette exeption est lancé dans le cas ou on essai de sommer deux vecteurs de taille differentes 
   </p>
 * @author jean
 */
public class TailleDifferentException extends Exception {
    
    public TailleDifferentException(){
        super(" les taille des tableaux sont differentes ");
    }
}