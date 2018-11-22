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

    if (zufallszahl %2==0){
        JOptionPane.showMessageDialog(null, "Die Zahl ist gerade");
    }
    else{
        JOptionPane.showInputDialog(null, "Die Zahl ist ungerade");
    }
}
}