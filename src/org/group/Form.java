package org.group;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.Rectangle;

public class Form extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Form() {
		setPreferredSize(new Dimension(540, 585));
		
		JLabel lblHashtag = new JLabel("hashtag");
		lblHashtag.setBounds(58, 42, 61, 19);
		lblHashtag.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setBounds(164, 42, 265, 22);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("vocabulary");
		lblNewLabel.setBounds(58, 84, 70, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 82, 265, 22);
		textField_1.setColumns(10);
		
		JLabel lblTuLoai = new JLabel("tu loai");
		lblTuLoai.setBounds(58, 123, 61, 19);
		lblTuLoai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnNoun = new JRadioButton("noun");
		rdbtnNoun.setBounds(164, 121, 57, 25);
		
		JRadioButton rdbtnVerb = new JRadioButton("verb");
		rdbtnVerb.setBounds(221, 121, 53, 25);
		
		JRadioButton rdbtnAdj = new JRadioButton("adj");
		rdbtnAdj.setBounds(274, 121, 47, 25);
		
		JRadioButton rdbtnOther = new JRadioButton("adv");
		rdbtnOther.setBounds(321, 121, 49, 25);
		
		JLabel lblPhienAm = new JLabel("phien am");
		lblPhienAm.setBounds(58, 164, 61, 19);
		lblPhienAm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 165, 265, 22);
		textField_2.setColumns(10);
		
		JLabel lblNghia = new JLabel("nghia");
		lblNghia.setBounds(58, 204, 61, 19);
		lblNghia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(164, 205, 265, 79);
		
		JButton btnChonAnh = new JButton("Chon hinh anh");
		btnChonAnh.setBounds(164, 493, 123, 25);
		
		JButton btnAmThan = new JButton("Chon am thanh");
		btnAmThan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAmThan.setBounds(306, 493, 123, 25);
		
		JLabel lblGoiNho = new JLabel("goi nho");
		lblGoiNho.setBounds(58, 314, 61, 19);
		lblGoiNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(164, 314, 265, 127);
		setLayout(null);
		
		JRadioButton rdbtnOther_1 = new JRadioButton("other");
		rdbtnOther_1.setBounds(370, 121, 59, 25);
		add(rdbtnOther_1);
		add(lblHashtag);
		add(textField);
		add(lblNghia);
		add(lblGoiNho);
		add(textPane_1);
		add(btnChonAnh);
		add(btnAmThan);
		add(lblTuLoai);
		add(rdbtnNoun);
		add(rdbtnVerb);
		add(rdbtnAdj);
		add(rdbtnOther);
		add(lblNewLabel);
		add(textField_1);
		add(lblPhienAm);
		add(textField_2);
		add(textPane);
		
		JLabel lblFile = new JLabel("file");
		lblFile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFile.setBounds(58, 497, 56, 16);
		add(lblFile);

	}
}
