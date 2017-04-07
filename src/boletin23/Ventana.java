
package boletin23;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;


public class Ventana {
    JFrame marco=new JFrame("***BOLETÍN 23***");
    JPanel panel=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JLabel etiqueta=new JLabel("Nome");
    JButton bot1=new JButton("Premer");
    JButton bot2=new JButton("Limpar");
    String[] lista= {"Elemento 1", "Elemento 2","Elemento 3"};
    JList lis=new JList(lista);
    
    
    JPasswordField pass=new JPasswordField("           ");
    JTextArea tx=new JTextArea("Area de texto");
    JButton bot3=new JButton("Botón");
    
    public void crearVent(){
   
      marco.getContentPane().setBackground(Color.white);
      marco.setSize(800, 800);
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco.setVisible(true);
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panel.add(panel1, BorderLayout.NORTH);
      panel.add(panel2, BorderLayout.CENTER);
      marco.add(panel);
    }
    public void panel1(){
      panel1.setLayout(null);
      panel1.setBackground(Color.gray);
      panel1.setSize(400, 400);
      etiqueta.setBounds(100, 100, 100, 60);
      pass.setBounds(100, 150, 100, 60);
      pass.setSize(100,20);
      
      bot1.setBounds(120, 250, 100, 50);
      bot2.setBounds(300, 250, 100, 50);
      panel1.add(etiqueta);
      panel1.add(bot1);
      panel1.add(bot2);
      panel1.add(pass);
    
    }  
    public void panel2(){
      panel2.setLayout(null);
      tx.setBounds(450, 100, 100, 120); 
      bot3.setBounds(270, 200, 100, 50);
      lis.setBounds(100, 100, 100, 120);
      panel2.add(tx);
      panel2.add(bot3);
      panel2.add(lis);
      panel2.setBackground(Color.pink);  
    }

     
}
   
        
    

