package bs;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
 
public class ChengJiBiaoUI extends JFrame 
{ 
 
 public ChengJiBiaoUI() 
 { 
  intiComponent(); 
 } 
 
 //��ʼ��������� 
 private void intiComponent() 
 { 
 
  String[] columnNames = 
  { "�γ���Ŀ","�γ�����", "ѧ��", "����", "����", "����" }; //����JTable������ 
  Object[][] obj=new Object[7][7]; 
  for (int i=0;i<7;i++) 
  { 
   for(int j=0;j<7;j++) 
   { 
    switch (j) 
    { 
    case 0: 
     obj[0][0] = "    1";
     obj[0][1] = "   �ߵ���ѧ"; 
     obj[0][2] = "    2"; 
     obj[0][3] = "    1.5"; 
     obj[0][4] = "    75"; 
     obj[0][5] = "    ��"; 
 
 
     break; 
    case 1: 
     obj[1][0] = "    2";
     obj[1][1] = "   ���Դ���"; 
     obj[1][2] = "    2"; 
     obj[1][3] = "    1.8"; 
     obj[1][4] = "    5"; 
     obj[1][5] = "    ��"; 
 
     break; 
    case 2: 
     obj[2][0] = "    3";
     obj[2][1] = "   ��ѧ����"; 
     obj[2][2] = "    1.5"; 
     obj[2][3] = "    1.2"; 
     obj[2][4] = "    70"; 
     obj[2][5] = "    ��"; 
 
     break; 
    case 3: 
     obj[3][0] = "    4";
     obj[3][1] = "   Ӣ���д��"; 
     obj[3][2] = "    2"; 
     obj[3][3] = "    1.6"; 
     obj[3][4] = "    78"; 
     obj[3][5] = "    ��"; 
 
     break; 
    case 4: 
     obj[4][0] = "    5";
     obj[4][1] = "   Ӣ������˵"; 
     obj[4][2] = "    1.0"; 
     obj[4][3] = "    1.0"; 
     obj[4][4] = "    ����"; 
     obj[4][5] = "    ��"; 
 
     break; 
    case 5: 
     obj[5][0] = "    6";
     obj[5][1] = "   ����ʵ��"; 
     obj[5][2] = "    1.0"; 
     obj[5][3] = "    1.0"; 
     obj[5][4] = "    ����"; 
     obj[5][5] = "    ��"; 
     break; 
    case 6: 
     obj[6][0] = "    7";
     obj[6][1] = "  python"; 
     obj[6][2] = "    1.0"; 
     obj[6][3] = "    1.0"; 
     obj[6][4] = "    ����"; 
     obj[6][5] = "    ��"; 
     break; 
 
    } 
   } 
  } 
 
  JTable table=new JTable(obj, columnNames); //JTable������һ�ֹ��췽�� 
  TableColumn column=null;     //����JTable����Ĭ�ϵĿ�Ⱥ͸߶� 
  int colunms = table.getColumnCount(); 
  for(int i=0;i<colunms;i++) 
  { 
   column = table.getColumnModel().getColumn(i); 
   column.setPreferredWidth(100);   //��ÿһ�е�Ĭ�Ͽ������Ϊ100
  } 
  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //����JTable�Զ������б��״̬���˴�����Ϊ�ر� 
  JScrollPane scroll = new JScrollPane(table); //��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴
  scroll.setSize(300, 50); 
 
  add(scroll); 
 
  this.setTitle("ѧ���ɼ�����ϵͳ"); 
  this.setLocation(450, 200); 
  this.setVisible(true); 
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  this.pack(); 
 } 
 
 public static void main(String[] args) 
 { 
  new ChengJiBiaoUI(); 
 } 
} 