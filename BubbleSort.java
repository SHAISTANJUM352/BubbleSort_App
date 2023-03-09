import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BubbleSort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubbleSort frame = new BubbleSort();
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
	public BubbleSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("SORTING");
		label.setForeground(new Color(75, 0, 130));
		label.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 20));
		label.setBounds(167, 25, 108, 27);
		contentPane.add(label);
		
		JLabel label1 = new JLabel("ENTER NUMBER FOR SORTING");
		label1.setForeground(new Color(128, 0, 0));
		label1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		label1.setBounds(7, 76, 268, 20);
		contentPane.add(label1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setFont(new Font("Algerian", Font.BOLD, 18));
		ta1.setBackground(new Color(245, 245, 245));
		ta1.setBounds(256, 73, 148, 22);
		contentPane.add(ta1);
		
		JLabel label2 = new JLabel("NUMBERS AFTER SORTING");
		label2.setForeground(new Color(128, 0, 0));
		label2.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		label2.setBounds(27, 126, 222, 18);
		contentPane.add(label2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setFont(new Font("Algerian", Font.BOLD, 18));
		ta2.setBackground(new Color(245, 245, 245));
		ta2.setBounds(256, 122, 148, 22);
		contentPane.add(ta2);
		
		JButton button = new JButton("BUBBLE SORT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic of sorting the contents
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				String help;
				for(int i=0;i<=arr.length-2;i++)
				{
					for(int j=0;j<=arr.length-2-i;j++)
					{
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1]))
						{
							help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
					}
				}
				String result="";
				for(int i=0;i<=arr.length-1;i++)
				{
					result=result+arr[i]+" ";
				}
				ta2.setText(result);
			}
		});
		button.setBackground(new Color(245, 245, 245));
		button.setForeground(new Color(165, 42, 42));
		button.setFont(new Font("Algerian", Font.BOLD, 18));
		button.setBounds(141, 188, 169, 33);
		contentPane.add(button);
	}
}
