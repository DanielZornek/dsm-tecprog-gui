package br.edu.fatecpg.tecprog.gui.cadastro.model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class CadastroForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private ButtonGroup groupRadiosSexo;
	private final JPanel panel = new JPanel();
	
    private static String sexo, nome;
    private static int idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroForm frame = new CadastroForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel.setBounds(35, 12, 600, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNome.setBounds(35, 83, 55, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(35, 109, 228, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIdade.setBounds(35, 146, 55, 14);
		contentPane.add(lblIdade);
		
		SpinnerNumberModel model = new SpinnerNumberModel(18, 1, 100, 1);
		JSpinner spnIdade = new JSpinner(model);
		spnIdade.setBounds(35, 172, 55, 31);
		contentPane.add(spnIdade);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSexo.setBounds(35, 226, 55, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(35, 248, 121, 22);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(172, 248, 121, 22);
		
		groupRadiosSexo = new ButtonGroup();
		groupRadiosSexo.add(rdbtnMasculino);
		groupRadiosSexo.add(rdbtnFeminino);
		
		contentPane.add(rdbtnFeminino);
		
		panel.setBackground(new Color(148, 172, 181));
		panel.setBounds(372, 68, 294, 264);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblInfo = new JLabel("Dados");
		lblInfo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblInfo.setBounds(123, 12, 55, 14);
		panel.add(lblInfo);
		
		JLabel lblNomeRes = new JLabel("Nome");
		lblNomeRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeRes.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNomeRes.setBounds(25, 38, 257, 27);
		panel.add(lblNomeRes);
		
		JLabel lblIdadeRes = new JLabel("Idade");
		lblIdadeRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdadeRes.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIdadeRes.setBounds(25, 91, 257, 14);
		panel.add(lblIdadeRes);
		
		JLabel lblSexoRes = new JLabel("Sexo");
		lblSexoRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexoRes.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSexoRes.setBounds(25, 136, 257, 14);
		panel.add(lblSexoRes);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(35, 292, 98, 24);
		contentPane.add(btnEnviar);
		
		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == rdbtnMasculino) {
		            sexo = "Masculino";
		        } else if (e.getSource() == rdbtnFeminino) {
		            sexo = "Feminino";
		        }
		    }
		});
		
		txtNome.addFocusListener(new FocusListener() {

		    @Override
		    public void focusLost(FocusEvent e) {
		        // Código a ser executado quando o campo perde o foco
		        nome = txtNome.getText();
		        idade = (int) spnIdade.getValue();
		        // Aqui você pode realizar as ações desejadas com os valores capturados
		        System.out.println("Nome: " + nome);
		        System.out.println("Idade: " + idade);
		    }

			@Override
			public void focusGained(FocusEvent arg0) {
				
			}
		});
		
		// idade não está atualizando, provavelmente sexo tmb MUDAAAAAR
		
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("NOme: "+nome);
				lblNomeRes.setText(nome);
				lblSexoRes.setText(sexo);
				lblIdadeRes.setText(""+idade);
			}
		});
	}
}
