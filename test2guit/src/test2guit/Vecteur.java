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
    * Constructeur Vecteur sans arguments 
    * <p>Construction d'un objet Vecteur qui un tableau à remplir. 
    * </p>
        
         */
    public Vecteur (){}
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
          System.out.print("vecteur["+i+"]=");
          vect[i]=sc.nextInt();
          System.out.println();
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
        for(int k=0;k<taille;k++){
        System.out.println("vecteur["+k+"]="+vect[k]);
        }
    }
    /**
    
    * <p>Trié le tableau vect en ordre croissant. 
    * Exemple: V1={2,8,5,1,4,7,9,6,3,10};
    * aprés tri : V1={1,2,3,4,5,6,7,8,9,10};
    * </p>  
         
         * @see Vecteur#taille
         * @see Vecteur#vect
         */
  public void triVecteur()
    {
    int i=1,x;
    System.out.println("hhh");
    boolean inv1;
    do{
        inv1=false;
        for (i=0;i<taille-1;i++)
         {
           if (vect[i]>vect[i+1])
             {
                x=vect[i];
                vect[i]=vect[i+1];
                vect[i+1]=x;
        inv1=true;
    
              }
         }
      }while(inv1);
     }
    /**
     
    * <p>Trouver le maximum et le minimum dans le tableau vect. 
    * Exemple: Soit V1 un tableau tell que : V1={2,8,5,1,4,7,9,6,3,10};
    *    on obtient : max=10, min=1;
    * </p>
       
     
         *@param v
         * un tableau contient le max et le min
   
         * @see Vecteur#taille
         * @see Vecteur#vect
         */
    public void retournerBornes(int v[] )
    {
        int i;
         
      v[0]=vect[0];
      v[1]=vect[0];
      for(i=0;i<taille-1;i++)
       {
          if (vect[i]>vect[i+1] ) v[0]=vect[i+1];//min
          if (vect[i+1]>vect[i] ) v[1]=vect[i+1];//max
           
       }
    
    }
      /**
     
    * <p>Sommer deux tableaux de meme taille et générer une exception si ils sont de tailles différentes.
    * Exemple: Soit V1 et V2 deux vecteurs de taille egale tell que : V1={1,2,3,4,5,6,7,8,9,10}, V2={2,8,5,1,4,7,9,6,3,10};
    * on obtient : V3=V1+V2={3,10,8,5,12,15,13,14,12,20};
    * Si V1et V2 sont de taille differente le message suivant est affiché: "les taille des tableaux sont differentes";
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
    * Exemple : Soit V1={1,2,3,4,5,6,7,8,9,10};
    * on obtient: V1={10,9,8,7,6,5,4,3,2,1};
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
    * Exemple : Soit V1={1,2,3,4,5,6,7,8,9,10}, x=2 ;
    * on obtient: V1*x={2,4,6,8,10,12,14,16,18,20};
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
    * Exemple : Soit V1={1,2,3,4,5,6,7,8,9,10}, x=2 ;
    * on obtient: V1+x={3,4,5,6,7,8,9,10,11,12};
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
    * Exemple : Soit V1={1,2,3,4,5,6,7,8,9,10}, x=1 ;
    * on obtient: V1+x={0,1,2,3,4,5,6,7,8,9};
    * </p>
    * @param x
    * le nombre qu'on soustrait de chaque élément de vect
     */
    public void SUB (int x)
    {
     for(int i=0;i<taille;i++)
     vect[i]=vect[i]-x;
    }

    
    
    
}
