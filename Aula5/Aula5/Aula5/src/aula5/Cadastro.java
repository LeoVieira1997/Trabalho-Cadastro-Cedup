package aula5;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;
import java.util.ArrayList;
public class Cadastro extends javax.swing.JFrame{
    
    DefaultListModel modelo = new DefaultListModel();
    
    Pessoa acao = new Pessoa();
    BancoDeDados banco = new BancoDeDados();
    Statement stmt;

	private JFormattedTextField dataN;
	
	int tamanhoRows;
	int tamanhoCols;

	private JCheckBox chbxLivros;

	private JCheckBox chckbxFilmes;

	private JCheckBox chckbxSeriados;
	
	public boolean altera = false;
	
    public Cadastro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setSize(655, 412);
        jPanel2 = new javax.swing.JPanel();
        jTcodigo = new javax.swing.JTextField();
        jTcodigo.setEnabled(false);
        jTcodigo.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent evt) {
        		String caracteres="0987654321";
        		if(!caracteres.contains(evt.getKeyChar()+"")){
        		evt.consume();
        		}
        	}
        });
        jTcodigo.setToolTipText("Codigo");
        jTnome = new javax.swing.JTextField();
        jTnome.setEnabled(false);
        jTsobrenome = new javax.swing.JTextField();
        jTsobrenome.setEnabled(false);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRfeminino = new javax.swing.JRadioButton();
        jRfeminino.setEnabled(false);
        jRfeminino.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		if(jRmasculino.isSelected()) {
        			jRmasculino.setSelected(false);
        		}
        	}
        });
        jRmasculino = new javax.swing.JRadioButton();
        jRmasculino.setEnabled(false);
        jRmasculino.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		if(jRfeminino.isSelected()) {
        			jRfeminino.setSelected(false);
        		}
        	}
        });
        jLabel10 = new javax.swing.JLabel();
        jCcor = new javax.swing.JComboBox();
        jCcor.setEnabled(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jLabel4.setText("Sobrenome");

        jLabel3.setText("CPF");

        jLabel6.setText("Data Nascimento");

        jLabel7.setText("cor");

        jRfeminino.setText("Feminino");

        jRmasculino.setText("Masculino");

        jLabel10.setText("Sexo");

        jCcor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Branco", "Pardo", "Negro" }));
        
        jftfCpf = new JFormattedTextField((setMascara("###.###.###-##")));
        jftfCpf.setEnabled(false);
        dataN = new JFormattedTextField((setMascara("##/##/####")));
        dataN.setEnabled(false);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4)
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel6)
        							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
        							.addComponent(dataN, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
        						.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel7)
        							.addGap(89)
        							.addComponent(jCcor, 0, 93, Short.MAX_VALUE))
        						.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jLabel2)
        									.addComponent(jLabel1))
        								.addComponent(jLabel10)
        								.addComponent(jLabel3))
        							.addGap(18)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        									.addGroup(jPanel2Layout.createSequentialGroup()
        										.addComponent(jRmasculino, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        										.addPreferredGap(ComponentPlacement.RELATED)
        										.addComponent(jRfeminino))
        									.addComponent(jTcodigo)
        									.addComponent(jTnome, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        									.addComponent(jTsobrenome, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
        								.addComponent(jftfCpf, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
        					.addGap(8)))
        			.addGap(231))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTcodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel2)
        				.addComponent(jTnome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTsobrenome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jRmasculino)
        				.addComponent(jLabel10)
        				.addComponent(jRfeminino))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(jftfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel6)
        				.addComponent(dataN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(jCcor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().setLayout(null);
        
        JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
        jBSalvar = new javax.swing.JButton();
        
                jBSalvar.setText("Salvar");
                jBSalvar.setEnabled(false);
                jBSalvar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jBSalvarActionPerformed(evt);
                    }
                });
        
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		acao.excluir(jTcodigo.getText());
        	}	
        });
        
        JButton btnNovo = new JButton("Novo");
        btnNovo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	limpaCampos();
        	jTnome.setEnabled(true);
        	jTsobrenome.setEnabled(true);
        	jRmasculino.setEnabled(true);
        	jRfeminino.setEnabled(true);
        	jftfCpf.setEnabled(true);
        	dataN.setEnabled(true);
        	jCcor.setEnabled(true);
        	jTendereco.setEnabled(true);
        	jTcomplemento.setEnabled(true);
        	jCestado.setEnabled(true);
        	jTcidade.setEnabled(true);
        	jTcidadeNatal.setEnabled(true);
        	jTcomida.setEnabled(true);
        	jBregistrar.setEnabled(true);
        	jBexcluir.setEnabled(true);
        	table.setEnabled(true);
        	jLista.setEnabled(true);
        	}
        });
        btnNovo.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		jBSalvar.setEnabled(true);
        		jTcodigo.setEnabled(true);
        		jTcodigo.setText(acao.novo());
        		jTcodigo.setEnabled(false);       		
        	}
        });
        
        btnAlterar = new JButton("Alterar");
        btnAlterar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		altera = true;
        		jTnome.setEnabled(true);
            	jTsobrenome.setEnabled(true);
            	jRmasculino.setEnabled(true);
            	jRfeminino.setEnabled(true);
            	jftfCpf.setEnabled(true);
            	dataN.setEnabled(true);
            	jCcor.setEnabled(true);
            	jTendereco.setEnabled(true);
            	jTcomplemento.setEnabled(true);
            	jCestado.setEnabled(true);
            	jTcidade.setEnabled(true);
            	jTcidadeNatal.setEnabled(true);
            	jTcomida.setEnabled(true);
            	jBregistrar.setEnabled(true);
            	jBexcluir.setEnabled(true);
            	table.setEnabled(true);
            	jLista.setEnabled(true);
        	}
        });
        btnAlterar.setEnabled(false);
        btnAlterar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		jBSalvar.setEnabled(true);
        		altera = true;
        	}
        });
        
        btnPesquisar = new JButton("Pesquisar");
        
        btnPesquisar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	
        		limpaCampos();
        		btnAlterar.setEnabled(true);
        		jTcodigo.setText(acao.pesquisar("codigo", jTPesquisa.getText()));
        		jTnome.setText(acao.pesquisar("nome", jTPesquisa.getText()));
        		jTsobrenome.setText(acao.pesquisar("sobrenome", jTPesquisa.getText()));
        		if(acao.pesquisarInt("sexo", jTPesquisa.getText()) == 1) {
        			jRmasculino.setSelected(true);
        			jRfeminino.setSelected(false);
        		}else {
        			jRfeminino.setSelected(true);
        			jRmasculino.setSelected(false);
        		}
        		jftfCpf.setText(acao.pesquisar("cpf", jTPesquisa.getText()));
        		dataN.setText(acao.pesquisar("dataNasc", jTPesquisa.getText()));
        		jCcor.setSelectedIndex(acao.pesquisarInt("cor", jTPesquisa.getText()));
        		jTendereco.setText(acao.pesquisar("endereco", jTPesquisa.getText()));
        		jTcomplemento.setText(acao.pesquisar("complemento", jTPesquisa.getText()));
        		jTcidade.setText(acao.pesquisar("cidade", jTPesquisa.getText()));
        		jTcidadeNatal.setText(acao.pesquisar("cidadeNasc", jTPesquisa.getText()));
        		jLista.setModel(modelo);
        		jCestado.setSelectedItem(acao.getEstado(acao.pesquisar("estado", jTPesquisa.getText())));  
        		chbxLivros.setSelected(acao.getLivros(acao.pesquisarInt("livros", jTPesquisa.getText())));
        		chckbxFilmes.setSelected(acao.getFilmes(acao.pesquisarInt("filmes", jTPesquisa.getText())));
        		chckbxSeriados.setSelected(acao.getSeriados(acao.pesquisarInt("seriados", jTPesquisa.getText())));
        		
        		jTnome.setEnabled(false);
        		jTsobrenome.setEnabled(false);
        		jftfCpf.setEnabled(false);
        		dataN.setEnabled(false);
        		jCcor.setEnabled(false);
        		jTendereco.setEnabled(false);
        		jTcomplemento.setEnabled(false);
        		jTcidade.setEnabled(false);
        		jTcidadeNatal.setEnabled(false);
        		jBregistrar.setEnabled(false);
        		jBexcluir.setEnabled(false);	
        		pegaTabela();
        		pegaLista();
        		}
        });
        
        jTPesquisa = new JTextField();
        jTPesquisa.setColumns(10);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(4)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jTPesquisa)
        				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 248, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(btnPesquisar)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btnNovo)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnAlterar)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnExcluir)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jBSalvar))
        				.addComponent(tabbedPane_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(21, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jBSalvar)
        						.addComponent(btnExcluir)
        						.addComponent(btnAlterar)
        						.addComponent(btnNovo)
        						.addComponent(jTPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnPesquisar))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGap(64))
        );
        jPanel3 = new javax.swing.JPanel();
        tabbedPane_1.addTab("Comida", null, jPanel3, null);
        jScrollPane1 = new javax.swing.JScrollPane();
        jBexcluir = new javax.swing.JButton();
        
                jPanel3.setBackground(new java.awt.Color(204, 204, 204));
                jPanel3.setBorder(new EmptyBorder(0, 0, 0, 0));
                jPanel3.setForeground(new java.awt.Color(204, 204, 204));
                
                        jBexcluir.setText("Excluir");
                        jBexcluir.setEnabled(false);
                        jBexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jBexcluirMouseClicked(evt);
                            }
                        });
                        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBexcluirActionPerformed(evt);
                            }
                        });
                        jLista = new javax.swing.JList();
                        jLista.setEnabled(false);
                        jLista.getAccessibleContext().setAccessibleName("");
                        jLabel17 = new javax.swing.JLabel();
                        
                                jLabel17.setText("Comida");
                                jTcomida = new javax.swing.JTextField();
                                jTcomida.setEnabled(false);
                                jBregistrar = new javax.swing.JButton();
                                jBregistrar.setEnabled(false);
                                        jBregistrar.setText("Registrar");
                                        jBregistrar.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                jBregistrarActionPerformed(evt);
                                            }
                                        });
                                        
                                                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                                                jPanel3Layout.setHorizontalGroup(
                                                	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
                                                		.addGroup(jPanel3Layout.createSequentialGroup()
                                                			.addContainerGap()
                                                			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
                                                				.addGroup(jPanel3Layout.createSequentialGroup()
                                                					.addComponent(jLabel17)
                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                					.addComponent(jTcomida)
                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                					.addComponent(jBregistrar)
                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                					.addComponent(jBexcluir))
                                                				.addComponent(jLista, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE))
                                                			.addPreferredGap(ComponentPlacement.RELATED)
                                                			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
                                                			.addContainerGap())
                                                );
                                                jPanel3Layout.setVerticalGroup(
                                                	jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                                		.addGroup(jPanel3Layout.createSequentialGroup()
                                                			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                                				.addGroup(jPanel3Layout.createSequentialGroup()
                                                					.addGap(48)
                                                					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                				.addGroup(jPanel3Layout.createSequentialGroup()
                                                					.addContainerGap()
                                                					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
                                                						.addComponent(jLabel17)
                                                						.addComponent(jTcomida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                						.addComponent(jBexcluir)
                                                						.addComponent(jBregistrar))
                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                					.addComponent(jLista, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
                                                			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                );
                                                jPanel3.setLayout(jPanel3Layout);
                                                
                                                JPanel panel_2 = new JPanel();
                                                panel_2.setBackground(Color.LIGHT_GRAY);
                                                tabbedPane_1.addTab("Entretenimento", null, panel_2, null);
                                                
                                                JPanel panel_3 = new JPanel();
                                                panel_2.add(panel_3);
                                                
                                                chbxLivros = new JCheckBox("Livros");
                                                panel_3.add(chbxLivros);
                                                
                                                chckbxFilmes = new JCheckBox("Filmes");
                                                panel_3.add(chckbxFilmes);
                                                
                                                chckbxSeriados = new JCheckBox("Seriados");
                                                panel_3.add(chckbxSeriados);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(null);
        tabbedPane.addTab("Enderecos", null, panel, null);
        tabbedPane.setBackgroundAt(0, Color.GRAY);
        
        JLabel lblEndereo = new JLabel("Endere\u00E7o");
        jTendereco = new javax.swing.JTextField();
        jTendereco.setEnabled(false);
        jLabel11 = new javax.swing.JLabel();
        
                jLabel11.setText("Complemento");
                jTcomplemento = new javax.swing.JTextField();
                jTcomplemento.setEnabled(false);
                jLabel9 = new javax.swing.JLabel();
                jLabel9.setVerticalAlignment(SwingConstants.TOP);
                
                        jLabel9.setText("Estado");
                        jCestado = new javax.swing.JComboBox();
                        jCestado.setEnabled(false);
                                jCestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AL", "BA", "ES", "GO", "MT", "MS", "PR", "RJ", "RS", "SP", "SC" }));
                                                jTcidade = new javax.swing.JTextField();
                                                jTcidade.setEnabled(false);
                                                lblCidade = new JLabel("Cidade");
                                                
                                                lblCidadeNatal = new JLabel("Cidade Natal");
                                                
                                                jTcidadeNatal = new JTextField();
                                                jTcidadeNatal.setEnabled(false);
                                                jTcidadeNatal.setColumns(10);
                                                GroupLayout gl_panel = new GroupLayout(panel);
                                                gl_panel.setHorizontalGroup(
                                                	gl_panel.createParallelGroup(Alignment.LEADING)
                                                		.addGroup(gl_panel.createSequentialGroup()
                                                			.addContainerGap()
                                                			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                				.addGroup(gl_panel.createSequentialGroup()
                                                					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                						.addComponent(lblEndereo)
                                                						.addComponent(jLabel11)
                                                						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                                                					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
                                                						.addGroup(gl_panel.createSequentialGroup()
                                                							.addPreferredGap(ComponentPlacement.UNRELATED)
                                                							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
                                                								.addComponent(jCestado, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                								.addComponent(jTcomplemento, 271, 271, 271)
                                                								.addGroup(gl_panel.createSequentialGroup()
                                                									.addComponent(jTcidade, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                                									.addPreferredGap(ComponentPlacement.RELATED)
                                                									.addComponent(lblCidadeNatal)
                                                									.addPreferredGap(ComponentPlacement.RELATED)
                                                									.addComponent(jTcidadeNatal))))
                                                						.addGroup(gl_panel.createSequentialGroup()
                                                							.addGap(11)
                                                							.addComponent(jTendereco))))
                                                				.addComponent(lblCidade))
                                                			.addContainerGap())
                                                );
                                                gl_panel.setVerticalGroup(
                                                	gl_panel.createParallelGroup(Alignment.TRAILING)
                                                		.addGroup(gl_panel.createSequentialGroup()
                                                			.addContainerGap()
                                                			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                                				.addComponent(lblEndereo)
                                                				.addComponent(jTendereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                			.addPreferredGap(ComponentPlacement.RELATED)
                                                			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                				.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                                				.addComponent(jTcomplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                			.addPreferredGap(ComponentPlacement.RELATED)
                                                			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                                				.addComponent(jLabel9)
                                                				.addComponent(jCestado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                			.addPreferredGap(ComponentPlacement.RELATED)
                                                			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                                				.addComponent(lblCidade)
                                                				.addComponent(jTcidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                				.addComponent(lblCidadeNatal)
                                                				.addComponent(jTcidadeNatal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                			.addGap(20))
                                                );
                                                panel.setLayout(gl_panel);
                        
                        JPanel panel_1 = new JPanel();
                        panel_1.setBackground(Color.LIGHT_GRAY);
                        tabbedPane.addTab("Telefones", null, panel_1, null);
                        
                        table = new JTable();
                        table.setEnabled(false);
                        table.setModel(new DefaultTableModel(
                        	new Object[][] {
                        		{"Tipo", "Fone", "Obs"},
                        		{null, null, null},
                        		{null, null, null},
                        		{null, null, null},
                        		{null, null, null},
                        		{null, null, null},
                        		{null, null, null},
                        		{null, null, null},
                        	},
                        	new String[] {
                        		"New column", "New column", "New column"
                        	}
                        ));
                        panel_1.add(table);
                        
                                jTendereco.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jTextField3ActionPerformed(evt);
                                    }
                                });
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        jPanel1.setLayout(jPanel1Layout);
        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodigoActionPerformed

    private void jBregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarActionPerformed
       if (!jTcomida.getText().trim().equals("")){
           jLista.setModel(modelo);
           modelo.addElement(jTcomida.getText());
           jTcomida.setText(null);
       }else
           JOptionPane.showMessageDialog(rootPane, "Informe o tipo de comida.");
           jTcomida.requestFocus();
        
    }//GEN-LAST:event_jBregistrarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        // TODO add your handling code here:
       modelo.remove(jLista.getSelectedIndex());
       jBexcluir.setEnabled(false);
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBexcluirMouseClicked
       jBexcluir.setEnabled(jLista.getSelectedIndex() >= 0);
    }//GEN-LAST:event_jBexcluirMouseClicked

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
    	contaTabela();
    	salvar();
    }//GEN-LAST:event_jBSalvarActionPerformed
    private void salvar(){
    	acao.setCodigo(jTcodigo.getText());
    	acao.setNome(jTnome.getText());
    	acao.setSobrenome(jTsobrenome.getText());
    	if(jRmasculino.isSelected()) {
    			acao.setSexo(1);
    		}else {
    				acao.setSexo(2);
    			}
    	acao.setDataNasc(dataN.getText());
    	if(jftfCpf.getText().length() != 14) {
    		JOptionPane.showMessageDialog(rootPane, "CPF inválido");
    	}else {
    		acao.setCpf(jftfCpf.getText());
    		}
    	 if(jCcor.getSelectedIndex() == 0){
    		 acao.setCor(0);
         }else if(jCcor.getSelectedIndex() == 1){
        	 acao.setCor(1);
         }else{
        	 acao.setCor(2);
         }
    	 acao.setEndereco(jTendereco.getText());
    	 acao.setComplemento(jTcomplemento.getText());
    	 switch(jCestado.getSelectedIndex()) {
    	 	case 0: acao.setEstado("AL");
    	 		break;
    	 	case 1: acao.setEstado("BA");
 		    	break;
    	 	case 2: acao.setEstado("ES");
 				break;
    	 	case 3: acao.setEstado("GO");
 				break;
    	 	case 4: acao.setEstado("MT");
 				break;
    	 	case 5: acao.setEstado("MS");
 				break;
    	 	case 6: acao.setEstado("PR");
 				break;
    	 	case 7: acao.setEstado("RJ");
 				break;
    	 	case 8: acao.setEstado("RS");
 				break;
    	 	case 9: acao.setEstado("SP");
 				break;
    	 	case 10: acao.setEstado("SC");
 				break;	
    	 }
    	 acao.setCidade(jTcidade.getText());
    	 acao.setCidadeNasc(jTcidadeNatal.getText());
    	 
    	 int tamanhoLista = jLista.getModel().getSize();
         ArrayList<String> listaPalavras = new ArrayList<String>();
         for (int i=0; i < tamanhoLista; i++){
             listaPalavras.add((String)jLista.getModel().getElementAt(i));
             acao.setComida(listaPalavras.get(i));
         }
                  
        if (chbxLivros.isSelected()) {
        	acao.setLivros(1);
        }else {acao.setLivros(0);}
        if (chckbxFilmes.isSelected()) {
        	acao.setFilmes(1);
        }else {acao.setFilmes(0);} 
        if (chckbxSeriados.isSelected()) {
        	acao.setSeriados(1);
        }else {acao.setSeriados(0);} 
        
      
        banco.conectar();
         if(banco.estaConectado()){
         }else{
        	 JOptionPane.showMessageDialog(rootPane,"Não foi possivel conectar ao banco de dados.");
         } 
    	if(altera) {
    		acao.alterar();
    		altera = false;
    	}else{acao.inserir();
        banco.desconectar();
        }
    }
    
   
    public void contaTabela() {
    	tamanhoRows = table.getModel().getRowCount();
        tamanhoCols = table.getColumnCount();
    	ArrayList<Object> listaItens = new ArrayList<Object>();
    	for(int i = 1; i < tamanhoRows; i++) {
    		for(int l = 0; l < tamanhoCols; l++) {
    			if(table.getModel().getValueAt(i, l) != null) {
    				listaItens.add(table.getModel().getValueAt(i, l));
    				acao.setTelefone((String) table.getModel().getValueAt(i, l));
    				}
    			}
    		}
    	}
    
    private MaskFormatter setMascara(String mascara) {
    	MaskFormatter mask = null;
    	try {
    		mask = new MaskFormatter(mascara);
    	}catch (java.text.ParseException ex) {}
    	return mask;
    }
    
    public void pegaLista() {
    	String dadosLista = acao.pesquisar("comida", jTPesquisa.getText());
		String arrayComidas[] = dadosLista.split(",");
		int cont = arrayComidas.length;
		for(int t = 0; t <= cont-1; t++) {
			modelo.addElement(arrayComidas[t]);	
		}	
    }
    
    public void pegaTabela() {
    	String dadosTabela = acao.pesquisar("telefone", jTPesquisa.getText());
		String arrayTelefone[] = dadosTabela.split(" ");
		int cont = arrayTelefone.length;
		int i = 1;
		int c = 0;
		for(int t = 0; t <= cont-1; t++) {
			table.setValueAt(arrayTelefone[t], i, c);
			c++;
			if(c == 3) {
				i++;
				c = 0;        					
			}	
		}
    }
    
    public void limpaCampos() {
    	jTcodigo.setText("");
    	jTnome.setText("");
    	jTsobrenome.setText("");
    	jftfCpf.setText("");
    	jTcidade.setText("");
    	jTcidadeNatal.setText("");
    	jTcomida.setText("");
    	jTcomplemento.setText("");
    	jTendereco.setText("");
    	chbxLivros.setSelected(false);
    	chckbxFilmes.setSelected(false);
    	chckbxSeriados.setSelected(false);
    	dataN.setText("");
    	modelo.removeAllElements();    
    	
    }
   

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBregistrar;
    private javax.swing.JComboBox jCestado;
    private javax.swing.JComboBox jCcor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRmasculino;
    private javax.swing.JRadioButton jRfeminino;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTcomida;
    private javax.swing.JTextField jTcomplemento;
    private javax.swing.JTextField jTsobrenome;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTcidade;
    private javax.swing.JTextField jTnome;
    private JLabel lblCidade;
    private JLabel lblCidadeNatal;
    private JTextField jTcidadeNatal;
    private JTable table;
    private JFormattedTextField jftfCpf;
    private JButton btnAlterar;
    private JButton btnPesquisar;
    private JTextField jTPesquisa;
}
