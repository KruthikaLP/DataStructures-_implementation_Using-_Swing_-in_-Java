import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizeBox;
	private JTextField elemBox;
	private JTextField disBox;
    private int s[];
    private int size;
    private int top=-1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 376);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(164, 31, 203, 14);
		contentPane.add(lblNewLabel);
		
		JLabel enterElem = new JLabel(" ");
		enterElem.setFont(new Font("Constantia", Font.BOLD, 12));
		enterElem.setBounds(63, 87, 3, 15);
		contentPane.add(enterElem);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE : ");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(118, 87, 153, 15);
		contentPane.add(lblNewLabel_1);
		
		sizeBox = new JTextField();
		sizeBox.setBounds(271, 82, 96, 20);
		contentPane.add(sizeBox);
		sizeBox.setColumns(10);
		
		JButton createStack = new JButton("Create Stack");
		createStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR SIZE OF STACK
				size = Integer.valueOf(sizeBox.getText());
				s = new int[size];
				String msg = "stack size"+ size +" is created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		createStack.setForeground(new Color(248, 248, 255));
		createStack.setFont(new Font("Constantia", Font.BOLD, 13));
		createStack.setBackground(new Color(47, 79, 79));
		createStack.setBounds(164, 113, 145, 23);
		contentPane.add(createStack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_2.setForeground(new Color(210, 105, 30));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setBounds(36, 151, 151, 17);
		contentPane.add(lblNewLabel_2);
		
		elemBox = new JTextField();
		elemBox.setBounds(198, 147, 96, 20);
		contentPane.add(elemBox);
		elemBox.setColumns(10);
		
		disBox = new JTextField();
		disBox.setBounds(80, 283, 378, 34);
		contentPane.add(disBox);
		disBox.setColumns(10);
		
		JButton btnNewButton = new JButton("PUSH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR PUSH AN ELEMENT
			
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "stack is full");
				}
				else {
				int ele = Integer.valueOf(elemBox.getText());
				++top;
				s[top] = ele;
				JOptionPane.showMessageDialog(contentPane, "push successfull");
				elemBox.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton.setBounds(308, 146, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR POP 
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "stack is empty");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, " deleted element "+ s[top]);
                     top--;
				}
			}
		});
		btnPop.setFont(new Font("Constantia", Font.BOLD, 13));
		btnPop.setBounds(208, 188, 89, 23);
		contentPane.add(btnPop);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR DISPLAYING AN ELEMENTS
				String msg = "";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "stack is empty");
				}
				else {
					for(int i=top;i>=0;i--) {
						msg = msg+" "+s[i];
					}
					
					disBox.setText(msg);
			}
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 13));
		btnDisplay.setBounds(208, 236, 101, 23);
		contentPane.add(btnDisplay);
	}
}
