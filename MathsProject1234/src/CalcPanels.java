import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

import java.util.Arrays;
import java.util.List;


public class CalcPanels {

	private JFrame	frame;
	private JTextField calcInput;
	private JTextField GButton1;
	private JTextField GButton2;
	private JTextField GButton3;
	private JTextField GButton4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcPanels window = new CalcPanels();
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
	public CalcPanels() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 250, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		final JPanel CalcPanel = new JPanel();
		frame.getContentPane().add(CalcPanel, "name_1425429507641098000");
		CalcPanel.setVisible(true);

		final JPanel MatrixPanel = new JPanel();
		frame.getContentPane().add(MatrixPanel, "name_1425429510834620000");
		MatrixPanel.setVisible(false);

		final JPanel GraphPanel = new JPanel();
		frame.getContentPane().add(GraphPanel, "name_1425431516255832000");
		GraphPanel.setLayout(null);
		GraphPanel.setVisible(false);

		JButton CGraphButton = new JButton("Graph");
		CGraphButton.setBounds(237, 5, 100, 30);
		CGraphButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatrixPanel.setVisible(false);
				CalcPanel.setVisible(false);
				GraphPanel.setVisible(true);
			}
		});
		CalcPanel.setLayout(null);
		CalcPanel.add(CGraphButton);

		JButton CMatrixButton = new JButton("Matrix");
		CMatrixButton.setBounds(334, 5, 100, 30);
		CMatrixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatrixPanel.setVisible(true);
				CalcPanel.setVisible(false);
				GraphPanel.setVisible(false);
			}
		});
		CalcPanel.add(CMatrixButton);

		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setBounds(83, 4, 98, 29);
		CalcPanel.add(lblCalculator);

		calcInput = new JTextField();
		calcInput.setBounds(48, 122, 447, 42);
		CalcPanel.add(calcInput);
		calcInput.setColumns(10);

		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 1");

			}
		});
		one.setBounds(215, 176, 65, 65);
		CalcPanel.add(one);

		final JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){ 
				Evaluator ask = new Evaluator(); 
				String question = calcInput.getText();
				if (question.contains("sinr")) {
					question = question.replaceAll("[^0-9]+", " ");
					double output = 0;
					List<String> trouble = (Arrays.asList(question.trim().split(" ")));
					double op1 = Double.parseDouble(trouble.get(0));
					if (trouble.size() == 1) {
						output = (Math.sin((op1)));
					}
					else {
						double op2 = Double.parseDouble(trouble.get(1));
						output = op1 * (Math.sin((op2)));
					}
					calcInput.setText (String.valueOf(output));	
				} else if (question.contains("cosr")) {
					question = question.replaceAll("[^0-9]+", " ");
					double output = 0;
					List<String> trouble = (Arrays.asList(question.trim().split(" ")));
					double op1 = Double.parseDouble(trouble.get(0));
					if (trouble.size() == 1) {
						output = (Math.sin((op1)));
					}
					else {
						double op2 = Double.parseDouble(trouble.get(1));
						output = op1 * (Math.cos((op2)));
					}
					calcInput.setText (String.valueOf(output));	
				} if (question.contains("tanr")) {
					question = question.replaceAll("[^0-9]+", " ");
					double output = 0;
					List<String> trouble = (Arrays.asList(question.trim().split(" ")));
					double op1 = Double.parseDouble(trouble.get(0));
					if (trouble.size() == 1) {
						output = (Math.sin((op1)));
					}
					else {
						double op2 = Double.parseDouble(trouble.get(1));
						output = op1 * (Math.tan((op2)));
					}
					calcInput.setText (String.valueOf(output));	
				} else if (question.contains("sind")) {
					question = question.replaceAll("[^0-9]+", " ");
					double output = 0;
					List<String> trouble = (Arrays.asList(question.trim().split(" ")));
					double op1 = Double.parseDouble(trouble.get(0));
					if (trouble.size() == 1) {
						output = (Math.sin((op1)));
					}
					else {
						double op2 = Double.parseDouble(trouble.get(1));
						output = op1 * (Math.sin((op2)));
					}
					calcInput.setText (String.valueOf(Math.toDegrees(output)));	
				} else if (question.contains("cosd")) {
					question = question.replaceAll("[^0-9]+", " ");
					double output = 0;
					List<String> trouble = (Arrays.asList(question.trim().split(" ")));
					double op1 = Double.parseDouble(trouble.get(0));
					if (trouble.size() == 1) {
						output = (Math.sin((op1)));
					}
					else {
						double op2 = Double.parseDouble(trouble.get(1));
						output = op1 * (Math.cos((op2)));
					}
					calcInput.setText (String.valueOf(Math.toDegrees(output)));	
				} else if (question.contains("tand")) {
					question = question.replaceAll("[^0-9]+", " ");
					double output = 0;
					List<String> trouble = (Arrays.asList(question.trim().split(" ")));
					double op1 = Double.parseDouble(trouble.get(0));
					if (trouble.size() == 1) {
						output = (Math.sin((op1)));
					}
					else {
						double op2 = Double.parseDouble(trouble.get(1));
						output = op1 * (Math.tan((op2)));
					}
					calcInput.setText (String.valueOf(Math.toDegrees(output)));	
				}

				else {
					System.out.println("hi1");									//ND
					double answer = Evaluator.shunting(0, question);			//ND
					System.out.println("answer is " + answer);					//ND
					List<String> list = Arrays.asList(question.split(" "));
					String [] num = ask.infixToRPN(list); 
					String asString = Arrays.toString(num);
					//String answerNew = Double.toString(num); 
					calcInput.setText(asString + " == " + answer);				//ND
				}
			} 

		});
		btnCalculate.setBounds(500, 123, 117, 41);
		CalcPanel.add(btnCalculate);

		//		JRadioButton rdbtnRadians = new JRadioButton("Radians");
		//		rdbtnRadians.setBounds(83, 42, 141, 23);
		//		CalcPanel.add(rdbtnRadians);
		//
		//		JRadioButton rdbtnDegrees = new JRadioButton("Degrees");
		//		rdbtnDegrees.setBounds(83, 77, 141, 23);
		//		CalcPanel.add(rdbtnDegrees);

		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 2");

			}
		});
		two.setBounds(292, 176, 65, 65);
		CalcPanel.add(two);

		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 3");

			}
		});
		three.setBounds(369, 176, 65, 65);
		CalcPanel.add(three);

		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 4");
			}
		});
		four.setBounds(215, 253, 65, 65);
		CalcPanel.add(four);

		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 5");
			}
		});
		five.setBounds(292, 253, 65, 65);
		CalcPanel.add(five);

		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 6");
			}
		});
		six.setBounds(369, 253, 65, 65);
		CalcPanel.add(six);

		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 7");
			}
		});
		seven.setBounds(215, 330, 65, 65);
		CalcPanel.add(seven);

		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 8");
			}
		});
		eight.setBounds(292, 330, 65, 65);
		CalcPanel.add(eight);

		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 9");
			}
		});
		nine.setBounds(369, 330, 65, 65);
		CalcPanel.add(nine);

		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " 0");
			}
		});
		zero.setBounds(292, 406, 65, 65);
		CalcPanel.add(zero);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(" ");
			}
		});
		zero.setBounds(292, 407, 65, 65);

		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " +");
			}
		});
		add.setBounds(446, 176, 65, 65);
		CalcPanel.add(add);

		JButton subtract = new JButton("-");
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " -");
			}
		});
		subtract.setBounds(446, 253, 65, 65);
		CalcPanel.add(subtract);

		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " *");
			}
		});
		multiply.setBounds(446, 330, 65, 65);
		CalcPanel.add(multiply);

		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + " /");
			}
		});
		divide.setBounds(446, 407, 65, 65);
		CalcPanel.add(divide);

		JButton acButton = new JButton("AC");
		acButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcInput.setText(" ");
			}
		});
		acButton.setBounds(521, 176, 65, 65);
		CalcPanel.add(acButton);

		JButton sindButton = new JButton("sind");
		sindButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + "sind");
			}
		});
		sindButton.setBounds(140, 175, 65, 65);
		CalcPanel.add(sindButton);

		JButton cosrButton = new JButton("cosr");
		cosrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + "cosr");
			}
		});
		cosrButton.setBounds(63, 253, 65, 65);
		CalcPanel.add(cosrButton);

		JButton sinrButton = new JButton("sinr");
		sinrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + "sinr");
			}
		});
		sinrButton.setBounds(63, 175, 65, 65);
		CalcPanel.add(sinrButton);

		JButton cosdButton = new JButton("cosd");
		cosdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + "cosd");
			}
		});
		cosdButton.setBounds(140, 253, 65, 65);
		CalcPanel.add(cosdButton);

		JButton tanrButton = new JButton("tanr");
		tanrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + "tanr");
			}
		});
		tanrButton.setBounds(63, 330, 65, 65);
		CalcPanel.add(tanrButton);

		JButton RBracketButton = new JButton(")");
		RBracketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcInput.setText(calcInput.getText() + ")");
			}
		});
		RBracketButton.setBounds(369, 406, 65, 65);
		CalcPanel.add(RBracketButton);

		JButton LBracketButton = new JButton("(");
		LBracketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcInput.setText(calcInput.getText() + "(");
			}
		});
		LBracketButton.setBounds(215, 407, 65, 65);
		CalcPanel.add(LBracketButton);


		JButton MCalcButton = new JButton("Calculator");
		MCalcButton.setBounds(237, 5, 108, 30);
		MCalcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcPanel.setVisible(true);
				MatrixPanel.setVisible(false);
				GraphPanel.setVisible(false);			
			}
		});
		MatrixPanel.setLayout(null);
		MatrixPanel.add(MCalcButton);

		JButton MGraphButton = new JButton("Graph");
		MGraphButton.setBounds(349, 5, 100, 30);
		MGraphButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GraphPanel.setVisible(true);
				CalcPanel.setVisible(false);
				MatrixPanel.setVisible(false);
			}
		});
		MatrixPanel.add(MGraphButton);


		final JTextArea matrixA = new JTextArea();
		matrixA.setBounds(107, 60, 150, 150);
		MatrixPanel.add(matrixA);

		final JTextArea matrixB = new JTextArea();
		matrixB.setBounds(321, 60, 150, 150);
		MatrixPanel.add(matrixB);

		final JTextArea matrixAns = new JTextArea();
		matrixAns.setBounds(533, 60, 150, 150);
		MatrixPanel.add(matrixAns);

		JLabel lblMatrix = new JLabel("Matrix");
		lblMatrix.setBounds(107, 10, 61, 16);
		MatrixPanel.add(lblMatrix);

		JButton button = new JButton("Multiply Matrix");
		button.setBounds(221, 283, 139, 29);
		MatrixPanel.add(button);

		JButton button_1 = new JButton("Add Matrix");
		button_1.setBounds(221, 225, 139, 29);
		MatrixPanel.add(button_1);

		JButton button_2 = new JButton("Subtract Matrix");
		button_2.setBounds(221, 254, 139, 29);
		MatrixPanel.add(button_2);

		JButton button_3 = new JButton("Transpose Matrix");
		button_3.setBounds(221, 311, 139, 29);
		MatrixPanel.add(button_3);

		JButton clrMatrixButton = new JButton("Clear");
		clrMatrixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matrixA.setText(" ");
				matrixB.setText(" ");
				matrixAns.setText(" ");
			}
		});
		clrMatrixButton.setBounds(221, 339, 139, 29);
		MatrixPanel.add(clrMatrixButton);

		//		final JButton button_4 = new JButton("Calculate Matrix");
		//		button_4.setBounds(491, 225, 117, 66);
		//		MatrixPanel.add(button_4);

		//multiplication

		button.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){ 
				Evaluator ask = new Evaluator();
				String matrix1 = matrixA.getText();
				String matrix2 = matrixB.getText();
				StringBuilder answer = ask.matrixMult(matrix1, matrix2);
				String answer1 = answer.toString();
				matrixAns.setText(answer1);						
			}
		});

		//addition

		button_1.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){ 
				Evaluator ask = new Evaluator();
				String matrix1 = matrixA.getText();
				String matrix2 = matrixB.getText();
				StringBuilder answer = ask.matrixAdd(matrix1, matrix2);
				String answer1 = answer.toString();
				matrixAns.setText(answer1);						
			}
		});

		//subtraction

		button_2.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){ 
				Evaluator ask = new Evaluator();
				String matrix1 = matrixA.getText();
				String matrix2 = matrixB.getText();
				StringBuilder answer = ask.matrixSubtract(matrix1, matrix2);
				String answer1 = answer.toString();
				matrixAns.setText(answer1);						
			}
		});

		//transposition

		button_3.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){ 
				Evaluator ask = new Evaluator();
				String matrix1 = matrixA.getText();
				StringBuilder answer = ask.matrixTransposition(matrix1);
				String answer1 = answer.toString();
				matrixAns.setText(answer1);						
			}
		});

		JButton GMatrixButton = new JButton("Matrix");
		GMatrixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatrixPanel.setVisible(true);
				CalcPanel.setVisible(false);
				GraphPanel.setVisible(false);
			}
		});
		GMatrixButton.setBounds(336, 5, 100, 30);
		GraphPanel.add(GMatrixButton);

		JButton GCalcButton = new JButton("Calculator");
		GCalcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcPanel.setVisible(true);
				MatrixPanel.setVisible(false);
				GraphPanel.setVisible(false);
			}
		});
		GCalcButton.setBounds(237, 5, 100, 30);
		GraphPanel.add(GCalcButton);

		JLabel lblGraph = new JLabel("Graph");
		lblGraph.setBounds(86, 11, 61, 16);
		GraphPanel.add(lblGraph);

		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.setBounds(199, 292, 117, 29);
		GraphPanel.add(btnNewButton_1);

		GButton1 = new JTextField();
		GButton1.setBounds(86, 77, 170, 94);
		GraphPanel.add(GButton1);
		GButton1.setColumns(10);

		GButton2 = new JTextField();
		GButton2.setColumns(10);
		GButton2.setBounds(266, 77, 170, 94);
		GraphPanel.add(GButton2);

		GButton3 = new JTextField();
		GButton3.setColumns(10);
		GButton3.setBounds(86, 181, 170, 94);
		GraphPanel.add(GButton3);

		GButton4 = new JTextField();
		GButton4.setColumns(10);
		GButton4.setBounds(266, 181, 170, 94);
		GraphPanel.add(GButton4);
	}
}
