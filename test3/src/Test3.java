import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
class Interfata {
    private static Timer timer;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfata cu camp text si buton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField(5);
        textField.setBounds(50, 50, 100, 50);

        JButton button = new JButton("Buton");
        button.setBounds(100, 100, 100, 30);
        frame.getContentPane().add(textField);
        frame.getContentPane().add(button);
        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randomNumber = random.nextInt();
                textField.setText(textField.getText() + " " + randomNumber);
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

