// Júlio César de Oliveira Vaz - Técnico em informatica - Noturno
//pacote
package calculator;

// imports 
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import operation.Operation;
import javax.swing.JLabel;



public class Calculadora extends JFrame{
	JFrame frame;
	JLabel visor = new JLabel();
	JTextField view = new JTextField();
	JButton button9 = new JButton("9");
	JButton button8 = new JButton("8");
	JButton button7 = new JButton("7");
	JButton button6 = new JButton("6");
	JButton button5 = new JButton("5");
	JButton button4 = new JButton("4");
	JButton button3 = new JButton("3");
	JButton button2 = new JButton("2");
	JButton button1 = new JButton("1");
	JButton button0 = new JButton("0");
	JButton buttonCE = new JButton("CE");
	JButton buttonC = new JButton("C");
	JButton buttonDelete = new JButton("x");
	JButton buttonPorcentagem = new JButton("%");
	JButton buttonX = new JButton("X");
	JButton buttonMenos  = new JButton("-");
	JButton buttonMais = new JButton("+");
	JButton buttonDiv = new JButton("/");
	JButton buttonIgual = new JButton("=");
	JButton buttonVirgula = new JButton(",");
	JButton buttonPonto = new JButton(".");
	JButton buttonFra = new JButton("¹/x");
	JButton buttonBack = new JButton("<=");
	JButton buttonMaME = new JButton("+-");
	JButton buttonRaiz = new JButton("Rz");
	JButton btnview = new JButton("view");
	JButton btnedit = new JButton("edit");
	JButton btnhelp = new JButton("Help");
	
	double number1;
	double number2;
	String sin = null;
	
	Operation operacao = new Operation();
	
	Calculadora(){
		preparaInterface();
		adicionaComponentes();
	}
	// prepara a interface no metodo contructor
	public void preparaInterface() {
		frame = new JFrame();
		frame.setTitle("Calculadora");
		frame.setSize(300, 440);
		frame.getContentPane().setLayout(null);// layoyt null
		frame.setResizable(false);// nao é possivel redimensionar
		frame.setLocationRelativeTo(null); // cria no centro do monitor
		frame.setVisible(true); // visivel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra o processo ao fechar
		
	}
	
