import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main implements ActionListener {

    // Elements of the program
    JFrame frame;
    JPanel panel;
    JTextField searchPerson;

    // Creating my font
    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    Main() {

        // Setting the frame
        frame = new JFrame("Address Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        searchPerson = new JTextField();
        searchPerson.setBounds(50, 25, 300, 50);
        searchPerson.setFont(myFont);
        searchPerson.setEditable(true);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 350);
        panel.setLayout(new GridLayout(1, 5, 10, 10));
        panel.setBackground(Color.GRAY);

        frame.add(panel);
        frame.add(searchPerson);
        frame.setVisible(true);

    }



    public static void main(String[] args) {

        Main addressBook = new Main();
        


    }

    public void arrayofPeople() {

        

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        

    }

    
}
