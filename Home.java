import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES");
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(156, 11, 143, 21);
		contentPane.add(lblNewLabel);
		
		JButton stack = new JButton("STACK");
		stack.setBackground(new Color(240, 240, 240));
		stack.setFont(new Font("Constantia", Font.BOLD, 13));
		stack.setForeground(new Color(0, 0, 139));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PLACE STACK WINDOW OPENING CODE HERE
                 new Stack().setVisible(true);
			}
		});
		stack.setBounds(28, 105, 97, 25);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PLACE QUEUE WINDOW OPENING CODE HERE
                 new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(255, 51, 204));
		queue.setFont(new Font("Constantia", Font.BOLD, 13));
		queue.setBounds(309, 105, 88, 25);
		contentPane.add(queue);
		
		JButton doublylinkedlist = new JButton("DOUBLY LINKEDLIST");
		doublylinkedlist.setForeground(new Color(0, 102, 102));
		doublylinkedlist.setFont(new Font("Constantia", Font.BOLD, 13));
		doublylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PLACE DOUBLYLINKEDLIST WINDOW OPENING CODE HERE
                new DoublyLinkedList().setVisible(true);
			}
		});
		doublylinkedlist.setBounds(138, 229, 191, 25);
		contentPane.add(doublylinkedlist);
		
		JButton linkedlist = new JButton("SINGLYLINKEDLIST");
		linkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PLACE SINGLYLINKEDLIST WINDOW OPENING CODE HERE
                new SinglyLinkedList().setVisible(true);
			}
		});
		linkedlist.setForeground(new Color(51, 0, 51));
		linkedlist.setFont(new Font("Constantia", Font.BOLD, 13));
		linkedlist.setBounds(257, 165, 169, 25);
		contentPane.add(linkedlist);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PLACE ARRAY WINDOW OPENING CODE HERE
				
//				Array a =new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
				
			}
		});
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 13));
		array.setBounds(171, 67, 94, 25);
		contentPane.add(array);
		
		JButton circularqueue = new JButton("CIRCLUAR QUEUE");
		circularqueue.setForeground(new Color(47, 79, 79));
		circularqueue.setFont(new Font("Constantia", Font.BOLD, 13));
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PLACE CIRCULARQUEUE WINDOW OPENING CODE HERE
                new CircularQueue().setVisible(true);
			}
		});
		circularqueue.setBounds(28, 165, 166, 25);
		contentPane.add(circularqueue);
	}
}
