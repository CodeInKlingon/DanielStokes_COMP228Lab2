package ex2;

import javax.swing.*;

public class Driver {

    public static void main(String[] args) {
        int userNumber = Integer.parseInt( JOptionPane.showInputDialog(null, "Enter an integer number between 1 and 27"));


        boolean won = false;
        for(int i = 0; i < 5; i++){
            Lotto l = new Lotto();

            JOptionPane.showMessageDialog(null, "The lotto generated the number: " + l.getLotto());
            if(l.getLotto() == userNumber){
                won = true;
                break;
            }

        }

        if(won){
            JOptionPane.showMessageDialog(null,"You won");
        }else{
            JOptionPane.showMessageDialog(null,"You lost");
        }
    }
}
