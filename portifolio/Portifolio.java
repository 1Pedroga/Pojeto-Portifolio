package portifolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Portifolio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portifolio frame = new Portifolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Portifolio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
				AbstractButton lblStatus = null;
				lblStatus.setText(formatador.format(data));
			}
		});
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portifolio.class.getResource("/img/pc.png")));
		setForeground(SystemColor.activeCaption);
		setResizable(false);
		setTitle("Portif\u00F3lio de Projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 471);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnImc = new JButton("");
		btnImc.setContentAreaFilled(false);
		btnImc.setBorderPainted(false);
		btnImc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImc.setIcon(new ImageIcon(Portifolio.class.getResource("/img/4075948_balance_measure_scale_weight_icon.png")));
		btnImc.setToolTipText("C\u00E1lculo do IMC");
		btnImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// as linhas abaixo fazem o link com o formulário IMC
				IMC imc = new IMC();
				imc.setVisible(true);
			}
		});
		btnImc.setBounds(24, 86, 64, 64);
		contentPane.add(btnImc);

		JButton btnSobre = new JButton("");
		btnSobre.setContentAreaFilled(false);
		btnSobre.setBorderPainted(false);
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setIcon(new ImageIcon(Portifolio.class.getResource("/img/interroga\u00E7\u00E3o.png")));
		btnSobre.setToolTipText("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// as linhas abaixo fazem o link com o formulário Sobre
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setBounds(252, 234, 64, 64);
		contentPane.add(btnSobre);

		JButton btnBoletim = new JButton("");
		btnBoletim.setContentAreaFilled(false);
		btnBoletim.setBorderPainted(false);
		btnBoletim.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBoletim.setToolTipText("Calculadora da M\u00E9dia");
		btnBoletim.setIcon(new ImageIcon(Portifolio.class.getResource("/img/2824440_calculator_math_school_tool_icon (1).png")));
		btnBoletim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boletim boletim = new Boletim();
				boletim.setVisible(true);
			}
		});
		btnBoletim.setBounds(176, 12, 64, 64);
		contentPane.add(btnBoletim);

		JButton btnCelsius = new JButton("");
		btnCelsius.setContentAreaFilled(false);
		btnCelsius.setBorderPainted(false);
		btnCelsius.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCelsius.setToolTipText("Converte para Celsius");
		btnCelsius.setIcon(new ImageIcon(Portifolio.class.getResource("/img/9045184_temperature_celsius_icon.png")));
		btnCelsius.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);
			}
		});
		btnCelsius.setBounds(24, 12, 64, 64);
		contentPane.add(btnCelsius);

		JButton btnFarenheit = new JButton("");
		btnFarenheit.setContentAreaFilled(false);
		btnFarenheit.setBorderPainted(false);
		btnFarenheit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFarenheit.setIcon(new ImageIcon(Portifolio.class.getResource("/img/fahrenheit-48.png")));
		btnFarenheit.setToolTipText("Converte para Fahrenheit");
		btnFarenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Temperatura2 temperatura2 = new Temperatura2();
				temperatura2.setVisible(true);
			}
		});
		btnFarenheit.setFont(new Font("Dialog", Font.BOLD, 12));
		btnFarenheit.setBounds(100, 12, 64, 64);
		contentPane.add(btnFarenheit);

		JButton btnPorcentagem = new JButton("");
		btnPorcentagem.setContentAreaFilled(false);
		btnPorcentagem.setBorderPainted(false);
		btnPorcentagem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPorcentagem.setIcon(new ImageIcon(Portifolio.class.getResource("/img/7898501_percentage_business_finance_office_marketing_icon.png")));
		btnPorcentagem.setToolTipText("C\u00E1lculo da Porcentagem");
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Porcentagem porcentagem = new Porcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnPorcentagem.setFont(new Font("Dialog", Font.BOLD, 12));
		btnPorcentagem.setBounds(252, 12, 64, 64);
		contentPane.add(btnPorcentagem);

		JButton btnServico = new JButton("");
		btnServico.setContentAreaFilled(false);
		btnServico.setBorderPainted(false);
		btnServico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnServico.setIcon(new ImageIcon(Portifolio.class.getResource("/img/app de service.png")));
		btnServico.setToolTipText("C\u00E1lculo da Hora de Trabalho");
		btnServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HoraServico horaservico = new HoraServico();
				horaservico.setVisible(true);
			}
		});
		btnServico.setBounds(100, 86, 64, 64);
		contentPane.add(btnServico);

		JButton btnCombustivel = new JButton("");
		btnCombustivel.setContentAreaFilled(false);
		btnCombustivel.setBorderPainted(false);
		btnCombustivel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCombustivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnCombustivel.setToolTipText("Gasolina ou Etanol ?");
		btnCombustivel.setIcon(new ImageIcon(Portifolio.class.getResource("/img/22910_gasstation_gas station_filling station_gasoline station_petrol station_icon.png")));
		btnCombustivel.setBounds(176, 86, 64, 64);
		contentPane.add(btnCombustivel);

		JButton btnEleicao = new JButton("");
		btnEleicao.setContentAreaFilled(false);
		btnEleicao.setBorderPainted(false);
		btnEleicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnEleicao.setToolTipText("Elei\u00E7\u00E3o");
		btnEleicao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEleicao.setIcon(new ImageIcon(Portifolio.class.getResource("/img/6971194_vote_time_icon.png")));
		btnEleicao.setBounds(252, 86, 64, 64);
		contentPane.add(btnEleicao);

		JButton btnCopa = new JButton("");
		btnCopa.setContentAreaFilled(false);
		btnCopa.setBorderPainted(false);
		btnCopa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Copa dado = new Copa();
				dado.setVisible(true);
			}
		});
		btnCopa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCopa.setToolTipText("Copa");
		btnCopa.setIcon(new ImageIcon(Portifolio.class.getResource("/img/309001_cup_sport_world_icon.png")));
		btnCopa.setBounds(24, 160, 64, 64);
		contentPane.add(btnCopa);

		JButton btnCep = new JButton("");
		btnCep.setContentAreaFilled(false);
		btnCep.setBorderPainted(false);
		btnCep.setIcon(new ImageIcon(Portifolio.class.getResource("/img/8684342_post_office_mail_maps_location_icon.png")));
		btnCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cep cep = new Cep();
				cep.setVisible(true);
			}
		});
		btnCep.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCep.setToolTipText("Busca CEP");
		btnCep.setBounds(100, 160, 64, 64);
		contentPane.add(btnCep);

		JButton btnJoKenPo = new JButton("");
		btnJoKenPo.setContentAreaFilled(false);
		btnJoKenPo.setBorderPainted(false);
		btnJoKenPo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokenpo jokenpo = new Jokenpo();
				jokenpo.setVisible(true);
			}
		});
		btnJoKenPo.setToolTipText("JoKenPo");
		btnJoKenPo.setIcon(new ImageIcon(Portifolio.class.getResource("/img/8664857_hand_scissors_icon (1).png")));
		btnJoKenPo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJoKenPo.setBounds(252, 160, 64, 64);
		contentPane.add(btnJoKenPo);

		JButton btnTabuada = new JButton("");
		btnTabuada.setContentAreaFilled(false);
		btnTabuada.setBorderPainted(false);
		btnTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnTabuada.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTabuada.setToolTipText("Tabuada");
		btnTabuada.setIcon(new ImageIcon(Portifolio.class.getResource("/img/tabuada-64.png")));
		btnTabuada.setBounds(24, 234, 64, 64);
		contentPane.add(btnTabuada);

		JButton btnJurosCompostos = new JButton("");
		btnJurosCompostos.setContentAreaFilled(false);
		btnJurosCompostos.setBorderPainted(false);
		btnJurosCompostos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJurosCompostos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JurosCompostos jurosCompostos = new JurosCompostos();
				jurosCompostos.setVisible(true);

			}
		});
		btnJurosCompostos.setIcon(new ImageIcon(Portifolio.class.getResource("/img/juros-compostos-64.png")));
		btnJurosCompostos.setToolTipText("Juros Compostos");
		btnJurosCompostos.setBounds(100, 234, 64, 64);
		contentPane.add(btnJurosCompostos);

		JButton btnCarta = new JButton("");
		btnCarta.setBorderPainted(false);
		btnCarta.setContentAreaFilled(false);
		btnCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);
			}
		});
		btnCarta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarta.setToolTipText("Carta");
		btnCarta.setIcon(new ImageIcon(Portifolio.class.getResource("/img/18054_cards_poker_icon.png")));
		btnCarta.setBounds(176, 161, 64, 64);
		contentPane.add(btnCarta);
		
		JButton btnDado = new JButton("");
		btnDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dado dado = new Dado();
				dado.setVisible(true);
	            
			}
		});
		btnDado.setToolTipText("Dado");
		btnDado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDado.setContentAreaFilled(false);
		btnDado.setBorderPainted(false);
		btnDado.setIcon(new ImageIcon(Portifolio.class.getResource("/img/8725832_dice_six_icon.png")));
		btnDado.setBounds(186, 234, 64, 64);
		contentPane.add(btnDado);
	} // fim do construtor
}
