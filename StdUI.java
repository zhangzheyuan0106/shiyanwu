package bs;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.JButton;
import java.awt.color.*;
import javax.swing.JOptionPane;
import bs.MainUI; 
public class StdUI extends JFrame implements ActionListener 
{ 
 
   //������� 
  JButton jb1=new JButton();
  JButton jb2=new JButton();
  JPanel jp1,jp2,jp3,jp4=null; 
  JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6=null;
 
  public static void main(String[] args)
  { 
   StdUI ui=new StdUI(); 
  } 
 
 
  //****************************�¼��ж�**********************
 
  //���캯�� 
  public StdUI() //��������Ϊvoid!!!!!���򵯲����½��� 
  { 
 
   //������� 
   jb1=new JButton("�γ̱�"); 
   jb1.setForeground(Color.BLUE);
   jb2=new JButton("�ɼ���ѯ"); 
   jb2.setForeground(Color.BLUE);
 
   jp1=new JPanel(); 
   jp2=new JPanel(); 
   jp3=new JPanel(); 
 
   jlb1=new JLabel("������"); 
   jlb2=new JLabel("ѧ�ţ�"); 
   jlb3=new JLabel("���¹��棺"); 
   jlb3.setForeground(Color.red);
   jlb4=new JLabel("��"); 
   jlb5=new JLabel(new MainUI().stu_name);
   jlb6=new JLabel(new MainUI().stu_num);
 
   jp1.add(jlb1); 
   jp1.add(jlb5);
   jp1.add(jlb2); 
   jp1.add(jlb6);
 
 
   jp2.add(jb1); 
   jp2.add(jb2); 
 
   jp3.add(jlb3);
   jp3.add(jlb4); 
 
   this.add(jp1); 
   this.add(jp2); 
   this.add(jp3); 
 
 
   //���ò��ֹ����� 
   this.setLayout(new GridLayout(4,3,50,50)); 
   this.setTitle("ѧ����Ϣ����ϵͳ"); 
   this.setSize(400,300); 
   this.setLocation(200, 200);  
 
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
   this.setVisible(true); 
   jb1.addActionListener(this);
   jb2.addActionListener(this);
 
 
  }
 
  public void actionPerformed(ActionEvent e) { 
    if(e.getSource() == jb1){
    //�رյ�ǰ���� 
     dispose(); 
     new KeChengBiaoUI();
    }else if(e.getSource() == jb2){
     //�رյ�ǰ���� 
     dispose(); 
     new ChengJiBiaoUI();
    }
 
  } 
} 