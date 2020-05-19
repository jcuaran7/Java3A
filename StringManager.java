package practica;

public class StringManager extends javax.swing.JFrame {
String Nombre="",Mayus="",Minus="",Completo=Nombre,letraf="";
 int contador=0,conspa=0,fin=0,buscar=0,i;
 int letrabuscar=0;
 char Letra=' ',letra=Letra,may=' ';
 int letrainicial=0,x=0;
 char Buscarletra [];
 
    public StringManager() {
      initComponents();
      setLocationRelativeTo(null);
      btnEN.setEnabled(false);
      btn_M.setEnabled(false);  
      btn_m.setEnabled(false);  
      btnReset.setEnabled(true);  
      btnSearch.setEnabled(true);  
      btnShow.setEnabled(true);
    }
    public void Botones(){
    if (!txtName.getText().isEmpty()){  
      btnReset.setEnabled(true);  
      btnSearch.setEnabled(true);  
      btnShow.setEnabled(true);
      btn_M.setEnabled(false);  
      btn_m.setEnabled(false); 
    }else{ 
      btnReset.setEnabled(true);  
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
             letrainicial=i+1;
             letra=Character.toLowerCase(letra);
           }
           if(letrainicial==i){
             letra=Character.toUpperCase(letra);        
           }
           contador++;
           Completo+=letra;
       }
       fin=contador;
       return Completo;  
    }
     public String buscar(String palabra){
    Buscarletra = Nombre.toCharArray();
    for ( x=1;x<Nombre.length();x++){
        if((letrabuscar-1)==x){
        Character.toString(Buscarletra [x]);
        letraf=Integer.toString(Buscarletra [x]);
        }
        }
    letraf+=letra;
    return letraf; 
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        lblYN = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSP = new javax.swing.JButton();
        btnEN = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
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
        lblTitulo2 = new javax.swing.JLabel();
        txtbuscador = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btn_M = new javax.swing.JButton();
        btn_m = new javax.swing.JButton();
        lblLetra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("String Manager");
        setBackground(new java.awt.Color(0, 0, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblYN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblYN.setText("Your name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnSP.setBackground(new java.awt.Color(204, 255, 204));
        btnSP.setForeground(new java.awt.Color(51, 51, 51));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblYN, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(btnEN)
                        .addGap(18, 18, 18)
                        .addComponent(btnSP)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblYN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSP)
                            .addComponent(btnEN))))
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        btnShow.setBackground(new java.awt.Color(204, 204, 255));
        btnShow.setForeground(new java.awt.Color(0, 51, 51));
        btnShow.setText("SHOW");
        btnShow.setFocusPainted(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(204, 204, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel2.setToolTipText("..");

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl1.setText("Your name is : ");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl2.setText("Your name in MAY:");

        lblMay.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl3.setText("Your name in MIN:");

        lblMin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl4.setText("Total characters :");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl5.setText("Initial capital letters :");

        lblInitial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Letter finder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTitulo2.setText("Type a number:");

        txtbuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscadorActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 255, 204));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btn_M.setBackground(new java.awt.Color(204, 255, 204));
        btn_M.setText("MAY");
        btn_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MActionPerformed(evt);
            }
        });

        btn_m.setBackground(new java.awt.Color(204, 255, 204));
        btn_m.setText("MIN");
        btn_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mActionPerformed(evt);
            }
        });

        lblLetra.setBackground(new java.awt.Color(204, 255, 204));
        lblLetra.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblLetra.setForeground(new java.awt.Color(204, 255, 204));
        lblLetra.setText("?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo2)
                    .addComponent(txtbuscador)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(142, 142, 142)
                .addComponent(lblLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_m)
                    .addComponent(btn_M))
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_M)
                        .addGap(18, 18, 18)
                        .addComponent(btn_m))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblLetra))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(lblMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl4)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(lblInitial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                    .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {                                             
    Botones();
    }
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {                                        

     if (!txtName.getText().isEmpty()){
     Nombre=txtName.getText();
     lblName.setText(Nombre);
     String Mayus = Nombre.toUpperCase();
     lblMay.setText(Mayus);
     String Minus = Nombre.toLowerCase();
     lblMin.setText(Minus);
     characters(Nombre);
     lblTotal.setText(Integer.toString(fin));
     lblInitial.setText(Completo);
     i=0;Completo="";fin=0;conspa=0;contador=0;
     }else{
     txtbuscador.setText("");
     txtName.setText("");
     lblName.setText("");
     lblMay.setText("");
     lblMin.setText("");
     lblTotal.setText("");
     lblInitial.setText("");
    } 
    }                                       

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtName.setText("");
        Botones();
        Nombre=""; Mayus="";Minus="";Completo=Nombre;letraf="";contador=0;conspa=0;fin=0;buscar=0;
        i=0;letrabuscar=0;Letra=' ';
        letra=Letra;may=' ';letrainicial=0;
        x=0;     
        lblName.setText("");
        lblMay.setText("");
        lblMin.setText("");
        lblTotal.setText("");
        lblInitial.setText("");
        lblLetra.setText("?");
        txtbuscador.setText("");
    }                                        

    private void btn_MActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if (Buscarletra [(letrabuscar-1)]==' '){
        lblLetra.setText("_");
        btn_m.setEnabled(false);
        btn_M.setEnabled(false);       
        }else{
        String M = letraf.toUpperCase();
        lblLetra.setText(M);
        btn_M.setEnabled(false);
        btn_m.setEnabled(true);
        }
    }                                     

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        lblYN.setText("Tu nombre:");
        lbl1.setText("Tu nombre es:");
        lbl2.setText("Tu nombre en MAY:");
        lbl3.setText("Tu nombre en MIN:");
        lbl4.setText("Caracteres totales:");
        lbl5.setText("Letras iniciales de subtítulos:");
        lblTitulo2.setText("Escribe un número:");
        btnShow.setText("MOSTRAR");
        btnReset.setText("REINICIAR");
        btnSearch.setText("BUSCAR");
        btnSP.setEnabled(false);
        btnEN.setEnabled(true);                                       
    }                                     

    private void btn_mActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if (Buscarletra [(letrabuscar-1)]==' '){
        lblLetra.setText("_");
        btn_m.setEnabled(false);
        btn_M.setEnabled(false);       
       }else{
        String N = letraf.toLowerCase();
        lblLetra.setText(N);
        btn_m.setEnabled(false);
        btn_M.setEnabled(true);
       }
    }                                     

    private void txtbuscadorActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           
    private void btnENActionPerformed(java.awt.event.ActionEvent evt) {                                      
        lblYN.setText("Your name:");
        lbl1.setText("Your name is:");
        lbl2.setText("Your name in MAY:");
        lbl3.setText("Your name in MIN:");
        lbl4.setText("Total characters ::");
        lbl5.setText("Initial caption letters :");
        lblTitulo2.setText("Type a number:");
        btnShow.setText("SHOW");
        btnReset.setText("RESET");
        btnSearch.setText("SEARCH");
        btnSP.setEnabled(true);
        btnEN.setEnabled(false);
    }                                     

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          

      if (txtbuscador.getText().isEmpty()){
      String o=lblYN.getText();
      }else{
        letraf="";  letrabuscar=0;Letra=' ';letra=Letra;letrainicial=0;x=letrabuscar;
        lblLetra.setText("");
        letraf="";  
        letrabuscar=Integer.parseInt(txtbuscador.getText());
        buscar(Nombre);
        letraf=Character.toString(Buscarletra [(letrabuscar-1)]);
        
       if (Buscarletra [(letrabuscar-1)]==' '){
        lblLetra.setText("_");
        btn_m.setEnabled(false);
        btn_M.setEnabled(false);       
       }else 
       if (lblName.getText()==""){
        lblLetra.setText("");}else{
        lblLetra.setText(letraf);
       }
       if (Character.isUpperCase(Buscarletra [(letrabuscar-1)])){
        btn_M.setEnabled(false);
        btn_m.setEnabled(true);
      }else{
        btn_m.setEnabled(false);
        btn_M.setEnabled(true);
      }
    }                                             
    }                                         

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {                                          
    char validar = evt.getKeyChar();
    if(Character.isDigit(validar)){
     getToolkit().beep();
     evt.consume();
     String o=lblYN.getText();    
    }
    }        
     
    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {                                          
    if (lblName.getText()=="") { 
      String o=lblYN.getText();    
    }
    char validar = evt.getKeyChar();
    if(Character.isLetter(validar)){
     getToolkit().beep();
     evt.consume();
     String o=lblYN.getText();
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

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnEN;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btn_M;
    private javax.swing.JButton btn_m;
    private javax.swing.JColorChooser jColorChooser1;
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
    private javax.swing.JLabel lblLetra;
    private javax.swing.JLabel lblMay;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblYN;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtbuscador;
    // End of variables declaration                   

    private String toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
