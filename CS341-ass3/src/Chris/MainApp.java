package Chris;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class MainApp.
 *
 * @author Chris
 * @version 1.0
 */

public class MainApp {

	/** The frame. */
	private JFrame frame;
	
	/** The text field. */
	private JTextField textField;
	
	/** The text field 1. */
	private JTextField textField_1;
	
	/** The text field 2. */
	private JTextField textField_2;
	
	/** The text field 3. */
	private JTextField textField_3;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * 
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shopping List ");
		lblNewLabel.setFont(new Font("Papyrus", Font.PLAIN, 19));
		lblNewLabel.setBounds(151, 11, 137, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Items:");
		lblNewLabel_1.setFont(new Font("Tarzan", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(67, 43, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(126, 41, 209, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Price:  $");
		lblNewLabel_2.setFont(new Font("Tarzan", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(67, 68, 59, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 66, 99, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity:");
		lblNewLabel_3.setFont(new Font("Tarzan", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(48, 93, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 91, 99, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 122, 336, 81);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setColumns(3);
		textArea.setWrapStyleWord(true);

		
		
		
		JButton btnNewButton = new JButton("Add Item");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * mouse event for when button is clicked 
			 * 
			 * 
			 */
			public void mouseClicked(MouseEvent e) {
				String item = textField.getText();
				String price = textField_1.getText();
				String amount = textField_1.getText();
				SaleSlip.addToList(item, price, amount);
				ArrayList<String> foodList = new ArrayList<String>(SaleSlip.getList());
				String prList ="";
				//checks if inputs are valid
				if(SaleSlip.isValid() == false) {
					textArea.setText("One of the 3 inputs is invalid please enter a word with no numbers and 2 numbers");
				}else {
					int count = 0;
					for (String str: foodList) {
						prList += str + "\t";
						count++;
						if(count == 3) {
							prList += "\n";
							count = 0;
						}
						textArea.setText(prList);
						textField_3.setText(String.valueOf(SaleSlip.getTotal()));
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tarzan", Font.PLAIN, 11));
		btnNewButton.setBounds(294, 90, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Total:");
		lblNewLabel_4.setFont(new Font("Tarzan", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(132, 214, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 212, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
