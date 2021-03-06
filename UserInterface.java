import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.*;

public class UserInterface extends JFrame {
    
	//initializing all variables
	JButton stepFile;
	JTextField pcReg;
	JTextField xReg;
	JTextField yReg;
	JTextField accReg;
	JTextField statusReg;
	JTextField spReg;
	    
	JTextField nFlag;
	JTextField vFlag;
	JTextField gFlag;
	JTextField bFlag;
	JTextField dFlag;
	JTextField iFlag;
	JTextField zFlag;
	JTextField cFlag;
	
	JTextArea inputTextField;
	
	String fileText = null;
	
	int intN = 0;
	int intV = 0;
	int intG = 0;
	int intB = 0;
	int intD = 0;
	int intI = 0;
	int intZ = 0;
	int intC = 0;
	

    public void createUI() {
    
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        
        //*********************************************************
        //labels for registers
        //*********************************************************
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
        
        //*********************************************************
        //labels for flags
        //*********************************************************
        
        JLabel nLabel = new JLabel("N");
        add(nLabel);
        nLabel.setBounds(450, 295, 15, 15);
        
        JLabel vLabel = new JLabel("V");
        add(vLabel);
        vLabel.setBounds(480, 295, 15, 15);
        
        JLabel gLabel = new JLabel("G");
        add(gLabel);
        gLabel.setBounds(510, 295, 15, 15);
        
        JLabel bLabel = new JLabel("B");
        add(bLabel);
        bLabel.setBounds(540, 295, 15, 15);
        
        JLabel dLabel = new JLabel("D");
        add(dLabel);
        dLabel.setBounds(570, 295, 15, 15);
        
        JLabel iLabel = new JLabel("I");
        add(iLabel);
        iLabel.setBounds(600, 295, 15, 15);
        
        JLabel zLabel = new JLabel("Z");
        add(zLabel);
        zLabel.setBounds(630, 295, 15, 15);
        
        JLabel cLabel = new JLabel("C");
        add(cLabel);
        cLabel.setBounds(660, 295, 15, 15);
        
        
        //*********************************************************
        //text fields for registers
        //*********************************************************
        
        pcReg = new JTextField(50);
        add(pcReg);
        pcReg.setEditable(false);
        pcReg.setBackground(Color.white);
        pcReg.setBounds(450, 70, 80, 25);
        
        xReg = new JTextField(50);
        add(xReg);
        xReg.setEditable(false);
        xReg.setBackground(Color.white);
        xReg.setBounds(450, 130, 80, 25);
        
        yReg = new JTextField(50);
        add(yReg);
        yReg.setEditable(false);
        yReg.setBackground(Color.white);
        yReg.setBounds(450, 190, 80, 25);
        
        accReg = new JTextField(50);
        add(accReg);
        accReg.setEditable(false);
        accReg.setBackground(Color.white);
        accReg.setBounds(600, 70, 80, 25);
        
        statusReg = new JTextField(50);
        add(statusReg);
        statusReg.setEditable(false);
        statusReg.setBackground(Color.white);
        statusReg.setBounds(600, 130, 80, 25);
        
        spReg = new JTextField(50);
        add(spReg);
        spReg.setEditable(false);
        spReg.setBackground(Color.white);
        spReg.setBounds(600, 190, 80, 25);
        
        //*********************************************************
        //text fields for flags
        //*********************************************************
        //String testflag = "0";
        nFlag = new JTextField(10);
        add(nFlag);
        nFlag.setEditable(false);
        nFlag.setBackground(Color.white);
        nFlag.setBounds(450, 310, 25, 25);
        
        vFlag = new JTextField(10);
        add(vFlag);
        vFlag.setEditable(false);
        vFlag.setBackground(Color.white);
        vFlag.setBounds(480, 310, 25, 25);
        
        gFlag = new JTextField(10);
        add(gFlag);
        gFlag.setEditable(false);
        gFlag.setBackground(Color.white);
        gFlag.setBounds(510, 310, 25, 25);
        
        bFlag = new JTextField(10);
        add(bFlag);
        bFlag.setEditable(false);
        bFlag.setBackground(Color.white);
        bFlag.setBounds(540, 310, 25, 25);
        
        dFlag = new JTextField(10);
        add(dFlag);
        dFlag.setEditable(false);
        dFlag.setBackground(Color.white);
        dFlag.setBounds(570, 310, 25, 25);
        
        iFlag = new JTextField(10);
        add(iFlag);
        iFlag.setEditable(false);
        iFlag.setBackground(Color.white);
        iFlag.setBounds(600, 310, 25, 25);
        
        zFlag = new JTextField(10);
        add(zFlag);
        zFlag.setEditable(false);
        zFlag.setBackground(Color.white);
        zFlag.setBounds(630, 310, 25, 25); 
        
        cFlag = new JTextField(10);
        add(cFlag);
        cFlag.setEditable(false);
        cFlag.setBackground(Color.white);
        cFlag.setBounds(660, 310, 25, 25); 
        
        
         //*********************************************************
        //add text area with scrollbar for input file ***scrollbar does not work yet
         //*********************************************************
        inputTextField = new JTextArea(400, 450);
        inputTextField.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(inputTextField); 
        inputTextField.setEditable(false);
        add(inputTextField);
        inputTextField.setBackground(Color.white);
        inputTextField.setBounds(10, 50, 400, 450);
        
    }
    
