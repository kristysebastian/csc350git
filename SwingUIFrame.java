import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;


public class SwingUIFrame extends JFrame {

	public static void main(String args[]) {
		new SwingUIFrame();
	}
	SwingUIFrame() {
		setLayout(null);
		setTitle("6502-Simulator");
		setSize(800, 600);
		setVisible(true);
		
		//labels for registers
		JLabel testlabel = new JLabel("Input Code:");
		add(testlabel);
		testlabel.setBounds(10, 15, 100, 25);
		
		JLabel registerLabel = new JLabel("Registers:");
		add(registerLabel);
		registerLabel.setBounds(450, 15, 80, 25);
		
		JLabel pcLabel = new JLabel("Program Counter");
		add(pcLabel);
		pcLabel.setBounds(450, 50, 150, 15);
		
		JLabel xLabel = new JLabel("Register x");
		add(xLabel);
		xLabel.setBounds(450, 110, 150, 15);
		
		JLabel yLabel = new JLabel("Register y");
		add(yLabel);
		yLabel.setBounds(450, 170, 150, 15);
		
		JLabel accLabel = new JLabel("Accumulator");
		add(accLabel);
		accLabel.setBounds(600, 50, 150, 15);
		
		JLabel statusLabel = new JLabel("Status Register");
		add(statusLabel);
		statusLabel.setBounds(600, 110, 150, 15);
		
		JLabel spLabel = new JLabel("Stack Pointer");
		add(spLabel);
		spLabel.setBounds(600, 170, 150, 15);
		
		JLabel flagLabel = new JLabel("Flags:");
		add(flagLabel);
		flagLabel.setBounds(450, 260, 150, 15);
		
		
		String testreg = "0x32432";
		//text fields for registers
		JTextField pcReg = new JTextField(testreg, 50);
		add(pcReg);
		pcReg.setEditable(false);
		pcReg.setBackground(Color.white);
		pcReg.setBounds(450, 70, 80, 25);
		
		JTextField xReg = new JTextField(50);
		add(xReg);
		xReg.setEditable(false);
		xReg.setBackground(Color.white);
		xReg.setBounds(450, 130, 80, 25);
		
		JTextField yReg = new JTextField(50);
		add(yReg);
		yReg.setEditable(false);
		yReg.setBackground(Color.white);
		yReg.setBounds(450, 190, 80, 25);
		
		JTextField accReg = new JTextField(testreg, 50);
		add(accReg);
		accReg.setEditable(false);
		accReg.setBackground(Color.white);
		accReg.setBounds(600, 70, 80, 25);
		
		JTextField statusReg = new JTextField(50);
		add(statusReg);
		statusReg.setEditable(false);
		statusReg.setBackground(Color.white);
		statusReg.setBounds(600, 130, 80, 25);
		
		JTextField spReg = new JTextField(50);
		add(spReg);
		spReg.setEditable(false);
		spReg.setBackground(Color.white);
		spReg.setBounds(600, 190, 80, 25);
		
		//test text for text area
		//String testtext = "the quick brown fox jumped over the lazy dog. the quick brown fox jumped over the lazy dog. the quick brown fox jumped over the lazy dog. the quick brown fox jumped over the lazy dog.";
		
		//add text area with scrollbar for input file ***scrollbar does not work yet***
		JTextArea inputTextField = new JTextArea(400, 450);
		inputTextField.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(inputTextField); 
		inputTextField.setEditable(false);
		add(inputTextField);
		inputTextField.setBackground(Color.white);
		inputTextField.setBounds(10, 50, 400, 450);
			
		
		//choose file - automatically chooses upon open
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File f = chooser.getSelectedFile();
		String filename = f.getAbsolutePath();
		
		//read file. if file can't be read, show error message
		try {
			FileReader reader = new FileReader(filename);
			BufferedReader br = new BufferedReader(reader);
			inputTextField.read(br, null);
			br.close();
			inputTextField.requestFocus();
		}catch (Exception e) {
			System.out.println("Can't load file");
		}
		
		
	}
}
