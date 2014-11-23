/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fmi
 */
import java.util.Scanner;

public class zad5 {
    public static int max(int i1, int i2){
        return i1 > i2 ? i1 : i2;
}
    
   // public static void main(String[] args){
        
    //int a = 1, b = 2, c = 3;
    //max(max(a, b), c);
    //System.out.println(max(max(a,b),c));
       
   
     public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        max(max(a, b), c);
        System.out.println(max(max(a,b),c));
       
    }
}
