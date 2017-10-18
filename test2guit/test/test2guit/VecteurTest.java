/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2guit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class VecteurTest {
    
    public VecteurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    int V1[]=new int[] {2,4,6,8,10,12,14,16,18,20};
    int V2[]=new int[] {10,9,8,7,6,5,4,3,2,1};
    int V3[]=new int[] {1,2,3,4,5,6,7,8,9,10};
    int V4[]=new int []{3,4,5,6,7,8,9,10,11,12};
    int V5[]=new int[] {0,1,2,3,4,5,6,7,8,9};
    /**
     * Test of triVecteur method, of class Vecteur.
     */
   /* @Test
    public void testTriVecteur() {
        System.out.println("triVecteur");
        Vecteur instance = new Vecteur(10);
        instance.vect =new int [] {2,8,5,1,4,7,9,6,3,10};
        instance.triVecteur();
        Assert.assertArrayEquals(instance.vect,V3);
      
    }*/

    /**
     * Test of retournerBornes method, of class Vecteur.
     */
    @Test
    public void testRetournerBornes() {
        System.out.println("retournerBornes");
        int maxR = 10;
        int minR = 1;
        int max = 10;
        int min = 1;
        Vecteur instance = new Vecteur(10);
        instance.vect = new int[] {1,2,3,4,5,6,7,8,9,10};
        
        instance.retournerBornes(max,min);
        assertEquals(max,maxR);
        assertEquals(min,minR);

    }

    /**
     * Test of sommer method, of class Vecteur.
     * @throws java.lang.Exception
     */
    @Test
    public void testSommer() throws Exception {
        System.out.println("sommer");
        Vecteur vect2=new Vecteur(10);
        vect2.vect = new int[] {1,2,3,4,5,6,7,8,9,10};
        Vecteur instance = new Vecteur(10);
        instance.vect = new int[] {1,2,3,4,5,6,7,8,9,10};
        instance.sommer(vect2);
        Assert.assertArrayEquals(instance.vect,V1);
    }

    /**
     * Test of Inverser method, of class Vecteur.
     */
    @Test
    public void testInverser() {
        System.out.println("Inverser");
        Vecteur instance = new Vecteur(10);
        instance.vect = new int[] {1,2,3,4,5,6,7,8,9,10};
        instance.Inverser();
        Assert.assertArrayEquals(instance.vect,V2);
    }

    /**
     * Test of Mul method, of class Vecteur.
     */
    @Test
    public void testMul() {
        System.out.println("Mul");
        int x = 2;
        Vecteur instance = new Vecteur(10);
        instance.vect = new int[] {1,2,3,4,5,6,7,8,9,10};
        instance.Mul(x);
        Assert.assertArrayEquals(instance.vect,V1);
       
    }

    /**
     * Test of ADD method, of class Vecteur.
     */
    @Test
    public void testADD() {
        System.out.println("ADD");
        int x = 2;
        Vecteur instance = new Vecteur(10);
        instance.vect = new int[] {1,2,3,4,5,6,7,8,9,10};
        instance.ADD(x);
        Assert.assertArrayEquals(instance.vect,V4);
       
    }

    /**
     * Test of SUB method, of class Vecteur.
     */
    @Test
    public void testSUB() {
        System.out.println("SUB");
        int x = 1;
        Vecteur instance = new Vecteur(10);
        instance.vect = new int[] {1,2,3,4,5,6,7,8,9,10};
        instance.SUB(x);
        Assert.assertArrayEquals(instance.vect,V5);
     
    }
    
}
