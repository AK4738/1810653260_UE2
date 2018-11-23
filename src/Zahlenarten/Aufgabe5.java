package Zahlenarten;

import javax.swing.*;
import java.util.Random;

public class Aufgabe5 {
    public static void main(String[] args){


        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min; //meiner meinung nach erzeugt es eine zufällige zahl zwischen 1 und 10 und fügt dann noch 1 dazu

        System.out.println("" + zufallszahl);

        int zahler = 0;
        while( zahler < 3)
         if (zufallszahl %2==0){
        JOptionPane.showMessageDialog(null, "Die Zahl ist gerade");
        zahler++;
         }
        else{
        JOptionPane.showInputDialog(null, "Die Zahl ist ungerade");
        }

        }
    }

