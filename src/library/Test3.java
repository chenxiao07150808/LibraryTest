package library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test3 extends JFrame implements ActionListener{
	JMenuBar jmb;
	   JMenu jm;
	   JMenuItem Open1;
	   JMenuItem Close1;
	   JMenu jm2;
	   JMenuItem Open2;
	   JMenuItem close2;
	   JMenu jm3;
	   JMenuItem Open3;
	   JMenuItem close3;
	   JPanel jp1;
	   JLabel jl,jl2,jl3;
	   JButton jb1,jb2;
	   JTextField jt1,jt2;
	   Test3(){
		   super("ͼ��ݹ���ϵͳ");
		   jmb=new JMenuBar();
		   jm=new JMenu("��ҳ");
		   Open1=new JMenuItem("����");
		   Close1=new JMenuItem("����Ա��¼");
		   Close1.addActionListener(this);
		   
		   jm2=new JMenu("��ѯ");
		   Open2=new JMenuItem("ͼ���ѯ");
		   Open2.addActionListener(this);
		   close2=new JMenuItem("���Ĳ�ѯ");
		     
		  jm3=new JMenu("����");
		  Open3=new JMenuItem("ͼ��Ѱ��");
		  close3=new JMenuItem("ͼ�����");
		
		  jmb.add(jm);   
		  jm.add(Open1);
		  jm.add(Close1);
		  jmb.add(jm2);
		  jm2.add(Open2);
		  jm2.add(close2);
		  jmb.add(jm3);
		  jm3.add(Open3);
		  jm3.add(close3);
		  this.setJMenuBar(jmb);
		  
		  jp1=new JPanel();
		  jl=new JLabel();
		  jl.setIcon(new ImageIcon("book.jpg"));
		  jl2=new JLabel("����");
		  jl3=new JLabel("����");
		  jt1=new JTextField(10);
		  jt2=new JTextField(10);
		  jb1=new JButton("��¼");
		  jb2=new JButton("����");
		  jl.add(jl2);
		  jl.add(jt1);
		  jl.add(jl3);
		  jl.add(jt2);
		  jp1.add(jl);
		  this.getContentPane().add(jp1);
		  
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setSize(450,450);
	   }
	public static void main(String[] args) {
	new	Test3();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
