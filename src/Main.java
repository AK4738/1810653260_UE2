import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Geben Sie Ihr Name ein:"); //name als String eingeben
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihr Alter ein")); //alter als integer eingeben und daher Integer.parseInt

        if(alter>17){
            JOptionPane.showMessageDialog(null, "Sie sind volljährig"); // wenn er volljährig ist, ausgeben dass er volljähtig ist
        }
        else{
            JOptionPane.showMessageDialog(null, "Sie sind nicht volljährig");
        }

    }
}
