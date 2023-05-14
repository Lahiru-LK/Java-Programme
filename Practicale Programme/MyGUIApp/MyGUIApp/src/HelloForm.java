import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {

    private JPanel panHello;
    private JLabel lblFName;
    private JTextField txtFName;
    private JTextField txtLName;
    private JLabel lblDisplay;
    private JButton btnOK;
    private JButton btnClear;
    private JLabel lblLName;

    public HelloForm() {
        add(panHello);
        setVisible(true);
        setSize(300,250);
        setTitle("Hello World...!!!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = "Hello World From " + txtFName.getText() + " " +txtLName.getText();
                lblDisplay.setText(content);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFName.setText("");
                txtLName.setText("");
                lblDisplay.setText("");
            }
        });
    }

    public static void main(String[] args) {
        HelloForm myForm = new HelloForm();
    }

}
