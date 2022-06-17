/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbu
 */
public class hangmanmath extends javax.swing.JFrame {
    //variable declaration//
    double x1 = 1;
    double x2 = 1;
    double ra = 0;
    double wa = 0;
    double yr = 0; 
     
    
    
    /**
     * Creates new form hangmanmath
     */
    public hangmanmath() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bigpanelthing = new javax.swing.JPanel();
        enterpassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        passwordbutton = new javax.swing.JButton();
        forgot_password = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        question = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        nextq = new javax.swing.JButton();
        po = new javax.swing.JLabel();
        supercoolrope = new javax.swing.JLabel();
        stick = new javax.swing.JLabel();
        cr = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        mi = new javax.swing.JTextField();
        ma = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        topscore = new javax.swing.JLabel();
        backround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bigpanelthing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enterpassword.setText("Enter password for HangMath access");
        bigpanelthing.add(enterpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));
        bigpanelthing.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 110, -1));

        passwordbutton.setText("enter");
        passwordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordbuttonActionPerformed(evt);
            }
        });
        bigpanelthing.add(passwordbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        forgot_password.setText("forgot password");
        forgot_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_passwordActionPerformed(evt);
            }
        });
        bigpanelthing.add(forgot_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        getContentPane().add(bigpanelthing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 610));

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/po death (tragic) (2).png"))); // NOI18N
        reset.setText("YOU LOSE CLICK ANYWERE TO TRY AGAIN");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 610));

        enter.setText("enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 150, -1));

        question.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        question.setText("question");
        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 160, -1));

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 60, -1));

        nextq.setText("new question");
        nextq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextqActionPerformed(evt);
            }
        });
        getContentPane().add(nextq, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        po.setIcon(new javax.swing.ImageIcon(getClass().getResource("/po drip.png"))); // NOI18N
        po.setText("jLabel2");
        getContentPane().add(po, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 480, 470));

        supercoolrope.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ropesupercool.png"))); // NOI18N
        supercoolrope.setText("jLabel1");
        getContentPane().add(supercoolrope, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 190, 240));

        stick.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/badstick.png"))); // NOI18N
        stick.setText("jLabel1");
        getContentPane().add(stick, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -20, 720, -1));

        cr.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        cr.setText("Correct answers: 0.0");
        getContentPane().add(cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, -1));

        title.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        title.setText("HANGMATH!!!");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, -1));
        getContentPane().add(mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 60, -1));
        getContentPane().add(ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 60, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Min");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 20, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Max");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        topscore.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        topscore.setText("Your record: 0.0");
        getContentPane().add(topscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 100, 180, -1));

        backround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oogway.png"))); // NOI18N
        backround.setText("jLabel1");
        getContentPane().add(backround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //random int method//
    private void randomInts(double p2, double p1){
        x1 = (int) (Math.random() * ((p2 - p1)+1)) + p1;
        x2 = (int) (Math.random() * 12) + 1;
    }
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
     //submit answer//   
        
    //gets user input//
     double i = Double.parseDouble(input.getText());
     
     
     
     
        
        


        //if answer is right//
        if (i == (x1 * x2)) {
        //text based check//
        System.out.println("nice");
        
        //gets min and max//
        double p1 = Double.parseDouble(mi.getText());
        double p2 = Double.parseDouble(ma.getText());
        
        //creates new question// 
        randomInts(p2, p1);
        question.setText(String.valueOf(x1  + " x " + x2 +" = ?"));
        
        //add 1 to correct answers//
        ra += 1;
        cr.setText(String.valueOf("Correct answers: " + ra));
        
        //adds 1 to record if correct answers gets larger than current record//
        if (ra >= yr){
        yr = ra;   
        }
        topscore.setText(String.valueOf("Your record: " + yr));
        }
        else {
        System.out.println("wrong");
        wa += 1;
        
        }
        
        //if answer wrong//
        if (wa == 1) {
            stick.setVisible(true);
        }
        else if (wa == 2) {
            supercoolrope.setVisible(true);
        }  
        else if (wa == 3){
            po.setVisible(true);
        }
        else if (wa == 4){
          reset.setVisible(true);
          //System.exit(1);//
            
        }
    }//GEN-LAST:event_enterActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        
    }//GEN-LAST:event_inputActionPerformed

    private void nextqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextqActionPerformed
        
           
        //new question//
        double p1 = Double.parseDouble(mi.getText());
        double p2 = Double.parseDouble(ma.getText());
        randomInts(p2, p1);
        
        question.setText(String.valueOf(x1  + " x " + x2 +" = ?"));
        
    }//GEN-LAST:event_nextqActionPerformed
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        //reset after loss button//
        reset.setVisible(false);
        stick.setVisible(false);
        supercoolrope.setVisible(false);
        po.setVisible(false);
        stick.setVisible(false);
        supercoolrope.setVisible(false);
        if (ra >= yr){
        yr = ra;   
        }
        ra = 0;
        wa = 0;
        topscore.setText(String.valueOf("Your record: " + yr));
        cr.setText(String.valueOf("Correct answers: " + ra)); 
        title.setText(String.valueOf("HANGMATH!!!")); 
    }//GEN-LAST:event_resetActionPerformed

    private void passwordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordbuttonActionPerformed
        //enter password enter//
        String pass = jPasswordField1.getText();
        reset.setVisible(false);
        
        
        
        if (pass.equals("password")) {
        bigpanelthing.setVisible(false);
        po.setVisible(false);
        stick.setVisible(false);
        supercoolrope.setVisible(false);
        }
    }//GEN-LAST:event_passwordbuttonActionPerformed

    private void forgot_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_passwordActionPerformed
        forgotgame ff = new forgotgame();
        
        ff.show();
        
        
        
        
    }//GEN-LAST:event_forgot_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      

        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hangmanmath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hangmanmath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hangmanmath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hangmanmath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hangmanmath().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backround;
    private javax.swing.JPanel bigpanelthing;
    private javax.swing.JLabel cr;
    private javax.swing.JButton enter;
    private javax.swing.JLabel enterpassword;
    private javax.swing.JButton forgot_password;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField ma;
    private javax.swing.JTextField mi;
    private javax.swing.JButton nextq;
    private javax.swing.JButton passwordbutton;
    private javax.swing.JLabel po;
    private javax.swing.JLabel question;
    private javax.swing.JButton reset;
    private javax.swing.JLabel stick;
    private javax.swing.JLabel supercoolrope;
    private javax.swing.JLabel title;
    private javax.swing.JLabel topscore;
    // End of variables declaration//GEN-END:variables
}
