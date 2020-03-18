package class10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JButton result;
	private JTextField first, second, output;
	private JComboBox operations;

	public Calculator() {
		createComponents();
		addComponents();
		addListeners();
		makeVisible();

	}

	private void makeVisible() {
		this.setSize(400, 400);
		this.setVisible(true);

	}

	private void addListeners() {
		result.addActionListener((ActionEvent ae) -> performOperationAndTrapException());

	}

	private void performOperationAndTrapException() {
		try {
			performOperation();
		} catch (Exception e) {
			String message = e.getMessage();
			JOptionPane.showMessageDialog(this, message);
		}
	}

	private void performOperation() {
		Integer x = Integer.parseInt(first.getText());
		int y = Integer.parseInt(second.getText());
		String op = (String) operations.getSelectedItem();
		if (op.equals("+")) {
			output.setText((x + y) + "");
		}
		if (op.equals("-")) {
			output.setText((x - y) + "");
		}
		if (op.equals("x")) {
			output.setText((x * y) + "");
		}
		if (op.equals("/")) {
			output.setText((x / y) + "");
		}
	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(first);
		con.add(operations);
		con.add(second);
		con.add(result);
		con.add(output);

	}

	private void createComponents() {
		result = new JButton("=");
		first = new JTextField(10);
		second = new JTextField(10);
		output = new JTextField(10);
		operations = new JComboBox(new String[] { "+", "-", "x", "/" });

	}

	public static void main(String[] args) {
		new Calculator();

	}

}
