import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EspeakGUI {

	private JFrame frame;
	private JTextField txtEn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspeakGUI window = new EspeakGUI();
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
	public EspeakGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(12, 27, 395, 120);
		frame.getContentPane().add(editorPane);
		
		txtEn = new JTextField();
		txtEn.setText("en");
		txtEn.setBounds(474, 26, 114, 19);
		frame.getContentPane().add(txtEn);
		txtEn.setColumns(10);
		
		JLabel lblVoice = new JLabel("Voice");
		lblVoice.setBounds(421, 28, 70, 15);
		frame.getContentPane().add(lblVoice);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(474, 57, 114, 24);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setBounds(421, 62, 70, 15);
		frame.getContentPane().add(lblSpeed);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1.setBounds(474, 93, 114, 24);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblPause = new JLabel("Pause");
		lblPause.setBounds(421, 98, 70, 15);
		frame.getContentPane().add(lblPause);
		
		JButton btnSpeak = new JButton("Speak");
		btnSpeak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EspeakAPI.say(editorPane.getText(), txtEn.getText(), comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex());
			}
		});
		btnSpeak.setBounds(471, 142, 117, 25);
		frame.getContentPane().add(btnSpeak);
	
		
		
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
