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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField rearBox;
	private JTextField frontBox;
	private JTextField forwordBox;
	private JTextField reverseBox;
      
	public class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node head;
	Node tail;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKEDLIST DATASTRUCTUE");
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(159, 38, 274, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(97, 98, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		rearBox = new JTextField();
		rearBox.setBounds(260, 93, 107, 20);
		contentPane.add(rearBox);
		rearBox.setColumns(10);
		
		JButton rearButton = new JButton("INSERT REAR");
		rearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR insert REAR 
				int ele = Integer.valueOf(rearBox.getText());
				Node temp = new Node(ele);
				if(head==null) {
					head = temp;
					tail = temp;
				}
				else  {
					Node curr = head;
					while(curr!=null) {
						curr = curr.next;
					}
				     tail.next = temp;
				     temp.prev = tail;
				     tail = temp;
				
				     JOptionPane.showMessageDialog(contentPane, "element "+ ele +" added @ rear");
				     rearBox.setText("");
				}
				
			}
		});
		rearButton.setBounds(378, 92, 121, 23);
		contentPane.add(rearButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(97, 158, 153, 14);
		contentPane.add(lblNewLabel_1_1);
		
		frontBox = new JTextField();
		frontBox.setColumns(10);
		frontBox.setBounds(260, 153, 107, 20);
		contentPane.add(frontBox);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR  insert FRONT
				int ele = Integer.valueOf(frontBox.getText());
				Node temp = new Node(ele);
				if(head==null) {
					head = temp;
					tail = temp;
				}
				else {
					 temp.next = head;
					 head.prev = temp;
					 head = temp;
				     JOptionPane.showMessageDialog(contentPane, "element "+ele +" added @ front");
				     frontBox.setText("");
				}
			}
		});
		btnInsertFront.setBounds(378, 152, 143, 23);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETE REAR
				if(head==null) {
				     JOptionPane.showMessageDialog(contentPane, "delete not possible");
				}
				else if(head.next==null) {
					head=null;
					tail=null;
				     JOptionPane.showMessageDialog(contentPane, "rear element deleted");
				}
				else if(head.next!=null) {
					Node curr = tail;
					tail = tail.prev;
					tail.next = null;
					curr.prev = null;
				     JOptionPane.showMessageDialog(contentPane, " rear element deleted");
				}
			}
		});
		btnDeleteRear.setBounds(260, 208, 121, 23);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(head==null) {
				     JOptionPane.showMessageDialog(contentPane, "delete not possible");
				}
				else if(head.next==null) {
					head=null;
					tail=null;
				     JOptionPane.showMessageDialog(contentPane, " front element deleted");
				}
				else if(head.next!=null) {
					Node curr = head;
					head = head.next;
					head.prev = null;
					curr.next = null;
				    JOptionPane.showMessageDialog(contentPane, " front element deleted");
				}
			}
		});
		btnDeleteFront.setBounds(260, 256, 143, 23);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForword = new JButton("DISPLAY FORWORD");
		btnDisplayForword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR FORWORD DISPLAY
				String msg = "";
				Node curr = head;
				while(curr!=null) {
					msg = msg+" "+curr.data;
					curr = curr.next;
				}
				forwordBox.setText(msg);
			}
		});
		btnDisplayForword.setBounds(53, 307, 166, 23);
		contentPane.add(btnDisplayForword);
		
		JButton btnDisplayBackward = new JButton("DISPLAY BACKWARD");
		btnDisplayBackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR BACKWORD DISPLAY
				String msg = "";
				Node curr = tail;
				while(curr!=null) {
					msg = msg+" "+curr.data;
					curr = curr.prev;
				}
				reverseBox.setText(msg);
			}
		});
		btnDisplayBackward.setBounds(390, 307, 175, 23);
		contentPane.add(btnDisplayBackward);
		
		forwordBox = new JTextField();
		forwordBox.setColumns(10);
		forwordBox.setBounds(38, 341, 210, 42);
		contentPane.add(forwordBox);
		
		reverseBox = new JTextField();
		reverseBox.setColumns(10);
		reverseBox.setBounds(378, 341, 200, 42);
		contentPane.add(reverseBox);
	}
}
