大数据181 张柘元 2018310989

一、实验目的：
1、分析学生选课系统。
2、使用GUI窗体及其组件设计窗体界面。
3、完成学生选课过程业务逻辑编程。
4、基于文件保存并读取数据。
5、处理异常。

二、实验要求：
1、系统角色分析及类设计
例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
定义每种角色人员的属性，及其操作方法。
属性示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。
2、要求:
（1）设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
（2）基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
（3）针对操作过程中可能会出现的各种异常，做异常处理
（4）基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
（5）基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。

三、实验过程与核心代码：
1、此次实验，首先建了一个包zonghexuanke，里面有我想要的登陆界面和注册界面。一开始肯定是没有账号密码的，所以就需要注册，然后由登陆界面引导到注册界面当中，让使用者完成注册。此后将界面转移至另一个包中，既使用import bs.MainUI，这里的bs是另一个包，MainUI是主方法。这部分的主要代码如下：
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
2、在第二个包中，建立了有关学生登陆界面和老师登陆界面的两个类，还包括这两个登录界面接口到下个事件的另外四个类，加上主界面，共计7个类。到主界面以后进行登录，然后就可以分别进行成绩管理、课程管理等操作了。这部分主要代码如下：
public class MainUI extends JFrame implements ActionListener { 
 //定义组件 
 JButton jb1,jb2,jb3=null; 
 JRadioButton jrb1,jrb2=null; 
 JPanel jp1,jp2,jp3,jp4=null; 
 JTextField jtf=null; 
 JLabel jlb1,jlb2,jlb3=null; 
 JPasswordField jpf=null; 
 ButtonGroup bg=null;
 //设定用户名和密码 
 final String stu_name="张柘元"; 
 final String stu_pwd="zzy"; 
 final String stu_num="14140301"; 
 final String tea_name="王老师"; 
 final String tea_pwd="1"; 
 final String tea_num="00001"; 
 public static void main(String[] args) { 
  MainUI mUI=new MainUI(); 
 } 
 public MainUI() 
 { 
   //创建组件 
  jb1=new JButton("登录"); 
  jb2=new JButton("重置"); 
  jb3=new JButton("退出");
  //设置监听 
  jb1.addActionListener(this); 
  jb2.addActionListener(this); 
  jb3.addActionListener(this); 
 
  jrb1=new JRadioButton("教师"); 
  jrb2=new JRadioButton("学生"); 
  bg=new ButtonGroup(); 
  bg.add(jrb1); 
  bg.add(jrb2); 
  jrb2.setSelected(true); //初始页面默认选择权限为 学生
 
  jp1=new JPanel(); 
  jp2=new JPanel(); 
  jp3=new JPanel(); 
  jp4=new JPanel();     
 
  jlb1=new JLabel("用户名："); 
  jlb2=new JLabel("密 码："); 
  jlb3=new JLabel("权 限："); 
 
  jtf=new JTextField(10); 
  jpf=new JPasswordField(10); 
  //加入到JPanel中 
  jp1.add(jlb1); 
  jp1.add(jtf); 
 
  jp2.add(jlb2); 
  jp2.add(jpf); 
 
  jp3.add(jlb3);  //添加标签
  jp3.add(jrb1); 
  jp3.add(jrb2); 
 
  jp4.add(jb1);  //添加按钮
  jp4.add(jb2); 
  jp4.add(jb3);
  
  //加入JFrame中 
  this.add(jp1); 
  this.add(jp2); 
  this.add(jp3); 
  this.add(jp4); 
 
  this.setLayout(new GridLayout(4,1));   //选择GridLayout布局管理器  
  this.setTitle("教务在线系统");   
  this.setSize(300,200);   
  this.setLocation(400, 200);   
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置当关闭窗口时，保证JVM也退出 
  this.setVisible(true); 
  this.setResizable(true); 
 } 
 public void actionPerformed(ActionEvent e) {   //事件判断
 
  if(e.getActionCommand()=="登录") 
  { 
   //如果选中教师登录 
   if(jrb1.isSelected()) 
   { 
     tealogin();        //连接到教师的方法 页面
   }else if(jrb2.isSelected()) //学生在登录系统 
   { 
     stulogin();        //连接到学生的方法 页面
   } 
  }else if(e.getActionCommand()=="重置") 
  { 
     clear(); 
  }    
 } 
3、此外，在主界面当中，设计了一个判断，当用户输入错误的用户名或密码时，自动弹出一个新的窗口报错，老师登录和学生登录判断方法一致。这部分的主要代码如下：
public void stulogin()
 { 
  if(stu_name.equals(jtf.getText())&&stu_pwd.equals(jpf.getText())) 
  {   
   JOptionPane.showMessageDialog(null,"登录成功！","提示",JOptionPane.WARNING_MESSAGE);   
   dispose();  
   clear();   
   StdUI ui=new StdUI();  //创建新界面 
  }else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty()) 
  { 
   JOptionPane.showMessageDialog(null,"请输入用户名和密码！","提示",JOptionPane.WARNING_MESSAGE); 
  }else if(jtf.getText().isEmpty()) 
  { 
   JOptionPane.showMessageDialog(null,"请输入用户名！","张世豪-提示",JOptionPane.WARNING_MESSAGE); 
  }else if(jpf.getText().isEmpty()) 
  { 
   JOptionPane.showMessageDialog(null,"请输入密码！","张世豪-提示",JOptionPane.WARNING_MESSAGE); 
  }else
  { 
   JOptionPane.showMessageDialog(null,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE); 
   //清空输入框 
   clear(); 
  } 
 } 
 
四、流程图（见附件）

五、实验运行结果截图（见附件）

六、实验感想：
本学期最后的一次实验，一次综合性实验，综合了前几次实验的功能，还是关于选课系统的，但方法众多，思路步骤设计的很复杂。在此之前，我的程序显示了很多毛病，比如GUI显示异常、无法获取数据等等问题，但我通过不断地尝试，最终终于调试出了合适的GUI界面，虽然问题仍旧存在，写程序也依然不熟练，缺乏联系。在以后的编程学习中，还是要不断通过写代码来完善自己的知识储备！
