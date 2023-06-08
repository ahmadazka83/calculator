package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	
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
	public Calculator() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 32));
		textField.setBounds(10, 11, 502, 113);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAC = new JButton("AC");
		btnAC.setBounds(10, 131, 119, 100);
		btnAC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		contentPane.add(btnAC);
		
		JButton btnBack = new JButton("B");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace = str.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(139, 131, 119, 100);
		contentPane.add(btnBack);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation="%";
				}
			});
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMod.setBounds(268, 131, 119, 100);
		contentPane.add(btnMod);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(393, 131, 119, 100);
		contentPane.add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn7.getText();
				textField.setText(name);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 242, 119, 100);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn4.getText();
				textField.setText(name);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 353, 119, 100);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn1.getText();
				textField.setText(name);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 464, 119, 100);
		contentPane.add(btn1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn8.getText();
				textField.setText(name);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(139, 242, 119, 100);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText()+btn5.getText();
				textField.setText(name);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(139, 353, 119, 100);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn2.getText();
				textField.setText(name);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(139, 464, 119, 100);
		contentPane.add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn9.getText();
				textField.setText(name);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(268, 242, 119, 100);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn6.getText();
				textField.setText(name);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(268, 353, 119, 100);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn3.getText();
				textField.setText(name);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(268, 464, 119, 100);
		contentPane.add(btn3);
		
		JButton btnMultipy = new JButton("*");
		btnMultipy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultipy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMultipy.setBounds(393, 242, 119, 100);
		contentPane.add(btnMultipy);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSub.setBounds(393, 353, 119, 100);
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.setBounds(393, 464, 119, 100);
		contentPane.add(btnAdd);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btn0.getText();
				textField.setText(name);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(139, 575, 119, 100);
		contentPane.add(btn0);
		
		JButton btnPow = new JButton("^");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="^";
			}
		});
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPow.setBounds(10, 575, 119, 100);
		contentPane.add(btnPow);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText()+btnPoint.getText();
				textField.setText(name);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPoint.setBounds(268, 575, 119, 100);
		contentPane.add(btnPoint);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="-") {
					result = first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="/") {
					result = first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="*") {
					result = first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="%") {
					result = first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="^") {
					result = Math.pow(first, second);
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEquals.setBounds(393, 575, 119, 100);
		contentPane.add(btnEquals);
	}
}
