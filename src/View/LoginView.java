package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setResizable(false);
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTop = new JPanel();
		panelTop.setBounds(10, 11, 414, 170);
		contentPane.add(panelTop);
		panelTop.setLayout(new MigLayout("", "[62px][38.00px][][][]", "[20px][20px][][20.00][]"));
		
		JLabel lblUsername = new JLabel("Username:");
		panelTop.add(lblUsername, "cell 2 2,alignx center,aligny center");
		
		txtUsername = new JTextField();
		panelTop.add(txtUsername, "cell 4 2,growx,aligny center");
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		panelTop.add(lblPassword, "cell 2 4,alignx center,aligny center");
		
		pwdPassword = new JPasswordField();
		panelTop.add(pwdPassword, "cell 4 4,growx,aligny center");
		
		JPanel panelBottom = new JPanel();
		panelBottom.setBounds(10, 191, 414, 59);
		contentPane.add(panelBottom);
		
		JButton btnLogin = new JButton("Login");
		panelBottom.add(btnLogin);
	}
}
