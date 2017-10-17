/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2guit;
/**
 *
 * @author Admin
 */
public class Test2guit {

    
    public static void main(String[] args) {
        Vecteur v1=new Vecteur(3);
        int min = 0,max=0;
        v1.remplir();
        v1.triVecteur();
        v1.afficher();
        v1.retournerBornes(max, min);
    }
    
}
