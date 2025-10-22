package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtxtDisplay;
	
	double EnterNum1;
	double EnterNum2;
	double Result;
	String Operate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBS = new JButton("\uF0E7");
		btnBS.setFont(new Font("windgings", Font.BOLD, 24));
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bs = null;
				if(jtxtDisplay.getText().length() > 0)
				{
					StringBuilder stB = new StringBuilder(jtxtDisplay.getText());
					stB.deleteCharAt(jtxtDisplay.getText().length() - 1);
					bs = stB.toString();
					jtxtDisplay.setText(bs);
					
						
					}
				}
			
		});
		btnBS.setBounds(10, 91, 93, 71);
		contentPane.add(btnBS);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText("");
				
				String Fn, Sn;
				
				Fn = String.valueOf(EnterNum1);
				Sn = String.valueOf(EnterNum2);
				
				Fn = ""; 
				Sn = "";
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCE.setBounds(114, 91, 93, 71);
		contentPane.add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText("");
			}
		});
		btnC.setBounds(217, 91, 105, 71);
		contentPane.add(btnC);
		
		JButton btnPM = new JButton("+/-");
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pm = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
				pm = pm * (-1);
				jtxtDisplay.setText(String.valueOf(pm));
				
			}
						
		
		});
		btnPM.setBounds(332, 91, 102, 71);
		contentPane.add(btnPM);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn7.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.setBounds(10, 184, 93, 71);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn4.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(10, 279, 93, 71);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn1.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setBounds(10, 363, 93, 71);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn0.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(10, 462, 93, 71);
		contentPane.add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn8.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.setBounds(114, 184, 93, 71);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn5.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.setBounds(114, 279, 93, 71);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn2.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(114, 363, 93, 71);
		contentPane.add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!jtxtDisplay.getText().contains("."))
				{
					jtxtDisplay.setText(jtxtDisplay.getText() + btnDot.getText());
					
				}
			}
		});
		btnDot.setBounds(114, 462, 93, 71);
		contentPane.add(btnDot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn9.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.setBounds(217, 184, 105, 71);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn6.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(217, 279, 105, 71);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn3.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(217, 363, 105, 71);
		contentPane.add(btn3);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterNum2 = Double.parseDouble(jtxtDisplay.getText());
				if (Operate == "+")
				{
					Result = EnterNum1 + EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
				}
				else if (Operate == "-")
				{
					Result = EnterNum1 - EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
				}
				else if (Operate == "*")
				{
					Result = EnterNum1 * EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
				}
				else if (Operate == "/")
				{
					Result = EnterNum1 / EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
				}

					
					
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnEquals.setBounds(217, 462, 105, 71);
		contentPane.add(btnEquals);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAdd.setBounds(332, 184, 102, 71);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btnSub.setBounds(332, 279, 102, 71);
		contentPane.add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btnMult.setBounds(332, 363, 102, 71);
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDiv.setBounds(332, 462, 102, 71);
		contentPane.add(btnDiv);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtDisplay.setBounds(10, 10, 424, 71);
		contentPane.add(jtxtDisplay);
		jtxtDisplay.setColumns(10);

	}
}
