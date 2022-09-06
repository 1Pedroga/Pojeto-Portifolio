package portifolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Copa extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Copa dialog = new Copa();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Copa() {
		getContentPane().setBackground(new Color(0, 255, 255));
		setBackground(new Color(0, 255, 255));
		setResizable(false);
		setTitle("sorteio");
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Copa.class.getResource("/img/309001_cup_sport_world_icon.png")));
		setBounds(100, 100, 518, 685);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JButton btnLancar = new JButton("");
		btnLancar.setIcon(new ImageIcon(Copa.class.getResource("/img/4843031_medal_price_sports_trophy_winner_icon.png")));
		btnLancar.setToolTipText("sortear");
		btnLancar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lancar();
			}
		});
		btnLancar.setBounds(47, 30, 64, 64);
		getContentPane().add(btnLancar);

		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/309001_cup_sport_world_icon.png")));
		lblNewLabel.setBounds(10, 105, 492, 530);
		getContentPane().add(lblNewLabel);

		btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setIcon(new ImageIcon(Copa.class.getResource("/img/eraser.png")));
		btnLimpar.setBounds(413, 30, 64, 64);
		getContentPane().add(btnLimpar);

	} // Fim do Construtor

	void lancar() {
		Random random = new Random();
		int face = random.nextInt(6) + 1;
		switch (face) {
		case 1:
			lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/mbappe.png")));
			break;
		case 2:
			lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/messi.png")));
			break;
		case 3:
			lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/neymar.png")));
			break;
		case 4:
			lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/cr7.png")));
			break;
		case 5:
			lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/vinijr.png")));
			break;
		case 6:
			lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/njr.png")));
			break;
		}
		
	} // Fim do m�todo lancar

	/** M�todo para Limpar **/
	void limpar() {
		
		lblNewLabel.setIcon(new ImageIcon(Copa.class.getResource("/img/309001_cup_sport_world_icon.png")));
		
	} // Fim do m�todo limpar

} // Fim
