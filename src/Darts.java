import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Darts {

	private JFrame frmDartsScores;
	private JTextField txtPlayerOne;
	private JTextField txtPlayerTwo;
	private JTextField txtPlayerThree;
	private JTextField txtPlayerFour;
	private JTextField txtScore1;
	private JTextField txtScore2;
	private JTextField txtScore3;
	private JTextField txtScore4;
	String Winner;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Darts window = new Darts();
					window.frmDartsScores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Darts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDartsScores = new JFrame();
		frmDartsScores.setTitle("Darts Scores");
		frmDartsScores.setBounds(100, 100, 691, 314);
		frmDartsScores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDartsScores.getContentPane().setLayout(null);
		
		txtPlayerOne = new JTextField();
		
		JButton btnGo = new JButton("Go");
		btnGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGo.setVisible(false);
				txtPlayerOne.setVisible(false);
				txtPlayerTwo.setVisible(false);
				txtPlayerThree.setVisible(false);
				txtPlayerFour.setVisible(false);
				txtScore1.setVisible(false);
				txtScore2.setVisible(false);
				txtScore3.setVisible(false);
				txtScore4.setVisible(false);
				
			}
		});
		btnGo.setBounds(12, 168, 105, 27);
		frmDartsScores.getContentPane().add(btnGo);
		txtPlayerOne.setText("PlayerName");
		txtPlayerOne.setBounds(12, 41, 114, 21);
		frmDartsScores.getContentPane().add(txtPlayerOne);
		txtPlayerOne.setColumns(10);
		
		txtPlayerTwo = new JTextField();
		txtPlayerTwo.setText("PlayerName");
		txtPlayerTwo.setColumns(10);
		txtPlayerTwo.setBounds(12, 71, 114, 21);
		frmDartsScores.getContentPane().add(txtPlayerTwo);
		
		txtPlayerThree = new JTextField();
		txtPlayerThree.setText("PlayerName");
		txtPlayerThree.setColumns(10);
		txtPlayerThree.setBounds(12, 104, 114, 21);
		frmDartsScores.getContentPane().add(txtPlayerThree);
		
		txtPlayerFour = new JTextField();
		txtPlayerFour.setText("PlayerName");
		txtPlayerFour.setColumns(10);
		txtPlayerFour.setBounds(12, 135, 114, 21);
		frmDartsScores.getContentPane().add(txtPlayerFour);
		
		JLabel lblPlayerOne = new JLabel("New label");
		lblPlayerOne.setBounds(12, 43, 120, 17);
		frmDartsScores.getContentPane().add(lblPlayerOne);
		lblPlayerOne.setText(txtPlayerOne.getText().toUpperCase());
		
		JLabel lblPlayerTwo = new JLabel("New label");
		lblPlayerTwo.setBounds(12, 74, 120, 17);
		frmDartsScores.getContentPane().add(lblPlayerTwo);
		lblPlayerTwo.setText(txtPlayerTwo.getText().toUpperCase());
		
		JLabel lblPlayerThree = new JLabel("New label");
		lblPlayerThree.setBounds(12, 106, 120, 17);
		frmDartsScores.getContentPane().add(lblPlayerThree);
		lblPlayerThree.setText(txtPlayerThree.getText().toUpperCase());
		
		JLabel lblPlayerFour = new JLabel("New label");
		lblPlayerFour.setBounds(12, 137, 120, 17);
		frmDartsScores.getContentPane().add(lblPlayerFour);
		lblPlayerFour.setText(txtPlayerFour.getText().toUpperCase());
		
		
		JLabel lblPlayerOneScore = new JLabel("0");
		lblPlayerOneScore.setBounds(223, 43, 32, 17);
		frmDartsScores.getContentPane().add(lblPlayerOneScore);
		lblPlayerOneScore.setVisible(false);
		
		JLabel lblPlayerTwoScore = new JLabel("0");
		lblPlayerTwoScore.setBounds(223, 76, 21, 17);
		frmDartsScores.getContentPane().add(lblPlayerTwoScore);
		lblPlayerTwoScore.setVisible(false);
		
		JLabel lblPlayerThreeScore = new JLabel("0");
		lblPlayerThreeScore.setBounds(223, 104, 21, 17);
		frmDartsScores.getContentPane().add(lblPlayerThreeScore);
		lblPlayerThreeScore.setVisible(false);
		
		JLabel lblPlayerFourScore = new JLabel("0");
		lblPlayerFourScore.setBounds(223, 137, 21, 17);
		frmDartsScores.getContentPane().add(lblPlayerFourScore);
		lblPlayerFourScore.setVisible(false);
		
		JButton btnSingle1 = new JButton("Single");
		btnSingle1.setFont(new Font("Hack", Font.BOLD, 12));
		btnSingle1.setBackground(new Color(165, 42, 42));
		btnSingle1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ScoreIn1 = Integer.parseInt(txtScore1.getText());
				int playerScore1 = Integer.parseInt(lblPlayerOneScore.getText());
				int scorePlus1 = ScoreIn1 + playerScore1;
				lblPlayerOneScore.setText(Integer.toString(scorePlus1));
			}
		});
		btnSingle1.setBounds(247, 38, 76, 25);
		frmDartsScores.getContentPane().add(btnSingle1);
		btnSingle1.setVisible(false);


		
		JButton btnSingle2 = new JButton("Single");
		btnSingle2.setFont(new Font("Hack", Font.BOLD, 12));
		btnSingle2.setBackground(new Color(165, 42, 42));
		btnSingle2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ScoreIn2 = Integer.parseInt(txtScore2.getText());
				int playerScore2 = Integer.parseInt(lblPlayerTwoScore.getText());
				int scorePlus1 = ScoreIn2 + playerScore2;
				lblPlayerTwoScore.setText(Integer.toString(scorePlus1));
			}
		});
		btnSingle2.setBounds(247, 71, 76, 25);
		frmDartsScores.getContentPane().add(btnSingle2);
		btnSingle2.setVisible(false);
		
		JButton btnSingle3 = new JButton("Single");
		btnSingle3.setFont(new Font("Hack", Font.BOLD, 12));
		btnSingle3.setBackground(new Color(165, 42, 42));
		btnSingle3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ScoreIn3 = Integer.parseInt(txtScore3.getText());
				int playerScore3 = Integer.parseInt(lblPlayerThreeScore.getText());
				int scorePlus1 = ScoreIn3 + playerScore3;
				lblPlayerThreeScore.setText(Integer.toString(scorePlus1));
			}
		});
		btnSingle3.setBounds(247, 99, 76, 25);
		frmDartsScores.getContentPane().add(btnSingle3);
		btnSingle3.setVisible(false);
		
		JButton btnSingle4 = new JButton("Single");
		btnSingle4.setFont(new Font("Hack", Font.BOLD, 12));
		btnSingle4.setBackground(new Color(165, 42, 42));
		btnSingle4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ScoreIn4 = Integer.parseInt(txtScore4.getText());
				int playerScore4 = Integer.parseInt(lblPlayerFourScore.getText());
				int scorePlus1 = ScoreIn4 + playerScore4;
				lblPlayerFourScore.setText(Integer.toString(scorePlus1));
			}
		});
		btnSingle4.setBounds(247, 132, 76, 25);
		frmDartsScores.getContentPane().add(btnSingle4);
		btnSingle4.setVisible(false);
		
		JButton btnDouble1 = new JButton("Double");
		btnDouble1.setBackground(new Color(0, 100, 0));
		btnDouble1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn1 = Integer.parseInt(txtScore1.getText());
				int playerScore1 = Integer.parseInt(lblPlayerOneScore.getText());
				int scoreDouble = scoreIn1 * 2;
				int scoreTotal = scoreDouble + playerScore1;
				lblPlayerOneScore.setText(Integer.toString(scoreTotal)); 
			}
		});
		btnDouble1.setBounds(331, 38, 77, 27);
		frmDartsScores.getContentPane().add(btnDouble1);
		btnDouble1.setVisible(false);
		
		JButton btnDouble2 = new JButton("Double");
		btnDouble2.setBackground(new Color(0, 100, 0));
		btnDouble2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn2 = Integer.parseInt(txtScore2.getText());
				int playerScore2 = Integer.parseInt(lblPlayerTwoScore.getText());
				int scoreDouble = scoreIn2 * 2;
				int scoreTotal = scoreDouble + playerScore2;
				lblPlayerTwoScore.setText(Integer.toString(scoreTotal));
			}
		});
		btnDouble2.setBounds(331, 71, 77, 27);
		frmDartsScores.getContentPane().add(btnDouble2);
		btnDouble2.setVisible(false);
		
		JButton btnDouble3 = new JButton("Double");
		btnDouble3.setBackground(new Color(0, 100, 0));
		btnDouble3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn3 = Integer.parseInt(txtScore3.getText());
				int playerScore3 = Integer.parseInt(lblPlayerThreeScore.getText());
				int scoreDouble = scoreIn3 * 2;
				int scoreTotal = scoreDouble + playerScore3;
				lblPlayerThreeScore.setText(Integer.toString(scoreTotal));
			}
		});
		btnDouble3.setBounds(331, 99, 77, 27);
		frmDartsScores.getContentPane().add(btnDouble3);
		btnDouble3.setVisible(false);
		
		JButton btnDouble4 = new JButton("Double");
		btnDouble4.setBackground(new Color(0, 100, 0));
		btnDouble4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn4 = Integer.parseInt(txtScore4.getText());
				int playerScore4 = Integer.parseInt(lblPlayerFourScore.getText());
				int scoreDouble = scoreIn4 * 2;
				int scoreTotal = scoreDouble + playerScore4;
				lblPlayerFourScore.setText(Integer.toString(scoreTotal));
			}
		});
		btnDouble4.setBounds(331, 132, 77, 27);
		frmDartsScores.getContentPane().add(btnDouble4);
		btnDouble4.setVisible(false);
		
		JButton btnTriple1 = new JButton("Triple");
		btnTriple1.setBackground(new Color(165, 42, 42));
		btnTriple1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn1 = Integer.parseInt(txtScore1.getText());
				int playerScore1 = Integer.parseInt(lblPlayerOneScore.getText());
				int scoreDouble = scoreIn1 * 3;
				int scoreTotal = scoreDouble + playerScore1;
				lblPlayerOneScore.setText(Integer.toString(scoreTotal));
			}
		});
		btnTriple1.setBounds(415, 40, 69, 27);
		frmDartsScores.getContentPane().add(btnTriple1);
		btnTriple1.setVisible(false);
		
		JButton btnTriple2 = new JButton("Triple");
		btnTriple2.setBackground(new Color(165, 42, 42));
		btnTriple2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn2 = Integer.parseInt(txtScore2.getText());
				int playerScore2 = Integer.parseInt(lblPlayerTwoScore.getText());
				int scoreDouble = scoreIn2 * 3;
				int scoreTotal = scoreDouble + playerScore2;
				lblPlayerTwoScore.setText(Integer.toString(scoreTotal));
			}
		});
		btnTriple2.setBounds(415, 71, 69, 27);
		frmDartsScores.getContentPane().add(btnTriple2);
		btnTriple2.setVisible(false);
		
		JButton btnTriple3 = new JButton("Triple");
		btnTriple3.setBackground(new Color(165, 42, 42));
		btnTriple3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn3 = Integer.parseInt(txtScore3.getText());
				int playerScore3 = Integer.parseInt(lblPlayerThreeScore.getText());
				int scoreDouble = scoreIn3 * 3;
				int scoreTotal = scoreDouble + playerScore3;
				lblPlayerThreeScore.setText(Integer.toString(scoreTotal));
			}
		});
		btnTriple3.setBounds(415, 99, 69, 27);
		frmDartsScores.getContentPane().add(btnTriple3);
		btnTriple3.setVisible(false);
		
		JButton btnTriple4 = new JButton("Triple");
		btnTriple4.setBackground(new Color(165, 42, 42));
		btnTriple4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int scoreIn4 = Integer.parseInt(txtScore4.getText());
				int playerScore4 = Integer.parseInt(lblPlayerFourScore.getText());
				int scoreDouble = scoreIn4 * 3;
				int scoreTotal = scoreDouble + playerScore4;
				lblPlayerFourScore.setText(Integer.toString(scoreTotal));
			}
		});
		btnTriple4.setBounds(415, 132, 69, 27);
		frmDartsScores.getContentPane().add(btnTriple4);
		btnTriple4.setVisible(false);
		
		JButton btnConfrim = new JButton("Confrim");
		btnConfrim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPlayerOne.setVisible(true);
				lblPlayerTwo.setVisible(true);
				lblPlayerThree.setVisible(true);
				lblPlayerFour.setVisible(true);	
				lblPlayerOneScore.setVisible(true);
				lblPlayerTwoScore.setVisible(true);
				lblPlayerThreeScore.setVisible(true);
				lblPlayerFourScore.setVisible(true);
				txtPlayerOne.setVisible(false);
				txtPlayerTwo.setVisible(false);
				txtPlayerTwo.setVisible(false);
				txtPlayerThree.setVisible(false);
				txtPlayerFour.setVisible(false);
				txtScore1.setVisible(true);
				txtScore2.setVisible(true);
				txtScore3.setVisible(true);
				txtScore4.setVisible(true);
				btnConfrim.setVisible(false);	
				btnSingle1.setVisible(true);
				btnSingle2.setVisible(true);
				btnSingle3.setVisible(true);
				btnSingle4.setVisible(true);
				btnDouble1.setVisible(true);
				btnDouble2.setVisible(true);
				btnDouble3.setVisible(true);
				btnDouble4.setVisible(true);
				btnTriple1.setVisible(true);
				btnTriple2.setVisible(true);
				btnTriple3.setVisible(true);
				btnTriple4.setVisible(true);
				
			}
		});
		btnConfrim.setBounds(12, 168, 105, 27);
		frmDartsScores.getContentPane().add(btnConfrim);
		
		txtScore1 = new JTextField();
		txtScore1.setText("0");
		txtScore1.setBounds(167, 43, 38, 21);
		frmDartsScores.getContentPane().add(txtScore1);
		txtScore1.setColumns(10);
		txtScore1.setVisible(false);
		
		txtScore2 = new JTextField();
		txtScore2.setText("0");
		txtScore2.setColumns(10);
		txtScore2.setBounds(167, 76, 38, 21);
		frmDartsScores.getContentPane().add(txtScore2);
		txtScore2.setVisible(false);
		
		txtScore3 = new JTextField();
		txtScore3.setText("0");
		txtScore3.setColumns(10);
		txtScore3.setBounds(167, 107, 38, 21);
		frmDartsScores.getContentPane().add(txtScore3);
		txtScore3.setVisible(false);
		
		txtScore4 = new JTextField();
		txtScore4.setText("0");
		txtScore4.setBounds(167, 137, 37, 21);
		frmDartsScores.getContentPane().add(txtScore4);
		txtScore4.setColumns(10);
		

		}
			

	}

