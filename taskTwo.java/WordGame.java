import javax.swing.*;  
import java.awt.event.*;

public class WordGame{

     WordGame(){
          JFrame frame = new JFrame("Word Count");

          JLabel userInput = new JLabel("Enter the text or sentences:");
          userInput.setBounds(100,50,200,20);

          JTextArea area = new JTextArea();
          area.setBounds(100,80,400,200);

         JTextField field = new JTextField();
         field.setBounds(100,340,300,30);

          JButton button1 = new JButton("Word Count");
          JButton button2 = new JButton("Letter Count");
          JButton button3 = new JButton("Clear");

          button1.setBounds(100, 290, 100, 30);
          button2.setBounds(200, 290, 120, 30);
          button3.setBounds(330,290,100,30);


          frame.add(field);
          frame.add(button1);
          frame.add(button2);
          frame.add(button3);
          
          frame.add(userInput);
          frame.add(area);

          button1.addActionListener(new ActionListener(){  
               public void actionPerformed(ActionEvent e){  
               String str = area.getText();
               if(str.isEmpty()){
                    field.setText("The total number of words is 0");
               }else{
                    String words[] = str.split(" ");
                    field.setText("The total number of words is "+words.length);
               }    
               }  
          });  
          
          button2.addActionListener(new ActionListener(){  
               public void actionPerformed(ActionEvent e){  
               String str = area.getText();
               if(str.isEmpty()){
                    field.setText("The total number of letter is 0");
               }else{

                    String words[] = str.split(" ");
                    String strJoin = String.join("", words);
                    field.setText("The total number of letter is "+strJoin.length());
               }    
               }  
          });  
          button3.addActionListener(new ActionListener(){  
               public void actionPerformed(ActionEvent e){  
                    area.setText("");
                    field.setText("");
               }
               
          });  
          



          frame.setSize(600,600);
          frame.setLayout(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public static void main(String[] args){
          new WordGame();

     }
}
