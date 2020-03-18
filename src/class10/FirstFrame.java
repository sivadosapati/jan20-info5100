package class10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		final Container con = jframe.getContentPane();
		jframe.setTitle("We are working from home");
		con.setBackground(Color.blue);

		
		con.setLayout(new FlowLayout());
		
		JButton button = new JButton("Click me..");
		con.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color c = con.getBackground();
				if (c == Color.blue) {
					con.setBackground(Color.RED);
				} else {
					con.setBackground(Color.BLUE);
				}
			}

		});

		jframe.setSize(400, 600);
		jframe.setVisible(true);

	}

}
