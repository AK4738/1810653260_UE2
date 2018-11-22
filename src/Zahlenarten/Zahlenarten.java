package Zahlenarten;

import javax.swing.*;
import java.util.Random;

public class Zahlenarten {

public static void main(String[] args){


    int min = 1;
    int max = 10;

    Random rnd = new Random();
    int zufallszahl = rnd.nextInt(max - min + 1) + min; //meiner meinung nach erzeugt es eine zufällige zahl zwischen 1 und 10 und fügt dann noch 1 dazu

    System.out.println("" + zufallszahl);

 /*   if (zufallszahl %2==0){
        JOptionPane.showMessageDialog(null, "Die Zahl ist gerade");
    }
    else{
        JOptionPane.showInputDialog(null, "Die Zahl ist ungerade");
    }
    */
    //String zahl = JOptionPane.showInputDialog("Geben Sie eine Zahl zwischen 1 und 10 ein");// Mit string kann man nicht rechnen bzw. vergleihen
    int zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl zw. 1 und 10 ein"));


    if (zahl == zufallszahl) {
        JOptionPane.showMessageDialog(null, "Die zahlen sind gleich");
    }
    else if (zufallszahl - zahl >= -2 && zufallszahl - zahl <= 2) {
        JOptionPane.showMessageDialog(null, "Sie waren nah dran");
        for (int i = 0; i < 3; i++) {
            int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Versuchen Sie es nochmal"));

            if (zahl2 == zufallszahl) {
                JOptionPane.showMessageDialog(null, "Die zahlen sind gleich");
                i=3;
            } else if (zufallszahl - zahl2 > -2 && zufallszahl - zahl2 < 2) {
                JOptionPane.showMessageDialog(null, "Sie waren nah dran");
            } else {
                JOptionPane.showMessageDialog(null, "Die zahlen sind nicht gleich");
            }
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "Die zahlen sind nicht gleich");
        for (int h = 0; h < 3; h++) {
            int zahl3 = Integer.parseInt(JOptionPane.showInputDialog("Versuchen Sie es nochmal"));

            if (zahl3 == zufallszahl) {
                JOptionPane.showMessageDialog(null, "Die zahlen sind gleich");
                h=3;
            } else if (zufallszahl - zahl3 > -2 && zufallszahl - zahl3 < 2) {
                JOptionPane.showMessageDialog(null, "Sie waren nah dran");
            } else {
                JOptionPane.showMessageDialog(null, "Die zahlen sind nicht gleich");

            }
        }
    }

}
}