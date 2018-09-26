import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frmAcmAitp;
	private JTextField display;
	static String displayText = "";
	static int varOne;
	static int varTwo;
	static char currentOp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmAcmAitp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcmAitp = new JFrame();
		frmAcmAitp.setTitle("ACM / AITP Calculator");
		frmAcmAitp.setBounds(100, 100, 450, 300);
		frmAcmAitp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAcmAitp.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setBackground(Color.WHITE);
		display.setEditable(false);
		display.setBounds(10, 11, 220, 37);
		frmAcmAitp.getContentPane().add(display);
		display.setColumns(10);
		
		JButton sevenBtn = new JButton("7");
		sevenBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sevenBtn.setBounds(10, 59, 41, 37);
		frmAcmAitp.getContentPane().add(sevenBtn);
		
		JButton eightBtn = new JButton("8");
		eightBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		eightBtn.setBounds(61, 59, 41, 37);
		frmAcmAitp.getContentPane().add(eightBtn);
		
		JButton nineBtn = new JButton("9");
		nineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText += "9";
				display.setText(displayText);
			}
		});
		nineBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nineBtn.setBounds(112, 59, 41, 37);
		frmAcmAitp.getContentPane().add(nineBtn);
		
		JButton fourBtn = new JButton("4");
		fourBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fourBtn.setBounds(10, 107, 41, 37);
		frmAcmAitp.getContentPane().add(fourBtn);
		
		JButton fiveBtn = new JButton("5");
		fiveBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fiveBtn.setBounds(61, 107, 41, 37);
		frmAcmAitp.getContentPane().add(fiveBtn);
		
		JButton sixBtn = new JButton("6");
		sixBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sixBtn.setBounds(112, 107, 41, 37);
		frmAcmAitp.getContentPane().add(sixBtn);
		
		JButton oneBtn = new JButton("1");
		oneBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		oneBtn.setBounds(10, 155, 41, 37);
		frmAcmAitp.getContentPane().add(oneBtn);
		
		JButton twoBtn = new JButton("2");
		twoBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		twoBtn.setBounds(61, 155, 41, 37);
		frmAcmAitp.getContentPane().add(twoBtn);
		
		JButton threeBtn = new JButton("3");
		threeBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		threeBtn.setBounds(112, 155, 41, 37);
		frmAcmAitp.getContentPane().add(threeBtn);
		
		JButton zeroBtn = new JButton("0");
		zeroBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		zeroBtn.setBounds(10, 203, 41, 37);
		frmAcmAitp.getContentPane().add(zeroBtn);
		
		JButton clearBtn = new JButton("C");
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		clearBtn.setBounds(112, 203, 41, 37);
		frmAcmAitp.getContentPane().add(clearBtn);
		
		JButton decimalBtn = new JButton(".");
		
		decimalBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		decimalBtn.setBounds(61, 203, 41, 37);
		frmAcmAitp.getContentPane().add(decimalBtn);
		
		JButton addBtn = new JButton("+");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				varOne = Integer.parseInt(displayText);
				currentOp = '+';
				display.setText("");
				displayText = "";
			}
		});
		addBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		addBtn.setBounds(189, 59, 41, 37);
		frmAcmAitp.getContentPane().add(addBtn);
		
		JButton subtractBtn = new JButton("-");
		subtractBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		subtractBtn.setBounds(189, 107, 41, 37);
		frmAcmAitp.getContentPane().add(subtractBtn);
		
		JButton multipleBtn = new JButton("*");
		multipleBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		multipleBtn.setBounds(189, 155, 41, 37);
		frmAcmAitp.getContentPane().add(multipleBtn);
		
		JButton equalsBtn = new JButton("=");
		equalsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				varTwo = Integer.parseInt(displayText);
				if (currentOp == '+') {
					int result = varOne + varTwo;
					String disp = Integer.toString(result);
					display.setText(disp);
				}
			}
		});
		equalsBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		equalsBtn.setBounds(189, 203, 41, 37);
		frmAcmAitp.getContentPane().add(equalsBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(252, 11, 172, 239);
		frmAcmAitp.getContentPane().add(scrollPane);
		
		JTextArea history = new JTextArea();
		history.setEditable(false);
		scrollPane.setViewportView(history);
	}
}
