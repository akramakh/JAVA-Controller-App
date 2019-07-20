
package program;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.IOException;

public class Program extends JFrame{
    
       JButton jButton1;
       JButton jButton2;
       JButton jButton3 ;
       JButton jButton4;
       JButton jButton5;
       Process pp,ppp ;
       
    public Program() {
       
        Runtime run=Runtime.getRuntime();
        jButton1 = new JButton("Open Notepad");
        jButton2 = new JButton("Close Notepad");
        jButton3 = new JButton("Open Calculator");   
        jButton4 = new JButton("Close Calculator");
        jButton5 = new JButton("Exit");   
        setLayout(null);
        setVisible(true);
        setBounds(50,600,380,300);
        jButton1.setBounds(20, 30, 150, 40);
        jButton2.setBounds(20, 100, 150, 40);
        jButton3.setBounds(190, 30, 150, 40);
        jButton4.setBounds(190, 100, 150, 40);
        jButton5.setBounds(20, 170, 320, 40);
        jButton1.setBackground(Color.GREEN);
        jButton3.setBackground(Color.green);
        jButton5.setBackground(Color.red);jButton5.setForeground(Color.WHITE);
        add(jButton1);add(jButton2);add(jButton3);add(jButton4);add(jButton5);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                   pp= run.exec("notepad");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null,"you got an error");
                                            } }
                                              });         
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 try { 
                     pp.destroyForcibly();
                     } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"you got an error");
                     } }
        });
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            try{
               ppp= run.exec("calc");
                
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"you got an error");
            }
        });         
        jButton4.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                ppp.destroyForcibly();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"you got an error");
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        
}


 public static void main(String args[]) {
   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

                Program f= new Program();
                
    }
   
}
