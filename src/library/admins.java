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

public class admins extends JFrame implements ActionListener{
	JMenuBar jmb;
	   JMenu jm;
	   JMenuItem Open1;
	   JMenuItem Close1;
	   JMenuItem jia;
	   JMenuItem jian;
	   JMenu jm2;
	   JMenuItem Open2;
	   JMenuItem close2;
	   JMenu jm3;
	   JMenuItem Open3;
	   JMenuItem close3;
	  JPanel jp1,jp2,jp3;
	  JLabel jl,jl2,jl3;
	  JTextField jt1,jt2;
	  JButton jb1, jb2;
	  
	  admins(){
		  super("����Ա����ϵͳ");
		   jmb=new JMenuBar();
		   jm=new JMenu("���߹���");
		   Open1=new JMenuItem("�������");
		   Open1.addActionListener(this);
		   Close1=new JMenuItem("������Ϣ");
		   Close1.addActionListener(this);
		   jia=new JMenuItem("����ע��");
		   jia.addActionListener(this);
		   jian=new JMenuItem("������Ϣ�޸�");
		   jian.addActionListener(this);
		   
		   jm2=new JMenu("ͼ�����");
		   Open2=new JMenuItem("ͼ�����");
		   Open2.addActionListener(this);
		   close2=new JMenuItem("ͼ��ע��");
		   close2.addActionListener(this);
		     
		  jm3=new JMenu("�������");
		  Open3=new JMenuItem("������");
		  Open3.addActionListener(this);
		  close3=new JMenuItem("����˵��");
		
		  jmb.add(jm);   
		  jm.add(Open1);
		  jm.add(Close1);
		  jm.add(jia);
		  jm.add(jian);
		  jmb.add(jm2);
		  jm2.add(Open2);
		  jm2.add(close2);
		  jmb.add(jm3);
		  jm3.add(Open3);
		  jm3.add(close3);
		  this.setJMenuBar(jmb);
		  
		  jp1=new JPanel();
		  jl=new JLabel(new ImageIcon("book.jpg"));
		  jp1.add(jl);
		  jp1.setVisible(true);
		  this.getContentPane().add(jp1);
		  
		 

		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setSize(450,450);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(Open1)){
			
		}else if(e.getSource().equals(Close1)){
			
		}else if(e.getSource().equals(Open2)){
			
		}else if(e.getSource().equals(close2)){
			
		}else if(e.getSource().equals(Open3)){
			
		}else if(e.getSource().equals(close3)){
			
		}else if(e.getSource().equals(jia)){
			
		}else if(e.getSource().equals(jian)){
			
		}
		
	}

}
