/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ernesto
 */
public class Libros extends javax.swing.JFrame {
    
    ArrayList<Libros_Principal> Libros_P;
    LibrosDB db=new LibrosDB();
    
    //variable para seleccion
  int estadodeseleccion=0;
    
    Connection cn;
    PreparedStatement ps;
    ResultSetMetaData ram;
    DefaultTableModel dmt;
    ListSelectionModel lsmlibro;
    
    
    /**
     * Creates new form Libros
     */
    public Libros() {
        initComponents();
        lb_aviso.setText(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblibros = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        Titulo = new javax.swing.JLabel();
        boton_nuevo = new javax.swing.JLabel();
        boton_editar = new javax.swing.JLabel();
        boton_borrar = new javax.swing.JLabel();
        in_codigo = new javax.swing.JTextField();
        in_titulo = new javax.swing.JTextField();
        in_autor = new javax.swing.JTextField();
        in_anio = new javax.swing.JTextField();
        in_genero = new javax.swing.JTextField();
        in_editorial = new javax.swing.JTextField();
        in_cant = new javax.swing.JTextField();
        BotonActualizar = new javax.swing.JLabel();
        BotonGuardado = new javax.swing.JLabel();
        BotonSalida = new javax.swing.JLabel();
        lb_aviso = new javax.swing.JLabel();
        Lbfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(360, 400));
        setName("Libros"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idlibro", "Titulo", "Autor", "Anio_Publi", "Genero", "Editorial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblibros.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tblibrosComponentAdded(evt);
            }
        });
        tblibros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblibrosFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblibros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 590, 300));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 370));

        Titulo.setBackground(new java.awt.Color(100, 180, 100));
        Titulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("LIBROS");
        Titulo.setToolTipText("");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        Titulo.setOpaque(true);
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        boton_nuevo.setBackground(new java.awt.Color(55, 55, 55));
        boton_nuevo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        boton_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_nuevo.setText("NUEVO");
        boton_nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        boton_nuevo.setOpaque(true);
        boton_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_nuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_nuevoMouseExited(evt);
            }
        });
        getContentPane().add(boton_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 30));

        boton_editar.setBackground(new java.awt.Color(55, 55, 55));
        boton_editar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_editar.setForeground(new java.awt.Color(255, 255, 255));
        boton_editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_editar.setText("EDITAR");
        boton_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        boton_editar.setOpaque(true);
        boton_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_editarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_editarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_editarMouseExited(evt);
            }
        });
        getContentPane().add(boton_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, 30));

        boton_borrar.setBackground(new java.awt.Color(55, 55, 55));
        boton_borrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_borrar.setForeground(new java.awt.Color(255, 255, 255));
        boton_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_borrar.setText("BORRAR");
        boton_borrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        boton_borrar.setOpaque(true);
        boton_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_borrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_borrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_borrarMouseExited(evt);
            }
        });
        getContentPane().add(boton_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 80, 30));

        in_codigo.setEditable(false);
        in_codigo.setBackground(new java.awt.Color(200, 200, 200));
        in_codigo.setText("CODIGO");
        in_codigo.setFocusable(false);
        in_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(in_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 90, 30));

        in_titulo.setEditable(false);
        in_titulo.setBackground(new java.awt.Color(200, 200, 200));
        in_titulo.setText("TITULO");
        in_titulo.setFocusable(false);
        in_titulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                in_tituloFocusGained(evt);
            }
        });
        getContentPane().add(in_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 30));

        in_autor.setEditable(false);
        in_autor.setBackground(new java.awt.Color(200, 200, 200));
        in_autor.setText("AUTOR");
        in_autor.setFocusable(false);
        in_autor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                in_autorFocusGained(evt);
            }
        });
        in_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_autorKeyTyped(evt);
            }
        });
        getContentPane().add(in_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 30));

        in_anio.setEditable(false);
        in_anio.setBackground(new java.awt.Color(200, 200, 200));
        in_anio.setText("AÑO PUBLIC");
        in_anio.setFocusable(false);
        in_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_anioActionPerformed(evt);
            }
        });
        in_anio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                in_anioFocusGained(evt);
            }
        });
        in_anio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_anioKeyTyped(evt);
            }
        });
        getContentPane().add(in_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 90, 30));

        in_genero.setEditable(false);
        in_genero.setBackground(new java.awt.Color(200, 200, 200));
        in_genero.setText("GENERO");
        in_genero.setFocusable(false);
        in_genero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                in_generoFocusGained(evt);
            }
        });
        in_genero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_generoKeyTyped(evt);
            }
        });
        getContentPane().add(in_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 30));

        in_editorial.setEditable(false);
        in_editorial.setBackground(new java.awt.Color(200, 200, 200));
        in_editorial.setText("EDITORIAL");
        in_editorial.setFocusable(false);
        in_editorial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                in_editorialFocusGained(evt);
            }
        });
        getContentPane().add(in_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, 30));

        in_cant.setEditable(false);
        in_cant.setBackground(new java.awt.Color(200, 200, 200));
        in_cant.setText("CANTIDAD");
        in_cant.setFocusable(false);
        in_cant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                in_cantFocusGained(evt);
            }
        });
        in_cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_cantKeyTyped(evt);
            }
        });
        getContentPane().add(in_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, 30));

        BotonActualizar.setBackground(new java.awt.Color(100, 180, 100));
        BotonActualizar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BotonActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonActualizar.setText("ATUALIZAR");
        BotonActualizar.setFocusable(false);
        BotonActualizar.setOpaque(true);
        BotonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonActualizarMousePressed(evt);
            }
        });
        BotonActualizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseMoved(evt);
            }
        });
        getContentPane().add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 120, 30));

        BotonGuardado.setBackground(new java.awt.Color(100, 180, 100));
        BotonGuardado.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BotonGuardado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonGuardado.setText("GUARDAR");
        BotonGuardado.setFocusable(false);
        BotonGuardado.setOpaque(true);
        BotonGuardado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardadoMousePressed(evt);
            }
        });
        BotonGuardado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotonGuardadoMouseMoved(evt);
            }
        });
        getContentPane().add(BotonGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 80, 40));

        BotonSalida.setBackground(new java.awt.Color(100, 180, 100));
        BotonSalida.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BotonSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonSalida.setText("VOLVER");
        BotonSalida.setFocusable(false);
        BotonSalida.setOpaque(true);
        BotonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonSalidaMousePressed(evt);
            }
        });
        BotonSalida.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotonSalidaMouseMoved(evt);
            }
        });
        getContentPane().add(BotonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 40));

        lb_aviso.setBackground(new java.awt.Color(55, 55, 55));
        lb_aviso.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        lb_aviso.setForeground(new java.awt.Color(255, 0, 0));
        lb_aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_aviso.setText("AVISO");
        lb_aviso.setOpaque(true);
        getContentPane().add(lb_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 140, 40));

        Lbfondo.setBackground(new java.awt.Color(55, 55, 55));
        Lbfondo.setOpaque(true);
        getContentPane().add(Lbfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalidaMouseClicked

        rootPane.setVisible(false);
       dispose();
        MenuP m = new MenuP();
        m.setVisible(true);    
        
    }//GEN-LAST:event_BotonSalidaMouseClicked

    private void BotonSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalidaMouseEntered
      Color bColor1=new Color(151,195,151);
        BotonSalida.setBackground(bColor1);  
    }//GEN-LAST:event_BotonSalidaMouseEntered

    private void BotonSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalidaMouseExited
      Color bColor2=new Color(100,180,100);
        BotonSalida.setBackground(bColor2);
    }//GEN-LAST:event_BotonSalidaMouseExited

    private void BotonSalidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalidaMousePressed
         Color bColor3=new Color(171,225,171);
        BotonSalida.setBackground(bColor3);
    }//GEN-LAST:event_BotonSalidaMousePressed

    private void BotonSalidaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalidaMouseMoved
         Color bColor3=new Color(151,195,151);
        BotonSalida.setBackground(bColor3);
    }//GEN-LAST:event_BotonSalidaMouseMoved

    private void boton_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_borrarMouseEntered

        Color bColor=new Color(100,100,100);
           boton_borrar.setBackground(bColor);
    }//GEN-LAST:event_boton_borrarMouseEntered

    private void boton_borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_borrarMouseExited

        Color bColor=new Color(55,55,55);
            boton_borrar.setBackground(bColor);
    }//GEN-LAST:event_boton_borrarMouseExited

    private void boton_nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_nuevoMouseEntered

        Color bColor=new Color(100,100,100);
           boton_nuevo.setBackground(bColor);
    }//GEN-LAST:event_boton_nuevoMouseEntered

    private void boton_nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_nuevoMouseExited
        
        Color bColor=new Color(55,55,55);
            boton_nuevo.setBackground(bColor);
    }//GEN-LAST:event_boton_nuevoMouseExited

    private void boton_editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_editarMouseEntered

         Color bColor=new Color(100,100,100);
           boton_editar.setBackground(bColor);
    }//GEN-LAST:event_boton_editarMouseEntered

    private void boton_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_editarMouseExited

        Color bColor=new Color(55,55,55);
            boton_editar.setBackground(bColor);
    }//GEN-LAST:event_boton_editarMouseExited

    private void in_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_anioActionPerformed

    private void in_autorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_autorKeyTyped

        char c = evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' '))evt.consume();
    }//GEN-LAST:event_in_autorKeyTyped

    private void in_cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_cantKeyTyped

        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_in_cantKeyTyped

    private void in_generoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_generoKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' '))evt.consume();
    }//GEN-LAST:event_in_generoKeyTyped

    private void in_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_codigoKeyTyped

         char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_in_codigoKeyTyped

    private void in_anioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_anioKeyTyped
        
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_in_anioKeyTyped

    private void BotonGuardadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardadoMouseClicked
        
           Conexion con = new Conexion();
           Connection conn = con.Conectar();
           Statement stm=null;
        
        
        String cad1,cad2,cad3,cad4,cad5,cad6;
       cad1=in_titulo.getText();
       cad2=in_autor.getText();
       cad3=in_genero.getText();
       cad4=in_editorial.getText();
       cad5=in_anio.getText();
       cad6=in_cant.getText();
       String ins=null;
       
      if ((in_titulo.getText().equals("")) || (in_autor.getText().equals("")) || (in_genero.getText().equals("")) || in_editorial.getText().equals("") || (in_anio.getText().equals("")) || (in_cant.getText().equals(""))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            in_titulo.requestFocus();
        }
      else {
      
        ins = "INSERT INTO `biblioteca`.`libro` (`Titulo`, `Autor`, `Anio_Publi`,`Genero`,`Editorial`) VALUES ('"+cad1+"', '"+cad2+"', '"+cad5+"', '"+cad3+"', '"+cad4+"')";
      }
      try{
          stm=conn.createStatement();
          stm.executeUpdate(ins);
      } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
   this.boton_nuevoMouseClicked(evt);
      
         
    }//GEN-LAST:event_BotonGuardadoMouseClicked

    private void BotonGuardadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardadoMouseEntered
        
        Color bColor1=new Color(151,195,151);
        BotonGuardado.setBackground(bColor1);  
    }//GEN-LAST:event_BotonGuardadoMouseEntered

    private void BotonGuardadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardadoMouseExited

         Color bColor2=new Color(100,180,100);
        BotonGuardado.setBackground(bColor2);
    }//GEN-LAST:event_BotonGuardadoMouseExited

    private void BotonGuardadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardadoMousePressed
        
        Color bColor3=new Color(171,225,171);
        BotonGuardado.setBackground(bColor3);
    }//GEN-LAST:event_BotonGuardadoMousePressed

    private void BotonGuardadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardadoMouseMoved
       
         Color bColor3=new Color(151,195,151);
        BotonGuardado.setBackground(bColor3);
    }//GEN-LAST:event_BotonGuardadoMouseMoved

    private void boton_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_nuevoMouseClicked

        estadodeseleccion=0;
        lb_aviso.setText("Ingreso Nuevo");
        
        in_titulo.setFocusable(true);
        in_titulo.setEditable(true);
        in_titulo.setBackground(Color.white);
        in_titulo.hasFocus();
       
        
        in_autor.setFocusable(true);
        in_autor.setEditable(true);
        in_autor.setBackground(Color.white);
        
 
        in_genero.setFocusable(true);
        in_genero.setEditable(true);
        in_genero.setBackground(Color.white);
        
        
        in_editorial.setFocusable(true);
        in_editorial.setEditable(true);
        in_editorial.setBackground(Color.white);
        
        
        in_anio.setFocusable(true);
        in_anio.setEditable(true);
        in_anio.setBackground(Color.white);
       
        
        in_cant.setFocusable(true);
        in_cant.setEditable(true);
        in_cant.setBackground(Color.white);
        
        
        in_codigo.setText("AUTO");
        
        
    }//GEN-LAST:event_boton_nuevoMouseClicked

    private void in_autorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_autorFocusGained
        in_autor.selectAll();
    }//GEN-LAST:event_in_autorFocusGained

    private void in_generoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_generoFocusGained
        in_genero.selectAll();
    }//GEN-LAST:event_in_generoFocusGained

    private void in_editorialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_editorialFocusGained
       in_editorial.selectAll();
    }//GEN-LAST:event_in_editorialFocusGained

    private void in_anioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_anioFocusGained
        in_anio.selectAll();
    }//GEN-LAST:event_in_anioFocusGained

    private void in_cantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_cantFocusGained
        in_cant.selectAll();
    }//GEN-LAST:event_in_cantFocusGained

    private void boton_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_editarMouseClicked

        estadodeseleccion=1;
   
        Color lbColor=new Color(200,200,200);
        
        lb_aviso.setText("NO DISPONIBLE");
        
        in_titulo.setEditable(false);
        in_titulo.setBackground(lbColor);
        in_titulo.setFocusable(false);
                
        in_autor.setEditable(false);
        in_autor.setBackground(lbColor);
        in_autor.setFocusable(false);
 
        in_genero.setEditable(false);
        in_genero.setBackground(lbColor);
        in_genero.setFocusable(false);
        
        in_editorial.setEditable(false);
        in_editorial.setBackground(lbColor);
        in_editorial.setFocusable(false);
        
        in_anio.setEditable(false);
        in_anio.setBackground(lbColor);
        in_anio.setFocusable(false);
        
        in_cant.setEditable(false);
        in_cant.setBackground(lbColor);
        in_cant.setFocusable(false);
                
        in_codigo.setText("Codigo");
    }//GEN-LAST:event_boton_editarMouseClicked

    private void boton_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_borrarMouseClicked

        estadodeseleccion=1;
        Color lbColor=new Color(200,200,200);
        
        lb_aviso.setText("NO DISPONIBLE");
        
        in_titulo.setEditable(false);
        in_titulo.setBackground(lbColor);
        in_titulo.setFocusable(false);
                
        in_autor.setEditable(false);
        in_autor.setBackground(lbColor);
        in_autor.setFocusable(false);
 
        in_genero.setEditable(false);
        in_genero.setBackground(lbColor);
        in_genero.setFocusable(false);
        
        in_editorial.setEditable(false);
        in_editorial.setBackground(lbColor);
        in_editorial.setFocusable(false);
        
        in_anio.setEditable(false);
        in_anio.setBackground(lbColor);
        in_anio.setFocusable(false);
        
        in_cant.setEditable(false);
        in_cant.setBackground(lbColor);
        in_cant.setFocusable(false);
        
        in_codigo.setText("Codigo");
    }//GEN-LAST:event_boton_borrarMouseClicked

    
    private void in_tituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_tituloFocusGained
        
         in_titulo.selectAll();
    }//GEN-LAST:event_in_tituloFocusGained

    private void tblibrosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tblibrosComponentAdded
        
    }//GEN-LAST:event_tblibrosComponentAdded

   
    
    private void BotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseClicked
        // TODO add your handling code here:
        Libros_P = db.listarLibros();
        DefaultTableModel tb=(DefaultTableModel)tblibros.getModel();
        for(Libros_Principal libros: Libros_P){
            limpiarformulario();
            tb.addRow(new Object[]{libros.getIdlibro(),libros.getTitulo(),libros.getAutor(),libros.getAnio_Publi(),libros.getGenero(),libros.getEditorial()});
        }
            
    }//GEN-LAST:event_BotonActualizarMouseClicked

    public void limpiarformulario(){
 
        DefaultTableModel tb=(DefaultTableModel)tblibros.getModel();
        for(int i=tb.getRowCount()-1;i>=0;i--)
            tb.removeRow(i);
}
    private void BotonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonActualizarMouseEntered

    private void BotonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonActualizarMouseExited

    private void BotonActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonActualizarMousePressed

    private void BotonActualizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonActualizarMouseMoved

    private void tblibrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblibrosFocusGained

        if(estadodeseleccion==1){
            in_titulo.getText();
            
        }
    }//GEN-LAST:event_tblibrosFocusGained

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
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonActualizar;
    private javax.swing.JLabel BotonGuardado;
    private javax.swing.JLabel BotonSalida;
    private javax.swing.JLabel Lbfondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel boton_borrar;
    private javax.swing.JLabel boton_editar;
    private javax.swing.JLabel boton_nuevo;
    private javax.swing.JTextField in_anio;
    private javax.swing.JTextField in_autor;
    private javax.swing.JTextField in_cant;
    private javax.swing.JTextField in_codigo;
    private javax.swing.JTextField in_editorial;
    private javax.swing.JTextField in_genero;
    private javax.swing.JTextField in_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_aviso;
    private javax.swing.JTable tblibros;
    // End of variables declaration//GEN-END:variables
}