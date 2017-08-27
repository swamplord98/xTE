import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class xTE{
	public static void main(String[] args){
	
		//Window
		JFrame frame = new JFrame("xTE v0.01");
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

		//Menu bar
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

		JMenuItem newFile = new JMenuItem("New");
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem saveFile = new JMenuItem("Save");

        JMenuItem fnt = new JMenuItem("Font");
        JMenuItem cpy = new JMenuItem("Copy");
        JMenuItem pst = new JMenuItem("Paste");

		JMenuItem aboutme = new JMenuItem("About");
		aboutme.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent e){
		        
		            //About Window//
                    JFrame f = new JFrame("About");
                    f.setSize(250,250);
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setLocationRelativeTo(null);
                    f.setResizable(false);
                    
                    //Labels
                    JLabel me = new JLabel("Program by: Swamplord98");
                    JLabel ver = new JLabel("Version 0.01 alpha");
                    JLabel aboutxTE = new JLabel("xTE is a basic text editor");
                    
                    JPanel p = new JPanel();
                    p.add(me);
                    p.add(ver);
                    p.add(aboutxTE);
                    f.add(p);
                    f.setVisible(true);
                }
            });

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		fileMenu.add(newFile);
		fileMenu.add(openFile);
		fileMenu.add(saveFile);
        editMenu.add(fnt);
        editMenu.add(cpy);
        editMenu.add(pst);

		helpMenu.add(aboutme);

		//Creating the text area
		JTextArea text = new JTextArea(10,10);
		text.setLineWrap(true);

		//add it to JFrame
		frame.setJMenuBar(menuBar);
		frame.add(text);
		frame.setVisible(true);
	}
}
