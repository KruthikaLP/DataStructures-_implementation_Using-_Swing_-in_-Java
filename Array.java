import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel deletePosition;
	private JTextField sizeBox;
	private JTextField enterBox;
	private JTextField positionBox;
	private JTextField deleteBox;
	private JTextField displayTextBox;
    private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 340);
		deletePosition = new JPanel();
		deletePosition.setBackground(SystemColor.info);
		deletePosition.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(deletePosition);
		deletePosition.setLayout(null);
		
		JLabel arrayds = new JLabel("ARRAY DATA STRUCTURE");
		arrayds.setBackground(Color.PINK);
		arrayds.setFont(new Font("Algerian", Font.BOLD, 14));
		arrayds.setForeground(new Color(0, 0, 0));
		arrayds.setVerticalAlignment(SwingConstants.TOP);
		arrayds.setBounds(197, 21, 198, 19);
		deletePosition.add(arrayds);
		
		JLabel arraySize = new JLabel("ENTER ARRAY LENGTH : ");
		arraySize.setForeground(Color.RED);
		arraySize.setFont(new Font("Constantia", Font.BOLD, 12));
		arraySize.setBounds(129, 73, 160, 17);
		deletePosition.add(arraySize);
		
		sizeBox = new JTextField();
		sizeBox.setBounds(274, 69, 96, 20);
		deletePosition.add(sizeBox);
		sizeBox.setColumns(10);
		
		JLabel enterElement = new JLabel("ENTER AN INTEGER ELEMENT : ");
		enterElement.setBackground(SystemColor.info);
		enterElement.setForeground(new Color(102, 0, 255));
		enterElement.setFont(new Font("Constantia", Font.BOLD, 12));
		enterElement.setBounds(27, 152, 184, 15);
		deletePosition.add(enterElement);
		
		JButton createButton = new JButton("CREATE ARRAY");
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR CREATING AN ARRAY
				
				int len = Integer.valueOf(sizeBox.getText());
				arr = new int[len];
				String msg = "Araay size is  "+len+" is created";
				JOptionPane.showMessageDialog(getContentPane(),msg );
			}
		});
		createButton.setBackground(new Color(51, 102, 0));
		createButton.setForeground(new Color(255, 255, 255));
		createButton.setFont(new Font("Constantia", Font.BOLD, 13));
		createButton.setBounds(217, 100, 142, 25);
		deletePosition.add(createButton);
		
		enterBox = new JTextField();
		enterBox.setColumns(10);
		enterBox.setBounds(221, 147, 53, 20);
		deletePosition.add(enterBox);
		
		positionBox = new JTextField();
		positionBox.setColumns(10);
		positionBox.setBounds(366, 147, 53, 20);
		deletePosition.add(positionBox);
		
		JLabel position = new JLabel("POSITION :");
		position.setForeground(new Color(153, 51, 102));
		position.setFont(new Font("Constantia", Font.BOLD, 13));
		position.setBackground(SystemColor.info);
		position.setBounds(284, 151, 75, 17);
		deletePosition.add(position);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR INSERTION
				
				int ele = Integer.valueOf(enterBox.getText());
				int pos = Integer.valueOf(positionBox.getText());
				arr[pos] = ele;
				String msg = "element "+ele+" inserted @ position "+ pos ;
				JOptionPane.showMessageDialog(getContentPane(), msg);
				enterBox.setText("");
				positionBox.setText("");
			}
		});
		btnSubmit.setForeground(new Color(102, 51, 102));
		btnSubmit.setFont(new Font("Constantia", Font.BOLD, 13));
		btnSubmit.setBounds(429, 147, 106, 25);
		deletePosition.add(btnSubmit);
		
		JLabel deleteposition = new JLabel("ENTER THE POSITION : ");
		deleteposition.setForeground(new Color(51, 51, 0));
		deleteposition.setFont(new Font("Constantia", Font.BOLD, 12));
		deleteposition.setBackground(SystemColor.info);
		deleteposition.setBounds(77, 194, 184, 15);
		deletePosition.add(deleteposition);
		
		deleteBox = new JTextField();
		deleteBox.setColumns(10);
		deleteBox.setBounds(217, 189, 75, 20);
		deletePosition.add(deleteBox);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 CODE FOR DELETION
			    int delPos = Integer.valueOf(deleteBox.getText());
			    arr[delPos] = 0;
			    String msg = "element "+delPos+" is delete";
			    JOptionPane.showMessageDialog(getContentPane(), msg);
			    deleteBox.setText("");
			}
		});
		btnDelete.setForeground(new Color(102, 51, 102));
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 13));
		btnDelete.setBounds(302, 189, 93, 25);
		deletePosition.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAY
				String msg = " ";
				for(int i=0;i<arr.length;i++) {
					msg = msg + " " +arr[i];
				}
				displayTextBox.setText(msg);
				JOptionPane.showMessageDialog(getContentPane(),msg);
			}
		});
		btnDisplay.setForeground(new Color(102, 51, 102));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 13));
		btnDisplay.setBounds(211, 220, 111, 25);
		deletePosition.add(btnDisplay);
		
		displayTextBox = new JTextField();
		displayTextBox.setColumns(10);
		displayTextBox.setBounds(55, 256, 419, 36);
		deletePosition.add(displayTextBox);
	}
}
