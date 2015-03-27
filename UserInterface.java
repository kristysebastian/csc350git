import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

public class UserInterface {
	
	public void createUI() {
	
		JFrame frame = new JFrame("6502-Simulator");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		//*********************************************************
		//labels for registers
		//*********************************************************
		JLabel testlabel = new JLabel("Input Code:");
		frame.add(testlabel);
		testlabel.setBounds(10, 15, 100, 25);
		
		JLabel registerLabel = new JLabel("Registers:");
		frame.add(registerLabel);
		registerLabel.setBounds(450, 15, 80, 25);
		
		JLabel pcLabel = new JLabel("Program Counter");
		frame.add(pcLabel);
		pcLabel.setBounds(450, 50, 150, 15);
		
		JLabel xLabel = new JLabel("Register x");
		frame.add(xLabel);
		xLabel.setBounds(450, 110, 150, 15);
		
		JLabel yLabel = new JLabel("Register y");
		frame.add(yLabel);
		yLabel.setBounds(450, 170, 150, 15);
		
		JLabel accLabel = new JLabel("Accumulator");
		frame.add(accLabel);
		accLabel.setBounds(600, 50, 150, 15);
		
		JLabel statusLabel = new JLabel("Status Register");
		frame.add(statusLabel);
		statusLabel.setBounds(600, 110, 150, 15);
		
		JLabel spLabel = new JLabel("Stack Pointer");
		frame.add(spLabel);
		spLabel.setBounds(600, 170, 150, 15);
		
		JLabel flagLabel = new JLabel("Flags:");
		frame.add(flagLabel);
		flagLabel.setBounds(450, 260, 150, 15);
		
		//*********************************************************
		//labels for flags
		//*********************************************************
		
		JLabel nLabel = new JLabel("N");
		frame.add(nLabel);
		nLabel.setBounds(450, 295, 15, 15);
		
		JLabel vLabel = new JLabel("V");
		frame.add(vLabel);
		vLabel.setBounds(480, 295, 15, 15);
		
		
		//*********************************************************
		//text fields for registers
		//*********************************************************
		String testreg = "0x32432";
		JTextField pcReg = new JTextField(testreg, 50);
		frame.add(pcReg);
		pcReg.setEditable(false);
		pcReg.setBackground(Color.white);
		pcReg.setBounds(450, 70, 80, 25);
		
		JTextField xReg = new JTextField(50);
		frame.add(xReg);
		xReg.setEditable(false);
		xReg.setBackground(Color.white);
		xReg.setBounds(450, 130, 80, 25);
		
		JTextField yReg = new JTextField(50);
		frame.add(yReg);
		yReg.setEditable(false);
		yReg.setBackground(Color.white);
		yReg.setBounds(450, 190, 80, 25);
		
		JTextField accReg = new JTextField(testreg, 50);
		frame.add(accReg);
		accReg.setEditable(false);
		accReg.setBackground(Color.white);
		accReg.setBounds(600, 70, 80, 25);
		
		JTextField statusReg = new JTextField(50);
		frame.add(statusReg);
		statusReg.setEditable(false);
		statusReg.setBackground(Color.white);
		statusReg.setBounds(600, 130, 80, 25);
		
		JTextField spReg = new JTextField(50);
		frame.add(spReg);
		spReg.setEditable(false);
		spReg.setBackground(Color.white);
		spReg.setBounds(600, 190, 80, 25);
		
		//*********************************************************
		//text fields for flags
		//*********************************************************
		String testflag = "0";
		JTextField nFlag = new JTextField(testflag, 10);
		frame.add(nFlag);
		nFlag.setEditable(false);
		nFlag.setBackground(Color.white);
		nFlag.setBounds(450, 310, 20, 20);
		
		
		//add text area with scrollbar for input file ***scrollbar does not work yet
		final JTextArea inputTextField = new JTextArea(400, 450);
		inputTextField.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(inputTextField); 
		inputTextField.setEditable(false);
		frame.add(inputTextField);
		inputTextField.setBackground(Color.white);
		inputTextField.setBounds(10, 50, 400, 450);

		
		//button for uploading a file ***only shows up if you mouseover??
		JButton uploadFile = new JButton("Upload File");
		uploadFile.setBounds(450, 475, 95, 25);
		frame.add(uploadFile);
		
		uploadFile.addActionListener(new ActionListener() {
 
			public void actionPerformed(ActionEvent e){
				
				//execute when button is pressed
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
				}catch (Exception x) {
					System.out.println("Can't load file");
				}
				
			}
		});
                
                //button for stepping thru a file ***doesn't work yet
		JButton stepFile = new JButton("Step");
		stepFile.setBounds(550, 475, 95, 25);
		frame.add(stepFile);
		
		
	}
	public void updateRegisters (short PC, byte AC, byte X, byte Y, byte SR, byte SP) {
		System.out.println("updated registers");
		
		// to do
		
		
	}

	public void updateFlags (boolean N, boolean V, boolean G, boolean B, boolean D, boolean I, boolean Z, boolean C) {
		System.out.println("updated flags");
		
		// to do
	}	
}
