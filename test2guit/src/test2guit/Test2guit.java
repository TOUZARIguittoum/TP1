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
import static java.lang.System.exit;
import java.util.Scanner;
public class Test2guit {

    
    public static void main(String[] args) {
       
        int v[]=new int[2];        
     
      int choix=0,taille=0;
      Scanner sc=new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);
      Vecteur v1=new Vecteur();
      Vecteur v2=new Vecteur();
      do{
      
   
      System.out.println("1. Trier les les éléments d'un Vecteur.");
      System.out.println("2. Sommer deux vecteur de meme taille.");
      System.out.println("3. Inverser les éléments d'un Vecteur.");
      System.out.println("4. Obtenir le maximum et le minimum dans un Vecteur.");
      System.out.println("5. Ajouter un nombre à tous les éléments d'un Vecteur.");
      System.out.println("6. Soustraire un nombre à tous les éléments d'un Vecteur.");
      System.out.println("7. Multiplier un nombre avec tous les éléments d'un Vecteur.");
      System.out.println("8. Quitter.");
      System.out.println("Donner votre choix svp : ");
      choix=sc.nextInt();
      switch(choix)
      {
          case 1:
          System.out.println("Remplir le Vecteur:");
          System.out.print("Donner la taille du vecteur : ");
          taille=sc1.nextInt();
          v1=new Vecteur(taille);
          v1.remplir();
          v1.triVecteur();
          System.out.println("le Vecteur aprés le Trie :");
          v1.afficher();
          break;
          case 2:
          System.out.println("Remplir le Vecteur n°1:");
          System.out.print("Donner la taille du vecteur n°1 : ");
          taille=sc1.nextInt();
          v1=new Vecteur(taille);
          v1.remplir();
          System.out.println("Remplir le Vecteur n°2:");
          System.out.print("Donner la taille du vecteur n°2 : ");
          taille=sc1.nextInt();
          v2=new Vecteur(taille);
          v2.remplir();
          try{
          v1.sommer(v2);
          System.out.println("le Vecteur somme2 :");
          v1.afficher();
          }
          catch(TailleDifferentException e)
          {
          System.out.println(" les taille des tableaux sont differentes ");
          }
          break;
          case 3:
          System.out.println("Remplir le Vecteur:");
          System.out.print("Donner la taille du vecteur : ");
          taille=sc1.nextInt();
          v1=new Vecteur(taille);
          v1.remplir();
          v1.Inverser();
          System.out.println("le Vecteur aprés invertion :");
          v1.afficher();
          break;
          case 4:
          System.out.println("Remplir le Vecteur:");
          System.out.print("Donner la taille du vecteur : ");
          taille=sc1.nextInt();
          v1=new Vecteur(taille);
          v1.remplir();
          v1.retournerBornes(v);
          System.out.println("le max est: "+v[1]+"   "+"le min est: "+v[0]);
          break;
          case 5:
          System.out.println("Remplir le Vecteur:");
          System.out.print("Donner la taille du vecteur : ");
          taille=sc1.nextInt();
          v1=new Vecteur(taille);
          v1.remplir();
          System.out.print("Donner le nombre à ajouter aux éléments de vecteur : ");
          int nb = sc.nextInt();
          v1.ADD(nb);
          System.out.println("le Vecteur résultat :");
          v1.afficher();
          break;
          case 6:
          System.out.println("Remplir le Vecteur:");
          System.out.print("Donner la taille du vecteur : ");
          taille=sc1.nextInt();
          v1=new Vecteur(taille);
          v1.remplir();
          System.out.print("Donner le nombre à soustriare des éléments du vecteur : ");
          nb = sc.nextInt();
          v1.SUB(nb);
          System.out.println("le Vecteur résultat :");
          v1.afficher();
          break;
          case 7:
          System.out.println("Remplir le Vecteur:");
          System.out.print("Donner la taille du vecteur : ");
          taille=sc1.nextInt();
          v1=new Vecteur(taille);
          v1.remplir();
          System.out.print("Donner le nombre à multiplier avec les éléments du vecteur : ");
          nb = sc.nextInt();
          v1.Mul(nb); 
          System.out.println("le Vecteur résultat :");
          v1.afficher();
          break;
          case 8:
           exit(0);
           break;
          default:
           System.out.println("Revoir le menu");
           break;
          
      
      }
          
      }while(choix!=8);






      choix=sc.nextInt();
      
      
      
    }
    
}
