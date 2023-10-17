package loginSection;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class TextFieldTest {
	private Button btnlogin;
	private Button btnRegister;
	private TextField tfMsg;
	private TextField id;
	private TextField pwd;
	private Frame f;
	private MemberDAO dao;
	private Frame mainFrame;

	public class InnerHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Login")) {
				if (btnlogin.getLabel() == "Login") {

					if (!id.getText().equals("") && !pwd.getText().equals("")) {
						ArrayList<MemberVo> ar = dao.list(id.getText());

						if (ar.size() != 0 && ar.get(0).getpwd().equals(pwd.getText())) {
							tfMsg.setText("로그인 되었습니다.");
							mainFrame.setVisible(true);
							f.setVisible(false);
						}

						else {
							tfMsg.setText("로그인에 실패했습니다.");
						}
					}

					else {
						tfMsg.setText("틀렸습니다.");
					}
				} else if (e.getActionCommand().equals("Register")) {
					System.out.println("Register");
				}
			}
		}
	}

	public TextFieldTest() {
		dao = new MemberDAO();
		f = new Frame("Login");
		f.setSize(330, 150);
		f.setLayout(null);

		mainFrame = new Frame("MAIN");
		mainFrame.setSize(400, 300);
		mainFrame.setLocation(10, 20);
		mainFrame.setVisible(false);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(20, 20, 50, 50);
		Label lpwd = new Label("PWD : ", Label.RIGHT);
		lpwd.setBounds(20, 50, 50, 50);

		id = new TextField(10);
		id.setBounds(80, 35, 120, 20);
		pwd = new TextField(10);
		pwd.setEchoChar('*');
		pwd.setBounds(80, 65, 120, 20);

		btnlogin = new Button("Login");
		btnlogin.setBounds(210, 30, 60, 30);
		btnlogin.addActionListener(new InnerHandler());

		btnRegister = new Button("Register");
		btnRegister.setBounds(210, 70, 60, 30);
		btnRegister.addActionListener(new InnerHandler());

		tfMsg = new TextField();
		tfMsg.setBounds(80, 95, 120, 20);

		btnlogin.addActionListener(new InnerHandler());

		f.add(btnlogin);
		f.add(tfMsg);
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btnRegister);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new TextFieldTest();
	}
}