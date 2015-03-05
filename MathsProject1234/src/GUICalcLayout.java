import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;


public class GUICalcLayout {

	private JFrame	frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnCalculateMatrix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICalcLayout window = new GUICalcLayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUICalcLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 939, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(750, 128, 117, 29);
		frame.getContentPane().add(btnCalculate);
		
		JRadioButton rdbtnDegrees = new JRadioButton("Degrees");
		rdbtnDegrees.setBounds(130, 39, 141, 23);
		frame.getContentPane().add(rdbtnDegrees);
		
		JRadioButton rdbtnRadians = new JRadioButton("Radians");
		rdbtnRadians.setBounds(130, 74, 141, 23);
		frame.getContentPane().add(rdbtnRadians);
		
		textField = new JTextField();
		textField.setBounds(130, 127, 608, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(65, 200, 117, 27);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(194, 198, 57, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(253, 198, 57, 28);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(310, 198, 57, 28);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(194, 226, 57, 28);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(253, 226, 57, 28);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(310, 226, 57, 28);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(194, 255, 57, 28);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(253, 255, 57, 28);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(310, 255, 57, 28);
		frame.getContentPane().add(textField_9);
		
		JButton btnMultiplyMatrix = new JButton("Multiply Matrix");
		btnMultiplyMatrix.setBounds(228, 353, 139, 29);
		frame.getContentPane().add(btnMultiplyMatrix);
		
		JButton btnAddMatrix = new JButton("Add Matrix");
		btnAddMatrix.setBounds(228, 295, 139, 29);
		frame.getContentPane().add(btnAddMatrix);
		
		JButton btnSubtractMatrix = new JButton("Subtract Matrix");
		btnSubtractMatrix.setBounds(228, 324, 139, 29);
		frame.getContentPane().add(btnSubtractMatrix);
		
		JButton btnTransposeMatrix = new JButton("Transpose Matrix");
		btnTransposeMatrix.setBounds(228, 381, 139, 29);
		frame.getContentPane().add(btnTransposeMatrix);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(497, 198, 57, 28);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(556, 198, 57, 28);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(613, 198, 57, 28);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(497, 226, 57, 28);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(556, 226, 57, 28);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(613, 226, 57, 28);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(497, 255, 57, 28);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(556, 255, 57, 28);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(613, 255, 57, 28);
		frame.getContentPane().add(textField_18);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(379, 200, 106, 27);
		frame.getContentPane().add(comboBox_1);
		
		btnCalculateMatrix = new JButton("Calculate Matrix");
		btnCalculateMatrix.setBounds(65, 344, 117, 66);
		frame.getContentPane().add(btnCalculateMatrix);
	}
}
