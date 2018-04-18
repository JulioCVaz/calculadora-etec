package formask;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroPF extends JFrame{
	// criacao de textfield nome
	JTextField txtNome = new JTextField();
	JLabel nome = new JLabel("nome: ");
	// criacao de textfield endereco
	JTextField txtEnd = new JTextField();
	JLabel end = new JLabel("endereço: ");
	// criacao de textfield bairro
	JTextField txtBairro = new JTextField();
	JLabel bairro = new JLabel("bairro: ");
	// criacao de textfield cep
	JFormattedTextField txtCep = null;
	JLabel cep = new JLabel("cep: ");
	// criacao de textfield cidade
	JTextField txtCidade = new JTextField();
	JLabel cidade = new JLabel("cidade: ");	
	// criacao de textfield estado
	JLabel est = new JLabel("estado: ");
	JComboBox cmbEst = new JComboBox();
	// criacao de textfield telefone
	JFormattedTextField txtTel = null;
	JLabel tel = new JLabel("telefone: ");
	// criacao de textfield celular
	JFormattedTextField txtCel = null;
	JLabel cel = new JLabel("celular: ");
	// criacao de textfield rg
	JFormattedTextField txtRg = null;
	JLabel rg = new JLabel("rg: ");
	// criacao de textfield cpf
	JFormattedTextField txtCpf = null;
	JLabel cpf = new JLabel("cpf: ");
	// criacao de botao salvar
	JButton btnSalvar = new JButton("Salvar");
	// criacao de botao imprimir
	JButton btnImprimir = new JButton("Imprimir");
	// criacao label sexo
	JLabel sexo = new JLabel("sexo: ");
	
	JRadioButton[] rdbsexo = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();{ 
	
	rdbsexo[0] = new JRadioButton("Feminino");
	rdbsexo[1] = new JRadioButton("Masculino");}
	// criacao de mascara e inicializar com valor null
	MaskFormatter formatTel = null;
	MaskFormatter formatCel = null;
	MaskFormatter formatCpf = null;
	MaskFormatter formatCep = null;
	MaskFormatter formatRg = null;
	
	public CadastroPF(){
		super("Cadastro PF");
		// criacao de um container para inserir os botoes
		Container paine = this.getContentPane();
		// adiciona botoes ao painel
		paine.add(nome);
		paine.add(txtNome);	
		nome.setBounds(10, 15, 45, 30);
		txtNome.setBounds(90, 15, 225, 30);
		
		paine.add(end);
		paine.add(txtEnd);	
		end.setBounds(10, 50, 70, 30);
		txtEnd.setBounds(90, 50, 225, 30);
		// verificacao de mascara		
		try {
			formatCep = new MaskFormatter("#####-###");
			txtCep = new JFormattedTextField(formatCep);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// adiciona botoes ao painel
		paine.add(cep);
		paine.add(txtCep);			
		cep.setBounds(335, 70, 40, 30);
		txtCep.setBounds(400, 70, 120, 30);
		
		// adiciona botoes ao painel
		paine.add(cidade);
		paine.add(txtCidade);	
		cidade.setBounds(10, 85, 70, 30);
		txtCidade.setBounds(90, 85, 225, 30);
		// adiciona botoes ao painel
		paine.add(est);
		est.setBounds(335, 105, 70, 30);
		paine.add(cmbEst);
		cmbEst.setBounds(400, 105, 70, 30);
		cmbEst.addItem("AC");		cmbEst.addItem("AL");
		cmbEst.addItem("AP");		cmbEst.addItem("AM");
		cmbEst.addItem("BA");		cmbEst.addItem("CE");
		cmbEst.addItem("DF");		cmbEst.addItem("ES");
		cmbEst.addItem("GO");		cmbEst.addItem("MA");
		cmbEst.addItem("MT");		cmbEst.addItem("MS");
		cmbEst.addItem("MG");		cmbEst.addItem("PA");
		cmbEst.addItem("PB");		cmbEst.addItem("PR");
		cmbEst.addItem("PE");		cmbEst.addItem("PI");
		cmbEst.addItem("RJ");		cmbEst.addItem("RN");
		cmbEst.addItem("RS");		cmbEst.addItem("RO");
		cmbEst.addItem("RR");		cmbEst.addItem("SC");
		cmbEst.addItem("SP");		cmbEst.addItem("SE");
		cmbEst.addItem("TO");		
		
		paine.add(bairro);
		paine.add(txtBairro);
		bairro.setBounds(10, 120, 70, 30);
		txtBairro.setBounds(90, 120, 225, 30);
		// verificacao de mascara		
		try {
			formatTel = new MaskFormatter("(##)####-####");
			txtTel = new JFormattedTextField(formatTel);
		} catch (Exception ext) {
			ext.printStackTrace();
		}
		paine.add(tel);
		paine.add(txtTel);	
		tel.setBounds(10, 155, 70, 30);
		txtTel.setBounds(90, 155, 155, 30);		
		
		try {
			formatCel = new MaskFormatter("(##)#####-####");
			txtCel = new JFormattedTextField(formatCel);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		// adiciona botoes ao painel
		paine.add(cel);
		paine.add(txtCel);	
		cel.setBounds(335, 155, 70, 30);
		txtCel.setBounds(400, 155, 155, 30);
		// adiciona botoes ao painel
		
		paine.add(sexo);			
		sexo.setBounds(335, 15, 55, 30);		
		grupo.add(rdbsexo[0]);
		grupo.add(rdbsexo[1]);
		paine.add(rdbsexo[0]);
		rdbsexo[0].setBounds(375, 15, 85, 30);
		paine.add(rdbsexo[1]);
		rdbsexo[1].setBounds(455, 15, 90, 30);
		// verificacao de mascara
		try {
			formatRg = new MaskFormatter("##.###.###-A");
			txtRg = new JFormattedTextField(formatRg);
		} catch (Exception exr) {
			exr.printStackTrace();
		}
		paine.add(rg);
		paine.add(txtRg);	
		rg.setBounds(10, 190, 55, 30);
		txtRg.setBounds(90, 190, 155, 30);		
		
		try {
			formatCpf = new MaskFormatter("###.###.###-##");
			txtCpf = new JFormattedTextField(formatCpf);
		} catch (Exception exf) {
			exf.printStackTrace();
		}
		paine.add(cpf);
		paine.add(txtCpf);	
		cpf.setBounds(335, 190, 70, 30);
		txtCpf.setBounds(400, 190, 155, 30);
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(250, 250, 130, 30);
		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//TODO
			}
		});
		//adiciona botao imprimir
		paine.add(btnImprimir);
		btnImprimir.setBounds(390, 250, 130, 30);
		//set do tamanho da view
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(600, 330);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// metodo main
	public static void main(String args[]){
		// estancia
		CadastroPF cadpf = new CadastroPF();
	}
}
