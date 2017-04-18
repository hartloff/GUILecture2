import javax.swing.*;
import java.awt.*;

public class GUILecture2{


    public static JPanel getPanel(){
        // Q1 (1 point): create and return a panel
        // Q2 (1 point): add a text field to the panel and set its number of columns to 7
        // Q3 (1 point): add a button to the panel with the text "Yell"
        // Q4 (1 point): add a label to the panel containing only text (The initial text can be any String)
        // Q5 (1 point): add an action listener to the button that reads the text of the text field and displays it on
        //               the label in all capital letters


        return null;
    }



    /*** You do not need to change any code below this line ***/

    public static void startGUI(){

        // create a new window
        JFrame frame = new JFrame("Shouter");

        // set the size of the window
        frame.setSize(320,65);

        // add your frame to the left side of the window
        frame.getContentPane().add(GUILecture2.getPanel(), BorderLayout.WEST);

        // ends the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // displays the window
        frame.setVisible(true);
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                startGUI();
            }
        });
    }


}
