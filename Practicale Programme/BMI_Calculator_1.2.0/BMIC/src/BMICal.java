import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICal extends JFrame {

    private JPanel BMIPanle;
    private JComboBox comboBox1;
    private JTextField HField;
    private JTextField WField;
    private JButton clearButton;
    private JButton answerButton;
    private JLabel hvname;
    private JLabel bmiName;
    private JLabel bmiValue;
    private JLabel wvname;

    public BMICal() {
        add(BMIPanle);
        setVisible(true);
        setSize(600, 410);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle(" BMIC ");

        Image icon = Toolkit.getDefaultToolkit().getImage("src\\image\\icon.png");
        setIconImage(icon);

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int combox = comboBox1.getSelectedIndex();

                switch (combox) {
                    case 0:

                            HField.setText(null);
                            WField.setText(null);
                            hvname.setText(null);
                            wvname.setText(null);
                            bmiName.setText(null);
                            bmiValue.setText(null);

                        break;
                    case 1:
                            hvname.setText("m  ");
                            wvname.setText("Kg   ");

                            bmiName.setText(null);
                            bmiValue.setText(null);
                        break;
                    case 2:
                            hvname.setText("Inch  ");
                            wvname.setText("Pound   ");

                            bmiName.setText(null);
                            bmiValue.setText(null);
                        break;

                    default:
                        break;
                }

            }
        });




        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int combox = comboBox1.getSelectedIndex();

                float he = Float.parseFloat(HField.getText());
                float we = Float.parseFloat(WField.getText());
                float BMIV = 0;





                switch (combox) {
                    case 0:
                        int result = JOptionPane.showConfirmDialog(rootPane, "Please Select English or Metric", "Error !😡", JOptionPane.CANCEL_OPTION);


                        break;
                    case 1:

                        try {

                            if (we == 0 )
                            {
                                int result2 = JOptionPane.showConfirmDialog(rootPane, "CAN'T Used zero ", "Error in Weight !😡", JOptionPane.CANCEL_OPTION);
                            }
                            BMIV = we / (he * he);
                            bmiValue.setText(String.valueOf(BMIV));

                        }
                        catch (NumberFormatException a) {

                        }

                        if (BMIV > 29.9) {

                            bmiName.setText("Obes :");
                        } else if (BMIV >= 25 && BMIV <= 29.9) {

                            bmiName.setText("Overweight :");
                        } else if (BMIV >= 18.5 && BMIV <= 24.9) {

                            bmiName.setText("Normal :");
                        } else if (BMIV < 18.5) {

                            if (we == 0) {
                                bmiName.setText(null);
                                bmiValue.setText(null);
                            } else {
                                bmiName.setText("UnderWeight :");
                            }

                        } else {
                            bmiName.setText(null);
                            bmiValue.setText(null);

                        }break;




                    case 2:

                        try {

                            if (we == 0.0)
                            {
                                int result2 = JOptionPane.showConfirmDialog(rootPane, "CAN'T Used zero ", "Error in Weight !😡", JOptionPane.CANCEL_OPTION);
                            }
                                BMIV =  we*703/(he*he);
                                bmiValue.setText(String.valueOf(BMIV));

                        }catch (NumberFormatException a)
                        {
                        }


                        if (BMIV>=30)
                        {

                            bmiName.setText("Obes :");
                        } else if (BMIV>=25 && BMIV<=29.9 ) {

                            bmiName.setText("Overweight :");
                        } else if (BMIV>=18.5 && BMIV<=24.9 ) {

                            bmiName.setText("Normal :");
                        }
                        else if (BMIV<18.5 ){

                            if (we == 0)
                            {
                                bmiName.setText(null);
                                bmiValue.setText(null);
                            }
                            else
                            {
                                bmiName.setText("UnderWeight :");
                            }
                        }
                        else {
                            bmiName.setText(null);
                            bmiValue.setText(null);

                        }

                        break;



                    default:
                        break;

                }

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HField.setText(null);
                WField.setText(null);
                hvname.setText(null);
                wvname.setText(null);
                bmiName.setText(null);
                bmiValue.setText(null);

                comboBox1.setSelectedIndex(0);

            }
        });
    }

    public static void main(String[] args) {
        BMICal myform = new BMICal();

    }
}

