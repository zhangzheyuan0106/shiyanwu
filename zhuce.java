
package zonghrxuanke;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class zhuce implements ActionListener {

	JFrame mainJFrame;
	Container con;
	JLabel labName,labPass,labRPass,labTitle,labEmpty1,labEmpty,labSex,labAge,labClass;
	JTextField txtName,txtID,txtAge;
	JPasswordField txtPass,txtRPass;
	JButton resetBtn,regBtn,cancel;
	JRadioButton mRadio,fRadio;
	ButtonGroup sexBtnGroup;
	static final String msg1[]={"100821","100822","100823"};
	JComboBox Jcombobox1;
	
public zhuce(){
	mainJFrame=new JFrame("�û�ע��");
	con=mainJFrame.getContentPane();
	con.setLayout(new FlowLayout());
	
	labTitle=new JLabel("<html><body><h1>�û�ע��     </h1> </body>  </html> ");
	con.add(labTitle);
	con.add(Box.createHorizontalStrut(30000));//��������
	
	labName=new JLabel("�û���:");
	txtName=new JTextField();
	txtName.setColumns(20);
	con.add(labName);
	con.add(txtName);
	con.add(Box.createHorizontalStrut(30000));//��������
	
	labPass=new JLabel("����:");
	txtPass=new JPasswordField();
	txtPass.setColumns(20);
	con.add(labPass);
	con.add(txtPass);
	con.add(Box.createHorizontalStrut(30000));//��������
	
	labRPass=new JLabel("ȷ������:");
	txtRPass=new JPasswordField();
	txtRPass.setColumns(20);
	con.add(labRPass);
	con.add(txtRPass);
	con.add(Box.createHorizontalStrut(30000));//��������
	
	 
	labSex=new JLabel("�Ա�:");
	mRadio=new JRadioButton("��",true);
	mRadio.addActionListener(this);
	fRadio=new JRadioButton("Ů",false);
	fRadio.addActionListener(this);
	sexBtnGroup=new ButtonGroup();
	sexBtnGroup.add(mRadio);
	sexBtnGroup.add(fRadio);
	con.add(labSex);
	con.add(mRadio);
	con.add(fRadio);
	
	labAge=new JLabel("����:");
	txtAge=new JTextField();
	txtAge.setColumns(5);
	con.add(labAge);
	con.add(txtAge);
	con.add(Box.createHorizontalStrut(30000));//��������
	
	labClass=new JLabel("�����༶:");
	Jcombobox1=new JComboBox(msg1);
	//Jcombobox1.addItemListener(this);
	con.add(labClass);
	con.add(Jcombobox1);
	con.add(Box.createHorizontalStrut(30000));//��������
	
	regBtn=new JButton("ע��");
	regBtn.addActionListener(this); 
	con.add(regBtn);
	
	resetBtn=new JButton("����");
	resetBtn.addActionListener(this);
	con.add(resetBtn);
	
	cancel=new JButton("ȡ��");
	cancel.addActionListener(this);
	con.add(cancel);
	
	mainJFrame.setSize(400,400);
	mainJFrame.setVisible(true);
	mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==regBtn){
		
	}
	if(e.getSource()==resetBtn){
		txtName.setText(null);
		txtPass.setText(null);
		txtRPass.setText(null);
		mRadio.setSelected(true);
		txtAge.setText(null);
		Jcombobox1.setSelectedIndex(0);
		}
	if(e.getSource()==cancel){
		mainJFrame.setVisible(false);
		denglu login=new denglu();
		login.mainJFrame.setVisible(true);
	}
}
public static void main(String[] args){
	new denglu();
}
}


