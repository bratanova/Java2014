/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fmi
 */
public class zad42 {
    public static int max(int i1, int i2){
        return i1 > i2 ? i1 : i2;
}
    public static void main(String[] args) {

    int max = max(11, 16);

    System.out.println(max);

    System.out.println(max(4, 8));

}
}