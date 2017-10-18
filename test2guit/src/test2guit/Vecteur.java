package test2guit;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * <b>Vecteur est la classe réprésentant un tableau d'entiers</b>
 *un Vecteur est caractérisé par les informations suivants:
 * <ul>
 * <li><strong>vect:</strong> qui est un tableau d'entier.</li>
 * <li><strong>taille:</strong> qui est la taille du tableau vect.</li>
 * </ul>
 *  

 * @author Admin
 */
    

public class Vecteur {
    /**
     * Le tableau d'entier qui réprésente la classe vecteur
     * @see Vecteur#Vecteur(int) 
     * @see Vecteur#remplir() 
     * @see Vecteur#afficher()
     * @see Vecteur#retournerBornes(int, int) 
     * @see Vecteur#sommer(test2guit.Vecteur) 
     * @see Vecteur#triVecteur() 
     * @see Vecteur#Inverser() 
     * @see Vecteur#ADD(int) 
     *@see Vecteur#Mul(int)
     * @see Vecteur#SUB(int) 
     * 
     */
     int vect[];
     /**
     * la taille du tableau vect qui réprésente la classe Vecteur  
     * @see Vecteur#Vecteur(int) 
     * @see Vecteur#remplir() 
     * @see Vecteur#afficher()
     * @see Vecteur#retournerBornes(int, int) 
     * @see Vecteur#sommer(test2guit.Vecteur) 
     * @see Vecteur#triVecteur() 
     * @see Vecteur#Inverser() 
     * @see Vecteur#ADD(int) 
     *@see Vecteur#Mul(int)
     * @see Vecteur#SUB(int) 
     * 
     */
    int taille;
    
   /**
    * Constructeur Vecteur
    * <p>Construction d'un objet Vecteur qui un tableau à remplir. 
    * </p>
         * @param t 
         * taille de vecteur à construire
         * @see Vecteur#taille
         * @see Vecteur#vect
         */
    public Vecteur (int t)
    { 
         
      taille=t;
      vect=new int [taille] ;
    }
    /**
    *  
    * <p>Remlplir le vecteur par des entiers entrés par l'utilisateur. 
    * </p>
          
        
         * @see Vecteur#taille
         * @see Vecteur#vect
         */
    public void remplir()
    {
        for(int i=0;i<taille;i++)
        {
          Scanner sc=new Scanner(System.in);  
          vect[i]=sc.nextInt(); 
        }
    }
    /**
    *  
    * <p>Afficher tous les élements du tableau vect. 
    * </p>
        
         * @see Vecteur#taille
         * @see Vecteur#vect
         */
    public void afficher ()
    {
        for(int i=0;i<taille;i++){
        System.out.println(vect[i]);
        }
    }
    /**
    
    * <p>Trié le tableau vect en ordre croissant. 
    * </p>  
         
         * @see Vecteur#taille
         * @see Vecteur#vect
         */
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
    /**
     
    * <p>Trouver le maximum et le minimum dans le tableau vect. 
    * </p>
       
         @param max
         * le maximum dans le tableau vect
         *    @param min
         * le minimum dans le tableau vect
     * @return 
         * @see Vecteur#taille
         * @see Vecteur#vect
         */
    public void retournerBornes(int max,int min)
    {
        int i;
        Integer v[]=new Integer [2];
      
      for(i=0;i<taille-1;i++)
       {
          if (vect[i]>vect[i+1] ) max=vect[i+1];//max
          if (vect[i+1]>vect[i] ) min=vect[i+1];//min
       }
      
    
    }
      /**
     
    * <p>Sommer deux tableaux de meme taille et générer une exception si ils sont de tailles différentes. 
    * </p>
       
         @param vect2
         * un tableau auquel on somme vect 
         
         * @see Vecteur#taille
         * @see Vecteur#vect
         * @throws TailleDifferentException
         * lancée si les tailles des vecteurs sont différentes
         */
   public void sommer (Vecteur vect2) throws TailleDifferentException
    {if (taille != vect2.taille ) throw new TailleDifferentException();
    else {
    for(int i=0;i<taille;i++)
     vect[i] =vect[i]+vect2.vect[i];
    }
    }
    /**
     
    * <p> Inverser les éléments d'un tableau. 
    * </p>
       
      
         
         * @see Vecteur#taille
         * @see Vecteur#vect
        
         */
    public void Inverser ()
    {  int j=0;
       int VV[]=new int[taille];
    for(int i=taille-1;i>=0;i--)
    {  VV[j]=vect[i];
       j++;
    }
    
    for(int i=0;i<taille;i++)
      vect[i]=VV[i];
    }
 /**
     
    * <p> Multiplier tous les éléments de vect par x. 
    * </p>
    * @param x
    * le facteur de multiplication
       
         
      
         */
    public void Mul (int x)
    {
     for(int i=0;i<taille;i++)
     vect[i]=vect[i]*x;
    }
    /**
     
    * <p> Ajouter x à tous les éléments de vect. 
    * </p>
    * @param x
    * le nombre qu'on ajoute à chaque élément de vect
     */
    public void ADD (int x)
    {
     for(int i=0;i<taille;i++)
     vect[i]=vect[i]+x;
    }
     /**
     
    * <p> Soustraire x de tous les éléments de vect. 
    * </p>
    * @param x
    * le nombre qu'on soustrait de chaque élément de vect
     */
    public void SUB (int x)
    {
     for(int i=0;i<taille;i++)
     vect[i]=vect[i]-x;
    }

    static class vect {

        public vect() {
        }
    }
    
    
}
