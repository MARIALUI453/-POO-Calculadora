package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculadora {

	private JFrame frmMariaLuisaSilva;
	private JTextField JTFResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmMariaLuisaSilva.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}
	double valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9;
	double resultadoAcumulado = 0;
	String op;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMariaLuisaSilva = new JFrame();
		frmMariaLuisaSilva.setTitle("MARIA LUISA SILVA CABRAL - 0023496");
		frmMariaLuisaSilva.getContentPane().setBackground(new Color(118, 106, 206));
		frmMariaLuisaSilva.setBackground(new Color(255, 255, 255));
		frmMariaLuisaSilva.setBounds(100, 100, 432, 540);
		frmMariaLuisaSilva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMariaLuisaSilva.getContentPane().setLayout(null);
		
		JTFResultado = new JTextField();
		JTFResultado.setBounds(10, 10, 395, 91);
		frmMariaLuisaSilva.getContentPane().add(JTFResultado);
		JTFResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("0");
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setBounds(99, 387, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("1");

			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_1.setBounds(22, 325, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("2");

			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_2.setBounds(99, 325, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("3");

			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_3.setBounds(176, 325, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("4");

			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_4.setBounds(22, 260, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("5");

			}
		});
		btnNewButton_5.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_5.setBounds(99, 260, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("6");

			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_6.setBounds(176, 260, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("7");

			}
		});
		btnNewButton_7.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_7.setBounds(22, 195, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("8");

			}
		});
		btnNewButton_8.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_8.setBounds(99, 195, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("9");

			}
		});
		btnNewButton_9.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_9.setBounds(176, 195, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("C");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			     JTFResultado.setText("");      
			        valor1 = 0;                    
			        valor2 = 0;           
			        op = "";                       
			        resultadoAcumulado = 0;        
			    
			
			}
		});
		btnNewButton_9_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_9_1.setBounds(114, 131, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_9_1);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (!JTFResultado.getText().trim().isEmpty()) {
			            valor1 = Double.parseDouble(JTFResultado.getText());
			            JTFResultado.setText("");
			            op = "Divisao";
			        }
			}
		});
		btnDivisao.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnDivisao.setBounds(266, 196, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnDivisao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (!JTFResultado.getText().trim().isEmpty()) {
			            valor1 = Double.parseDouble(JTFResultado.getText());
			            JTFResultado.setText("");
			            op = "Multiplicacao";
			        }
			}
		});
		btnMultiplicacao.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnMultiplicacao.setBounds(338, 196, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnMultiplicacao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().trim().isEmpty()) {
			        valor1 = Double.parseDouble(JTFResultado.getText());
			        JTFResultado.setText("");      
			        op = "Subtracao";
			}
			}
		});
		btnSubtracao.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnSubtracao.setBounds(338, 260, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnSubtracao);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			valor1 = Double.parseDouble(JTFResultado.getText());
			resultadoAcumulado += Double.parseDouble(JTFResultado.getText());
			JTFResultado.setText("");
			op = "Soma";
			}
						
		});
		btnSoma.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnSoma.setBounds(266, 260, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnSoma);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  if (JTFResultado.getText().isEmpty()) {
			            return;
			        }
			        
			        valor2 = Double.parseDouble(JTFResultado.getText());
			        
			        if ("Soma".equals(op)) {
			            JTFResultado.setText(String.valueOf(valor1 + valor2));
			        }
			        else if ("Subtracao".equals(op)) {
			            JTFResultado.setText(String.valueOf(valor1 - valor2));
			        }
			        else if ("Multiplicacao".equals(op)) {
			            JTFResultado.setText(String.valueOf(valor1 * valor2));
			        }
			        else if ("Divisao".equals(op)) {
			            if (valor2 == 0) {
			                JTFResultado.setText("Erro");
			            } else {
			                JTFResultado.setText(String.valueOf(valor1 / valor2));
			            }
			        }
			        else if ("Potencia".equals(op)) {
			            JTFResultado.setText(String.valueOf(Math.pow(valor1, valor2)));
			        }
			    }
		});
		btnIgual.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnIgual.setBounds(338, 325, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnIgual);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(".");

			}
		});
		btnNewButton_10.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_10.setBounds(191, 390, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton(",");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(",");

			}
		});
		btnNewButton_11.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_11.setBounds(37, 390, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_11);
		
		JButton btnPotencia = new JButton("^");
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!JTFResultado.getText().trim().isEmpty()) {
		            valor1 = Double.parseDouble(JTFResultado.getText());
		            JTFResultado.setText("");
		            op = "Potencia";
		        }
			}
		});
		btnPotencia.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnPotencia.setBounds(266, 325, 67, 55);
		frmMariaLuisaSilva.getContentPane().add(btnPotencia);
	}
}
