import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame_Puzzle extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
    JFrame_Puzzle(){
        super("JPuzzle Frame");
        b1 = new JButton("1");
        b1.setBounds(10,30,50,40);

        b2 = new JButton("6");
        b2.setBounds(70,30,50,40);

        b3 = new JButton("3");
        b3.setBounds(130,30,50,40);

        b4 = new JButton("7");
        b4.setBounds(10,80,50,40);

        b5 = new JButton("5");
        b5.setBounds(70,80,50,40);

        b6 = new JButton("2");
        b6.setBounds(130,80,50,40);

        b7 = new JButton("4");
        b7.setBounds(10,130,50,40);

        b8 = new JButton("");
        b8.setBounds(70,130,50,40);

        b9 = new JButton("8");
        b9.setBounds(130,130,50,40);

        next = new JButton("next");
        next.setBounds(70,200,100,40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(next);

        setLayout(null);
        setSize(250,300);
        setVisible(true);

        next.setBackground(Color.black);
        next.setForeground(Color.green);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(next))
        {
            String s = b4.getText();
            b4.setText(b9.getText());
            b9.setText(s);

            s=b1.getText();
            b1.setText(b5.getText());
            b5.setText(s);

            s=b2.getText();
            b2.setText(b7.getText());
            b7.setText(s);
        }

        if (e.getSource() == b1) {
            String label = b1.getText();
            if (b2.getText().equals("")) {
                b2.setText(label);
                b1.setText("");
            }
            if (b4.getText().equals("")) {
                b4.setText(label);
                b1.setText("");
            }
        }
        if (e.getSource() == b2) {
            String label = b2.getText();
            if (b1.getText().equals("")) {
                b1.setText(label);
                b2.setText("");
            }
            if (b3.getText().equals("")) {
                b3.setText(label);
                b2.setText("");
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b2.setText("");
            }
        }
        if (e.getSource() == b3) {
            String label = b3.getText();
            if (b2.getText().equals("")) {
                b2.setText(label);
                b3.setText("");
            }
            if (b6.getText().equals("")) {
                b6.setText(label);
                b3.setText("");
            }
        }
        if (e.getSource() == b4) {
            String label = b4.getText();
            if (b1.getText().equals("")) {
                b1.setText(label);
                b4.setText("");
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b4.setText("");
            }
            if (b7.getText().equals("")) {
                b7.setText(label);
                b4.setText("");
            }
        }
        if (e.getSource() == b6) {
            String label = b6.getText();
            if (b3.getText().equals("")) {
                b3.setText(label);
                b6.setText("");
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b6.setText("");
            }
            if (b9.getText().equals("")) {
                b9.setText(label);
                b6.setText("");
            }
        }
        if (e.getSource() == b5) {
            String label = b5.getText();
            if (b2.getText().equals("")) {
                b2.setText(label);
                b5.setText("");
            }
            if (b4.getText().equals("")) {
                b4.setText(label);
                b5.setText("");
            }
            if (b6.getText().equals("")) {
                b6.setText(label);
                b5.setText("");
            }
            if (b8.getText().equals("")) {
                b8.setText(label);
                b5.setText("");
            }
        }
        if (e.getSource() == b7) {
            String label = b7.getText();
            if (b4.getText().equals("")) {
                b4.setText(label);
                b7.setText("");
            }
            if (b8.getText().equals("")) {
                b8.setText(label);
                b7.setText("");
            }
        }
        if (e.getSource() == b8) {
            String label = b8.getText();
            if (b7.getText().equals("")) {
                b7.setText(label);
                b8.setText("");
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b8.setText("");
            }
            if (b9.getText().equals("")) {
                b9.setText(label);
                b8.setText("");
            }
        }
        if (e.getSource() == b9) {
            String label = b9.getText();
            if (b6.getText().equals("")) {
                b6.setText(label);
                b9.setText("");
            }
            if (b8.getText().equals("")) {
                b8.setText(label);
                b9.setText("");
            }
        }

        if (b1.getText().equals("1")
                && b2.getText().equals("2")
                && b3.getText().equals("3")
                && b8.getText().equals("8")
                && b4.getText().equals("4")
                && b5.getText().equals("5")
                && b6.getText().equals("6")
                && b7.getText().equals("7") )
        {
            JOptionPane.showMessageDialog(this, "Congratulations! You Won the Game");
        }

    }
    public static void main(String[] args) {
        new JFrame_Puzzle();
    }
}
