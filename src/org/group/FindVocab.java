package org.group;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FindVocab extends JPanel {
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FindVocab() {
		setPreferredSize(new Dimension(540, 585));
		setLayout(null);
		
		JLabel lblKeyWord = new JLabel("key word");
		lblKeyWord.setBounds(10, 26, 56, 16);
		add(lblKeyWord);
		
		textField = new JTextField();
		textField.setBounds(96, 23, 245, 22);
		add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 70, 516, 138);
		add(table);
		
		Form form = new Form();
		JScrollPane scrollPane = new JScrollPane(form);
		scrollPane.setBounds(0, 221, 540, 585);
		add(scrollPane);
//		scrollPane.setViewportView(form);
		

	}
}
