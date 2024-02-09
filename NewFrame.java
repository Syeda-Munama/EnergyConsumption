import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField quanttextField1;
	private JTextField quanttextField2;
	private JTextField quanttextField3;
	private JTextField HrtextField1;
	private JTextField HrtextField2;
	private JTextField HrtextField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewFrame frame = new NewFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbLabelH1 = new JLabel("ACs");
		lbLabelH1.setBackground(new Color(153, 102, 255));
		lbLabelH1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbLabelH1.setBounds(10, 11, 32, 14);
		contentPane.add(lbLabelH1);
		
		JLabel lbLabelq1 = new JLabel("Quantity:");
		lbLabelq1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbLabelq1.setBounds(10, 36, 49, 14);
		contentPane.add(lbLabelq1);
		
		JLabel lbLabelh1 = new JLabel("Hours:");
		lbLabelh1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbLabelh1.setBounds(108, 36, 38, 14);
		contentPane.add(lbLabelh1);
		
		JCheckBox ac1Checkbox = new JCheckBox("AC (1-Ton)");
		ac1Checkbox.setBounds(214, 32, 87, 23);
        ac1Checkbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                enableTextField(ac1Checkbox, quanttextField1, HrtextField1);
                accalculate.setEnabled(ac1Checkbox.isSelected() || ac2Checkbox.isSelected() || ac3Checkbox.isSelected());
            }

        });
		contentPane.add(ac1Checkbox);
		
		JCheckBox ac2Checkbox = new JCheckBox("AC (1.5-Ton)");
		ac2Checkbox.setBounds(214, 58, 100, 23);
        ac2Checkbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                enableTextField(ac2Checkbox, quanttextField2, HrtextField2);
                accalculate.setEnabled(ac1Checkbox.isSelected() || ac2Checkbox.isSelected() ||ac3Checkbox.isSelected());
            }
        });
		contentPane.add(ac2Checkbox);
		
		JCheckBox ac3Checkbox = new JCheckBox("AC (2-Ton)");
		ac3Checkbox.setBounds(214, 84, 100, 23);
        ac3Checkbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                enableTextField(ac3Checkbox, quanttextField3, HrtextField3);
                accalculate.setEnabled(ac1Checkbox.isSelected() || ac2Checkbox.isSelected() ||ac3Checkbox.isSelected());
            }
        });
		contentPane.add(ac3Checkbox);
		
		
		
		JLabel lbLabelq2 = new JLabel("Quantity:");
		lbLabelq2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbLabelq2.setBounds(10, 62, 49, 14);
		contentPane.add(lbLabelq2);
		
		JLabel lbLabelq3 = new JLabel("Quantity:");
		lbLabelq3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbLabelq3.setBounds(10, 88, 49, 14);
		contentPane.add(lbLabelq3);
		
		JLabel lbLabelh2 = new JLabel("Hours:");
		lbLabelh2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbLabelh2.setBounds(108, 62, 38, 14);
		contentPane.add(lbLabelh2);
		
		JLabel lbLabelh3 = new JLabel("Hours:");
		lbLabelh3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbLabelh3.setBounds(108, 88, 38, 14);
		contentPane.add(lbLabelh3);
		
		quanttextField1 = new JTextField();
		quanttextField1.setBounds(53, 33, 49, 20);
		contentPane.add(quanttextField1);
		quanttextField1.setColumns(10);
		
		quanttextField2 = new JTextField();
		quanttextField2.setColumns(10);
		quanttextField2.setBounds(53, 59, 49, 20);
		contentPane.add(quanttextField2);
		
		quanttextField3 = new JTextField();
		quanttextField3.setColumns(10);
		quanttextField3.setBounds(53, 87, 49, 20);
		contentPane.add(quanttextField3);
		
		HrtextField1 = new JTextField();
		HrtextField1.setColumns(10);
		HrtextField1.setBounds(140, 33, 49, 20);
		contentPane.add(HrtextField1);
		
		HrtextField2 = new JTextField();
		HrtextField2.setColumns(10);
		HrtextField2.setBounds(140, 59, 49, 20);
		contentPane.add(HrtextField2);
		
		HrtextField3 = new JTextField();
		HrtextField3.setColumns(10);
		HrtextField3.setBounds(140, 88, 49, 20);
		contentPane.add(HrtextField3);
		
		JButton accalculate = new JButton("Calculate AC");
		accalculate.setFont(new Font("Tahoma", Font.BOLD, 9));
		accalculate.setBounds(320, 58, 100, 23);
		accalculate.setEnabled(ac1Checkbox.isSelected() || ac2Checkbox.isSelected() || ac3Checkbox.isSelected());
		accalculate.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				double totalPower = 0;
				if (ac1Checkbox.isSelected()){
					totalPower += 1500 * Integer.parseInt(quanttextField1.getText());
				}
				if (ac2Checkbox.isSelected()){
					totalPower += 2000 * Integer.parseInt(quanttextField2.getText());
				}
				if (ac3Checkbox.isSelected()){
					totalPower += 2500 * Integer.parseInt(quanttextField3.getText());
				}

				int hour1 = Integer.parseInt(HrtextField1.getText());
				int hour2 = Integer.parseInt(HrtextField2.getText());
				int hour3 = Integer.parseInt(HrtextField3.getText());

				double totalEnergy = (totalPower * (hour1 + hour2 + hour3)) / 1000;

				acTotalCal.setText("Total AC consumption: " + totalEnergy + " kWh");
			}

			
		});

		JLabel acTotalCal = new JLabel("Total AC Consumption:");
		acTotalCal.setFont(new Font("Tahoma", Font.PLAIN, 9));
		acTotalCal.setBounds(320, 84, 100, 14);
		contentPane.add(acTotalCal);
		contentPane.add(accalculate);
		
	
    }
	private void enableTextField(JCheckBox checkBox, JTextField quantityTextField, JTextField hoursTextField) {
		boolean enable = checkBox.isSelected();
		quantityTextField.setEnabled(enable);
		hoursTextField.setEnabled(enable);
	}
}
