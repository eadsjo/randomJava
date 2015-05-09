package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JProgressBar;
import javax.swing.SwingConstants;


/*NOTE: This code was created using the Window Builder GUI, with input from Mahendra's video:
 * https://www.youtube.com/watch?v=1sEYde5I7J8
 * See "UserTestFrame.java" for hand-coded version of this code (looks different too for some reason). 
 * - josh eads 5/3/2015
 */



public class MahendraTest extends JFrame{

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JButton buttonNextQuestion = new JButton("Next Question");
	
	//New as of 5/6/2015 
	//- josh eads 5/6/2015
	private JButton buttonPriorQuestion = new JButton("Prior Question");
	
	   
    private JBarJPanel myProgBar;
    
    private Integer progBarValue = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		/*
		 *This is how the look of this page looks different than others.
         *Code below is saying to "setLookAndFeel()" to the system look and feel
         *getSystemLookAndFeelClassName(); 
         * - josh eads 5/4/2015
		try {        	
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        **/
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MahendraTest window = new MahendraTest();
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
	public MahendraTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 470, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		myProgBar = new JBarJPanel (0, 10, true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 354);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//panel.add(myProgBar);
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setText("Apples");
		textField1.setBounds(80, 121, 112, 138);
		panel.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setText("Bananas");
		textField2.setBounds(246, 121, 112, 138);
		panel.add(textField2);
		textField2.setColumns(10);
		
		buttonNextQuestion.setFont(new Font("SansSerif", Font.PLAIN, 11));		
		buttonNextQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progBarValue = progBarValue +1;
				myProgBar.setBarValue(progBarValue);
			}
		});
		buttonNextQuestion.setBounds(246, 304, 112, 23);
		panel.add(buttonNextQuestion);
		
		buttonPriorQuestion.setFont(new Font("SansSerif", Font.PLAIN, 11));
		buttonPriorQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progBarValue = progBarValue -1;
				myProgBar.setBarValue(progBarValue);
			}
		});
		buttonPriorQuestion.setBounds(80, 304, 112, 23);
		panel.add(buttonPriorQuestion);
		
		
		
		//JProgressBar progressBar = new JProgressBar();
		myProgBar.setBounds(117, 25, 200, 50);
		panel.add(myProgBar);
	}
}
