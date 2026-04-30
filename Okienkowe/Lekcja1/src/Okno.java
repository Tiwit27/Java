import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Console;
import java.util.Random;

public class Okno extends JFrame {
    JPanel panel;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    JTextField text;
    JLabel label;
    public Okno()
    {
        this.setTitle("Moja aplikacja");
        setSize(1000,600);
        //setResizable(false);
        panel = new JPanel();
        //panel.setBackground(Color.CYAN);
        panel.setBackground(new Color(0, 150, 150));
        btn1 = new JButton();
        btn1.setText("Kliknij mnie");
        btn1.setFont(new Font("Arial", Font.ITALIC, 24));
        panel.add(btn1);
        btn2 = new JButton();
        btn2.setText("Kliknij mnie 2");
        btn2.setFont(new Font("Arial", Font.ITALIC, 24));
        panel.add(btn2);
        btn3 = new JButton();
        btn3.setText("Kliknij mnie 3");
        btn3.setFont(new Font("Arial", Font.ITALIC, 24));
        panel.add(btn3);
        btn4 = new JButton();
        btn4.setText("Kliknij mnie 4");
        btn4.setFont(new Font("Arial", Font.ITALIC, 24));
        panel.add(btn4);
        btn5 = new JButton();
        btn5.setText("Kliknij mnie 5");
        btn5.setFont(new Font("Arial", Font.ITALIC, 24));
        panel.add(btn5);
        add(panel);
        text = new JTextField(15);
//        text.setPreferredSize(new Dimension(200, 30));
        panel.add(text);
        btn6 = new JButton();
        btn6.setText("Kliknij mnie 6");
        btn6.setFont(new Font("Arial", Font.ITALIC, 24));
        panel.add(btn6);
        label = new JLabel();
        label.setFont(new Font("Arial", Font.ITALIC, 24));
        label.setText("LABEL");
        label.setBackground(Color.red);
        label.setOpaque(true);
        panel.add(label);

        btn7 = new JButton();
        btn7.setText("Kliknij mnie 7");
        btn7.setFont(new Font("Arial", Font.ITALIC, 24));
        btn7.setActionCommand("Button7");
        panel.add(btn7);

        btn8 = new JButton();
        btn8.setText("Kliknij mnie 8");
        btn8.setFont(new Font("Arial", Font.ITALIC, 24));
        btn8.setActionCommand("Button8");
        panel.add(btn8);

        btn9 = new JButton();
        btn9.setText("Kliknij mnie 9");
        btn9.setFont(new Font("Arial", Font.ITALIC, 24));
        btn9.setActionCommand("Button9");
        panel.add(btn9);
//        btn1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                btn1.setText("Zostałem kliknięty");
//                btn1.setBackground(Color.red);
//                btn1.setForeground(Color.white);
//                JOptionPane.showMessageDialog(Okno.this, e.getActionCommand());
//            }
//        });
//        btn2.addActionListener(e -> {
//            btn2.setText("Zostałem kliknięty");
//            btn2.setBackground(Color.red);
//            btn2.setForeground(Color.white);
//            JOptionPane.showMessageDialog(Okno.this, e.getActionCommand());
//        });
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn4.addActionListener(listener);
        btn5.addActionListener(listener);
        text.addActionListener(listener2);
        btn6.addActionListener(listener2);
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Kliknięto");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Przytrzymano");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Zwolniono");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Najechano");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Wyjechano");
            }
        });

        btn7.addActionListener(listener3);
        btn8.addActionListener(listener3);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            Random r = new Random();
            button.setBackground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
        }
    };

    ActionListener listener2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn6)
            {
                btn6.setText("Kliknąłeś mnie");
                btn6.setForeground(Color.red);
            }
            else if(e.getSource()==text)
            {
                text.setText("Wcisnąłeś enter");
            }
        }
    };

    ActionListener listener3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            String action = button.getActionCommand();
            System.out.println(action);

            if("Button7".equals(action))
            {
                System.out.println("Wcisnąłeś przycisk 7");
                button.setText("Wcisnąłeś przycisk 7");
            }
            else if("Button8".equals(action))
            {
                System.out.println("Wcisnąłeś przycisk 8");
                button.setText("Wcisnąłeś przycisk 8");
            }
        }
    };
}
