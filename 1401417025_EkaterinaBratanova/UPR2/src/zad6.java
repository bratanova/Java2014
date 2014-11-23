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

public class zad6 {
    public static void m(int i1, int i2){
   
        for (int i = i1; i <= i2; i++)
        {
        System.out.println(i);
        }
}
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        m(i1,i2);
}
}