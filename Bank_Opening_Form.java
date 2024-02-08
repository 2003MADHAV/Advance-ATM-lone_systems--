package code_java;

import javax.swing.*;
import java.awt.*;

/*public class Bank_Opening_Form {
}*/
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

class Bank1 extends JFrame {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField namet;
    private JLabel mno;
    private JTextField tmno;
    private JLabel adh;
    private JTextField tadh;




    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;

    private JLabel fname;
    private JTextField fnamet;
    private JLabel actype;
    private JComboBox actypet;
    private JCheckBox term;

    private JLabel date;
    private JComboBox day;
    private JComboBox mon;
    private JComboBox year;
    private JLabel mname;
    private JTextField mnamet;
    private JLabel add;
    private JTextArea tadd;

    private JLabel em;
    private JTextField tem;
    private JButton sub;
    private JButton reset;
    private JLabel cr;


    private String Day[]
            = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31"};
    private String Mon[]
            = {"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
    private String Year[]
            = {"1994","1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008","2009","2010","2011","2012","2013","2014"};
    private String acc_type[]
            = {"Saving (SB)" ,
            "Current (CR)", "Recurring Deposits ",
            "Fixed Deposit"};

    // constructor, to initialize the components
    // with default values.
    public Bank1() {
        setTitle("KARUR VYSYA BANK");
        setBounds(500, 90, 900, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("KARUR VYSYA BANK");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        actype = new JLabel("Account Type");
        actype.setFont(new Font("Arial", Font.PLAIN, 20));
        actype.setSize(400, 20);
        actype.setLocation(100, 100);
        c.add(actype);

        actypet = new JComboBox(acc_type);
        actypet.setFont(new Font("Arial", Font.PLAIN, 15));
        actypet.setSize(150, 22);
        actypet.setLocation(300, 100);
        c.add(actypet);


        name = new JLabel("Full Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(400, 20);
        name.setLocation(100, 150);
        c.add(name);

        namet = new JTextField();
        namet.setFont(new Font("Arial", Font.PLAIN, 15));
        namet.setSize(190, 20);
        namet.setLocation(300, 150);
        c.add(namet);



        date = new JLabel("Date Of Birth");
        date.setFont(new Font("Arial", Font.PLAIN, 20));
        date.setSize(400, 20);
        date.setLocation(100, 200);
        c.add(date);

        day = new JComboBox(Day);
        day.setFont(new Font("Arial", Font.PLAIN, 15));
        day.setSize(50, 20);
        day.setLocation(300, 200);
        c.add(day);

        mon = new JComboBox(Mon);
        mon.setFont(new Font("Arial", Font.PLAIN, 15));
        mon.setSize(60, 20);
        mon.setLocation(350, 200);
        c.add(mon);

        year = new JComboBox(Year);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(410, 200);
        c.add(year);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 250);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.BOLD, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(300, 250);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.BOLD, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(400, 250);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        fname = new JLabel("Father Name");
        fname.setFont(new Font("Arial", Font.PLAIN, 20));
        fname.setSize(400, 20);
        fname.setLocation(100, 300);
        c.add(fname);

        fnamet = new JTextField();
        fnamet.setFont(new Font("Arial", Font.PLAIN, 15));
        fnamet.setSize(190, 20);
        fnamet.setLocation(300, 300);
        c.add(fnamet);

        mname = new JLabel("Mother Name");
        mname.setFont(new Font("Arial", Font.PLAIN, 20));
        mname.setSize(400, 20);
        mname.setLocation(100, 350);
        c.add(mname);

        mnamet= new JTextField();
        mnamet.setFont(new Font("Arial", Font.PLAIN, 15));
        mnamet.setSize(200, 20);
        mnamet.setLocation(300, 350);
        c.add(mnamet);


        mno = new JLabel("Mobile No.");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(400, 20);
        mno.setLocation(100, 400);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(200, 20);
        tmno.setLocation(300, 400);
        c.add(tmno);

        em=new JLabel("Email");
        em.setFont(new Font("Arial",Font.PLAIN,20));
        em.setSize(100,20);
        em.setLocation(100,450);
        c.add(em);

        tem=new JTextField();
        tem.setFont(new Font("Arial",Font.PLAIN,15));
        tem.setSize(200,20);
        tem.setLocation(300,450);
        c.add(tem);

        adh = new JLabel("Aadhaar Number");
        adh.setFont(new Font("Arial", Font.PLAIN, 20));
        adh.setSize(400, 20);
        adh.setLocation(100, 500);
        c.add(adh);

        tadh = new JTextField();
        tadh.setFont(new Font("Arial", Font.PLAIN, 15));
        tadh.setSize(200, 20);
        tadh.setLocation(300, 500);
        c.add(tadh);


        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 550);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(300, 550);
        tadd.setLineWrap(true);
        c.add(tadd);


        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(300, 670);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(250, 720);
        //sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Cancel");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(400, 720);
        //reset.addActionListener(this);
        c.add(reset);





        setVisible(true);
    }



}
// Driver Code
class BankOpeningForm{

    public static void main(String[] args) throws Exception
    {
        Bank1  f = new Bank1();
    }
}