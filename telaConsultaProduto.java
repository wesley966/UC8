package com.mycompany.consultas;

import Banco.BancoProdutos;

import Modelo.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WESLLEIOLIVEIRADAROS
 */
public class telaConsultaProduto extends javax.swing.JInternalFrame {
    private int idSelecionado = 0;
    
    public telaConsultaProduto() {
        initComponents();
        carregarProdutos();
        
       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnPesquisa = new javax.swing.JButton();
        rbDescricao = new javax.swing.JRadioButton();
        rbID = new javax.swing.JRadioButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "descrição", "valor", "quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        btnPesquisa.setText("Pesquisa");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDescricao);
        rbDescricao.setSelected(true);
        rbDescricao.setText("Descrição");
        rbDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDescricaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbID);
        rbID.setText("Código");
        rbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIDActionPerformed(evt);
            }
        });

        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descricao"));

        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        txtQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(btnPesquisa)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbDescricao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbID)))
                                .addGap(59, 59, 59))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar)))
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir))
                        .addGap(8, 8, 8)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDescricao)
                            .addComponent(rbID))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisa)
                        .addGap(14, 14, 14)
                        .addComponent(btnAdicionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
     carregarProdutos();
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void rbDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDescricaoActionPerformed
         carregarProdutos();
    }//GEN-LAST:event_rbDescricaoActionPerformed

    private void rbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIDActionPerformed
       carregarProdutos();
    }//GEN-LAST:event_rbIDActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
         if (txtDescricao.getText().isEmpty()
            || txtValor.getText().isEmpty()
            || txtQuantidade.getText().isEmpty()) {

        JOptionPane.showMessageDialog(
                null,
                "Preencha todos os campos.");

        return;
    }

    Produto produto = new Produto();

    produto.setID(BancoProdutos.idProduto);
    produto.setDescricao(txtDescricao.getText());
    produto.setValor(
            Double.parseDouble(txtValor.getText()));
    produto.setQuantidade(
            Integer.parseInt(txtQuantidade.getText()));

    BancoProdutos.produtos.add(produto);

    BancoProdutos.idProduto++;

    JOptionPane.showMessageDialog(
            null,
            "Produto adicionado com sucesso!");

    carregarProdutos();
    limparCampos();
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (idSelecionado == 0) {

        JOptionPane.showMessageDialog(
                null,
                "Selecione um produto.");

        return;
    }

    for (Produto produto :
            BancoProdutos.produtos) {

        if (produto.getID() == idSelecionado) {

            produto.setDescricao(
                    txtDescricao.getText());

            produto.setValor(
                    Double.parseDouble(
                            txtValor.getText()));

            produto.setQuantidade(
                    Integer.parseInt(
                            txtQuantidade.getText()));

            JOptionPane.showMessageDialog(
                    null,
                    "Produto atualizado!");

            carregarProdutos();
            limparCampos();

            idSelecionado = 0;

            break;
        }
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (idSelecionado == 0) {

        JOptionPane.showMessageDialog(
                null,
                "Selecione um produto.");

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    null,
                    "Deseja excluir?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {

        for (Produto produto :
                BancoProdutos.produtos) {

            if (produto.getID()
                    == idSelecionado) {

                BancoProdutos.produtos
                        .remove(produto);

                JOptionPane.showMessageDialog(
                        null,
                        "Produto removido!");

                carregarProdutos();
                limparCampos();

                idSelecionado = 0;

                break;
            }
        }
    }  
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
      

    int linha =
            tabelaProdutos.getSelectedRow();

    if (linha >= 0) {

        idSelecionado = Integer.parseInt(
                tabelaProdutos
                .getValueAt(linha, 0)
                .toString());

        txtDescricao.setText(
                tabelaProdutos
                .getValueAt(linha, 1)
                .toString());

        txtValor.setText(
                tabelaProdutos
                .getValueAt(linha, 2)
                .toString());

        txtQuantidade.setText(
                tabelaProdutos
                .getValueAt(linha, 3)
                .toString());
    }

    }//GEN-LAST:event_tabelaProdutosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
private void carregarProdutos() {

    DefaultTableModel modelo =
            new DefaultTableModel();

    String pesquisa =
            txtPesquisa.getText().toLowerCase();

    modelo.addColumn("ID");
    modelo.addColumn("Descrição");
    modelo.addColumn("Valor");
    modelo.addColumn("Quantidade");

    for (Produto produto :
            BancoProdutos.produtos) {

        boolean encontrou = false;

        if (rbDescricao.isSelected()) {

            if (produto.getDescricao()
                    .toLowerCase()
                    .contains(pesquisa)) {

                encontrou = true;
            }

        } else if (rbID.isSelected()) {

            try {

                int idPesquisado =
                        Integer.parseInt(pesquisa);

                if (produto.getID()
                        == idPesquisado) {

                    encontrou = true;
                }

            } catch (NumberFormatException e) {

                encontrou = false;
            }
        }

        if (encontrou) {

            modelo.addRow(new Object[]{
                produto.getID(),
                produto.getDescricao(),
                produto.getValor(),
                produto.getQuantidade()
            });
        }
    }

    tabelaProdutos.setModel(modelo);
}
private void limparCampos() {

    txtDescricao.setText("");
    txtValor.setText("");
    txtQuantidade.setText("");
    txtPesquisa.setText("");

    idSelecionado = 0;

    txtDescricao.requestFocus();
}

}