    public String fileUpload() {
    	    

        //button for uploading a file ***only shows up if you mouseover??      
        JButton uploadFile = new JButton("Upload File");
        uploadFile.setBounds(450, 475, 95, 25);
        add(uploadFile);
        
        //button for stepping thru a file ***doesn't work yet
        JButton stepFile = new JButton("Step");
        stepFile.setBounds(550, 475, 95, 25);
        stepFile.setVisible(true);
        add(stepFile);
        
        //uploadFile.addActionListener(new ActionListener() {
 
            //public void actionPerformed(ActionEvent e){
                
                /*//execute when button is pressed
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
                }*/
                StringBuilder sb = new StringBuilder();
                String line = null;
                
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                String filename = f.getAbsolutePath();
                
                //read file. if file can't be read, show error message
                try {
                    FileReader reader = new FileReader(filename);
                    BufferedReader br = new BufferedReader(reader);
                    //inputTextField.read(br, null);
                    //br.close();
                    //inputTextField.requestFocus();
                    
                    while ((line = br.readLine()) != null) {
                    	    sb.append(line + "\n");
                    	    //System.out.println(line);
                    }
                    //return sb.toString();
                    //return line;
                }catch (Exception x) {
                    System.out.println("Can't load file");
                }
                inputTextField.setText(sb.toString());
                return sb.toString();
                
            //}
        //});
                
        
        
    }
    
    public String getFileText(){
    	    return fileText;
    }	    
    public void updateRegisters (short PC, byte AC, byte X, byte Y, byte SR, byte SP) {

    	//converts registers to strings and prints to register text fields on ui
    	pcReg.setText(String.valueOf(PC));
        accReg.setText(String.valueOf(AC));
        xReg.setText(String.valueOf(X));
        yReg.setText(String.valueOf(Y));
        statusReg.setText(String.valueOf(SR));
        spReg.setText(String.valueOf(SP));
      
        
    }

    public void updateFlags (boolean N, boolean V, boolean G, boolean B, boolean D, boolean I, boolean Z, boolean C) {
        
    	//converts flags to 1 or 0    
        intN = (N) ? 1 : 0;
	intV = (V) ? 1 : 0; 
	intG = (G) ? 1 : 0; 
	intB = (B) ? 1 : 0;
	intD = (D) ? 1 : 0;
	intI = (I) ? 1 : 0; 
	intZ = (Z) ? 1 : 0; 
	intC = (C) ? 1 : 0;     
        
	//converts flag integers to strings and prints to flag text fields on ui 
        nFlag.setText(String.valueOf(intN));        
        vFlag.setText(String.valueOf(intV));        
        gFlag.setText(String.valueOf(intG));
        bFlag.setText(String.valueOf(intB));
        dFlag.setText(String.valueOf(intD));
        iFlag.setText(String.valueOf(intI));
        zFlag.setText(String.valueOf(intZ));
        cFlag.setText(String.valueOf(intC));
                
        
    }   
}
