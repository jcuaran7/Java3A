public class StringManager extends javax.swing.JFrame {
String Name="",May="",Min="",Completo=Name,letraf="";
 int cont=0,cons=0,fin=0,buscar=0,i;
 int Letsearch=0;
 char Letra=' ',letra=Letra,may=' ';
 int letraI=0,x=0;
 char Buscarletra [];
 
    public StringManager () {
      initComponents();
      setLocationRelativeTo(null);
      btnEN.setEnabled(false);
      btn_M.setEnabled(false);  
      btn_m.setEnabled(false);  
      btnRese.setEnabled(true);  
      btnSearch.setEnabled(true);  
      btnShow.setEnabled(true);
    }
    public void buttons(){
    if (!txtName.getText().isEmpty()){  
      btnRese.setEnabled(true);  
      btnSearch.setEnabled(true);  
      btnShow.setEnabled(true);
      btn_M.setEnabled(false);  
      btn_m.setEnabled(false); 
    }else{ 
      btnRese.setEnabled(true);  
      btnSearch.setEnabled(true);  
      btnShow.setEnabled(true);  
      btn_M.setEnabled(false);  
      btn_m.setEnabled(false);      
    }   
    }
       public String characters(String parametro){
       for (i=0;i<parametro.length();i++){
           letra=parametro.charAt(i);
           if(i==0){
             letra=Character.toUpperCase(letra);  
           }
           if(i>=1){
             letra=Character.toLowerCase(letra);  
           }
           if(letra==' '){             
             letraI=i+1;
             letra=Character.toLowerCase(letra);
           }
           if(letraI==i){
             letra=Character.toUpperCase(letra);        
           }
           cont++;
           Completo+=letra;
       }
       fin=cont;
       return Completo;  
    }
     public String buscar(String palabra){
    Buscarletra = Name.toCharArray();
    for ( x=1;x<Name.length();x++){
        if((Letsearch-1)==x){
        Character.toString(Buscarletra [x]);
        letraf=Integer.toString(Buscarletra [x]);
        }
        }
    letraf+=letra;
    return letraf; 
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTittle1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSP = new javax.swing.JButton();
        btnEN = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnRese = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblMay = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lblInitial = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btn_M = new javax.swing.JButton();
        btn_m = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("String Manager");
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblTittle1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTittle1.setText("Your name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnSP.setBackground(new java.awt.Color(204, 255, 204));
        btnSP.setText("SP");
        btnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPActionPerformed(evt);
            }
        });

        btnEN.setBackground(new java.awt.Color(204, 255, 204));
        btnEN.setText("EN");
        btnEN.setEnabled(false);
        btnEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnENActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTittle1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addComponent(btnEN)
                        .addGap(18, 18, 18)
                        .addComponent(btnSP))
                    .addComponent(txtName))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblTittle1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSP)
                            .addComponent(btnEN))))
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        btnShow.setBackground(new java.awt.Color(102, 255, 102));
        btnShow.setText("SHOW");
        btnShow.setFocusPainted(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnRese.setBackground(new java.awt.Color(153, 153, 255));
        btnRese.setText("RESET");
        btnRese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReseActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl1.setText(". Your name is : ");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl2.setText(". Your name in MAY:");

        lblMay.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl3.setText(". Your name in MIN:");

        lblMin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl4.setText(". Total characters :");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl5.setText(". Initial capital letters :");

        lblInitial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Letter finder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lblTitle2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTitle2.setText("Type a number:");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 255, 51));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btn_M.setBackground(new java.awt.Color(102, 102, 255));
        btn_M.setText("MAY");
        btn_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MActionPerformed(evt);
            }
        });

        btn_m.setBackground(new java.awt.Color(51, 255, 51));
        btn_m.setText("MIN");
        btn_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mActionPerformed(evt);
            }
        });

        lblResult.setBackground(new java.awt.Color(0, 0, 0));
        lblResult.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblResult.setText("?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle2)
                    .addComponent(txtNumber)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_M)
                    .addComponent(btn_m))
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_M)
                        .addGap(18, 18, 18)
                        .addComponent(btn_m))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblResult))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(lblMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInitial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(jLabel3)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lblMay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(lblMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInitial)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnRese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRese, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {                                             
    buttons();
    }
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed

     if (!txtName.getText().isEmpty()){
     Name=txtName.getText();
     lblName.setText(Name);
     String Mayus = Name.toUpperCase();
     lblMay.setText(Mayus);
     String Minus = Name.toLowerCase();
     lblMin.setText(Minus);
     characters(Name);
     lblTotal.setText(Integer.toString(fin));
     lblInitial.setText(Completo);
     i=0;Completo="";fin=0;cons=0;cont=0;
     }else{
     txtNumber.setText("");
     txtName.setText("");
     lblName.setText("");
     lblMay.setText("");
     lblMin.setText("");
     lblTotal.setText("");
     lblInitial.setText("");
    } 
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnReseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReseActionPerformed
        txtName.setText("");
        buttons();
        Name=""; May="";Min="";Completo=Name;letraf="";cont=0;cons=0;fin=0;buscar=0;
        i=0;Letsearch=0;Letra=' ';
        letra=Letra;may=' ';letraI=0;
        x=0;     
        lblName.setText("");
        lblMay.setText("");
        lblMin.setText("");
        lblTotal.setText("");
        lblInitial.setText("");
        lblResult.setText("?");
        txtNumber.setText("");
    }//GEN-LAST:event_btnReseActionPerformed

    private void btn_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MActionPerformed
        // TODO add your handling code here:
        if (Buscarletra [(Letsearch-1)]==' '){
        lblResult.setText("_");
        btn_m.setEnabled(false);
        btn_M.setEnabled(false);       
        }else{
        String M = letraf.toUpperCase();
        lblResult.setText(M);
        btn_M.setEnabled(false);
        btn_m.setEnabled(true);
        }
    }//GEN-LAST:event_btn_MActionPerformed

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPActionPerformed
        // TODO add your handling code here:
        lblTittle1.setText("Tu nombre:");
        lbl1.setText("Tu nombre es:");
        lbl2.setText("Tu nombre en MAY:");
        lbl3.setText("Tu nombre en MIN:");
        lbl4.setText("Caracteres totales:");
        lbl5.setText("Letras iniciales de subtítulos:");
        lblTitle2.setText("Escribe un número:");
        btnShow.setText("MOSTRAR");
        btnRese.setText("REINICIAR");
        btnSearch.setText("BUSCAR");
        btnSP.setEnabled(false);
        btnEN.setEnabled(true);                                       
    }//GEN-LAST:event_btnSPActionPerformed

    private void btn_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mActionPerformed
        // TODO add your handling code here:
        if (Buscarletra [(Letsearch-1)]==' '){
        lblResult.setText("_");
        btn_m.setEnabled(false);
        btn_M.setEnabled(false);       
       }else{
        String N = letraf.toLowerCase();
        lblResult.setText(N);
        btn_m.setEnabled(false);
        btn_M.setEnabled(true);
       }
    }//GEN-LAST:event_btn_mActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed

    }//GEN-LAST:event_txtNumberActionPerformed
    private void btnENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnENActionPerformed
        lblTittle1.setText("Your name:");
        lbl1.setText("Your name is:");
        lbl2.setText("Your name in MAY:");
        lbl3.setText("Your name in MIN:");
        lbl4.setText("Total characters ::");
        lbl5.setText("Initial caption letters :");
        lblTitle2.setText("Type a number:");
        btnShow.setText("SHOW");
        btnRese.setText("RESET");
        btnSearch.setText("SEARCH");
        btnSP.setEnabled(true);
        btnEN.setEnabled(false);
    }//GEN-LAST:event_btnENActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

      if (txtNumber.getText().isEmpty()){
      String o=lblTittle1.getText();
      }else{
        letraf="";  Letsearch=0;Letra=' ';letra=Letra;letraI=0;x=Letsearch;
        lblResult.setText("");
        letraf="";  
        Letsearch=Integer.parseInt(txtNumber.getText());
        buscar(Name);
        letraf=Character.toString(Buscarletra [(Letsearch-1)]);
        
       if (Buscarletra [(Letsearch-1)]==' '){
        lblResult.setText("_");
        btn_m.setEnabled(false);
        btn_M.setEnabled(false);       
       }else 
       if (lblName.getText()==""){
        lblResult.setText("");}else{
        lblResult.setText(letraf);
       }
       if (Character.isUpperCase(Buscarletra [(Letsearch-1)])){
        btn_M.setEnabled(false);
        btn_m.setEnabled(true);
      }else{
        btn_m.setEnabled(false);
        btn_M.setEnabled(true);
      }
    }                                             
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {                                          
    char validar = evt.getKeyChar();
    if(Character.isDigit(validar)){
     getToolkit().beep();
     evt.consume();
     String o=lblTittle1.getText();    
    }
    }        
     
    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {                                          
    if (lblName.getText()=="") { 
      String o=lblTittle1.getText();    
    }
    char validar = evt.getKeyChar();
    if(Character.isLetter(validar)){
     getToolkit().beep();
     evt.consume();
     String o=lblTittle1.getText();
    }    
    }            
   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
              new StringManager().setVisible(true);  
            }
          
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEN;
    private javax.swing.JButton btnRese;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btn_M;
    private javax.swing.JButton btn_m;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblInitial;
    private javax.swing.JLabel lblMay;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTittle1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables

    private String toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
