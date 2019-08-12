package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonAddNames = new JButton();
	JButton buttonViewNames = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		new GuestBook().createUI();
	}

	void createUI() {
		buttonAddNames.setText("Add Name");
		buttonViewNames.setText("View Names");
		buttonAddNames.addActionListener(this);
		buttonViewNames.addActionListener(this);
		panel.add(buttonAddNames);
		panel.add(buttonViewNames);
		frame.add(panel);
		frame.pack();
		frame.setTitle("Name List");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == buttonAddNames) {
			String nameAdded = JOptionPane.showInputDialog("Input name to add to list.");
			names.add(nameAdded);
		} else {
			for (int i = 0; i < names.size(); i++) {
				int j = i + 1;
				System.out.println("Guest #" + j + " : " + names.get(i));
			}
		}
	}
}
