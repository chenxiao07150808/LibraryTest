package library;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class search extends JFrame implements ActionListener{
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
	  JPanel jp1,jp2,jp3,jp4;
	  JLabel jl,jl2,jl3,jl1;
	  JTextField jt,jt1,jt2,jt3;
	  JButton jb1, jb2;
	  
	  search(){
		  super("ͼ��ݲ���ϵͳ");
		   jmb=new JMenuBar();
		   jm=new JMenu("��ҳ");
		   Open1=new JMenuItem("����");
		   Open1.addActionListener(this);
		   Close1=new JMenuItem("������Ϣ��ѯ");
		  
		   
		   jm2=new JMenu("��ѯ");
		   Open2=new JMenuItem("ͼ���ѯ");
		   Open2.addActionListener(this);
		   close2=new JMenuItem("���Ĳ�ѯ");
		   close2.addActionListener(this);
		     
		  jm3=new JMenu("����");
		  Open3=new JMenuItem("ͼ��Ѱ��");
		  Open3.addActionListener(this);
		  close3=new JMenuItem("ͼ�����");
		  close3.addActionListener(this);
		  
		  
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
		  
		  jp2=new JPanel();
		  jb1=new JButton("��ѯ");
		  jb2=new JButton("����");
		  jl2=new JLabel("����");
		  jl3=new JLabel("����");
		  jt1=new JTextField(8);
		  jt2=new JTextField(8);
		 
		
		  jp2.add(jl2);
		  jp2.add(jt1);
		  jp2.add(jl3);
		  jp2.add(jt2);
		  jp2.add(jb1);
		  jp2.add(jb2);
	     
		  jp2.setSize(400, 400);
		  this.getContentPane().add(jp2);
		  
		 

		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setSize(450,450);
	  }

	public static void main(String[] e) {
				

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(Close1)){
			new readerMessage();
		}else if(e.getSource().equals(Open2)){
			new book();
		}else if(e.getSource().equals(close2)){
			new borrow();
		}else if(e.getSource().equals(Open3)){
			new search();
		}else if(e.getSource().equals(close3)){
			new bookMessage();
		}else if(e.getSource().equals(Open1)){
			new index();
		}

	}

}
