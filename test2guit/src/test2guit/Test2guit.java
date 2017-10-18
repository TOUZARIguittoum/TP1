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
        int v[]=new int[2];        
        v1.remplir();
      v1.retournerBornes(v);
      System.out.println(v[0]+"  "+v[1]);
      
    }
    
}
