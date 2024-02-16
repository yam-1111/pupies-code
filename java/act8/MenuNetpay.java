/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;

/**
 *
 * @author Hinay, Anthony John C.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


    public class MenuNetpay extends Frame   
    {
        Frame theFrame;
        MenuBar menu1;
        Menu area;
        Label A;
        
        public  MenuNetpay(String s)
        {
        super(s);
        theFrame = new Frame();
        setLayout(new BorderLayout());
        setSize(500,500);
        menu1=new MenuBar();
        setMenuBar(menu1);
        area = new Menu("PAYROLL SYSTEM");
        menu1.add(area);
        area.add("Records");
        area.add("Compute");
        area.add("Exit");
        show();
        } //end of Frame
        
        class LoginDialog extends Dialog
        {
            Frame frameRef;
            LoginDialog(Frame fr, String title, boolean modal)
            {
            super(fr, title, modal);
            frameRef = fr;
            }
        }
        
          class Computation extends Dialog
    {
        Frame frameRef;

        Computation(Frame fr, String title, boolean modal)
        {
            super(fr, title, modal);
            frameRef = fr;     
        }
    }
        
        public boolean action(Event e, Object o)
        {
            if ("Records".equals(e.arg))
                new MenuNetpay.Records();
            else if ("Compute".equals(e.arg)){
                new Compute(this, "Compute Netpay", true);
            }
            else if ("Exit".equals(e.arg))
                System.exit(0);
            return(super.action(e, e.target));
        }
        
        class Records extends Frame implements ActionListener
        {
            JButton q1,q2,q3;
            Label s1,s2;
            TextField t1, t2;
            Dialog loginDialog;
            Records()
            {
                loginDialog=new MenuNetpay.LoginDialog(theFrame,"Employees Records", true);
                loginDialog.setLayout(new GridLayout(3,1));
                Panel p = new Panel();
                p.setLayout(new FlowLayout());
                JLabel p1 = new JLabel("Enter First Name:", 10);
                JLabel p2 = new JLabel("Enter Last Name:", 10);
                t1 = new TextField(10);
                t2 = new TextField(11);
                p.add(p1); p.add(t1);
                p.add(p2); p.add(t2);
                Panel q = new Panel();
                q.setLayout(new FlowLayout());
                q1 = new JButton("Display");
                q1.addActionListener(this);
                q2 = new JButton("Clear");

                q2.addActionListener(this);

                q3 = new JButton("Exit");
                q3.addActionListener(this);
                q.add(q1); q.add(q2); q.add(q3);
                s1 = new Label(" ");
                s2 = new Label(" ");
                loginDialog.add(p);
                loginDialog.add(q);
                loginDialog.add(s1);
                loginDialog.add(s2);
                loginDialog.setLocation(100,100);
                loginDialog.setSize(600,500);
                loginDialog.show();
            }
            
            public void actionPerformed(ActionEvent event)
            {
                if(event.getSource()==q1)
                {
                    if(!(t1.getText().isEmpty() && t2.getText().isEmpty())){
                        String i = (t1.getText());
                        String j = (t2.getText());
                        s1.setAlignment(1);
                        s2.setAlignment(1);
                        s1.setFont(new Font("Arial", Font.BOLD,14));
                        s1.setText("First Name is: " +i);
                        s2.setFont(new Font("Arial", Font.BOLD,14));
                        s2.setText("Last Name is: " +j);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please input complete fields", "Blank Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                else if(event.getSource() == q2)
                {
                    s1.setText("");
                    t1.setText("");
                    t2.setText("");
                }
                else loginDialog.dispose();
            }
        }
        
        /*Compute function*/
        class Compute extends Dialog implements ActionListener
        {
            Frame frameRef;
            JTextField hoursField, rateField;
            JTextArea resultTextArea;
            
            Compute(Frame fr, String title, boolean modal) 
            {
                super(fr, title, modal);
                frameRef = fr;

                setLayout(new BorderLayout());

                Panel inputPanel = new Panel(new FlowLayout());
                Label label1 = new Label("Enter Hours Worked:");
                hoursField = new JTextField("", 5);
                Label label2 = new Label("Enter Rate per Hour:");
                rateField = new JTextField("", 5);

                inputPanel.add(label1);
                inputPanel.add(hoursField);
                inputPanel.add(label2);
                inputPanel.add(rateField);

                add(inputPanel, BorderLayout.NORTH);

                resultTextArea = new JTextArea(); // Use JTextArea for better text handling
                resultTextArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(resultTextArea);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

                JPanel resultPanel = new JPanel(new BorderLayout());
                resultPanel.add(scrollPane, BorderLayout.CENTER);

                add(resultPanel, BorderLayout.CENTER);

                Panel buttonPanel = new Panel(new FlowLayout());
                JButton computeButton = new JButton("Compute");
                computeButton.addActionListener(this);
                buttonPanel.add(computeButton);
                
                JButton clearButton = new JButton("Clear");
                clearButton.addActionListener(this);
                buttonPanel.add(clearButton);
                
                
                JButton closeButton = new JButton("Close");
                closeButton.addActionListener(this);
                buttonPanel.add(closeButton);
                
          

                add(buttonPanel, BorderLayout.SOUTH);

                setLocation(200, 200);
                setSize(400, 300);
                show();
            }
            
            public void actionPerformed(ActionEvent event) {
            if (event.getActionCommand().equals("Compute")) {
                if(hoursField.getText().isEmpty() && rateField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frameRef, "Please input text", "Empty form", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else{
                    try {
                        double hours = Double.parseDouble(hoursField.getText());
                        double rate = Double.parseDouble(rateField.getText());

                        double grossPay = hours * rate;
                        double tax = 0.1 * grossPay;
                        double sss = 0.05 * grossPay;
                        double philhealth = 0.05 * grossPay;

                        double deductions = tax + sss + philhealth;
                        double netPay = grossPay - deductions;

                        resultTextArea.setText("Gross Pay: " + grossPay + "\n");
                        resultTextArea.append("Tax: " + tax + "\n");
                        resultTextArea.append("SSS: " + sss + "\n");
                        resultTextArea.append("PhilHealth: " + philhealth + "\n");
                        resultTextArea.append("Net Pay: " + netPay);
                    } catch (NumberFormatException e) 
                    {
                        JOptionPane.showMessageDialog(frameRef, "Invalid input, please input number only"
                        , "Invalid input", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else if(event.getActionCommand().equals("Clear")){
                hoursField.setText(""); rateField.setText("");
            }
            else if (event.getActionCommand().equals("Close")) 
                {
                dispose();
                }

            }
        }
        // end
        
        public boolean handleEvent(Event e)
        {
            if(e.id==Event.WINDOW_DESTROY){
            hide();
            System.exit(0);}
            return(super.handleEvent(e));
        }
    }


class main{
    public static void main(String[]args){
        new MenuNetpay("MenuNetpay");
    }
}
