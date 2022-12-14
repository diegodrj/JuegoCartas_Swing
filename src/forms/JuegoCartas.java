/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Component;
import java.awt.Image;
import static java.lang.Thread.sleep;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import persistencia.FondoPanel;
import persistencia.LeerProperties;

/**
 *
 * @author diego
 */
public class JuegoCartas extends javax.swing.JDialog {

    /**
     * Creates new form JuegoCartas
     */
    public JuegoCartas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setContentPane(new FondoPanel("/imagenes/fondo.jpg"));//Insertar fondo panel
        initComponents();

        cargarRutas();
        iniciarTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb_timer = new javax.swing.JLabel();
        panel_cartas = new javax.swing.JPanel();
        lb_carta2 = new javax.swing.JLabel();
        lb_carta3 = new javax.swing.JLabel();
        lb_carta4 = new javax.swing.JLabel();
        lb_carta5 = new javax.swing.JLabel();
        lb_carta1 = new javax.swing.JLabel();
        lb_carta7 = new javax.swing.JLabel();
        lb_carta8 = new javax.swing.JLabel();
        lb_carta6 = new javax.swing.JLabel();
        bt_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Juego de las parejas");

        lb_timer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_timer.setForeground(new java.awt.Color(255, 255, 255));
        lb_timer.setText("TIMER");

        panel_cartas.setOpaque(false);

