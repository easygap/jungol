package java6.p52;

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest extends WindowAdapter{
	

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		
		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();
		mFile.add(miExit);
		
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		Menu mEdit = new Menu("Edit");
		MenuItem mBefore = new MenuItem("Before");
		MenuItem mCut = new MenuItem("Cut");
		MenuItem mCopy = new MenuItem("Copy");
		MenuItem mPaste = new MenuItem("Paste");
		MenuItem mSearch = new MenuItem("Search");
		MenuItem mChange = new MenuItem("Change");
		mEdit.add(mBefore);
		mEdit.addSeparator();
		mEdit.add(mCut);
		mEdit.add(mCopy);
		mEdit.add(mPaste);
		mEdit.addSeparator();
		mEdit.add(mSearch);
		mEdit.add(mChange);
		
		Menu mFormat = new Menu("Format");
		CheckboxMenuItem mLine = new CheckboxMenuItem("auto line break");
		MenuItem mFont = new MenuItem("font");
		mFormat.add(mLine);
		mFormat.add(mFont);
		
		
		Menu mView = new Menu("View");
		Menu mzoomzoomout = new Menu("zoom/zoom out");
		MenuItem mzoom = new MenuItem("zoom");
		MenuItem mzoomout = new MenuItem("zoom out");
		MenuItem mReset = new MenuItem("reset");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		mView.add(mzoomzoomout);
		mzoomzoomout.add(mzoom);
		mzoomzoomout.add(mzoomout);
		mzoomzoomout.addSeparator();
		mzoomzoomout.add(mReset);
		mView.add(miStatusbar);		
		
		
		Menu mHelp = new Menu("Help");
		MenuItem mLook = new MenuItem("look");
		MenuItem mSend = new MenuItem("send");
		MenuItem mInformation = new MenuItem("information");
		mHelp.add(mLook);
		mHelp.add(mSend);
		
		Dialog info = new Dialog(f, "Informaiton", true);
		info.setSize(140, 100);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		Label msg = new Label("This is Note Program", Label.CENTER);
		Button ok = new Button("ok");
		info.add(msg);
		info.add(ok);
		
		mInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
			}
		});
		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.dispose();
			}
		});
		
		mHelp.add(mInformation);
		
		
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mFormat);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		
		f.setMenuBar(mb);
		f.setVisible(true);
	}
}