	public void adicionaComponentes() {
		// visor de operacoes
		btnview.setBounds(0, 0, 58, 20);
		btnview.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.add(btnview);
		
		btnedit.setBounds(58, 0, 58, 20);
		btnedit.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.add(btnedit);
		
		btnhelp.setBounds(116, 0, 58, 20);
		btnhelp.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.add(btnhelp);
		
		view.setBounds(8, 40 , 270, 100);
		view.setFont(new Font("Arial", Font.BOLD, 20)); // verificar outra forma de fazer fonts
		view.setEditable(false);
		view.setHorizontalAlignment(SwingConstants.RIGHT);// alinha a letra no canto esquerdo do visor
		view.setBackground(new Color(255,255,255));
		frame.add(view);
		
		// cria button - 1 linha
		button7.setBounds(10, 200, 50, 40);
		button7.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button7);
        button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(view.getText().equals("0")) {
					view.setText("7");
				}else {
					view.setText(view.getText() + "7");
				}
			}
		});
        
	        

        button8.setBounds(65, 200, 50, 40);
        button8.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button8);
        button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(view.getText().equals("0")) {
					view.setText("8");
				}else {
					view.setText(view.getText() + "8");
				}
			}
		});
 

	    button9.setBounds(120, 200, 50, 40);
	    button9.setFont(new Font("Arial", Font.BOLD, 15));
	    frame.add(button9);
	    button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(view.getText().equals("0")) {
					view.setText("9");
				}else {
					view.setText(view.getText() + "9");
				}
			}
		});
 
        //	cria button - 2 linha
	    button4.setBounds(10, 250, 50, 40);
	    button4.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button4);
        button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText("4");
				}else {
					view.setText(view.getText() + "4");
				}
			}
		});
 

        button5.setBounds(65, 250, 50, 40);
        button5.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button5);
        button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText("5");
				}else {
					view.setText(view.getText() + "5");
				}
			}
		});

        
        button6.setBounds(120, 250, 50, 40);
        button6.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button6);
        button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText("6");
				}else {
					view.setText(view.getText() + "6");
				}
			}
		});
        
        // cria button - 3 linha
        button1.setBounds(10, 300, 50, 40);
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button1);
        button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText("1");
				}else {
					view.setText(view.getText() + "1");
				}
			}
		});
 

        button2.setBounds(65, 300, 50, 40);
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button2);
        button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText("2");
				}else {
					view.setText(view.getText() + "2");
				}
			}
		});
        
	        

        button3.setBounds(120, 300, 50, 40);
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button3);
        button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText("3");
				}else {
					view.setText(view.getText() + "3");
				}
			}
		});
 
        //Cria linha 4
        
        button0.setBounds(10, 350, 105, 40);
        button0.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button0);
        button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText("0");
				}else {
					view.setText(view.getText() + "0");
				}
			}
		});
        
        buttonPonto.setBounds(120, 350, 50, 40);
        buttonPonto.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonPonto);
        buttonPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(view.getText().equals("0")) {
					view.setText(".");
				}else {
					view.setText(view.getText() + ".");
				}
			}
		});
	 

        buttonMais.setBounds(175, 350, 50, 40);
        buttonMais.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMais);
        buttonMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(view.getText());
				sin = "soma";
				view.setText("0");
			}
		});
        
        
        buttonMenos.setBounds(175, 300, 50, 40);
        buttonMenos.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMenos);
        buttonMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(view.getText());
				sin = "sun";
				view.setText("0");
			}
		});
        
	 
        buttonX.setBounds(175, 250, 50, 40);
        buttonX.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonX);
        buttonX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(view.getText());
				sin = "mult";
				view.setText("0");
			}
		});

        buttonDiv.setBounds(175, 200, 50, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonDiv);
        buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(view.getText());
				sin = "div";
				view.setText("0");
			}
		});
        
        buttonIgual.setBounds(230, 300, 50, 90);
        buttonIgual.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonIgual);
        buttonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = Double.parseDouble(view.getText());
				
				if(sin.equals("soma")) {
					view.setText(operacao.soma(number1, number2)+"");
				}
				else if(sin.equals("sub")) {
					view.setText(operacao.sub(number1, number2)+"");
				}
				else if(sin.equals("mult")) {
					view.setText(operacao.mult(number1, number2)+"");
				}
				else if(sin.equals("div")) {
					view.setText(operacao.div(number1, number2)+"");
				}
				else if(sin.equals("raiz")) {
					view.setText(operacao.raiz(number1)+"");
				}
			}
		});
        
        buttonFra.setBounds(230, 250, 51, 40);
        buttonFra.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonFra);
        buttonFra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//TODO
			}
		});
        
        buttonPorcentagem.setBounds(230, 200, 50, 40);
        buttonPorcentagem.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonPorcentagem);
        buttonPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//TODO
			}
		});
        
        buttonBack.setBounds(10, 150, 50, 40);
        buttonBack.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//TODO
			}
		});
        
        buttonCE.setBounds(65, 150, 50, 40);
        buttonCE.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonCE);
        buttonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.setText("0");
			}
		});
        
        buttonC.setBounds(120, 150, 50, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonC);
        buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.setText("0");
			}
		});
        
        buttonMaME.setBounds(175, 150, 50, 40);
        buttonMaME.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMaME);
        buttonMaME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
        
        buttonRaiz.setBounds(230, 150, 50, 40);
        buttonRaiz.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonRaiz);
        buttonRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//TODO
				}
			}
		);
        
	}
	

	
	public static void main(String[] args) {
		new Calculadora();

	}
	
}