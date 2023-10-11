package java6.p40;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

public class TextFieldTest { //extends WindowAdapter {
	private Button btn;
	private TextField tfMsg;
	private String iroot = new String("root");
	private String proot = new String("root");
	private TextField id;
	private TextField pwd;
	private Frame f;

	public class InnerHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (btn.getLabel() == "Login") {
				if (id.getText().equals(iroot) && pwd.getText().equals(proot))
					tfMsg.setText("로그인 되었습니다.");
				else
					tfMsg.setText("로그인에 실패했습니다.");
			}
		}
	}

//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}

	public TextFieldTest() {
//		f.addWindowListener(this);
		f = new Frame("Login");
		f.setSize(330, 150);
//		f.setLayout(new FlowLayout());
		f.setLayout(null);

//		b.addActionListener();

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(20, 20, 50, 50);
		Label lpwd = new Label("PWD : ", Label.RIGHT);
		lpwd.setBounds(20, 50, 50, 50);

		id = new TextField(10);
		id.setBounds(80, 35, 120, 20);
		pwd = new TextField(10);
		pwd.setEchoChar('*');
		pwd.setBounds(80, 65, 120, 20);

		btn = new Button("Login");
		btn.setBounds(210, 30, 40, 50);

		tfMsg = new TextField();
		tfMsg.setBounds(80, 95, 120, 20);

		btn.addActionListener(new InnerHandler());

		f.add(btn);
		f.add(tfMsg);
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		TextFieldTest tf = new TextFieldTest();
	}
}