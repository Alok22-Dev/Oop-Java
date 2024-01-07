import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Class representing the main frame
class MyFrame extends JFrame {
    private JButton myButton;

    // Constructor to initialize the frame
    public MyFrame() {
        // Set the title of the frame
        super("OOP Java Project");

        // Create a button
        myButton = new JButton("Click me!");

        // Add action listener to the button
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a simple message when the button is clicked
                JOptionPane.showMessageDialog(MyFrame.this, "Hello, I'm Alok Sarmah");
            }
        });

        // Set layout manager for the frame
        setLayout(new FlowLayout());

        // Add the button to the frame
        add(myButton);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size
        setSize(300, 200);

        // Set frame visibility
        setVisible(true);
    }
}

// Main class to execute the program
public class Project {
    public static void main(String[] args) {
        // Create an instance of MyFrame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}
