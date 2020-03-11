import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.swing.JFrame;
import java.swing.JTextField;
import java.swing.JPasswordField;
import java.swing.JOptionPane;

public class TextFieldFrame extends JFrame{
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;
	
	public TextField Frame(){
		super("Testing JTextField and JPasswordField");
		setLayout(new FlowLayout() );
		
		textField1 = new JTextField(10);
		add (textField1);

		textField2 = new JTextField ("Enter text here");
		add (textField2);

		textField3 = new JTextField ("Uneditable text field",21);
		textField3.setEditable(false);
		add (textField);
		
		passwordField = new JPasswordField("Hidden text");
		add (passwordField);

		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener (handler);
		textField2.addActionListener (handler);
		textField3.addActionListener (handler);
		passwordField.addActionListener (handler);
	}

	private class TextFieldHandler implements ActionListener{
		public void actionPerformed ( ActionEvent event){
			String string = "";
			
			if (event.getSource() == textField1)
				string = String.format("textField1: %s",
					event.getActionCommand() );
			
			else if (event.getSource() == textField2)
				string = String.format("textField2: %s",
					event.getActionCommand() );
			
			else if (event.getSource() == textField3)
				string = String.format("textField: %s",
					event.getActionCommand() );
			
			else if (event.getSpurce() == passwordField) 
				string = String.format("passwordField: %s",
					event.getActionCommand() );

			JOptionPane.showMessageDialog(null,string);
		}
	}
}
	
public class TextFieldTest{
	public static void main (String[] args){
		TextFieldFrame textFieldFrame = new TextFieldFrame();
		textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		textFieldFrame.setSize( 350, 100);
		textFieldFrame.setVisible(true);
	}
}