        lb_carta2.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta2.setName("carta2"); // NOI18N
        lb_carta2.setOpaque(true);
        lb_carta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta2MouseClicked(evt);
            }
        });

        lb_carta3.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta3.setName("carta3"); // NOI18N
        lb_carta3.setOpaque(true);
        lb_carta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta3MouseClicked(evt);
            }
        });

        lb_carta4.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta4.setName("carta4"); // NOI18N
        lb_carta4.setOpaque(true);
        lb_carta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta4MouseClicked(evt);
            }
        });

        lb_carta5.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta5.setName("carta5"); // NOI18N
        lb_carta5.setOpaque(true);
        lb_carta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta5MouseClicked(evt);
            }
        });

        lb_carta1.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta1.setName("carta1"); // NOI18N
        lb_carta1.setOpaque(true);
        lb_carta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta1MouseClicked(evt);
            }
        });

        lb_carta7.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta7.setName("carta7"); // NOI18N
        lb_carta7.setOpaque(true);
        lb_carta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta7MouseClicked(evt);
            }
        });

        lb_carta8.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta8.setName("carta8"); // NOI18N
        lb_carta8.setOpaque(true);
        lb_carta8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta8MouseClicked(evt);
            }
        });

        lb_carta6.setBackground(new java.awt.Color(51, 51, 51));
        lb_carta6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        lb_carta6.setName("carta6"); // NOI18N
        lb_carta6.setOpaque(true);
        lb_carta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_carta6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_cartasLayout = new javax.swing.GroupLayout(panel_cartas);
        panel_cartas.setLayout(panel_cartasLayout);
        panel_cartasLayout.setHorizontalGroup(
            panel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cartasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cartasLayout.createSequentialGroup()
                        .addComponent(lb_carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_cartasLayout.createSequentialGroup()
                        .addComponent(lb_carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_cartasLayout.setVerticalGroup(
            panel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cartasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_reset.setBackground(new java.awt.Color(51, 51, 51));
        bt_reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_reset.setForeground(new java.awt.Color(255, 255, 255));
        bt_reset.setText("Reiniciar");
        bt_reset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 5, true));
        bt_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(panel_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_timer)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_timer))
                .addGap(18, 18, 18)
                .addComponent(panel_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_carta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta1MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta1MouseClicked

    private void lb_carta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta2MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta2MouseClicked

    private void lb_carta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta3MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta3MouseClicked

    private void lb_carta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta4MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta4MouseClicked

    private void lb_carta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta5MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta5MouseClicked

    private void lb_carta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta6MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta6MouseClicked

    private void lb_carta7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta7MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta7MouseClicked

    private void lb_carta8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carta8MouseClicked
        clickCarta((JLabel) evt.getComponent());
    }//GEN-LAST:event_lb_carta8MouseClicked

    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
        timer.cancel();
        iniciarTodo();
    }//GEN-LAST:event_bt_resetActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JuegoCartas dialog = new JuegoCartas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_carta1;
    private javax.swing.JLabel lb_carta2;
    private javax.swing.JLabel lb_carta3;
    private javax.swing.JLabel lb_carta4;
    private javax.swing.JLabel lb_carta5;
    private javax.swing.JLabel lb_carta6;
    private javax.swing.JLabel lb_carta7;
    private javax.swing.JLabel lb_carta8;
    private javax.swing.JLabel lb_timer;
    private javax.swing.JPanel panel_cartas;
    // End of variables declaration//GEN-END:variables
    //VARIABLES
    private ArrayList<String> imagenes;
    private ArrayList<JLabel> cartasAux;
    private Timer timer;
    private boolean pausa = false;

    //M??TODOS
    private void iniciarTodo(){
        cartasAux = new ArrayList<>();
        pausa = false;
        
        cargarRutasEnJLabels();
        empezarTimer();
    }
    
    private void clickCarta(JLabel carta) {
        if (pausa || carta.getIcon() != null) {
            return;
        }

        darImagen(carta);
        cartasAux.add(carta);
        if (cartasAux.size() == 1) {
            return;
        }

        comprobarCartas();
    }

    private void darImagen(JLabel carta) {
        System.out.println(carta.getName());
        ImageIcon img = new ImageIcon(getClass().getResource(carta.getAccessibleContext().getAccessibleDescription()));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(carta.getWidth(), carta.getHeight(), Image.SCALE_DEFAULT));
        carta.setIcon(icono);
    }

    private void comprobarCartas() {
        if (!cartasAux.get(0).getAccessibleContext().getAccessibleDescription().equals(cartasAux.get(1).getAccessibleContext().getAccessibleDescription())) {
            pausa = true;
            pausaUnSegundo(false);
            return;
        }

        cartasAux.clear();
        if (todasLevantadas()) {
            timer.cancel();
            JOptionPane.showMessageDialog(this, "????HAS GANADO!!\nDale a reiniciar para jugar de nuevo");
        }
    }

    private void taparDosCartas() {
        cartasAux.get(0).setIcon(null);
        cartasAux.get(1).setIcon(null);
        cartasAux.clear();
    }

    private boolean todasLevantadas() {
        for (Component cmp : panel_cartas.getComponents()) {
            if (cmp instanceof JLabel) {
                if (cmp.getName() != null && cmp.getName().contains("carta")) {
                    if (((JLabel) cmp).getIcon() == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void pausaUnSegundo(boolean empiezas) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("PAUSAAAAANDO");
                try {
                    sleep(1000);
                    pausa = false;
                    
                    if(empiezas){
                        voltearTodos();
                        return;
                    }
                    taparDosCartas();

                } catch (InterruptedException ex) {
                    Logger.getLogger(JuegoCartas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.start();
    }

    private void empezarTimer() {
        timer = new Timer();

        TimerTask task = new TimerTask() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            private int segundos = 0;
            private int minutos = 0;
            private int horas = 0;

            @Override
            public void run() {
                segundos++;

                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                    if (minutos == 60) {
                        horas++;
                        minutos = 0;
                    }
                }

                try {
                    Date crono = sdf.parse(horas + ":" + minutos + ":" + segundos);
                    lb_timer.setText(sdf.format(crono));

                } catch (ParseException ex) {
                    Logger.getLogger(JuegoCartas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    private void cargarRutas() {
        LeerProperties prop = new LeerProperties();
        imagenes = new ArrayList<>();
        imagenes.add(prop.getProperty().getProperty("imagen1"));
        imagenes.add(prop.getProperty().getProperty("imagen2"));
        imagenes.add(prop.getProperty().getProperty("imagen3"));
        imagenes.add(prop.getProperty().getProperty("imagen4"));
    }

    private void cargarRutasEnJLabels() {
        ArrayList<Integer> yaUsados = new ArrayList<>();

        for (String ruta : imagenes) {
            for (int i = 0; i < 2; i++) {
                String nombreCarta = "carta" + obtenerIndiceCarta(yaUsados);
                for (Component cmp : panel_cartas.getComponents()) {
                    if (cmp instanceof JLabel) {
                        if (cmp.getName() != null && cmp.getName().contains(nombreCarta)) {
                            cmp.getAccessibleContext().setAccessibleDescription(ruta);
                            darImagen((JLabel) cmp);
                        }
                    }
                }
                System.out.println(ruta);
            }
        }
        System.out.println(yaUsados);

        pausa = true;
        pausaUnSegundo(true);
    }

    private void voltearTodos() {
        for (Component cmp : panel_cartas.getComponents()) {
            if (cmp instanceof JLabel) {
                if (cmp.getName() != null && cmp.getName().contains("carta")) {
                    ((JLabel) cmp).setIcon(null);
                }
            }
        }
    }

    private int obtenerIndiceCarta(ArrayList<Integer> aNumeros) {
        do {
            int random = new Random().nextInt(8) + 1;

            if (!aNumeros.contains(random)) {
                aNumeros.add(random);
                return random;
            }

        } while (true);
    }
}
