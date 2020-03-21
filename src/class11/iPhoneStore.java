package class11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import class6.AppleStore;
import class6.AppleStorePersistenceImpl;
import class6.iPhone;

public class iPhoneStore extends JFrame {

	private JButton buy, stock, rtn;

	private AppleStore appleStore;

	private JTable table;

	private iPhoneModel model;

	public iPhoneStore() {
		create();
		addComponents();
		setListeners();
		makeItVisible();
	}

	private void makeItVisible() {
		setSize(500, 500);
		setVisible(true);

	}

	private void setListeners() {
		buy.addActionListener((ActionEvent ae) -> performBuy());
		stock.addActionListener((ae) -> performStock());
		rtn.addActionListener((ae) -> performReturn());

	}

	private void performBuy() {
		iPhone p = appleStore.buyPhone();
		JOptionPane.showMessageDialog(this, "Phone -> " + p + " is bought by the customer");
		table.updateUI();
	}

	private void performStock() {
		appleStore.addPhones(3);
		table.updateUI();
	}

	private void performAction(ActionEvent ae) {
		if (ae.getSource() == buy) {
			performBuy();
		}
		if (ae.getSource() == stock) {
			performStock();
		}
		if (ae.getSource() == rtn) {
			performReturn();
		}

	}

	private void performReturn() {
		appleStore.returnPhone(iPhone.makePhone(appleStore.getNumberOfPhones() + 1));
		table.updateUI();

	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		JPanel panel = new JPanel();// Default layout for Panel is Flow Layout..
		panel.add(buy);
		panel.add(stock);
		panel.add(rtn);

		con.add(panel, "North");

		JScrollPane jsp = new JScrollPane(table);

		con.add(jsp, "Center");
		// con.add(table, "Center");

	}

	private void create() {
		buy = new JButton("Buy");
		stock = new JButton("Stock");
		rtn = new JButton("Return");

		appleStore = new AppleStorePersistenceImpl();
		model = new iPhoneModel(appleStore);

		table = new JTable(model);

	}

	public static void main(String[] args) {
		new iPhoneStore();
	}

}

class iPhoneModel implements TableModel {

	private AppleStore appleStore;

	public iPhoneModel(AppleStore as) {
		this.appleStore = as;
	}

	@Override
	public int getRowCount() {
		return appleStore.getNumberOfPhones();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Phone Number";
		}
		return "Price";
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		if (columnIndex == 0) {
			return String.class;
		}
		return Double.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		iPhone p = appleStore.getPhones()[rowIndex];
		if (columnIndex == 0) {
			return p.number;
		}
		return p.price;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
