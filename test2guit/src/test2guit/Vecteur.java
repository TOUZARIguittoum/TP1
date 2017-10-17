package test2guit;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class Vecteur {
    int vect[];
    int taille;
    public Vecteur (int t)
    { 
      taille=t;
      vect=new int [taille] ;
    }
    public void remplir()
    {
        for(int i=0;i<taille;i++)
        {
          Scanner sc=new Scanner(System.in);  
          vect[i]=sc.nextInt(); 
        }
    }
    public void afficher ()
    {
        for(int i=0;i<taille;i++){
        System.out.println(vect[i]);
        }
    }
    public void triVecteur()
    {
    int i,j,x;
    for (i=1;i<taille;i++)
    {
    x=vect[i];
    j=i;
    while (vect[j-1]> x && j>=0)
    {
    vect[j]=vect[j-1];
    j--;
    
    }
    vect[j]=x;
    }
    }
    public void retournerBornes(int max,int min)
    {
        int i;
        min=vect[0];
        max=vect[0];
      for(i=0;i<taille-1;i++)
      {
          if (vect[i]>vect[i+1] ) min=vect[i+1];
          if (vect[i+1]>vect[i] ) max=vect[i+1];
       }
    System.out.println(min +" "+ max);
    
    }

    
    
  
    
    
}
