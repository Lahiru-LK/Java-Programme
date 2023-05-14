import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;

public class HelloForm extends JFrame {

    private JPanel Hellopanale;
    private JPanel Hellopanel;
    private JLabel lblFname;
    private JTextField textfname;
    private JLabel lblLname;
    private JTextField textlname;
    private JButton btnOk;
    private JButton btnClear;
    private JPanel lblDisplay;

    public HelloForm()
    {
        add(Hellopanale);
        setVisible(true);
        setSize(300,250);
        setTitle("HelloWorld");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnOk.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {

                String content = "Hello World Form" + textfname.getText()   + " " +textlname.getText();
                lblDisplay.setd
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {

            }

            @Override
            public void ancestorMoved(AncestorEvent event) {

            }


        });
        btnClear.

    }

    public static void main(String[] args) {
       HelloForm myForm = new HelloForm();
    }
}
