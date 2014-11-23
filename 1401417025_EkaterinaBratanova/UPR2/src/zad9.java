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
public class zad9 {
    
    public static void main(String[] args) {
    System.out.println("Посочете месец на раждане");
   
    Scanner s = new Scanner(System.in);
    int месец;
    String текст;
    
    System.out.print("Изберете възможност (1-5): ");
    месец = s.nextInt();
    switch(месец){
    case 1: текст = "януари"; break; 
    case 2: текст = "февруари"; break;
    case 3: текст = "март"; break;
    case 4: текст = "април"; break;
    case 5: текст = "май"; break;
    case 6: текст = "юни"; break;
    case 7: текст = "юли"; break;
    case 8: текст = "август"; break;
    case 9: текст = "септември"; break;
    case 10: текст = "октомври"; break;
    case 11: текст = "ноември"; break;
    case 12: текст = "декември"; break;
    default: текст = "Въвели сте грешен избор!"; 
    }

    System.out.println(текст); 
    s.close();
    
}
}