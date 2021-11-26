package p1;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class memo implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JMenuBar mb;    
	private JMenu file;       
	private JMenuItem save, load;
	private JLabel titleMemo;
	private JTextArea field;
	private JButton btnSave, btnOpen, btnCancel; 
	
	public memo() {
		//����
		frame = new JFrame("�޸���");
		mb = new JMenuBar(); 
		file = new JMenu("����");
		save = new JMenuItem("����");
        load = new JMenuItem("����");
		titleMemo = new JLabel("������ �Է��Ͻð� OK�� ��������.");
  		field = new JTextArea("������ �Է��ϼ���.");
  		btnSave = new JButton("Save");
  		btnOpen = new JButton("Open");
  		btnCancel = new JButton("Cancel");
  		
  		//�̺�Ʈ������ �߰�
        save.addActionListener(this);
        load.addActionListener(this);
        
        btnSave.addActionListener(this);
        btnOpen.addActionListener(this);
        btnCancel.addActionListener(this);
        
        file.add(save);
        file.add(load);
        mb.add(file);
        
        //������ ���
        //����,�ؽ�Ʈâ
        titleMemo.setSize(400, 20);
        titleMemo.setLocation(20, 0);
        field.setSize(400, 200);
        field.setLocation(20, 20);
        
        //��ư��
        btnSave.setSize(100, 40);
        btnSave.setLocation(470, 20);
        btnOpen.setSize(100, 40);
        btnOpen.setLocation(470, 100);
        btnCancel.setSize(100, 40);
        btnCancel.setLocation(470, 180);
        
        //�����ӿ� �߰�
        frame.add(titleMemo);
        frame.add(field);
        frame.add(btnSave);
        frame.add(btnOpen);
        frame.add(btnCancel);
        frame.add(mb);
        frame.setJMenuBar(mb);  
        frame.setLayout(null);  
        frame.setSize(600,300);    
        frame.setVisible(true);    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true); //�ٸ� �÷��������� ������ �ʴ� ������ ������ ������� ����.
		new memo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == save || e.getSource() == btnSave) {
	           FileDialog fd = new FileDialog(frame, "����", FileDialog.SAVE);
	           fd.setVisible(true);
	           String path = fd.getDirectory() + fd.getFile();
	           if (fd.getFile() == null) return;
		           try {
			           FileWriter fw = new FileWriter(path);
			           String s = field.getText();
			           fw.write(s);
			           fw.close(); 
			       } catch (Exception e1) {
			           System.out.println("�������"+e1);
			       }
		}

	    if(e.getSource() == load || e.getSource() == btnOpen) {
	    	FileDialog fd = new FileDialog(frame, "����", FileDialog.LOAD);
	        fd.setVisible(true);
	        String path = fd.getDirectory() + fd.getFile();
	        String s ="";
	        if (fd.getFile() == null) return;
	           try {
	              FileReader fr = new FileReader(path);
	              int k;
	              while(true) {
	                 k = fr.read();
	                 if(k == -1) break;
	                 s += (char)k;
	              }
	              fr.close();
		        } catch (Exception e2) {
		           System.out.println("����"+e2);
		        }
	         field.setText(s);
	    }
	    
	    if(e.getSource() == btnCancel) {
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	System.exit(0);
	    }
		
	}

}
