
package br.com.telas;

import br.com.infox.dal.ModuloConexao;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author WITCHS
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    Connection conexao = null;

    
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadCliente = new javax.swing.JMenuItem();
        MenuCadOS = new javax.swing.JMenuItem();
        MenuCadUsu = new javax.swing.JMenuItem();
        MenuRel = new javax.swing.JMenu();
        MenRelCli = new javax.swing.JMenuItem();
        MenuRelServicos = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuAjudaSobre = new javax.swing.JMenuItem();
        MenuOpcao = new javax.swing.JMenu();
        MenuOpcaoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ARKHEM - Sistema para Ordem de Serviços");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setBackground(java.awt.SystemColor.activeCaption);
        Desktop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Desktop.setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblData.setText("Data");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/x.png"))); // NOI18N

        MenuCadastro.setText("Cadastro");

        MenuCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenuCadCliente.setText("Cliente");
        MenuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadCliente);

        MenuCadOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MenuCadOS.setText("OS");
        MenuCadOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadOSActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadOS);

        MenuCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        MenuCadUsu.setText("Usuários");
        MenuCadUsu.setEnabled(false);
        MenuCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadUsuActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadUsu);

        Menu.add(MenuCadastro);

        MenuRel.setText("Relatório");
        MenuRel.setEnabled(false);

        MenRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        MenRelCli.setText("Clientes");
        MenRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelCliActionPerformed(evt);
            }
        });
        MenuRel.add(MenRelCli);

        MenuRelServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenuRelServicos.setText("Serviços");
        MenuRelServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelServicosActionPerformed(evt);
            }
        });
        MenuRel.add(MenuRelServicos);

        Menu.add(MenuRel);

        MenuAjuda.setText("Ajuda");

        MenuAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        MenuAjudaSobre.setText("Sobre");
        MenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaSobre);

        Menu.add(MenuAjuda);

        MenuOpcao.setText("Opções");

        MenuOpcaoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuOpcaoSair.setText("Sair");
        MenuOpcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpcaoSairActionPerformed(evt);
            }
        });
        MenuOpcao.add(MenuOpcaoSair);

        Menu.add(MenuOpcao);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblData)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblUsuario)
                .addGap(30, 30, 30)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(57, 57, 57))
        );

        Desktop.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(961, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadUsuActionPerformed
            TelaUsuario TLUsuario = new TelaUsuario();
            TLUsuario.setVisible(true);
            Desktop.add(TLUsuario);
    }//GEN-LAST:event_MenuCadUsuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        
        
       
        
        
    }//GEN-LAST:event_formWindowActivated

    private void MenuOpcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpcaoSairActionPerformed
         int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair do sistema?", "Atenção", JOptionPane.YES_NO_OPTION);
         if (sair == JOptionPane.YES_OPTION){
             System.exit(0);
         }
    }//GEN-LAST:event_MenuOpcaoSairActionPerformed

    private void MenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaSobreActionPerformed
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_MenuAjudaSobreActionPerformed

    private void MenuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadClienteActionPerformed
            TelaCliente cliente = new TelaCliente();
            cliente.setVisible(true);
            Desktop.add(cliente);
    }//GEN-LAST:event_MenuCadClienteActionPerformed

    private void MenuCadOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadOSActionPerformed
            TelaOS OS = new TelaOS();
            OS.setVisible(true);
            Desktop.add(OS);
    }//GEN-LAST:event_MenuCadOSActionPerformed

    private void MenRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelCliActionPerformed
            int confirma = JOptionPane.showConfirmDialog(null, "Confirma a visualização deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirma == JOptionPane.YES_NO_OPTION){
                try {
                    JasperPrint print = JasperFillManager.fillReport("C:/Reports/Clientes.jasper",null,conexao);
                    JasperViewer.viewReport(print, false);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    
                }
            }
    }//GEN-LAST:event_MenRelCliActionPerformed

    private void MenuRelServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelServicosActionPerformed
            int confirma = JOptionPane.showConfirmDialog(null, "Confirma a visualização deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(confirma == JOptionPane.YES_NO_OPTION){
                try {
                    JasperPrint print = JasperFillManager.fillReport("C:/Reports/OrdemServicos.jasper",null,conexao);
                    JasperViewer.viewReport(print, false);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    
                }
            }
    }//GEN-LAST:event_MenuRelServicosActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem MenRelCli;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuAjuda;
    public static javax.swing.JMenuItem MenuAjudaSobre;
    private javax.swing.JMenuItem MenuCadCliente;
    private javax.swing.JMenuItem MenuCadOS;
    public static javax.swing.JMenuItem MenuCadUsu;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuOpcao;
    private javax.swing.JMenuItem MenuOpcaoSair;
    public static javax.swing.JMenu MenuRel;
    private javax.swing.JMenuItem MenuRelServicos;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
