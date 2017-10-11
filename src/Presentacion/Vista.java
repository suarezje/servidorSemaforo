/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author Estudiantes
 */
public class Vista extends javax.swing.JFrame {
    private Modelo modelo;
    private Controlador control;
    
    public Vista(Modelo aThis) {
        modelo = aThis;
   }
    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
    }
        return control;
    }
    
      public Modelo getModelo() {
        return modelo;
    }
      
    public void iniciar (){
        initComponents1();
        capturareventos();
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        L1DanadosA = new javax.swing.JLabel();
        L1DanadosV = new javax.swing.JLabel();
        ResultadoRojoL1 = new javax.swing.JLabel();
        ResultadoAmarilloL1 = new javax.swing.JLabel();
        ResultadoVerdeL1 = new javax.swing.JLabel();
        IntermitenciaL1 = new javax.swing.JCheckBox();
        L1DañadosR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CheckRojoL1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        CheckVerdeL1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        CheckAmarilloL1 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        CheckAmarilloL2 = new javax.swing.JCheckBox();
        L2DanadosA = new javax.swing.JLabel();
        L2DanadosV = new javax.swing.JLabel();
        ResultadoRojoL2 = new javax.swing.JLabel();
        ResultadoAmarilloL2 = new javax.swing.JLabel();
        ResultadoVerdeL2 = new javax.swing.JLabel();
        IntermitenciaL2 = new javax.swing.JCheckBox();
        L2DañadosR = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        CheckRojoL2 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        CheckVerdeL2 = new javax.swing.JCheckBox();
        BtnEnviar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CantL1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CantL2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        L1DanadosA.setText("N° Dañados Amarillo:");

        L1DanadosV.setText("N° Dañados Verde:");

        ResultadoRojoL1.setText("resultado");

        ResultadoAmarilloL1.setText("resultado2");

        ResultadoVerdeL1.setText("resultado3");

        IntermitenciaL1.setText("Intermitencia");

        L1DañadosR.setText("N° Dañados Rojo:");

        jLabel5.setText("LÍNEA 1 Encendidos");

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CheckRojoL1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CheckRojoL1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CheckVerdeL1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CheckVerdeL1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CheckAmarilloL1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(CheckAmarilloL1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(CheckAmarilloL2)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(CheckAmarilloL2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        L2DanadosA.setText("N° Dañados Amarillo:");

        L2DanadosV.setText("N° Dañados Verde:");

        ResultadoRojoL2.setText("resultado");

        ResultadoAmarilloL2.setText("resultado2");

        ResultadoVerdeL2.setText("resultado3");

        IntermitenciaL2.setText("Intermitencia");

        L2DañadosR.setText("N° Dañados Rojo:");

        jLabel17.setText("LÍNEA 2 Encendidos");

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));

        CheckRojoL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckRojoL2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CheckRojoL2)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CheckRojoL2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(102, 255, 51));

        CheckVerdeL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckVerdeL2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CheckVerdeL2)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CheckVerdeL2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        BtnEnviar.setText("Enviar");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        id.setText("Idcliente");

        jLabel1.setText("CLIENTE");

        CantL1.setText("jLabel2");

        jLabel3.setText("Cantidad");

        CantL2.setText("jLabel2");

        jLabel6.setText("Cantidad");

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CantL1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(IntermitenciaL1)
                                        .addGap(64, 64, 64))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(L1DanadosA)
                                            .addComponent(L1DañadosR)
                                            .addComponent(L1DanadosV))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ResultadoVerdeL1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ResultadoAmarilloL1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ResultadoRojoL1, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(5, 22, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(id)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(L2DanadosA)
                                    .addComponent(L2DañadosR)
                                    .addComponent(IntermitenciaL2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ResultadoAmarilloL2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ResultadoRojoL2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(CantL2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(L2DanadosV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ResultadoVerdeL2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IntermitenciaL1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IntermitenciaL2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(CantL2))
                                .addGap(2, 2, 2)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(CantL1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L1DañadosR)
                                    .addComponent(ResultadoRojoL1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ResultadoAmarilloL1)
                                    .addComponent(L1DanadosA))
                                .addGap(39, 39, 39))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L1DanadosV)
                        .addComponent(ResultadoVerdeL1)))
                .addGap(10, 10, 10)
                .addComponent(BtnSalir)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResultadoRojoL2)
                            .addComponent(L2DañadosR))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResultadoAmarilloL2)
                            .addComponent(L2DanadosA))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L2DanadosV)
                            .addComponent(ResultadoVerdeL2))
                        .addGap(45, 45, 45))
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEnviar)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents1() {
        
      jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        L1DanadosA = new javax.swing.JLabel();
        L1DanadosV = new javax.swing.JLabel();
        ResultadoRojoL1 = new javax.swing.JLabel();
        ResultadoAmarilloL1 = new javax.swing.JLabel();
        ResultadoVerdeL1 = new javax.swing.JLabel();
        IntermitenciaL1 = new javax.swing.JCheckBox();
        L1DañadosR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CheckRojoL1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        CheckVerdeL1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        CheckAmarilloL1 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        CheckAmarilloL2 = new javax.swing.JCheckBox();
        L2DanadosA = new javax.swing.JLabel();
        L2DanadosV = new javax.swing.JLabel();
        ResultadoRojoL2 = new javax.swing.JLabel();
        ResultadoAmarilloL2 = new javax.swing.JLabel();
        ResultadoVerdeL2 = new javax.swing.JLabel();
        IntermitenciaL2 = new javax.swing.JCheckBox();
        L2DañadosR = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        CheckRojoL2 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        CheckVerdeL2 = new javax.swing.JCheckBox();
        BtnEnviar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CantL1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CantL2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        L1DanadosA.setText("N° Dañados Amarillo:");

        L1DanadosV.setText("N° Dañados Verde:");

        ResultadoRojoL1.setText("resultado");

        ResultadoAmarilloL1.setText("resultado2");

        ResultadoVerdeL1.setText("resultado3");

        IntermitenciaL1.setText("Intermitencia");

        L1DañadosR.setText("N° Dañados Rojo:");

        jLabel5.setText("LÍNEA 1 Encendidos");

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CheckRojoL1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CheckRojoL1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CheckVerdeL1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CheckVerdeL1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CheckAmarilloL1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(CheckAmarilloL1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(CheckAmarilloL2)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(CheckAmarilloL2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        L2DanadosA.setText("N° Dañados Amarillo:");

        L2DanadosV.setText("N° Dañados Verde:");

        ResultadoRojoL2.setText("resultado");

        ResultadoAmarilloL2.setText("resultado2");

        ResultadoVerdeL2.setText("resultado3");

        IntermitenciaL2.setText("Intermitencia");

        L2DañadosR.setText("N° Dañados Rojo:");

        jLabel17.setText("LÍNEA 2 Encendidos");

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CheckRojoL2)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CheckRojoL2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CheckVerdeL2)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CheckVerdeL2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        BtnEnviar.setText("Enviar");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        id.setText("Idcliente");

        jLabel1.setText("CLIENTE");

        CantL1.setText("jLabel2");

        jLabel3.setText("Cantidad");

        CantL2.setText("jLabel2");

        jLabel6.setText("Cantidad");

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(IntermitenciaL1)
                                                .addGap(72, 72, 72))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(CantL1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105)))
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(L1DañadosR)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ResultadoRojoL1))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(L1DanadosA)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(ResultadoAmarilloL1)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(L1DanadosV)
                                                .addGap(18, 18, 18)
                                                .addComponent(ResultadoVerdeL1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(237, 237, 237))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(L2DañadosR)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ResultadoRojoL2))
                                        .addComponent(IntermitenciaL2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CantL2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(L2DanadosV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultadoVerdeL2)
                                .addGap(32, 32, 32)))
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(id)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(L2DanadosA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ResultadoAmarilloL2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(IntermitenciaL2)
                                    .addComponent(jLabel5)
                                    .addComponent(IntermitenciaL1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(CantL2)
                                            .addComponent(jLabel6))
                                        .addGap(2, 2, 2)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(CantL1)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(L1DañadosR)
                                            .addComponent(ResultadoRojoL1))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ResultadoAmarilloL1)
                                            .addComponent(L1DanadosA)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(L1DanadosV)
                                .addComponent(ResultadoVerdeL1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResultadoRojoL2)
                            .addComponent(L2DañadosR))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResultadoAmarilloL2)
                            .addComponent(L2DanadosA))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L2DanadosV)
                            .addComponent(ResultadoVerdeL2))
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BtnEnviar))
                    .addComponent(BtnSalir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    
    }// </editor-fold>   
    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void CheckVerdeL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckVerdeL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckVerdeL2ActionPerformed

    private void CheckRojoL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckRojoL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckRojoL2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel CantL1;
    private javax.swing.JLabel CantL2;
    private javax.swing.JCheckBox CheckAmarilloL1;
    private javax.swing.JCheckBox CheckAmarilloL2;
    private javax.swing.JCheckBox CheckRojoL1;
    private javax.swing.JCheckBox CheckRojoL2;
    private javax.swing.JCheckBox CheckVerdeL1;
    private javax.swing.JCheckBox CheckVerdeL2;
    private javax.swing.JCheckBox IntermitenciaL1;
    private javax.swing.JCheckBox IntermitenciaL2;
    private javax.swing.JLabel L1DanadosA;
    private javax.swing.JLabel L1DanadosV;
    private javax.swing.JLabel L1DañadosR;
    private javax.swing.JLabel L2DanadosA;
    private javax.swing.JLabel L2DanadosV;
    private javax.swing.JLabel L2DañadosR;
    private javax.swing.JLabel ResultadoAmarilloL1;
    private javax.swing.JLabel ResultadoAmarilloL2;
    private javax.swing.JLabel ResultadoRojoL1;
    private javax.swing.JLabel ResultadoRojoL2;
    private javax.swing.JLabel ResultadoVerdeL1;
    private javax.swing.JLabel ResultadoVerdeL2;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

    public void setId(JLabel id) {
        this.id = id;
    }
    public void cambiarid(int a){
       String h=String.valueOf(a);
       id.setText(h);
    }
    public String Obtenerid(){
         return id.getText();
    }
    public void setCantL1(int CantL1) {
        System.out.print("Entro a cambiar el dato del formulario");
        this.CantL1.setText(String.valueOf(CantL1));
    }

    public void setCantL2(int CantL2) {
        this.CantL2.setText(String.valueOf(CantL2));
    }
    
    public void capturareventos(){
        System.out.print("dasdasdas");
        BtnSalir.addActionListener(getControl());
        BtnEnviar.addActionListener(getControl());
    }

    public JButton getBtnEnviar() {
        return BtnEnviar;
    }

    public JButton getBtnsalir() {
       return BtnSalir;
    }

    public JCheckBox getCheckAmarilloL1() {
        return CheckAmarilloL1;
    }

    public JCheckBox getCheckAmarilloL2() {
        return CheckAmarilloL2;
    }

    public JCheckBox getCheckRojoL1() {
        return CheckRojoL1;
    }

    public JCheckBox getCheckRojoL2() {
        return CheckRojoL2;
    }

    public JCheckBox getCheckVerdeL1() {
        return CheckVerdeL1;
    }

    public JCheckBox getCheckVerdeL2() {
        return CheckVerdeL2;
    }

    public JCheckBox getIntermitenciaL1() {
        return IntermitenciaL1;
    }

    public JCheckBox getIntermitenciaL2() {
        return IntermitenciaL2;
    }

    public void setResultadoAmarilloL1(String ResultadoAmarilloL1) {
        this.ResultadoAmarilloL1.setText(ResultadoAmarilloL1);
    }

    public void setResultadoAmarilloL2(String ResultadoAmarilloL2) {
        this.ResultadoAmarilloL2.setText(ResultadoAmarilloL2);
    }

    public void setResultadoRojoL1(String ResultadoRojoL1) {
        this.ResultadoRojoL1.setText(ResultadoRojoL1);
    }

    public void setResultadoRojoL2(String ResultadoRojoL2) {
        this.ResultadoRojoL2.setText(ResultadoRojoL2);
    }

    public void setResultadoVerdeL1(String ResultadoVerdeL1) {
        this.ResultadoVerdeL1.setText(ResultadoVerdeL1);
    }

    public void setResultadoVerdeL2(String ResultadoVerdeL2) {
        this.ResultadoVerdeL2.setText(ResultadoVerdeL2);
    }
    
   
    
}
