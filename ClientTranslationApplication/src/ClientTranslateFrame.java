import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ClientTranslateFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public JButton bttnTranslate;
	private JLabel lblHeader;
	private JLabel lblFromHeader;
	private JLabel lblToHeader;
	
	private JTextField inputTo;
	
	private JLabel lblDash;
	private JLabel lblDash1;
	
	String[] eng = {"Good morning", "Good night" , "How are you?", "Thank you", "Goodbye", "What's up?"};
	String[] lang = {"Malay", "Arabic" , "Korean"};
	
	//combobox
	JComboBox cbEng;
			
	JComboBox cbLang;
	
	
	
	
	
	public ClientTranslateFrame() {
		
		loadComponents();
	}
	
	public void loadComponents() {
		this.setLayout(new GridLayout(3,1));
		this.setSize(new Dimension(400, 600));  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Translation App");
		
		JPanel panelTop = new JPanel();
		JPanel panelCenter = new JPanel(new GridLayout(2, 3));
		JPanel panelBottom = new JPanel();
		
		
		bttnTranslate = new JButton("TRANSLATE");
		lblHeader = new JLabel("Translate from English to Malay/ Korean/ Arabic");
		lblFromHeader = new JLabel("English");
		lblDash = new JLabel("To");
		lblDash1 = new JLabel("==");
		lblToHeader = new JLabel("-");
		
		cbEng = new JComboBox(eng);
		cbEng.setSelectedIndex(0);
				
		cbLang = new JComboBox(lang);
		cbLang.setSelectedIndex(0);
		
		//centralized every label
		
		lblFromHeader.setHorizontalAlignment(JLabel.CENTER);
		lblDash.setHorizontalAlignment(JLabel.CENTER);
		lblDash1.setHorizontalAlignment(JLabel.CENTER);
		lblToHeader.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		inputTo = new JTextField();
		inputTo.setEditable(false);
		inputTo.setPreferredSize(new Dimension(60, 28));
		
		panelTop.add(lblHeader);
		panelCenter.add(lblFromHeader);
		panelCenter.add(lblDash);
		panelCenter.add(cbLang);
		panelCenter.add(cbEng);
		panelCenter.add(lblDash1);
		panelCenter.add(inputTo);
		panelBottom.add(bttnTranslate);
		
		
		this.add(panelTop,BorderLayout.NORTH);
		this.add(panelCenter, BorderLayout.CENTER);
		this.add(panelBottom, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
		
		
	}
	
	
	public void updateTranslatedText(String translated) {
		
		inputTo.setText(translated);
		
		
	}
	
	
	public String getText() {
		String txt;
		
		txt = cbEng.getSelectedItem().toString();
		return txt;
		
	}
	
	public String getLang() {
		String lang;
		
		lang = cbLang.getSelectedItem().toString();
		
		return lang;
	}
	
	
	
	
	
	
	
	
	

}
