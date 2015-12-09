package Evaluacion_empresas;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.jfree.chart.*;
import org.jfree.data.*;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.applet.Main;

public class Encuesta extends javax.swing.JFrame implements Printable {

    double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0, p10 = 0, p11 = 0, p12 = 0, p13 = 0, p14 = 0, p15 = 0, p16 = 0;
    JPanel componentes = new JPanel();
    public String path = null;
    public String filename = null;
    public File ruta = null;
    private String image_encuesta;
    private String image_resultados;
    private String image_conclusion;
    
    public Encuesta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        RazSoc = new javax.swing.JLabel();
        Preg1 = new javax.swing.JLabel();
        Preg2 = new javax.swing.JLabel();
        RazSocial = new javax.swing.JTextField();
        si1 = new javax.swing.JRadioButton();
        no1 = new javax.swing.JRadioButton();
        no2 = new javax.swing.JRadioButton();
        si2 = new javax.swing.JRadioButton();
        si3 = new javax.swing.JRadioButton();
        no3 = new javax.swing.JRadioButton();
        si4 = new javax.swing.JRadioButton();
        no4 = new javax.swing.JRadioButton();
        Preg3 = new javax.swing.JLabel();
        Preg4 = new javax.swing.JLabel();
        Factores1 = new javax.swing.JLabel();
        Preg6 = new javax.swing.JLabel();
        si5 = new javax.swing.JRadioButton();
        no5 = new javax.swing.JRadioButton();
        Preg16 = new javax.swing.JLabel();
        si6 = new javax.swing.JRadioButton();
        no6 = new javax.swing.JRadioButton();
        Preg7 = new javax.swing.JLabel();
        si7 = new javax.swing.JRadioButton();
        no7 = new javax.swing.JRadioButton();
        Factores2 = new javax.swing.JLabel();
        Preg8 = new javax.swing.JLabel();
        si8 = new javax.swing.JRadioButton();
        no8 = new javax.swing.JRadioButton();
        Preg9 = new javax.swing.JLabel();
        si9 = new javax.swing.JRadioButton();
        no9 = new javax.swing.JRadioButton();
        Preg10 = new javax.swing.JLabel();
        si10 = new javax.swing.JRadioButton();
        no10 = new javax.swing.JRadioButton();
        Preg11 = new javax.swing.JLabel();
        si11 = new javax.swing.JRadioButton();
        no11 = new javax.swing.JRadioButton();
        Preg12 = new javax.swing.JLabel();
        si12 = new javax.swing.JRadioButton();
        no12 = new javax.swing.JRadioButton();
        Preg13 = new javax.swing.JLabel();
        si13 = new javax.swing.JRadioButton();
        no13 = new javax.swing.JRadioButton();
        Preg14 = new javax.swing.JLabel();
        si14 = new javax.swing.JRadioButton();
        no14 = new javax.swing.JRadioButton();
        Preg15 = new javax.swing.JLabel();
        si15 = new javax.swing.JRadioButton();
        no15 = new javax.swing.JRadioButton();
        si16 = new javax.swing.JRadioButton();
        no16 = new javax.swing.JRadioButton();
        Factores3 = new javax.swing.JLabel();
        Factores4 = new javax.swing.JLabel();
        Preg5 = new javax.swing.JLabel();
        Preg17 = new javax.swing.JLabel();
        Preg18 = new javax.swing.JLabel();
        Preg19 = new javax.swing.JLabel();
        Preg20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Diagnostico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        Panel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        Panel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        Panel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.setBackground(java.awt.Color.white);

        RazSoc.setText("Razon Social");

        Preg1.setText("1. Cuenta con fuentes de financiamiento");
        Preg1.setPreferredSize(new java.awt.Dimension(526, 14));

        Preg2.setText("2. Cuenta con una inversión efectuada en  Existencias (Mercaderías)");

