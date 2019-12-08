package bs;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
 
public class XueShengMingDanUI extends JFrame 
{ 
 
 public XueShengMingDanUI() 
 { 
  intiComponent(); 
 } 
 
  //初始化窗体组件 
 private void intiComponent() 
 { 
  // 设置JTable的列名 
  String[] columnNames = 
  { "学号","姓名", "专业", "班级"}; 
  Object[][] obj=new Object[7][7]; 
  for (int i=0;i<7;i++) 
  { 
   for(int j=0;j<7;j++) 
   { 
    switch (j) 
    { 
    case 0: 
     obj[0][0] = "  2018310989";
     obj[0][1] = "   张柘元"; 
     obj[0][2] = "   数据科学与大数据技术"; 
     obj[0][3] = "     1"; 
     break; 
    case 1: 
     obj[1][0] = "  2018310990";
     obj[1][1] = "   范忠阳"; 
     obj[1][2] = "   数据科学与大数据技术"; 
     obj[1][3] = "     1"; 
     break; 
    case 2: 
     obj[2][0] = "  2018310987";
     obj[2][1] = "   高宗伟"; 
     obj[2][2] = "   数据科学与大数据技术"; 
     obj[2][3] = "     1"; 
     break; 
    } 
   } 
  } 
 
  JTable table=new JTable(obj, columnNames); //JTable的其中一种构造方法 
  TableColumn column=null;     //设置JTable的列默认的宽度和高度 
  int colunms = table.getColumnCount(); 
  for(int i=0;i<colunms;i++) 
  { 
   column = table.getColumnModel().getColumn(i); 
   column.setPreferredWidth(100);   //将每一列的默认宽度设置为100
  } 
  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //设置JTable自动调整列表的状态，此处设置为关闭     
  JScrollPane scroll = new JScrollPane(table); //用JScrollPane装载JTable，这样超出范围的列就可以通过滚动条来查看 
  scroll.setSize(300, 50);   
 
  add(scroll); 
 
  this.setTitle("学生名单管理系统"); 
  this.setLocation(450, 200); 
  this.setVisible(true); 
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  this.pack(); 
 } 
 
 public static void main(String[] args) 
 { 
  new XueShengMingDanUI(); 
 } 
} 