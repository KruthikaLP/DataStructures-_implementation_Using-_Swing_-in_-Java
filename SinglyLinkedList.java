import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField rearBox;
	private JTextField frontBox;
	private JTextField disBox;
	
	
	class Node{
		int data ;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;


	
	private void addFront(int data) {
		Node temp = new Node(data);
		if(head==null) {
			head = temp;
		}
		else {
			temp.next = head;
			head = temp;
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKEDLIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(149, 35, 280, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE  ELEMENT : ");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(92, 117, 155, 14);
		contentPane.add(lblNewLabel_1);
		
		rearBox = new JTextField();
		rearBox.setBounds(257, 114, 96, 20);
		contentPane.add(rearBox);
		rearBox.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(102, 178, 155, 14);
		contentPane.add(lblNewLabel_1_1);
		
		frontBox = new JTextField();
		frontBox.setColumns(10);
		frontBox.setBounds(257, 173, 96, 20);
		contentPane.add(frontBox);
		
		JButton insertRear = new JButton("INSERT REAR");
		insertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR INSERT REAR
				int ele = Integer.valueOf(rearBox.getText());
				Node temp = new Node(ele);
				if(head==null) {
					head =temp;
				}
				else {
					Node curr = head;
					while(curr.next!=null) {
						curr = curr.next;
					}
					curr.next=temp;
					JOptionPane.showMessageDialog(contentPane, "element "+ele +" inserted @rear ");
					rearBox.setText("");
				}
			}
		});
		insertRear.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertRear.setBounds(366, 111, 179, 23);
		contentPane.add(insertRear);
		
		JButton insertFront = new JButton("INSERT FRONT");
		insertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERT FRONT
				int ele = Integer.valueOf(frontBox.getText());
				Node temp = new Node(ele);
				if(head==null) {
					head = temp;
				}
				else {
					temp.next = head;
					head = temp;
				JOptionPane.showMessageDialog(contentPane, "inserted element "+ele+" @ front");
				frontBox.setText("");
				}
			}
		});
		insertFront.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertFront.setBounds(366, 170, 179, 23);
		contentPane.add(insertFront);
		
		JButton deleteRear = new JButton("DELETE REAR");
		deleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETE REAR
				
				if(head==null) {
					JOptionPane.showMessageDialog(contentPane, "no element found");
				}
				else if(head.next==null) {
					head =null;
					JOptionPane.showMessageDialog(contentPane, "rear element deleted");
				}
				else if(head.next!=null) {
					Node curr = head;
					while(curr.next.next!=null) {
						curr = curr.next;
					}
					curr.next=null;
					JOptionPane.showMessageDialog(contentPane, "rear element deleted");
				}
			}
		});
		deleteRear.setFont(new Font("Tahoma", Font.BOLD, 14));
		deleteRear.setBounds(236, 234, 179, 23);
		contentPane.add(deleteRear);
		
		JButton deleteFront = new JButton("DELETE FRONT");
		deleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETE FRONT
				if(head==null) {
					JOptionPane.showMessageDialog(contentPane, "no element found");
				}
				else if(head.next==null) {
					head=null;
					JOptionPane.showMessageDialog(contentPane, "front element deleted");
				}
				else if(head.next!=null) {
					Node curr = head;
					head = head.next;
					curr.next=null;
					JOptionPane.showMessageDialog(contentPane, "front element deleted");
				}
			}
		});
		deleteFront.setFont(new Font("Tahoma", Font.BOLD, 14));
		deleteFront.setBounds(236, 282, 179, 23);
		contentPane.add(deleteFront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAYING AN ELEMENTS
				String msg = "";			
					Node curr = head;
					while(curr.next!=null) {
						msg = msg+" "+curr.data;
						curr = curr.next ;
					}
					disBox.setText(msg);
				
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 14));
		display.setBounds(236, 332, 179, 23);
		contentPane.add(display);
		
		disBox = new JTextField();
		disBox.setColumns(10);
		disBox.setBounds(73, 392, 451, 40);
		contentPane.add(disBox);
	}
}
