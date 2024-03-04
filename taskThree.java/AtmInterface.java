
import javax.swing.*;  
import java.awt.event.*;

public class AtmInterface {

     private double total_balance = 100000;
     AtmInterface(){
          JFrame frame = new JFrame("ATM Interface");

          JTextField inpuTextField  = new JTextField();
          inpuTextField.setBounds(40,10,300,100);

          JButton withDraw = new JButton("WithDraw");
          JButton deposite = new JButton("Deposite");
          JButton checkBalance = new JButton("Check Balance");
          JButton exit = new JButton("Exit");

          withDraw.setBounds(55,120,110,40);
          deposite.setBounds(220,120,110,40);
          checkBalance.setBounds(55,180,110,40);
          exit.setBounds(220,180,110,40);

          JLabel label = new JLabel("Balance:");
          label.setBounds(50,300,60,60);
          JTextField account = new JTextField();
         account.setBounds(120,300,200,80);

          inpuTextField.addFocusListener(new FocusListener() {
               public void focusGained(FocusEvent e){
                    String input = inpuTextField.getText();
                    input = "";
                    inpuTextField.setText(input);

               }
               public void focusLost(FocusEvent f){

               }
          });

          

          account.setText(String.valueOf(total_balance));
          withDraw.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                    String input = inpuTextField.getText();
                    if(input.isEmpty()){
                         inpuTextField.setText("please enter the amount!!");
                    }else{
                         double value = Double.parseDouble(input);
                         if(value <= total_balance){
                              double withdraw = (withDraw(value));
                              String changeToString = String.valueOf(withdraw);
                              account.setText(changeToString);
                         }else{
                              inpuTextField.setText("Sorry,You do not have enough money!!");
                         }
                    }

               }

          });

          deposite.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    String input = inpuTextField.getText();
                    if(input.isEmpty()){
                         inpuTextField.setText("please enter the amount!!");
                    }else{
                         double amount = Double.parseDouble(input);
                         double deposite = deposite(amount);
                         String changeToString = String.valueOf(deposite);
                         account.setText(changeToString);

                    }

               }
               
          });


          checkBalance.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    inpuTextField.setText(String.valueOf(total_balance));

               }
               
          });

          exit.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    String input = inpuTextField.getText();
                    input = "";
                    inpuTextField.setText(input);
               }
          });
          

          frame.add(inpuTextField);
          frame.add(withDraw);
          frame.add(deposite);
          frame.add(checkBalance);
          frame.add(exit);
          frame.add(label);
          frame.add(account);

          frame.setSize(400,500);
          frame.setLayout(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public double withDraw(double amt){
               total_balance = total_balance - amt;
               return total_balance;
     }

     public double deposite(double amt){
          total_balance = total_balance + amt;
          return total_balance;

     }

     public static void main(String[] args){
          new AtmInterface();
     }
}

