import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField eleSize;
	private JTextField enterElem;
	private JTextField disElem;
	private int q[];
	private int size;
	private int front=0;
    private int rear=-1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(205, 35, 198, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE QUEUE SIZE : ");
		lblNewLabel_1.setForeground(new Color(106, 90, 205));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(120, 95, 177, 17);
		contentPane.add(lblNewLabel_1);
		
		eleSize = new JTextField();
		eleSize.setBounds(291, 91, 143, 20);
		contentPane.add(eleSize);
		eleSize.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR SIZE OF A QUEUE
				
				size = Integer.valueOf(eleSize.getText());
				q = new int[size];
				JOptionPane.showMessageDialog(contentPane, "Queue size is "+ size +" is created");
			}
		});
		btnNewButton.setFont(new Font("SimSun", Font.BOLD, 13));
		btnNewButton.setBounds(269, 131, 126, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setBounds(120, 190, 165, 14);
		contentPane.add(lblNewLabel_2);
		
		enterElem = new JTextField();
		enterElem.setColumns(10);
		enterElem.setBounds(269, 185, 126, 20);
		contentPane.add(enterElem);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERTING A QUEUE
				if(rear==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Queue size is full");
				}
				else {
				int ele = Integer.valueOf(enterElem.getText());
				++rear;
                q[rear] = ele;
				JOptionPane.showMessageDialog(contentPane, "Queue "+ele+" is inserted");
				enterElem.setText("");
				}
			}
		});
		btnInsert.setFont(new Font("SimSun", Font.BOLD, 13));
		btnInsert.setBounds(405, 184, 126, 23);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETING A QUEUE
				if(rear==-1&&front>rear) {
					JOptionPane.showMessageDialog(contentPane, "Queue is empty");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Queue "+q[front]+" is deleted");
					++front;
				}
			}
		});
		btnDelete.setFont(new Font("SimSun", Font.BOLD, 13));
		btnDelete.setBounds(269, 238, 126, 23);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAYING A QUEUE
				String msg="";
				if(rear==-1&&front>rear) {
					JOptionPane.showMessageDialog(contentPane, "Queue is empty");	
				}
				else {
					for(int i=front;i<=rear;i++) {
						msg = msg + " "+ q[i];
					}
					disElem.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("SimSun", Font.BOLD, 13));
		btnDisplay.setBounds(269, 285, 126, 23);
		contentPane.add(btnDisplay);
		
		disElem = new JTextField();
		disElem.setColumns(10);
		disElem.setBounds(105, 334, 388, 20);
		contentPane.add(disElem);
	}
}
