package PEOO;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jogo extends javax.swing.JFrame {

    MyJButton[][] mObjetos;
    
    Integer tipoCacaP;

    String[][] cacaPalavras1Verd
            = {{" ", " ", " ", " ", " ", " ", " ", "I", " ", " "},
            {" ", " ", "R", "O", "T", "I", "N", "O", "M", " "},
            {" ", " ", " ", " ", " ", "T", " ", " ", "E", " "},
            {" ", " ", " ", " ", "E", " ", " ", " ", "S", " "},
            {" ", " ", " ", "R", " ", " ", " ", " ", "U", " "},
            {" ", " ", "N", " ", " ", " ", " ", " ", "O", " "},
            {" ", "E", " ", " ", " ", " ", " ", " ", "M", " "},
            {"T", "E", "C", "L", "A", "D", "O", " ", " ", " "},
            {"R", "O", "D", "A", "T", "U", "P", "M", "O", "C"},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}};

    String[][] cacaPalavras1
            = {{"M", "O", "N", "I", "T", "L", "F", "I", "T", "R"},
            {"O", "G", "R", "O", "T", "I", "N", "O", "M", "M"},
            {"J", "L", "F", "N", "G", "T", "E", "U", "E", "B"},
            {"W", "J", "A", "P", "E", "P", "O", "E", "S", "A"},
            {"I", "N", "T", "R", "X", "C", "K", "O", "U", "U"},
            {"B", "I", "N", "O", "I", "A", "B", "N", "O", "M"},
            {"J", "E", "U", "N", "A", "R", "H", "I", "M", "B"},
            {"T", "E", "C", "L", "A", "D", "O", "B", "A", "L"},
            {"R", "O", "D", "A", "T", "U", "P", "M", "O", "C"},
            {"C", "O", "M", "P", "R", "M", "S", "O", "V", "S"}};

    String[][] cacaPalavras2Verd
            = {{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"U", " ", "V", "I", "R", "Ú", "S", " ", " ", " ", " ", " ", " ", "A", " "},
            {"P", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " ", " "},
            {"C", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "L", "M", "T", "H"},
            {" ", "A", " ", " ", " ", " ", " ", "P", " ", " ", "I", " ", " ", " ", " "},
            {" ", " ", "R", " ", " ", " ", "U", " ", " ", "C", " ", " ", " ", " ", " "},
            {" ", " ", " ", "A", " ", "K", " ", " ", "A", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", "C", " ", " ", "T", " ", " ", " ", "E", " ", " ", " "},
            {" ", " ", " ", "A", " ", "T", "I", " ", " ", " ", " ", "R", " ", " ", " "},
            {" ", " ", "B", " ", " ", "V", "E", " ", " ", " ", " ", "A", " ", " ", " "},
            {" ", " ", " ", " ", "O", " ", " ", "R", " ", " ", " ", "W", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", "E", " ", " ", "D", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "R", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", "E", "Ã", "M", "A", "C", "A", "L", "P", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "H", " ", " ", " "}};

    String[][] cacaPalavras2
            = {{"M", "A", "R", "D", "W", "I", "L", "B", "A", "P", "C", "U", "O", "K", "Ã"},
            {"U", "P", "V", "I", "R", "Ú", "S", "A", "M", "N", "Ú", "F", "M", "A", "B"},
            {"P", "Y", "A", "Y", "A", "R", "A", "C", "T", "E", "V", "A", "P", "H", "G"},
            {"C", "X", "Z", "Z", "C", "A", "A", "R", "A", "C", "C", "L", "M", "T", "H"},
            {"Ú", "A", "M", "G", "Y", "L", "F", "P", "I", "Z", "I", "J", "Ã", "S", "K"},
            {"M", "A", "R", "U", "S", "A", "U", "M", "O", "C", "W", "L", "E", "R", "M"},
            {"Ã", "R", "M", "A", "W", "K", "Y", "O", "A", "O", "W", "M", "Y", "A", "Ú"},
            {"C", "R", "L", "E", "C", "Í", "D", "T", "I", "W", "H", "E", "Q", "O", "R"},
            {"Í", "G", "Ç", "A", "R", "T", "I", "L", "E", "B", "C", "R", "Ã", "I", "I"},
            {"W", "T", "B", "Ú", "P", "V", "E", "A", "S", "A", "U", "A", "Ú", "L", "V"},
            {"R", "L", "R", "C", "O", "H", "D", "R", "Z", "C", "T", "W", "C", "P", "P"},
            {"S", "M", "W", "A", "R", "L", "I", "S", "E", "X", "I", "D", "R", "A", "A"},
            {"B", "M", "C", "R", "R", "M", "E", "Ã", "U", "Z", "U", "R", "W", "Í", "C"},
            {"P", "R", "H", "A", "T", "F", "E", "Ã", "M", "A", "C", "A", "L", "P", "A"},
            {"M", "U", "S", "C", "I", "U", "Í", "R", "A", "L", "M", "H", "N", "O", "B"}};

    String[][] cacaPalavras3Verd
            = {{"Z", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", "I", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "M", " "},
            {" ", " ", "P", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "E", " "},
            {" ", " ", " ", " ", " ", "U", "T", "I", "L", "I", "T", "A", "R", "I", "O", "M", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "Ó", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "R", " "},
            {" ", " ", "F", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "I", " "},
            {" ", " ", "A", " ", " ", "R", " ", " ", " ", " ", " ", " ", " ", " ", " ", "A", " "},
            {" ", " ", "L", " ", " ", "A", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "S", " ", " ", "L", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "E", " ", " ", "I", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "P", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "M", " ", "D", "O", "W", "N", "L", "O", "A", "D", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "C", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", "U", "S", "B", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "A", "I", "F", "A", "R", "G", "O", "T", "P", "I", "R", "C"}};

    String[][] cacaPalavras3
            = {{"Z", "A", "P", "T", "U", "W", "O", "L", "M", "A", "O", "B", "W", "I", "W", "O", "W"},
            {"Z", "I", "A", "K", "O", "O", "A", "A", "E", "V", "W", "N", "I", "Z", "I", "M", "D"},
            {"A", "D", "P", "É", "P", "U", "Q", "F", "Q", "O", "L", "U", "V", "Y", "K", "E", "O"},
            {"Z", "L", "O", "D", "X", "U", "T", "I", "L", "I", "T", "A", "R", "I", "O", "M", "L"},
            {"P", "O", "O", "Ó", "R", "M", "O", "W", "A", "L", "H", "N", "A", "V", "K", "Ó", "P"},
            {"C", "R", "H", "I", "J", "S", "Ó", "S", "R", "E", "B", "S", "V", "B", "A", "R", "O"},
            {"J", "C", "F", "N", "S", "D", "N", "C", "U", "H", "Z", "P", "T", "S", "A", "I", "Í"},
            {"K", "T", "A", "W", "T", "R", "N", "S", "Z", "P", "A", "H", "U", "Z", "D", "A", "U"},
            {"T", "O", "L", "S", "U", "A", "U", "D", "O", "O", "W", "S", "L", "N", "U", "O", "K"},
            {"L", "V", "S", "K", "X", "L", "H", "V", "B", "Y", "Y", "V", "J", "C", "A", "D", "F"},
            {"S", "X", "E", "I", "X", "I", "U", "X", "L", "L", "I", "I", "Z", "I", "W", "D", "G"},
            {"O", "I", "I", "Z", "P", "P", "Y", "S", "N", "Y", "V", "V", "K", "T", "U", "A", "I"},
            {"O", "L", "O", "I", "S", "M", "X", "D", "O", "W", "N", "L", "O", "A", "D", "Y", "E"},
            {"H", "U", "R", "H", "N", "O", "S", "H", "U", "T", "T", "N", "I", "S", "I", "A", "Z"},
            {"V", "C", "T", "L", "X", "C", "A", "R", "Z", "I", "Y", "R", "E", "W", "O", "O", "U"},
            {"P", "U", "S", "B", "A", "H", "S", "B", "I", "C", "A", "W", "B", "H", "R", "D", "O"},
            {"O", "W", "B", "Z", "B", "A", "I", "F", "A", "R", "G", "O", "T", "P", "I", "R", "C"}};

    public Jogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTabuleiro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Dificil = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        Facil = new javax.swing.JButton();
        Medio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Novo = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Thanks = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnTabuleiro.setBackground(new java.awt.Color(0, 204, 255));
        pnTabuleiro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnTabuleiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Caça-Palavras");

        Dificil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dificil.setText("DÍFICIL");
        Dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificilActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Escolha um nível:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Encontre as palavras:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lb.setBackground(new java.awt.Color(153, 204, 255));
        lb.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Facil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Facil.setText("FÁCIL");
        Facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacilActionPerformed(evt);
            }
        });

        Medio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Medio.setText("MÉDIO");
        Medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        Novo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Novo.setText("Novo Jogo");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });
        jMenu1.add(Novo);

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Sair.setText("Sair do Jogo");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        Sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        jMenu2.add(Sobre);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Agradecimento");

        Thanks.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Thanks.setText("Thanks");
        Thanks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanksActionPerformed(evt);
            }
        });
        jMenu3.add(Thanks);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 175, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(Dificil)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Facil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Medio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(383, 383, 383))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel2, jLabel3, jLabel5, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnTabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Facil)
                        .addGap(8, 8, 8)
                        .addComponent(Medio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dificil)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addGap(233, 233, 233)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel2, jLabel3, jLabel5, jLabel7, jLabel8, jLabel9});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    


    private void DificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificilActionPerformed
        MyJButton botao;
        
        tipoCacaP = 3;
        
        mObjetos = new MyJButton[17][17];
        pnTabuleiro.removeAll();
        pnTabuleiro.setLayout(new GridLayout(17, 17));

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                botao = new MyJButton(i, j, this);
                botao.setText(cacaPalavras3[i][j]);

                pnTabuleiro.add(botao);
                mObjetos[i][j] = botao;
            }
        }

        pnTabuleiro.revalidate();
        pnTabuleiro.repaint();

        jLabel2.setText("Utilitario");
        jLabel5.setText("USB");
        jLabel3.setText("Criptografia");
        jLabel7.setText("Download");
        jLabel11.setText("Memória");
        jLabel8.setText("ZIP");
        jLabel10.setText("Compilar");
        jLabel9.setText("False");

    }//GEN-LAST:event_DificilActionPerformed


    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        pnTabuleiro.removeAll();
        pnTabuleiro.revalidate();
        pnTabuleiro.repaint();

        jLabel2.setText("");
        jLabel5.setText("");
        jLabel3.setText("");
        jLabel7.setText("");
        jLabel11.setText("");
        jLabel8.setText("");
        jLabel10.setText("");
        jLabel9.setText("");
        
        lb.setText("");
    }//GEN-LAST:event_NovoActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_SobreActionPerformed

    private void FacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacilActionPerformed
        MyJButton botao;

        tipoCacaP = 1;
        
        mObjetos = new MyJButton[10][10];
        pnTabuleiro.removeAll();
        pnTabuleiro.setLayout(new GridLayout(10, 10));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                botao = new MyJButton(i, j, this);
                botao.setText(cacaPalavras1[i][j]);

                pnTabuleiro.add(botao);
                mObjetos[i][j] = botao;
            }
        }

        pnTabuleiro.revalidate();
        pnTabuleiro.repaint();

        jLabel2.setText("Internet");
        jLabel5.setText("");
        jLabel3.setText("Monitor");
        jLabel7.setText("Computador");
        jLabel11.setText("Mouse");
        jLabel8.setText("");
        jLabel10.setText("Teclado");
        jLabel9.setText("");

    }//GEN-LAST:event_FacilActionPerformed

    private void MedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioActionPerformed
        MyJButton botao;
        
        tipoCacaP = 2;
        
        mObjetos = new MyJButton[15][15];
        pnTabuleiro.removeAll();
        pnTabuleiro.setLayout(new GridLayout(15, 15));

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                botao = new MyJButton(i, j, this);
                botao.setText(cacaPalavras2[i][j]);

                pnTabuleiro.add(botao);
                mObjetos[i][j] = botao;
            }
        }

        pnTabuleiro.revalidate();
        pnTabuleiro.repaint();

        jLabel2.setText("Virús");
        jLabel5.setText("CPU");
        jLabel3.setText("Caractere");
        jLabel7.setText("Hardware");
        jLabel11.setText("Backup");
        jLabel8.setText("Aplicativo");
        jLabel10.setText("Placa Mãe");
        jLabel9.setText("HTML");

    }//GEN-LAST:event_MedioActionPerformed

    private void ThanksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanksActionPerformed
        Thanks thanks = new Thanks();
        thanks.setVisible(true);
    }//GEN-LAST:event_ThanksActionPerformed

    public void marcarJogada(MyJButton botao) {
        if (botao.isMarcado()) {
            botao.setMarcado(false);
        } else {
            botao.setMarcado(true);
        }
        
        int cont = 0;

            if(tipoCacaP == 1){
                for (int i = 0; i < cacaPalavras1.length; i++) {
                    for (int j = 0; j < cacaPalavras1[0].length; j++) {
                        if (mObjetos[i][j].isMarcado()
                                && cacaPalavras1Verd[i][j].equals(mObjetos[i][j].getText())) {
                            cont++;
                        }
                    }
                }

                if (cont == 35) {
                    JOptionPane.showMessageDialog(null, "Parabéns, você encontrou todas as palavras!!!");
                }

            }
            
            if(tipoCacaP == 2){
                for (int i = 0; i < cacaPalavras2.length; i++) {
                    for (int j = 0; j < cacaPalavras2[0].length; j++) {
                        if (mObjetos[i][j].isMarcado()
                                && cacaPalavras2Verd[i][j].equals(mObjetos[i][j].getText())) {
                            cont++;
                        }
                    }
                }

                if (cont == 49) {
                    JOptionPane.showMessageDialog(null, "Parabéns, você encontrou todas as palavras!!!");
                }
            }

            if(tipoCacaP == 3){
                for (int i = 0; i < cacaPalavras3.length; i++) {
                    for (int j = 0; j < cacaPalavras3[0].length; j++) {            
                        if (mObjetos[i][j].isMarcado()
                                && cacaPalavras3Verd[i][j].equals(mObjetos[i][j].getText())) {
                            cont++;
                        }
                    }
                }

                if (cont == 56) {
                    JOptionPane.showMessageDialog(null, "Parabéns, você encontrou todas as palavras!!!");
                }
            }
       
    }

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dificil;
    private javax.swing.JButton Facil;
    private javax.swing.JButton Medio;
    private javax.swing.JMenuItem Novo;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem Thanks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb;
    private javax.swing.JPanel pnTabuleiro;
    // End of variables declaration//GEN-END:variables

}
