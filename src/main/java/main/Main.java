/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import dao.DataInit;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Andrei
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataInit dataInit = new DataInit();
        HashMap<String, Boolean> lights = dataInit.getLightsHash();
        
        
        dataInit.displayLightsStates();
        
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bec aprins in bucatarie?");
//        boolean buc = sc.nextBoolean();
//        System.out.println(buc ? "Bec aprins in bucatarie": "Bec stins in bucatarie");
//        
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Bec aprins in Sufragerie?");
//        boolean suf = sc1.nextBoolean();
//        System.out.println(suf ? "Bec aprins in sufragerie" : "Bec stins in sufragerie");
//        
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Bec aprins in Baie?");
//        boolean baie = sc2.nextBoolean();
//        System.out.println(baie? "Bec aprins in baie" : "Bec stins in baie");
//        
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Bec aprins in dormitor?");
//        boolean dorm = sc3.nextBoolean();
//        System.out.println(dorm? "Bec aprins in dormitor" : "Bec stins in dormitor");
//        Lumini(buc, "bucatarie");
//        Lumini(suf, "sufragerie");
//        Lumini(baie, "baie");
//        Lumini(dorm, "dorm");
//        Modifica(buc);
//        Modifica(suf);
//        Modifica(baie);
//        Modifica(dorm);
//        Lumini(buc, "bucatarie");
//        Lumini(suf, "sufragerie");
//        Lumini(baie, "baie");
//        Lumini(dorm, "dorm");
    }
        public static void Lumini(boolean x , String room){
            System.out.println(x? "bec aprins in " + room : " bec stins in " + room);
        }
        public static void Modifica(boolean y){
           if (y == true){
           y = false;
           System.out.println("becul s-a stins in camera " + y);
           }else{
           y = true;
           System.out.println("Becul s-a aprins in camera " + y);
           }
        }
}
