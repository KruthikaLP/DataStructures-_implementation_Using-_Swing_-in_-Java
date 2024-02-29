import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizeBox;
	private JTextField eleBox;
	private JTextField disBox;
    private int cq[];
    private int size;
    private int front = 0;
    private int rear  = -1;
    private int count = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 424);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setBounds(150, 32, 291, 14);
		contentPane.add(lblNewLabel);
		
		JLabel enter = new JLabel("ENTER THE SIZE OF CIRCULARQUEUE");
		enter.setFont(new Font("Constantia", Font.BOLD, 13));
		enter.setBounds(69, 98, 285, 14);
		contentPane.add(enter);
		
		sizeBox = new JTextField();
		sizeBox.setBounds(321, 93, 140, 20);
		contentPane.add(sizeBox);
		sizeBox.setColumns(10);
		
		eleBox = new JTextField();
		eleBox.setColumns(10);
		eleBox.setBounds(252, 190, 140, 20);
		contentPane.add(eleBox);
		
		JButton btnNewButton = new JButton("CREATE CIRCULARQUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(sizeBox.getText());
				cq = new int[size];
				JOptionPane.showMessageDialog(contentPane, "size of circular queue is "+size);
			}
		});
		btnNewButton.setBounds(182, 133, 208, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement.setFont(new Font("Constantia", Font.BOLD, 13));
		lblEnterTheElement.setBounds(89, 195, 161, 14);
		contentPane.add(lblEnterTheElement);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "size is full");
				}
				else {
				int ele = Integer.valueOf(eleBox.getText());
			    rear = (rear+1)%size;
				cq[rear]= ele;
				count++;
				JOptionPane.showMessageDialog(contentPane, "element "+ele+"is inserted ");
				eleBox.setText("");
				}
			}
		});
		btnInsert.setBounds(430, 189, 112, 23);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "size is empty");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "element is deleted "+cq[front]);
					front = (front+1)%size;
					--count;
				}
			}
		});
		btnDelete.setBounds(252, 248, 112, 23);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "size is empty");
				}
				else {
					int front1 = front;
					for(int i=0;i<count;i++) {
						msg = msg+" "+cq[front1];
						front1 = (front1+1)%size;
					}
					disBox.setText(msg);
				}
			}
		});
		btnDisplay.setBounds(252, 292, 112, 23);
		contentPane.add(btnDisplay);
		
		disBox = new JTextField();
		disBox.setColumns(10);
		disBox.setBounds(69, 326, 473, 39);
		contentPane.add(disBox);
	}

}
