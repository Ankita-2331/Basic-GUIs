/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FIBOARMSERIES.java
 *
 * Created on Dec 13, 2017, 11:17:17 AM
 */


    /**
 *
 * @author Sushant
 */
public class FIBOARMSERIES extends javax.swing.JFrame {


    /** Creates new form FIBOARMSERIES */
    public FIBOARMSERIES() {
        initComponents();}
    
 public  void fibbo(int n)
 {

}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numTf = new javax.swing.JTextField();
        fiboBtn = new javax.swing.JButton();
        armBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fiboTa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        armTa = new javax.swing.JTextArea();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel1.setText("ENTER A NUMBER");

        fiboBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        fiboBtn.setText("FIND FIBONICCI SERIES");
        fiboBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiboBtnActionPerformed(evt);
            }
        });

        armBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        armBtn.setText("FIND ARMSTRONG");
        armBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setFocusable(false);
        jScrollPane1.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N

        fiboTa.setColumns(20);
        fiboTa.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        fiboTa.setRows(5);
        jScrollPane1.setViewportView(fiboTa);

        jScrollPane2.setFocusable(false);
        jScrollPane2.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N

        armTa.setColumns(20);
        armTa.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        armTa.setRows(5);
        jScrollPane2.setViewportView(armTa);

        clearBtn.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fiboBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(armBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(numTf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiboBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(armBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
     System.exit(0);

    }//GEN-LAST:event_exitBtnActionPerformed

    private void fiboBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiboBtnActionPerformed
     int n=Integer.parseInt(numTf.getText());
     fiboTa.setText("THE FIBONACCI SERIES IS....");
     int x=0,y=1,z;
     for (int i=1;i<n;i++)
     {fiboTa.append(""+y+"");
      z=x;
      x=y;
      y=z+x;
     }

    }//GEN-LAST:event_fiboBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        numTf.setText("");
        fiboTa.setText("");
        armTa.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void armBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armBtnActionPerformed
     int n,s=0,d;
     n=Integer.parseInt(numTf.getText());
    
     while(n!=0)
     {d=n%10;
     s=s+d*d*d;
     n=n/10;
     ++n;}
     
     if(s==n)
         {armTa.setText("NUMBER IS AN ARMSTRONG NUMBER..");}
     else
         {armTa.setText("NUMBER IS NOT AN ARMSTRONG NUMBER..");}

    }//GEN-LAST:event_armBtnActionPerformed
/**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FIBOARMSERIES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton armBtn;
    private javax.swing.JTextArea armTa;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton fiboBtn;
    private javax.swing.JTextArea fiboTa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numTf;
    // End of variables declaration//GEN-END:variables

}
