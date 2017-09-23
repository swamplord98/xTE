import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class xTE{
	public static void main(String[] args) throws Exception{
	     
		//Window
		JFrame frame = new JFrame("xTE v0.02");
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
                
        //Creating the text area
		JTextArea textArea = new JTextArea(10,10);
		textArea.setLineWrap(true);

		//Menu bar
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

        //Menu bar items and functions
		JMenuItem newFile = new JMenuItem("New");
		newFile.addActionListener((ActionEvent er) -> {
		    textArea.
		});
		
		JMenuItem openFile = new JMenuItem("Open");
		openFile.addActionListener((ActionEvent er) -> {
		    JFileChooser opnfc = new JFileChooser();
		    opnfc.setDialogTitle("Open File");    
		    String filename = new String();
		    
		    if(opnfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
		        FileReader fr = null;
		    }
		    
		    try{
		        FileReader fr = new FileReader(opnfc.getSelectedFile().getAbsolutePath());
		        textArea.read(fr, null);
		        fr.close();
		    }catch(IOException e){
		        e.printStackTrace();
		    }
        });
		    
		JMenuItem saveFile = new JMenuItem("Save");
        saveFile.addActionListener((ActionEvent e) -> {
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Save File");
            if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
                FileWriter fw = null;
            }
                try{
                    FileWriter fw = new FileWriter(fc.getSelectedFile().getAbsolutePath());
                    textArea.write(fw);
                    fw.close();
                } catch (IOException ex) {
                            
                }
                JOptionPane.showMessageDialog(frame, "Save Complete");
        });

        JMenuItem fnt = new JMenuItem("Font Size");
        JMenuItem cpy = new JMenuItem("Copy");
        JMenuItem pst = new JMenuItem("Paste");

		JMenuItem aboutme = new JMenuItem("About");
		aboutme.addActionListener((ActionEvent e) -> {
		
            //About Window
            JFrame f = new JFrame("About");
            f.setSize(300,250);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
                    
            //Labels
            JLabel me = new JLabel("Program by: Swamplord98");
            JLabel ver = new JLabel("Version 0.02 alpha");
            JLabel aboutxTE = new JLabel("xTE is a basic text editor");
            JLabel aboutxTE1 = new JLabel("For updates visit");
            JLabel aboutxTE2 = new JLabel("https://github.com/swamplord98/xTE");
                    
            JPanel p = new JPanel();
             p.add(me);
             p.add(ver);
             p.add(aboutxTE);
             p.add(aboutxTE1);
             p.add(aboutxTE2);
             f.add(p);
             f.setVisible(true);
        });

        JMenuItem updatez = new JMenuItem("Update");
        
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
		helpMenu.add(updatez);
		
		frame.setJMenuBar(menuBar);
		frame.add(textArea);
		frame.setVisible(true);
	}
}
