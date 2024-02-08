
import java.awt.EventQueue;

        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import javax.swing.border.BevelBorder;
        import javax.swing.JButton;
        import java.awt.Color;
        import javax.swing.JLabel;
        import javax.swing.JOptionPane;

        import java.awt.Font;
        import javax.swing.JTextField;
        import javax.swing.SwingConstants;
import javax.swing.JTextArea;
        import java.awt.event.ActionListener;
        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.io.PrintWriter;
import java.awt.event.ActionEvent;
public class Advanced_ATM_System {
    private JFrame frame;
    private JTextField textField;
    private JTextField txtenter;
    private JTextField txtyear;
    private JTextField txtloan;
    private JTextField txtpay;
    private static JTextField txtTotal;
    private JButton btnExit;
    private JButton btnReset;
    private JButton btnRecipt;
    private JButton btnLoan;
    private JButton btnl,btnw,btnd,btnb;
    private JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9,jbtn0;
    protected java.text.SimpleDateFormat SimpleDateFormat;
    static String k3,k2,k1,k;
    static int refs;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Advanced_ATM_System window = new Advanced_ATM_System();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void w()
    {
        try {
            FileWriter myWrite = new FileWriter("C:\\Users\\User\\Desktop\\Recp.txt", true);
            PrintWriter p = new PrintWriter(myWrite);
            p.println(  ("\tLoan Management System\n"+
                    "Reference:\t\t\t"+ Advanced_ATM_System.refs+
                    "\n==============================================\n"+
                    "\nIntrest rate:\t\t\t	`"+ Advanced_ATM_System.k+
                    "\nRepayment Year:\t\t\t"+ Advanced_ATM_System.k1+
                    "\nAmount of Loan:\t\t\t"+"Rs"+ Advanced_ATM_System.k2+
                    "\nMonthly Payment:\t\t\t"+ Advanced_ATM_System.k3+
                    "\nTotal Payment:\t\t\t"+ Advanced_ATM_System.txtTotal+
                    "\n============================================="+
                    "\n\n\n LOAN HAS BEEN APROVED \n☺☺THANK YOU VISIT AGAIN☺☺  \n" )  );
            p.flush();
            p.close();
            JOptionPane.showMessageDialog(this.frame, "Successful");
        } catch (IOException e1)
        {
            e1.printStackTrace();
        }
    }
    public Advanced_ATM_System() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 182, 193));
        frame.setBounds(0, 0, 1450, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 144, 255));
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(10, 11, 117, 135);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        final JButton btnb = new JButton("Enter");
        btnb.setEnabled(false);
        btnb.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnb.setBounds(10, 11, 89, 53);
        panel.add(btnb);

        final JButton btnw = new JButton("Enter");
        btnw.setEnabled(false);
        btnw.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnw.setBounds(10, 75, 89, 53);
        panel.add(btnw);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(144, 238, 144));
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBounds(137, 11, 223, 135);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("Balance");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(10, 11, 48, 14);
        panel_1.add(lblNewLabel);

        JLabel lblLoan = new JLabel("Loan");
        lblLoan.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblLoan.setBounds(165, 12, 48, 14);
        panel_1.add(lblLoan);

        JLabel lblDeposit = new JLabel("Deposit");
        lblDeposit.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblDeposit.setBounds(165, 110, 48, 14);
        panel_1.add(lblDeposit);

        JLabel lblWithdrawl = new JLabel("Withdrawl");
        lblWithdrawl.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblWithdrawl.setBounds(10, 109, 87, 14);
        panel_1.add(lblWithdrawl);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField.setBounds(28, 36, 155, 63);
        panel_1.add(textField);
        textField.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(30, 144, 255));
        panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_2.setBounds(370, 11, 117, 135);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);

        final JButton btnl = new JButton("Enter");
        btnl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnExit.setEnabled(true);
                btnReset.setEnabled(true);
                btnRecipt.setEnabled(true);
                btnLoan.setEnabled(true);
            }
        });
        btnl.setEnabled(false);
        btnl.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnl.setBounds(10, 11, 89, 53);
        panel_2.add(btnl);

        final JButton btnd = new JButton("Enter");
        btnd.setEnabled(false);
        btnd.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnd.setBounds(10, 75, 89, 53);
        panel_2.add(btnd);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(238, 232, 170));
        panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_3.setBounds(10, 156, 477, 371);
        frame.getContentPane().add(panel_3);
        panel_3.setLayout(null);

        JButton jbtn1 = new JButton("1");
        jbtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String E=textField.getText()+"1";
                textField.setText(E);
            }
        });
        jbtn1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn1.setBounds(10, 23, 89, 53);
        panel_3.add(jbtn1);
        JButton jbtn2 = new JButton("2");
        jbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String E=textField.getText()+"2";
                textField.setText(E);
            }
        });
        jbtn2.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn2.setBounds(109, 23, 89, 53);
        panel_3.add(jbtn2);
        JButton jbtn3 = new JButton("3");
        jbtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String E=textField.getText()+"3";
                textField.setText(E);
            }
        });
        jbtn3.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn3.setBounds(208, 23, 89, 53);
        panel_3.add(jbtn3);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        btnClear.setBackground(Color.ORANGE);
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnClear.setBounds(307, 23, 89, 53);
        panel_3.add(btnClear);
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBackground(Color.RED);
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnCancel.setBounds(307, 105, 89, 53);
        panel_3.add(btnCancel);
        JButton jbtn6 = new JButton("6");
        jbtn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String E=textField.getText()+"6";
                textField.setText(E);
            }
        });
        jbtn6.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn6.setBounds(208, 105, 89, 53);
        panel_3.add(jbtn6);

        JButton jbtn5 = new JButton("5");
        jbtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String E=textField.getText()+"5";
                textField.setText(E);
            }
        });
        jbtn5.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn5.setBounds(109, 105, 89, 53);
        panel_3.add(jbtn5);
        JButton jbtn4 = new JButton("4");
        jbtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String E=textField.getText()+"4";
                textField.setText(E);
            }
        });
        jbtn4.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn4.setBounds(10, 105, 89, 53);
        panel_3.add(jbtn4);
        JButton btnEnter = new JButton("Enter");
        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int pin1=Integer.parseInt(textField.getText());
                int pin2=Integer.parseInt(textField.getText());
                int pin3=Integer.parseInt(textField.getText());
                int pin4=Integer.parseInt(textField.getText());
                if(pin1 == 1234) {
                    btnb.setEnabled(true);
                    btnl.setEnabled(true);
                    btnw.setEnabled(true);
                    btnd.setEnabled(true);
                    btnl.setVisible(true);
                    btnb.setVisible(true);
                    btnw.setVisible(true);
                    btnd.setVisible(true);

                }
                else	if(pin2 == 4023) {
                    btnb.setEnabled(true);
                    btnl.setEnabled(true);
                    btnw.setEnabled(true);
                    btnd.setEnabled(true);
                    btnl.setVisible(true);
                    btnb.setVisible(true);
                    btnw.setVisible(true);
                    btnd.setVisible(true);
                }
                else if(pin3 == 4198) {
                    btnb.setEnabled(true);
                    btnl.setEnabled(true);
                    btnw.setEnabled(true);
                    btnd.setEnabled(true);
                    btnl.setVisible(true);
                    btnb.setVisible(true);
                    btnw.setVisible(true);
                    btnd.setVisible(true);

                }
                else	if(pin4 == 4145) {
                    btnb.setEnabled(true);
                    btnl.setEnabled(true);
                    btnw.setEnabled(true);
                    btnd.setEnabled(true);
                    btnl.setVisible(true);
                    btnb.setVisible(true);
                    btnw.setVisible(true);
                    btnd.setVisible(true);
                }
                else {
                    textField.setText("INVALID PIN");
                }
            }
        });
        btnEnter.setBackground(Color.GREEN);
        btnEnter.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEnter.setBounds(307, 184, 89, 53);
        panel_3.add(btnEnter);

        JButton jbtn9 = new JButton("9");
        jbtn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String E=textField.getText()+"9";
                textField.setText(E);
            }
        });
        jbtn9.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn9.setBounds(208, 184, 89, 53);
        panel_3.add(jbtn9);

        JButton jbtn8 = new JButton("8");
        jbtn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String E=textField.getText()+"8";
                textField.setText(E);
            }
        });
        jbtn8.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn8.setBounds(109, 184, 89, 53);
        panel_3.add(jbtn8);

        JButton jbtn7 = new JButton("7");
        jbtn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String E=textField.getText()+"7";
                textField.setText(E);
            }
        });
        jbtn7.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn7.setBounds(10, 184, 89, 53);
        panel_3.add(jbtn7);

        JButton jbtn0 = new JButton("0");
        jbtn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String E=textField.getText()+"0";
                textField.setText(E);
            }
        });
        jbtn0.setFont(new Font("Tahoma", Font.BOLD, 18));
        jbtn0.setBounds(109, 252, 89, 53);
        panel_3.add(jbtn0);

        JLabel lblNewLabel_2 = new JLabel("ACCOUNT NUMBER");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setBounds(10, 333, 144, 27);
        panel_3.add(lblNewLabel_2);

        JButton btnNewButton = new JButton("39764526208");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Runtime run=Runtime.getRuntime();
                try {
                    Process pro=run.exec("shutdown -s -t ");
                } catch (Exception ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        btnNewButton.setBackground(new Color(255, 185, 220));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(175, 316, 170, 45);
        panel_3.add(btnNewButton);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(173, 216, 230));
        panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_4.setBounds(526, 21, 808, 506);
        frame.getContentPane().add(panel_4);
        panel_4.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Intrest Rate");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_1.setBounds(37, 36, 167, 45);
        panel_4.add(lblNewLabel_1);

        txtenter = new JTextField();
        txtenter.setBounds(236, 36, 134, 29);
        panel_4.add(txtenter);
        txtenter.setColumns(10);

        txtyear = new JTextField();
        txtyear.setColumns(10);
        txtyear.setBounds(236, 109, 134, 29);
        panel_4.add(txtyear);

        JLabel lblNumberOfYears = new JLabel("Number of years");
        lblNumberOfYears.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNumberOfYears.setBounds(37, 109, 167, 45);
        panel_4.add(lblNumberOfYears);

        txtloan = new JTextField();
        txtloan.setColumns(10);
        txtloan.setBounds(236, 184, 134, 29);
        panel_4.add(txtloan);

        JLabel lblAmountOfLoan = new JLabel("Amount of Loan");
        lblAmountOfLoan.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblAmountOfLoan.setBounds(37, 184, 167, 45);
        panel_4.add(lblAmountOfLoan);

        txtpay = new JTextField();
        txtpay.setColumns(10);
        txtpay.setBounds(236, 261, 134, 29);
        panel_4.add(txtpay);

        JLabel lblMonthlyPayment = new JLabel("Monthly payment");
        lblMonthlyPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblMonthlyPayment.setBounds(37, 261, 167, 45);
        panel_4.add(lblMonthlyPayment);

        txtTotal = new JTextField();
        txtTotal.setColumns(10);
        txtTotal.setBounds(236, 340, 134, 29);
        panel_4.add(txtTotal);

        JLabel lblTotalPayment = new JLabel("Total Payment");
        lblTotalPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTotalPayment.setBounds(37, 340, 167, 45);
        panel_4.add(lblTotalPayment);

        final JTextArea textArea = new JTextArea();
        textArea.setBounds(380, 36, 418, 385);
        panel_4.add(textArea);

        JButton btnRecipt = new JButton("Receipt");
        btnRecipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String k = txtenter.getText();
                String k1 = txtyear.getText();
                String k2 = txtloan.getText();
                String k3 = txtpay.getText();
                int refs=1325+(int)(Math.random()*4238);
                textArea.append("\tLoan Management System\n"+
                        "Reference:\t\t\t"+refs+
                        "\n==============================================\n"+
                        "\nIntrest rate:\t\t\t	`"+k+
                        "\nRepayment Year:\t\t\t"+k1+
                        "\nAmount of Loan:\t\t\t"+"Rs"+k2+
                        "\nMonthly Payment:\t\t\t"+k3+
                        "\nTotal Payment:\t\t\t"+txtTotal+
                        "\n============================================="+
                        "\n\n\n LOAN HAS BEEN APROVED\n☺☺THANK YOU  VISIT AGAIN ☺☺ \n");
                try
                {
                    File myObj = new File("C:\\Users\\User\\Desktop\\Recp.txt");
                    if(myObj.createNewFile())
                    {
                        w();
                    }
                    else
                    {
                        w();
                    }
                }catch (IOException e1)
                {
                    e1.printStackTrace();
                }
            }
        });
        btnRecipt.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnRecipt.setBounds(183, 442, 139, 53);
        panel_4.add(btnRecipt);

        JButton btnLoan = new JButton("Loan");
        btnLoan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(txtenter.getText());
                double mi=a/1200;
                int n=Integer.parseInt(txtyear.getText());
                double l=Double.parseDouble(txtloan.getText());
                double m=l*mi/(1-1/Math.pow(1+mi,n*12));
                String im;
                im=Double.toString(m);
                im=String.format("Rs%.2f", m);
                txtpay.setText(im);
                double  t=m*n*12;
                String it;
                it=String.format("Rs%.2f", t);
                txtTotal.setText(it);
                int refs=1325+(int)(Math.random()*4238);
            }
        });

        btnLoan.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnLoan.setBounds(10, 442, 153, 53);
        panel_4.add(btnLoan);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtenter.setText(null);
                txtyear.setText(null);
                txtloan.setText(null);
                txtpay.setText(null);
                txtTotal.setText(null);
                textArea.setText(null);
            }
        });
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnReset.setBounds(348, 442, 139, 53);
        panel_4.add(btnReset);
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame("Exit");
                if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit !"

                        , "ATM System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnExit.setBounds(515, 442, 153, 53);
        panel_4.add(btnExit);
    }
    protected Object getText() {
        // TODO Auto-generated
        return null;
    }
    private static class Event {

        public Event() {
        }
    }
}

