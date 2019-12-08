package zonghrxuanke;
import bs.MainUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class denglu implements ActionListener{

	JFrame mainJFrame;
	Container con;
	JLabel labName,labPass,labID,labTitle,labEmpty;
	JTextField txtName,txtID;
	JPasswordField txtPass;
	JButton login1,register,cancel;
	

public denglu(){
	mainJFrame=new JFrame("用户登录");
	con=mainJFrame.getContentPane();
	con.setLayout(new FlowLayout());
	labTitle=new JLabel(" 欢迎使用考试系统  ");
	
	labName=new JLabel("  用户名:");
	txtName=new JTextField();
	txtName.setColumns(20);
	
	labPass=new JLabel("    密码:");
	txtPass=new JPasswordField();
	txtPass.setColumns(20);
	
	login1=new JButton("登录");
	login1.addActionListener(this);
	
	register=new JButton("注册");
	register.addActionListener(this);
	
	cancel=new JButton("取消");
	cancel.addActionListener(this);
	
	
	con.add(labTitle);
	con.add(Box.createHorizontalStrut(30000));//用来换行
	
	con.add(labName);
	con.add(txtName);
	con.add(Box.createHorizontalStrut(30000));
	
	con.add(labPass);
	con.add(txtPass);
	con.add(Box.createHorizontalStrut(30000));
	
	con.add(login1);
	con.add(register);
	con.add(cancel);
	
	mainJFrame.setSize(350, 350);
	mainJFrame.setVisible(true);
	mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==login1){
		
	}
	if(e.getSource()==register){
		mainJFrame.setVisible(false);
		zhuce reg=new zhuce();
		reg.mainJFrame.setVisible(true);
	}
	if(e.getSource()==cancel){
		txtName.setText(null);
		txtPass.setText(null);
		
	}
}
public static void main(String[] args){
	new denglu();
  }
}