        si1.setText("si");
        si1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si1ActionPerformed(evt);
            }
        });

        no1.setBackground(java.awt.Color.white);
        no1.setText("no");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });

        no2.setBackground(java.awt.Color.white);
        no2.setText("no");
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });

        si2.setText("si");
        si2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si2ActionPerformed(evt);
            }
        });

        si3.setBackground(java.awt.Color.white);
        si3.setText("si");
        si3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si3ActionPerformed(evt);
            }
        });

        no3.setBackground(java.awt.Color.white);
        no3.setText("no");
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });

        si4.setBackground(java.awt.Color.white);
        si4.setText("si");
        si4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si4ActionPerformed(evt);
            }
        });

        no4.setBackground(java.awt.Color.white);
        no4.setText("no");
        no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no4ActionPerformed(evt);
            }
        });

        Preg3.setText("3. Cuenta con una inversión efectuada en Activos Fijos (Muebles e Inmuebles)");

        Preg4.setText("4. El negocio genera ingresos");

        Factores1.setBackground(java.awt.Color.blue);
        Factores1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Factores1.setForeground(new java.awt.Color(0, 0, 204));
        Factores1.setText("A) FACTORES ECONOMICOS DEL NEGOCIO");

        Preg6.setText("6. Sus costos y gastos en la gestion del negocio son siempre menores al valor de");

        si5.setBackground(java.awt.Color.white);
        si5.setText("si");
        si5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si5ActionPerformed(evt);
            }
        });

        no5.setBackground(java.awt.Color.white);
        no5.setText("no");
        no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no5ActionPerformed(evt);
            }
        });

        Preg16.setText("16. Cuenta con una página web o redes sociales para publicitar su necgocio");

        si6.setBackground(java.awt.Color.white);
        si6.setText("si");
        si6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si6ActionPerformed(evt);
            }
        });

        no6.setBackground(java.awt.Color.white);
        no6.setText("no");
        no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no6ActionPerformed(evt);
            }
        });

        Preg7.setText("7. Tiene Ruc");

        si7.setBackground(java.awt.Color.white);
        si7.setText("si");
        si7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si7ActionPerformed(evt);
            }
        });

        no7.setBackground(java.awt.Color.white);
        no7.setText("no");
        no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no7ActionPerformed(evt);
            }
        });

        Factores2.setBackground(java.awt.Color.blue);
        Factores2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Factores2.setForeground(new java.awt.Color(0, 0, 204));
        Factores2.setText("B) FACTORES REGULATORIOS DEL NEGOCIO");

        Preg8.setText("8. Conoce los regimenes Tributarios de la Sunat");

        si8.setBackground(java.awt.Color.white);
        si8.setText("si");
        si8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si8ActionPerformed(evt);
            }
        });

        no8.setBackground(java.awt.Color.white);
        no8.setText("no");
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });

        Preg9.setText("9. Cuenta con licencia de funcionamiento de la Municipalidad");

        si9.setBackground(java.awt.Color.white);
        si9.setText("si");
        si9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si9ActionPerformed(evt);
            }
        });

        no9.setBackground(java.awt.Color.white);
        no9.setText("no");
        no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no9ActionPerformed(evt);
            }
        });

        Preg10.setText("10. Conoce los requisitos exigidos por Defensa Civil");

        si10.setBackground(java.awt.Color.white);
        si10.setText("si");
        si10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si10ActionPerformed(evt);
            }
        });

        no10.setText("no");
        no10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no10ActionPerformed(evt);
            }
        });

        Preg11.setText("11. Cumple con regularidad con los pagos de sus obligaciones tributarias");

        si11.setText("si");
        si11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si11ActionPerformed(evt);
            }
        });

        no11.setBackground(java.awt.Color.white);
        no11.setText("no");
        no11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no11ActionPerformed(evt);
            }
        });

        Preg12.setText("12. Emite comprobante de pago (boletas de venta, tickets - facturas)");

        si12.setBackground(java.awt.Color.white);
        si12.setText("si");
        si12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si12ActionPerformed(evt);
            }
        });

        no12.setText("no");
        no12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no12ActionPerformed(evt);
            }
        });

        Preg13.setText("13. Cumple periodicamente con los pagos y renovación de la licencia de");

        si13.setBackground(java.awt.Color.white);
        si13.setText("si");
        si13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si13ActionPerformed(evt);
            }
        });

        no13.setText("no");
        no13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no13ActionPerformed(evt);
            }
        });

        Preg14.setText("14. Genera siempre propuesta de valor o innovación en la actividad que emprende");

        si14.setBackground(java.awt.Color.white);
        si14.setText("si");
        si14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si14ActionPerformed(evt);
            }
        });

        no14.setBackground(java.awt.Color.white);
        no14.setText("no");
        no14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no14ActionPerformed(evt);
            }
        });

        Preg15.setText("15. Tiene la capacidad de manejar adecuadamente sus emociones e influir en las");

        si15.setBackground(java.awt.Color.white);
        si15.setText("si");
        si15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si15ActionPerformed(evt);
            }
        });

        no15.setText("no");
        no15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no15ActionPerformed(evt);
            }
        });

        si16.setBackground(java.awt.Color.white);
        si16.setText("si");
        si16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si16ActionPerformed(evt);
            }
        });

        no16.setBackground(java.awt.Color.white);
        no16.setText("no");
        no16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no16ActionPerformed(evt);
            }
        });

        Factores3.setBackground(java.awt.Color.blue);
        Factores3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Factores3.setForeground(new java.awt.Color(0, 0, 204));
        Factores3.setText("C) FACTORES PERSONALES");

        Factores4.setBackground(java.awt.Color.blue);
        Factores4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Factores4.setForeground(new java.awt.Color(0, 0, 204));
        Factores4.setText("(Evalua en que situación regulatoria en la que se encuentra el negocio)");

        Preg5.setText("5. Sus ingresos generan rentabilidad");

        Preg17.setText("venta de sus servicios o existencia.");

        Preg18.setText("o realiza, y asume nuevos retos.");

        Preg19.setText("funcionamiento de su negocion licencia de funcionamiento de la Municipalidad.");

        Preg20.setText("emociones de los demás cuando se interlaciona.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Preg4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Preg1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Preg5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Preg2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Preg3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Preg6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(si3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(si4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(si5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(si1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(si2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(si6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no6))
                                    .addComponent(Preg17, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(si15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(no15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(si14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(no14))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Preg7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Preg8, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Preg9, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Preg10, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Factores4, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Preg11, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Preg12)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(si7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(no7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(si8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(no8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(si9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(no9))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(si10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(no10))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(si11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(no11))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(si12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(no12))))
                                    .addComponent(Preg13, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Factores3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RazSoc)
                                .addGap(18, 18, 18)
                                .addComponent(RazSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Factores1)
                            .addComponent(Factores2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Preg16, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Preg15, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(si16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no16))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(Preg18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Preg20, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Preg14, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(Preg19, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(si13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(no13)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RazSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RazSoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Factores1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si1)
                    .addComponent(no1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no2)
                    .addComponent(si2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no3)
                    .addComponent(si3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si4)
                    .addComponent(no4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si5)
                    .addComponent(no5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Preg6)
                        .addGap(20, 20, 20))
                    .addComponent(Preg17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si6)
                    .addComponent(no6))
                .addGap(10, 10, 10)
                .addComponent(Factores2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Factores4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si7)
                    .addComponent(no7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si8)
                    .addComponent(no8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si9)
                    .addComponent(no9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si10)
                    .addComponent(no10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si11)
                    .addComponent(no11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si12)
                    .addComponent(no12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Preg19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si13)
                    .addComponent(no13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Factores3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Preg15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(si14)
                            .addComponent(no14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preg20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si15)
                    .addComponent(no15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preg16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si16)
                    .addComponent(no16))
                .addGap(11, 11, 11))
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel6.setBackground(java.awt.Color.blue);
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FACTORES DETERMINANTES DEL ÉXITO DEL EMPRENDIMIENTO ");
        jLabel6.setAutoscrolls(true);

        jLabel7.setBackground(java.awt.Color.blue);
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DE NUEVOS NEGOCIOS EN LIMA METROPOLITANA");
        jLabel7.setAutoscrolls(true);

        jLabel8.setBackground(java.awt.Color.blue);
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ENCUESTA");
        jLabel8.setAutoscrolls(true);

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setText("PROCESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel9.setBackground(java.awt.Color.blue);
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RESULTADOS");
        jLabel9.setAutoscrolls(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Conclusión:");

        Diagnostico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Diagnostico.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Diagnostico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnIngresar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(231, 231, 231))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnIngresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ChartPanel panel;
        double tp1 = 0, tp2 = 0, tp3 = 0, tpos = 0, tn1 = 0, tn2 = 0, tn3 = 0, tneg = 0;

        tp1 = p1 + p2 + p3 + p4 + p5 + p6;
        tn1 = 1 - tp1;
        tp2 = p7 + p8 + p9 + p10 + p11 + p12 + p13;
        tn2 = 1 - tp2;
        tp3 = p14 + p15 + p16;
        tn3 = 1 - tp3;
        tpos = tp1 * 0.3 + tp2 * 0.2 + tp3 * 0.5;
        tneg = 1 - tpos;

        llamar_grafico(redondear(tp1), redondear(tn1), this.Panel1, "Factor Económico: 30%");
        llamar_grafico(redondear(tp2), redondear(tn2), this.Panel2, "Factor Regulatorio 20%");
        llamar_grafico(redondear(tp3), redondear(tn3), this.Panel3, "Factor Personal 50%");
        llamar_grafico(redondear(tpos), redondear(tneg), this.Panel4, "Total Factores");

        if (tpos >= 0.75) {
            Diagnostico.setForeground(Color.green);
            Diagnostico.setText("Negocio Exitoso");
        };
        if (0.75 > tpos && tpos >= 0.60) {
            Diagnostico.setForeground(Color.orange);
            Diagnostico.setText("Negocio Medianamente Exitoso");
        };
        if (0.60 > tpos) {
            Diagnostico.setForeground(Color.red);
            Diagnostico.setText("Negocio Deficiente");
        };
    }//GEN-LAST:event_btnIngresarActionPerformed

    public Double redondear(Double valor)
    {
        return Math.rint(valor*100)/100;
    }
    
    private void no16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no16ActionPerformed
        si16.setSelected(false);
        p16 = 0;
    }//GEN-LAST:event_no16ActionPerformed

    private void si16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si16ActionPerformed
        no16.setSelected(false);
        p16 = 0.2;
    }//GEN-LAST:event_si16ActionPerformed

    private void no15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no15ActionPerformed
        si15.setSelected(false);
        p15 = 0;
    }//GEN-LAST:event_no15ActionPerformed

    private void si15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si15ActionPerformed
        no15.setSelected(false);
        p15 = 0.3;
    }//GEN-LAST:event_si15ActionPerformed

    private void no14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no14ActionPerformed
        si14.setSelected(false);
        p14 = 0;
    }//GEN-LAST:event_no14ActionPerformed

    private void si14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si14ActionPerformed
        no14.setSelected(false);
        p14 = 0.5;
    }//GEN-LAST:event_si14ActionPerformed

    private void no13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no13ActionPerformed
        si13.setSelected(false);
        p13 = 0;
    }//GEN-LAST:event_no13ActionPerformed

    private void si13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si13ActionPerformed
        no13.setSelected(false);
        p13 = 0.03;
    }//GEN-LAST:event_si13ActionPerformed

    private void no12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no12ActionPerformed
        si12.setSelected(false);
        p12 = 0;
    }//GEN-LAST:event_no12ActionPerformed

    private void si12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si12ActionPerformed
        no12.setSelected(false);
        p12 = 0.3;
    }//GEN-LAST:event_si12ActionPerformed

    private void no11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no11ActionPerformed
        si11.setSelected(false);
        p11 = 0;
    }//GEN-LAST:event_no11ActionPerformed

    private void si11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si11ActionPerformed
        no11.setSelected(false);
        p11 = 0.05;
    }//GEN-LAST:event_si11ActionPerformed

    private void no10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no10ActionPerformed
        si10.setSelected(false);
        p10 = 0;
    }//GEN-LAST:event_no10ActionPerformed

    private void si10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si10ActionPerformed
        no10.setSelected(false);
        p10 = 0.01;
    }//GEN-LAST:event_si10ActionPerformed

    private void no9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no9ActionPerformed
        si9.setSelected(false);
        p9 = 0;
    }//GEN-LAST:event_no9ActionPerformed

    private void si9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si9ActionPerformed
        no9.setSelected(false);
        p9 = 0.1;
    }//GEN-LAST:event_si9ActionPerformed

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no8ActionPerformed
        si8.setSelected(false);
        p8 = 0;
    }//GEN-LAST:event_no8ActionPerformed

    private void si8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si8ActionPerformed
        no8.setSelected(false);
        p8 = 0.01;
    }//GEN-LAST:event_si8ActionPerformed

    private void no7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no7ActionPerformed
        si7.setSelected(false);
        p7 = 0;
    }//GEN-LAST:event_no7ActionPerformed

    private void si7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si7ActionPerformed
        no7.setSelected(false);
        p7 = 0.5;
    }//GEN-LAST:event_si7ActionPerformed

    private void no6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no6ActionPerformed
        si6.setSelected(false);
        p6 = 0;
    }//GEN-LAST:event_no6ActionPerformed

    private void si6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si6ActionPerformed
        no6.setSelected(false);
        p6 = 0.25;
    }//GEN-LAST:event_si6ActionPerformed

    private void no5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no5ActionPerformed
        si5.setSelected(false);
        p5 = 0;
    }//GEN-LAST:event_no5ActionPerformed

    private void si5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si5ActionPerformed
        no5.setSelected(false);
        p5 = 0.25;
    }//GEN-LAST:event_si5ActionPerformed

    private void no4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no4ActionPerformed
        si4.setSelected(false);
        p4 = 0;
    }//GEN-LAST:event_no4ActionPerformed

    private void si4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si4ActionPerformed
        no4.setSelected(false);
        p4 = 0.25;
    }//GEN-LAST:event_si4ActionPerformed

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        si3.setSelected(false);
        p3 = 0;
    }//GEN-LAST:event_no3ActionPerformed

    private void si3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si3ActionPerformed
        no3.setSelected(false);
        p3 = 0.05;
    }//GEN-LAST:event_si3ActionPerformed

    private void si2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si2ActionPerformed
        no2.setSelected(false);
        p2 = 0.1;
    }//GEN-LAST:event_si2ActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        si2.setSelected(false);
        p2 = 0;
    }//GEN-LAST:event_no2ActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        si1.setSelected(false);
        p1 = 0;
    }//GEN-LAST:event_no1ActionPerformed

    private void si1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si1ActionPerformed
        no1.setSelected(false);
        p1 = 0.1;
    }//GEN-LAST:event_si1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        JOptionPane.showMessageDialog(null, "Primero guarde el archivo para imprimir");
        Colocar_Destino();
        this.path = this.ruta.getParent();
        this.filename = this.ruta.getName();
        this.image_encuesta = this.path+"\\"+this.filename+"-encuesta.jpg";
        this.image_resultados = this.path+"\\"+this.filename+"-resultados.jpg";
        this.image_conclusion = this.path+"\\"+this.filename+"-conclusion.jpg";
        
        createImage(jPanel1,this.image_encuesta);
        createImage(jPanel2,this.image_resultados);
        createImage(jPanel3,this.image_conclusion);
        crear_PDF();
        JOptionPane.showMessageDialog(null, "El archivo se ha guardado con éxito");
        abrir_PDF();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void abrir_PDF()
    {
        try {
            File myFile = new File(this.ruta.getAbsolutePath()+".pdf");
            Desktop.getDesktop().open(myFile);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crear_PDF() {
        if (this.ruta != null) {
            try {
                Document documento = new Document();
                FileOutputStream fos = new FileOutputStream(this.ruta+".pdf");
                PdfWriter pdf = PdfWriter.getInstance(documento, fos);
                pdf.open();
                documento.open();
                documento.addTitle(this.ruta.getName());
                Image img1 = Image.getInstance(this.image_encuesta);
                img1.scalePercent(50);
                Image img2 = Image.getInstance(this.image_resultados);
                img2.scalePercent(50);
                Image img3 = Image.getInstance(this.image_conclusion);
                img3.scalePercent(40);
                documento.add(img1);
                documento.add(img2);
                documento.add(img3);
                documento.close();
                pdf.close();
                Files.delete(Paths.get(this.image_encuesta));
                Files.delete(Paths.get(this.image_resultados));
                Files.delete(Paths.get(this.image_conclusion));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void createImage(Component panel, String nombre) {
        Dimension size = panel.getSize();
        BufferedImage image = new BufferedImage(
                size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        panel.paint(g2);
        try {
            ImageIO.write(image, "jpg", new File(nombre));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Colocar_Destino() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF", "pdf", "PDF");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.ruta = fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }
    
    private void llamar_grafico(double positivos, double negativos, JPanel JPanel, String titulo) {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Neg(" + negativos + ")", negativos);
        data.setValue("Pos(" + positivos + ")", positivos);
        JFreeChart chart = ChartFactory.createPieChart(titulo, data, true, true, false);
        ChartPanel panel;
        panel = new ChartPanel(chart);
        panel.setBounds(10, 0, 500, 300);
        JPanel.removeAll();
        JPanel.add(panel);
        JPanel.repaint();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Diagnostico;
    private javax.swing.JLabel Factores1;
    private javax.swing.JLabel Factores2;
    private javax.swing.JLabel Factores3;
    private javax.swing.JLabel Factores4;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JLabel Preg1;
    private javax.swing.JLabel Preg10;
    private javax.swing.JLabel Preg11;
    private javax.swing.JLabel Preg12;
    private javax.swing.JLabel Preg13;
    private javax.swing.JLabel Preg14;
    private javax.swing.JLabel Preg15;
    private javax.swing.JLabel Preg16;
    private javax.swing.JLabel Preg17;
    private javax.swing.JLabel Preg18;
    private javax.swing.JLabel Preg19;
    private javax.swing.JLabel Preg2;
    private javax.swing.JLabel Preg20;
    private javax.swing.JLabel Preg3;
    private javax.swing.JLabel Preg4;
    private javax.swing.JLabel Preg5;
    private javax.swing.JLabel Preg6;
    private javax.swing.JLabel Preg7;
    private javax.swing.JLabel Preg8;
    private javax.swing.JLabel Preg9;
    private javax.swing.JLabel RazSoc;
    private javax.swing.JTextField RazSocial;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton no1;
    private javax.swing.JRadioButton no10;
    private javax.swing.JRadioButton no11;
    private javax.swing.JRadioButton no12;
    private javax.swing.JRadioButton no13;
    private javax.swing.JRadioButton no14;
    private javax.swing.JRadioButton no15;
    private javax.swing.JRadioButton no16;
    private javax.swing.JRadioButton no2;
    private javax.swing.JRadioButton no3;
    private javax.swing.JRadioButton no4;
    private javax.swing.JRadioButton no5;
    private javax.swing.JRadioButton no6;
    private javax.swing.JRadioButton no7;
    private javax.swing.JRadioButton no8;
    private javax.swing.JRadioButton no9;
    private javax.swing.JRadioButton si1;
    private javax.swing.JRadioButton si10;
    private javax.swing.JRadioButton si11;
    private javax.swing.JRadioButton si12;
    private javax.swing.JRadioButton si13;
    private javax.swing.JRadioButton si14;
    private javax.swing.JRadioButton si15;
    private javax.swing.JRadioButton si16;
    private javax.swing.JRadioButton si2;
    private javax.swing.JRadioButton si3;
    private javax.swing.JRadioButton si4;
    private javax.swing.JRadioButton si5;
    private javax.swing.JRadioButton si6;
    private javax.swing.JRadioButton si7;
    private javax.swing.JRadioButton si8;
    private javax.swing.JRadioButton si9;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) graphics;
        //Punto donde empezará a imprimir dentro la pagina (100, 50)
        g2d.translate(pageFormat.getImageableX() + 100,
                pageFormat.getImageableY() + 50);
        g2d.scale(0.50, 0.50); //Reducción de la impresión al 50%
        componentes.printAll(graphics);
        return PAGE_EXISTS;
    }
}
