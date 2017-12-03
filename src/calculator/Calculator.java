package calculator;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("clc.jpg")).getImage());
        this.setSize(400, 400);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bdel = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        bce = new javax.swing.JButton();
        bpm = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bdivide = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bmultiply = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        bdel.setText("DEL");
        bdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdelActionPerformed(evt);
            }
        });

        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        bce.setText("CE");
        bce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });

        bpm.setText("+/-");
        bpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpmActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bdivide.setText("/");
        bdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivideActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bmultiply.setText("*");
        bmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiplyActionPerformed(evt);
            }
        });

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bminus.setText("-");
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        bplus.setText("+");
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });

        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });

        display.setBackground(new java.awt.Color(255, 204, 255));
        display.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setText("0");
        display.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        display.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bc, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bce, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bpm, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(bdivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bmultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdel)
                    .addComponent(bc)
                    .addComponent(bce)
                    .addComponent(bpm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9)
                    .addComponent(bdivide))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(bmultiply))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(bminus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0)
                    .addComponent(bdot)
                    .addComponent(bplus)
                    .addComponent(bequal))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpmActionPerformed
        if((display.getText()).equals("ERROR"))
           ;//noting to do
        else
        {
            if(display.getText().equals("0"))
                ;
            else{
              if(Double.parseDouble(display.getText())>0.0)
                display.setText("-"+display.getText());
              else
                display.setText(display.getText().substring(1,display.getText().length()));
          }
        }
    }//GEN-LAST:event_bpmActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
       if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("0");
           else
               display.setText(display.getText()+"0");
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("1");
           else
               display.setText(display.getText()+1);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("2");
           else
               display.setText(display.getText()+2);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("3");
           else
               display.setText(display.getText()+3);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("4");
           else
               display.setText(display.getText()+4);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("5");
           else
               display.setText(display.getText()+5);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("6");
           else
               display.setText(display.getText()+6);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
       if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("7");
           else
               display.setText(display.getText()+7);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("8");
           else
               display.setText(display.getText()+8);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if((display.getText()).equals("ERROR"))
           ;//noting to do
       else
       {
           if(((display.getText()).equals("0"))||isoperatorpressed)
            display.setText("9");
           else
               display.setText(display.getText()+9);
           isoperatorpressed=false;
       }
    }//GEN-LAST:event_b9ActionPerformed

    private void bdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdelActionPerformed
         if(display.getText().equals("ERROR")||display.getText().equals("0")||isoperatorpressed)
             ;// nothing to do
         else{
             if(display.getText().length()>1)
                 display.setText(display.getText().substring(0,(display.getText().length()-1)));
            else
                 display.setText("0");
          if(display.getText().indexOf('.')==-1)
              isdot=false;
         }
    }//GEN-LAST:event_bdelActionPerformed

    private void bceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bceActionPerformed
        if(display.getText().equals("ERROR"))
          ;// TODO add your handling code here:
        else
        {
            display.setText("0");
            isdot=false;
        }
    }//GEN-LAST:event_bceActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        display.setText("0");
         isdot=false;
         isoperatorpressed=false;
         operator=0;
         whichoperand=false;// TODO add your handling code here:
    }//GEN-LAST:event_bcActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
       if(display.getText().equals("ERROR"))
          ;// TODO add your handling code here:
       else if(display.getText().equals("0")||isoperatorpressed)
       {
           display.setText("0.");
           isdot=true;
       }
       else
       {
           if(isdot)
               ;
           else
               display.setText(display.getText()+".");
             isdot=true;
        }
       isoperatorpressed=false;
    }//GEN-LAST:event_bdotActionPerformed

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusActionPerformed
        if(display.getText().equals("ERROR"))
           ;// TODO add your handling code here:
        else
        {
            if(whichoperand==false)
            {
                data1=Double.parseDouble(display.getText());
                whichoperand=true;
            }
            else
            {
                if(isoperatorpressed)
                    ;
                else
                    data2=Double.parseDouble(display.getText());
                switch(operator)
                {
                    case 1:
                        data1+=data2;
                        break;
                    case 2:
                        data1-=data2;
                        break;
                    case 3:
                        data1*=data2;
                        break;
                    case 4:
                        if(data2!=0.0)
                           data1/=data2;
                        else
                            display.setText("ERROR");
                        break;
                }
              if(display.getText().equals("ERROR"))
                {
                  isoperatorpressed=false;
                  operator=0;
                }
              else if(data1==Math.floor(data1))
                  display.setText(""+(int)Math.floor(data1));
              else
                  display.setText(""+data1);
            }
        }
        if(!display.getText().equals("ERROR"))
        {
            isoperatorpressed=true;
            operator= 1;
        }
    }//GEN-LAST:event_bplusActionPerformed

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminusActionPerformed
         if(display.getText().equals("ERROR"))
           ;// TODO add your handling code here:
        else
        {
            if(whichoperand==false)
            {
                data1=Double.parseDouble(display.getText());
                whichoperand=true;
            }
            else
            {
                if(isoperatorpressed)
                    ;
                else
                    data2=Double.parseDouble(display.getText());
                switch(operator)
                {
                    case 1:
                        data1+=data2;
                        break;
                    case 2:
                        data1-=data2;
                        break;
                    case 3:
                        data1*=data2;
                        break;
                    case 4:
                        if(data2!=0.0)
                           data1/=data2;
                        else
                            display.setText("ERROR");
                        break;
                }
              if(display.getText().equals("ERROR"))
                {
                  isoperatorpressed=false;
                  operator=0;
                }
              else if(data1==Math.floor(data1))
                  display.setText(""+(int)Math.floor(data1));
              else
                  display.setText(""+data1);
            }
        }
        if(!display.getText().equals("ERROR"))
        {
            isoperatorpressed=true;
            operator= 2;
        }
    }//GEN-LAST:event_bminusActionPerformed

    private void bmultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultiplyActionPerformed
         if(display.getText().equals("ERROR"))
           ;// TODO add your handling code here:
        else
        {
            if(whichoperand==false)
            {
                data1=Double.parseDouble(display.getText());
                whichoperand=true;
            }
            else
            {
                if(isoperatorpressed)
                    ;
                else
                    data2=Double.parseDouble(display.getText());
                switch(operator)
                {
                    case 1:
                        data1+=data2;
                        break;
                    case 2:
                        data1-=data2;
                        break;
                    case 3:
                        data1*=data2;
                        break;
                    case 4:
                        if(data2!=0.0)
                           data1/=data2;
                        else
                            display.setText("ERROR");
                        break;
                }
              if(display.getText().equals("ERROR"))
                {
                  isoperatorpressed=false;
                  operator=0;
                }
              else if(data1==Math.floor(data1))
                  display.setText(""+(int)Math.floor(data1));
              else
                  display.setText(""+data1);
            }
        }
        if(!display.getText().equals("ERROR"))
        {
            isoperatorpressed=true;
            operator= 3;
        }
    }//GEN-LAST:event_bmultiplyActionPerformed

    private void bdivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivideActionPerformed
       if(display.getText().equals("ERROR"))
           ;// TODO add your handling code here:
        else
        {
            if(whichoperand==false)
            {
                data1=Double.parseDouble(display.getText());
                whichoperand=true;
            }
            else
            {
                if(isoperatorpressed)
                    ;
                else
                    data2=Double.parseDouble(display.getText());
                switch(operator)
                {
                    case 1:
                        data1+=data2;
                        break;
                    case 2:
                        data1-=data2;
                        break;
                    case 3:
                        data1*=data2;
                        break;
                    case 4:
                        if(data2!=0.0)
                           data1/=data2;
                        else
                            display.setText("ERROR");
                        break;
                }
              if(display.getText().equals("ERROR"))
                {
                  isoperatorpressed=false;
                  operator=0;
                }
              else if(data1==Math.floor(data1))
                  display.setText(""+(int)Math.floor(data1));
              else
                  display.setText(""+data1);
            }
        }
        if(!display.getText().equals("ERROR"))
        {
            isoperatorpressed=true;
            operator= 4;
        }
    }//GEN-LAST:event_bdivideActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
        if(display.getText().equals("ERROR"))
           ;// TODO add your handling code here:
        else
        {
            if(whichoperand==false)
            {
                data1=Double.parseDouble(display.getText());
                whichoperand=false;
                isoperatorpressed=true;
            }
            else
            {
                if(isoperatorpressed){
                    data2=data1;
                switch(operator)
                {
                    case 1:
                        data1+=data2;
                        break;
                    case 2:
                        data1-=data2;
                        break;
                    case 3:
                        data1*=data2;
                        break;
                    case 4:
                        if(data2!=0.0)
                           data1/=data2;
                        else
                            display.setText("ERROR");
                        break;
                }
              if(display.getText().equals("ERROR"))
                {
                  isoperatorpressed=false;
                  operator=0;
                }
              else if(data1==Math.floor(data1))
                  display.setText(""+(int)Math.floor(data1));
              else
                  display.setText(""+data1);
            }
             else
             {
                data2=Double.parseDouble(display.getText());
                 switch(operator)
                {
                    case 1:
                        data1+=data2;
                        break;
                    case 2:
                        data1-=data2;
                        break;
                    case 3:
                        data1*=data2;
                        break;
                    case 4:
                        if(data2!=0.0)
                           data1/=data2;
                        else
                            display.setText("ERROR");
                        break;
                }
              if(display.getText().equals("ERROR"))
                {
                  isoperatorpressed=false;
                  operator=0;
                }
              else if(data1==Math.floor(data1))
                  display.setText(""+(int)Math.floor(data1));
              else
                  display.setText(""+data1);
              }
            whichoperand=false;
        }
        if(!display.getText().equals("ERROR"))
        {
            isoperatorpressed=true;
            operator= 5;
        }
    }//GEN-LAST:event_bequalActionPerformed
  }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    private double data1,data2;
    private boolean isdot=false;//true when button is pressed;
    private boolean isoperatorpressed =false;//true when operator is pressed
    private boolean whichoperand=false;//true for second operand
    private int operator=0;//0-noselection,1-plus,2-minus,3-multi,4-div 5-equal
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bce;
    private javax.swing.JButton bdel;
    private javax.swing.JButton bdivide;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmultiply;
    private javax.swing.JButton bplus;
    private javax.swing.JButton bpm;
    private javax.swing.JLabel display;
    // End of variables declaration//GEN-END:variables
}
