import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Okno extends JFrame {
    JPanel panel, alertPanel;
    JTextField number1, number2;
    JComboBox<String> character;
    JButton equals = new JButton("=");
    JLabel result = new JLabel();
    public Okno() {
        this.setTitle("Moja aplikacja");
        this.setLayout(new BorderLayout());
        setSize(1000, 600);
        //setResizable(false);
        panel = new JPanel();
        number1 = new JTextField(10);
        number2 = new JTextField(10);
        character = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        panel.add(number1);
        panel.add(character);
        panel.add(number2);
        panel.add(equals);
        panel.add(result);
        alertPanel = new JPanel();
        var alert = new JLabel("Wypełnij oba pola");
        alert.setVisible(false);
        alert.setForeground(new Color(193, 56, 56));
        alertPanel.add(alert);
        this.add(panel, BorderLayout.NORTH);
        this.add(alertPanel, BorderLayout.CENTER);
        panel.setBackground(new Color(0, 150, 150));
        alertPanel.setBackground(new Color(0, 150, 150));

        equals.addActionListener(e -> {
            alert.setVisible(false);
            try
            {
                Double d1 = Double.parseDouble(number1.getText());
                Double d2 = Double.parseDouble(number2.getText());
                Double r = 0d;
                switch(character.getSelectedItem().toString())
                {
                    case "+":
                        r = d1 + d2;
                        break;
                    case "-":
                        r = d1 - d2;
                        break;
                    case "*":
                        r = d1 * d2;
                        break;
                    case "/":
                        if(d2 == 0)
                        {
                            throw new ArithmeticException("Nie dziel przez 0");
                        }
                        r = d1 / d2;
                        break;
                }
                result.setText(String.valueOf(r));
            }
            catch (ArithmeticException ex)
            {
                alert.setText(ex.getMessage());
                alert.setVisible(true);
            }
            catch (Exception ex)
            {
                alert.setText("Proszę wprowadzić poprawne wartości do pól edycyjnych");
                alert.setVisible(true);
            }
        });
    }
}
