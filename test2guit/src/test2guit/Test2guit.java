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
       // v1.retournerBornes(max, min);
         v1.Inverser();
        Vecteur v2=new Vecteur(4);
        v2.remplir();
        v2.afficher();
        try{
        v1.sommer(v2);
        }
        catch(TailleDifferentException e){
        System.out.println(e.getMessage());
        return;
        }
        v1.afficher();
    }
    
}
