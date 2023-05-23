
package FigurasGeometricas;


public class VentanaPrincipal extends javax.swing.JFrame {

   
    public VentanaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBaseTriangulo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAlturaTriangulo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtTriangulo = new javax.swing.JLabel();
        txtAreaTriangulo = new javax.swing.JLabel();
        txtPerimetroTriangulo = new javax.swing.JLabel();
        txtAreaCuadrado = new javax.swing.JLabel();
        txtPerimetroCuadrado = new javax.swing.JLabel();
        txtAreaRectangulo = new javax.swing.JLabel();
        txtPerimetroRectangulo = new javax.swing.JLabel();
        txtAreaCirculo = new javax.swing.JLabel();
        txtPerimetroCirculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Area del Cuadrado :");

        jLabel2.setText("Perimetro del Cuadrado :");

        jLabel3.setText("Area del Rectangulo :");

        jLabel4.setText("Perimetro del Rectangulo :");

        jLabel5.setText("Area del Circulo :");

        jLabel6.setText("Perimetro del Circulo :");

        jLabel7.setText("Perimetro del Triangulo :");

        jLabel8.setText("Area del Triangulo :");

        jLabel9.setText("¿Que tipo de Triangulo es? :");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel10.setText("Radio del Circulo");

        jLabel11.setText("Base del triangulo ");

        jLabel12.setText("Altural del triangulo");

        jLabel13.setText("Longitud del cuadrado");

        jLabel15.setText("Base del rectangulo");

        jLabel16.setText("Altura del rectangulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(btnCalcular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(btnBorrar)
                                .addGap(141, 141, 141)
                                .addComponent(btnSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAreaTriangulo)
                                    .addComponent(txtTriangulo)
                                    .addComponent(txtPerimetroTriangulo)
                                    .addComponent(txtAreaCuadrado)
                                    .addComponent(txtPerimetroCuadrado)
                                    .addComponent(txtAreaRectangulo)
                                    .addComponent(txtPerimetroRectangulo)
                                    .addComponent(txtAreaCirculo)
                                    .addComponent(txtPerimetroCirculo)))
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnBorrar)
                    .addComponent(btnSalir))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTriangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAreaTriangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPerimetroTriangulo))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAreaCuadrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPerimetroCuadrado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAreaRectangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPerimetroRectangulo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAreaCirculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPerimetroCirculo))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Codigo del boton salir btnSalir :
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // codigo del boton calcular btnCalcular :
        double radio,areaCirculo, perimetroCirculo, alturaRectangulo, baseRectangulo, areaRectangulo, perimetroRectangulo, lado,
                areaCuadrado, perimetroCuadrado, baseTriangulo, alturaTriangulo, areaTriangulo, perimetroTriangulo;
        radio = Double.parseDouble(txtRadio.getText());
        baseRectangulo = Double.parseDouble(txtBase.getText());
        alturaRectangulo = Double.parseDouble(txtAltura.getText());
        lado = Double.parseDouble(txtLado.getText());
        baseTriangulo = Double.parseDouble(txtBaseTriangulo.getText());
        alturaTriangulo = Double.parseDouble(txtAlturaTriangulo.getText());
        
        
        
        areaTriangulo = Triangulo.calcularArea(baseTriangulo,alturaTriangulo);
        txtAreaTriangulo.setText(String.valueOf(areaTriangulo));
        perimetroTriangulo = Triangulo.calcularPerimetro(baseTriangulo,alturaTriangulo);
        txtPerimetroTriangulo.setText(String.valueOf(perimetroTriangulo));
        
        areaCuadrado = Cuadrado.calcularArea(lado);
        txtAreaCuadrado.setText(String.valueOf(areaCuadrado));
        perimetroCuadrado = Cuadrado.calcularPerimetro(lado);
        txtPerimetroCuadrado.setText(String.valueOf(perimetroCuadrado));
                
        areaRectangulo = Rectangulo.calcularArea(alturaRectangulo, baseRectangulo);
        txtAreaRectangulo.setText(String.valueOf(areaRectangulo));
        perimetroRectangulo = Rectangulo.calcularPerimetro(alturaRectangulo, baseRectangulo);
        txtPerimetroRectangulo.setText(String.valueOf(perimetroRectangulo));
        
        areaCirculo = Circulo.calcularArea(radio);
        txtAreaCirculo.setText(String.valueOf(areaCirculo));
        perimetroCirculo = Circulo.calcularPerimetro(radio);
        txtPerimetroCirculo.setText(String.valueOf(perimetroCirculo));
        
String a; 
String b;
String c;
if ((baseTriangulo == alturaTriangulo) && (baseTriangulo == Triangulo.calcularHipotenusa(alturaTriangulo, baseTriangulo)) 
        && (alturaTriangulo == Triangulo.calcularHipotenusa(alturaTriangulo, baseTriangulo)))
    
      {  a="Es un triangulo equilatero";
         txtTriangulo.setText(a);}

else if ((baseTriangulo != alturaTriangulo) && (baseTriangulo != Triangulo.calcularHipotenusa(alturaTriangulo, baseTriangulo)) &&
(alturaTriangulo != Triangulo.calcularHipotenusa(alturaTriangulo, baseTriangulo))){
    b ="Es un triángulo escaleno";
         txtTriangulo.setText(b); }
else { c="Es un triangulo isoceles";
         txtTriangulo.setText(c); }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // codigo del boton borrar btnBorrar :
        txtTriangulo.setText("");
        txtPerimetroCirculo.setText("");
        txtAreaCirculo.setText("");
        txtPerimetroRectangulo.setText("");
        txtAreaRectangulo.setText("");       
        txtPerimetroCuadrado.setText("");
        txtAreaCuadrado.setText("");
        txtPerimetroTriangulo.setText("");
        txtAreaTriangulo.setText("");        
        txtAlturaTriangulo.setText("");
        txtBaseTriangulo.setText("");
        txtLado.setText("");
        txtAltura.setText("");
        txtBase.setText("");
        txtRadio.setText("");
                        
    }//GEN-LAST:event_btnBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtAlturaTriangulo;
    private javax.swing.JLabel txtAreaCirculo;
    private javax.swing.JLabel txtAreaCuadrado;
    private javax.swing.JLabel txtAreaRectangulo;
    private javax.swing.JLabel txtAreaTriangulo;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLado;
    private javax.swing.JLabel txtPerimetroCirculo;
    private javax.swing.JLabel txtPerimetroCuadrado;
    private javax.swing.JLabel txtPerimetroRectangulo;
    private javax.swing.JLabel txtPerimetroTriangulo;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JLabel txtTriangulo;
    // End of variables declaration//GEN-END:variables
}
