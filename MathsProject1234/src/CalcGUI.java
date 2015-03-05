
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;
public class CalcGUI extends JFrame implements ActionListener {
	//declare all variables for the gui buttons
//	JTextField text;
	JTextArea text;
	double temp,temp1,result,a;
	static double m1, m2;
	int k = 1, x = 0, y = 0, z = 0;
	char ch;
	JButton cosh,tanh,fact,inv,sin,cos,tan,log,exp,sqroot,ans,xpowy,expo,zero,one,two,three,four,five,six,seven,eight,nine,equals,plus,minus,mul,div,clr;
	JButton sinh,loge,dot,xsq,cbroot,equal,deg,rad;
	Container c;
	JPanel txt,op;
	CalcGUI(){
		//GUI layout
		c=getContentPane();
		c.setLayout(new BorderLayout());
		txt=new JPanel();
		text = new JTextArea(10,10);//text=new JTextField(100);
		text.setPreferredSize(new Dimension(120,100));
		op=new JPanel();
		fact=new JButton("x!");
		op.add(fact);
		fact.addActionListener(this);
		loge=new JButton("log e");
		op.add(loge);
		loge.addActionListener(this);
		rad=new JButton("rad");
		op.add(rad);
		rad.addActionListener(this);
		clr=new JButton("AC");
		op.add(clr);
		clr.addActionListener(this);
		inv=new JButton("1/x");
		op.add(inv);
		inv.addActionListener(this);
		sin=new JButton("sin");
		op.add(sin);
		sin.addActionListener(this);
		seven=new JButton("7");
		op.add(seven);
		seven.addActionListener(this);
		eight=new JButton("8");
		op.add(eight);
		eight.addActionListener(this);
		nine=new JButton("9");
		op.add(nine);
		nine.addActionListener(this);
		xpowy=new JButton("^");
		op.add(xpowy);
		xpowy.addActionListener(this);
		deg=new JButton("deg");
		op.add(deg);
		deg.addActionListener(this);
		four=new JButton("4");
		op.add(four);
		four.addActionListener(this);
		five=new JButton("5");
		op.add(five);
		five.addActionListener(this);
		six=new JButton("6");
		op.add(six);
		six.addActionListener(this);
		log=new JButton("log");
		op.add(log);
		log.addActionListener(this);
		cos=new JButton("cos");
		op.add(cos);
		cos.addActionListener(this);
		three=new JButton("3");
		op.add(three);
		three.addActionListener(this);
		two=new JButton("2");
		op.add(two);
		two.addActionListener(this);
		one=new JButton("1");
		op.add(one);
		one.addActionListener(this);
		sqroot=new JButton("sqrt");
		op.add(sqroot);
		sqroot.addActionListener(this);
		tan=new JButton("tan");
		op.add(tan);
		tan.addActionListener(this);
		zero=new JButton("0");
		op.add(zero);
		zero.addActionListener(this);
		minus=new JButton("-");
		op.add(minus);
		minus.addActionListener(this);
		div=new JButton("/");
		op.add(div);
		div.addActionListener(this);
		xsq=new JButton("x^2");
		op.add(xsq);
		xsq.addActionListener(this);
		cbroot=new JButton("x^3");
		op.add(cbroot);
		cbroot.addActionListener(this);
		mul=new JButton("*");
		op.add(mul);
		mul.addActionListener(this);
		plus=new JButton("+");
		op.add(plus);
		plus.addActionListener(this);
		equal=new JButton("=");
		op.add(equal);
		equal.addActionListener(this);
		dot=new JButton(".");
		op.add(dot);
		dot.addActionListener(this);
		add(txt);
		c.add("North",text);
		c.add("Center",op);
		//text.setHorizontalAlignment(SwingConstants.RIGHT);
		op.setLayout(new GridLayout(6,5,4,4));
		setTitle("Calculator Project");
		setSize(450,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {//actions for all buttons
		String s=e.getActionCommand();
		if (s.equals("1")) {
			if (z == 0) {
				text.setText(text.getText() + "1");
			} else {
				text.setText("");
				text.setText(text.getText() + "1");
				z = 0;
			}
		}
		if (s.equals("2")) {
			if (z == 0) {
				text.setText(text.getText() + "2");
			} else {
				text.setText("");
				text.setText(text.getText() + "2");
				z = 0;
			}
		}
		if (s.equals("3")) {
			if (z == 0) {
				text.setText(text.getText() + "3");
			} else {
				text.setText("");
				text.setText(text.getText() + "3");
				z = 0;
			}
		}
		if (s.equals("4")) {
			if (z == 0) {
				text.setText(text.getText() + "4");
			} else {
				text.setText("");
				text.setText(text.getText() + "4");
				z = 0;
			}
		}
		if (s.equals("5")) {
			if (z == 0) {
				text.setText(text.getText() + "5");
			} else {
				text.setText("");
				text.setText(text.getText() + "5");
				z = 0;
			}
		}
		if (s.equals("6")) {
			if (z == 0) {
				text.setText(text.getText() + "6");
			} else {
				text.setText("");
				text.setText(text.getText() + "6");
				z = 0;
			}
		}
		if (s.equals("7")) {
			if (z == 0) {
				text.setText(text.getText() + "7");
			} else {
				text.setText("");
				text.setText(text.getText() + "7");
				z = 0;
			}
		}
		if (s.equals("8")) {
			if (z == 0) {
				text.setText(text.getText() + "8");
			} else {
				text.setText("");
				text.setText(text.getText() + "8");
				z = 0;
			}
		}
		if (s.equals("9")) {
			if (z == 0) {
				text.setText(text.getText() + "9");
			} else {
				text.setText("");
				text.setText(text.getText() + "9");
				z = 0;
			}
		}
		if (s.equals("0")) {
			if (z == 0) {
				text.setText(text.getText() + "0");
			} else {
				text.setText("");
				text.setText(text.getText() + "0");
				z = 0;
			}
		}
		if (s.equals("AC")) {//clears the textfield
			text.setText("");
			x = 0;
			y = 0;
			z = 0;
		}
		if (s.equals("log")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.log10(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("log e")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.log(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("deg")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.toDegrees(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("rad")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.toRadians(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("1/x")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = 1 / Double.parseDouble(text.getText());
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("x^2")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.pow(Double.parseDouble(text.getText()), 2);
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("x^3")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.pow(Double.parseDouble(text.getText()), 3);
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals(".")) {
			if (y == 0) {
				text.setText(text.getText() + ".");
				y = 1;
			} else {
				text.setText(text.getText());
			}
		}
		if (s.equals("+")) {
			if (text.getText().equals("")) {
				text.setText("");
				temp = 0;
				ch = '+';
			} else {
				temp = Double.parseDouble(text.getText());
				text.setText("");
				ch = '+';
				y = 0;
				x = 0;
			}
		}
		if (s.equals("-")) {
			if (text.getText().equals("")) {
				text.setText("");
				temp = 0;
				ch = '-';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(text.getText());
				text.setText("");
				ch = '-';
			}
			text.requestFocus();
		}
		if (s.equals("/")) {
			if (text.getText().equals("")) {
				text.setText("");
				temp = 1;
				ch = '/';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(text.getText());
				ch = '/';
				text.setText("");
			}
			text.requestFocus();
		}
		if (s.equals("*")) {
			if (text.getText().equals("")) {
				text.setText("");
				temp = 1;
				ch = '*';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(text.getText());
				ch = '*';
				text.setText("");
			}
			text.requestFocus();
		}
		if (s.equals("^")) {
			if (text.getText().equals("")) {
				text.setText("");
				temp = 1;
				ch = '^';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(text.getText());
				ch = '^';
				text.setText("");
			}
			text.requestFocus();
		}

		if (s.equals("sqrt")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.sqrt(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("sin")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.sin(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("cos")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.cos(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("tan")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = Math.tan(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		if (s.equals("=")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				temp1 = Double.parseDouble(text.getText());
				switch (ch) {
					case '+':
						result = temp + temp1;
						break;
					case '-':
						result = temp - temp1;
						break;
					case '/':
						result = temp / temp1;
						break;
					case '*':
						result = temp * temp1;
						break;
					case '^':
						result=Math.pow(temp,temp1);
						break;
				}
				text.setText("");
				text.setText(text.getText() + result);
				z = 1;
			}
		}
		if (s.equals("x!")) {
			if (text.getText().equals("")) {
				text.setText("");
			} else {
				a = fact(Double.parseDouble(text.getText()));
				text.setText("");
				text.setText(text.getText() + a);
			}
		}
		text.requestFocus();
	}
	
	double fact(double x){
		int i;
		double s=1;
		if(x<0){
			return 0;
		}else{	
			for(i=2;i<=x;i++){
			s*=i;
		}
		return s;
		}
	}
	
	public static void main(String[] args) {
		try	{
			new CalcGUI();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
