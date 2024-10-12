package br.edu.fatecpg.tecprog.gui.cadastro.view;

import br.edu.fatecpg.tecprog.gui.cadastro.model.CadastroForm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNome;
    private JLabel lblIdade;
    private JRadioButton rdbtnMasc;
    private JRadioButton rdbtnFem;
    private JLabel lblSexo;
    private JButton btnCadastrar;
    private JTextField txtIdade;

    // Main method to run the GUI
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 720);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCadastro = new JLabel("Cadastro");
        lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
        lblCadastro.setVerticalAlignment(SwingConstants.BOTTOM);
        lblCadastro.setFont(new Font("Chandas", Font.BOLD, 30));
        lblCadastro.setBounds(12, 0, 1280, 76);
        contentPane.add(lblCadastro);

        txtNome = new JTextField();
        txtNome.setFont(new Font("Dialog", Font.PLAIN, 16));
        txtNome.setBounds(64, 145, 374, 41);
        contentPane.add(txtNome);
        txtNome.setColumns(10);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setFont(new Font("Chandas", Font.BOLD, 14));
        lblNome.setBounds(64, 118, 70, 15);
        contentPane.add(lblNome);

        lblIdade = new JLabel("Idade");
        lblIdade.setFont(new Font("Chandas", Font.BOLD, 14));
        lblIdade.setBounds(64, 209, 70, 15);
        contentPane.add(lblIdade);

        rdbtnMasc = new JRadioButton("Masculino");
        rdbtnMasc.setBounds(64, 349, 149, 23);
        contentPane.add(rdbtnMasc);

        rdbtnFem = new JRadioButton("Feminino");
        rdbtnFem.setBounds(64, 377, 149, 23);
        contentPane.add(rdbtnFem);

        // Group the radio buttons to ensure only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnMasc);
        group.add(rdbtnFem);

        lblSexo = new JLabel("Sexo");
        lblSexo.setFont(new Font("Chandas", Font.BOLD, 14));
        lblSexo.setBounds(64, 319, 70, 15);
        contentPane.add(lblSexo);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nome = txtNome.getText().trim();
                int idade = Integer.parseInt(txtIdade.getText());
                String sexo = "Não informado";
                
                if (rdbtnMasc.isSelected()) {
                    sexo = "Masculino";
                } else if (rdbtnFem.isSelected()) {
                    sexo = "Feminino";
                }
                
                if(txtNome.getText().trim().isEmpty()) {
                	JOptionPane.showMessageDialog(lblNome, "nome vazio");
                }else {
                	CadastroForm cad = new CadastroForm(nome, idade, sexo);
                	
                    JLabel lblNomeRes = new JLabel("Nome: "+cad.getNome());
                    lblNomeRes.setFont(new Font("Chandas", Font.BOLD, 14));
                    lblNomeRes.setBounds(64, 520, 100, 10);
                    contentPane.add(lblNomeRes);
                    
                    JLabel lblIdadeRes = new JLabel("Idade: "+cad.getIdade());
                    lblIdadeRes.setFont(new Font("Chandas", Font.BOLD, 14));
                    lblIdadeRes.setBounds(64, 600, 100, 10);
                    contentPane.add(lblIdadeRes);
                    
                    JLabel lblSexoRes = new JLabel("Sexo: "+cad.getIdade());
                    lblSexoRes.setFont(new Font("Chandas", Font.BOLD, 14));
                    lblSexoRes.setBounds(64, 700, 100, 10);
                    contentPane.add(lblSexoRes);
                    
                }
            
           }
        });
        btnCadastrar.setBounds(64, 432, 117, 25);
        contentPane.add(btnCadastrar);

        txtIdade = new JTextField();
        txtIdade.setFont(new Font("Dialog", Font.PLAIN, 16));
        txtIdade.setColumns(10);
        txtIdade.setBounds(64, 242, 374, 41);
        contentPane.add(txtIdade);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(90, 348, 32, 24);
        contentPane.add(comboBox);
        
        JLabel lblSaida = new JLabel("Saida");
        lblSaida.setHorizontalAlignment(SwingConstants.CENTER);
        lblSaida.setVerticalAlignment(SwingConstants.BOTTOM);
        lblSaida.setFont(new Font("Chandas", Font.BOLD, 18));
        lblSaida.setBounds(12, 450, 680, 76);
        contentPane.add(lblSaida);
        
    }
}
