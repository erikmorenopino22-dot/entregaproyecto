package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class app3 {

	private JFrame Usuario;
	private JTable tableBicicletas;
	private JTable tableRutas;
	private JTable tableBonos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app3 window = new app3();
					window.Usuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public app3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Usuario = new JFrame();
		Usuario.setTitle("Usuario");
		Usuario.setBounds(100, 100, 1504, 644);
		Usuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Usuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Usuario.getContentPane().setLayout(null);
		
		tableBicicletas = new JTable();
		tableBicicletas.setBounds(89, 72, 317, 163);
		Usuario.getContentPane().add(tableBicicletas);
		
		JLabel lblEnQueEstacin = new JLabel("En que estación estas:");
		lblEnQueEstacin.setBounds(12, 27, 142, 17);
		Usuario.getContentPane().add(lblEnQueEstacin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(156, 27, 171, 26);
		Usuario.getContentPane().add(comboBox);
		
		JButton btnDevolver = new JButton("Devolver ");
		btnDevolver.setBounds(89, 395, 105, 27);
		Usuario.getContentPane().add(btnDevolver);
		
		JButton btnAlquilar = new JButton("Alquilar");
		btnAlquilar.setBounds(301, 395, 105, 27);
		Usuario.getContentPane().add(btnAlquilar);
		
		JLabel lblTusRutas = new JLabel("Tus Rutas:");
		lblTusRutas.setBounds(517, 27, 85, 17);
		Usuario.getContentPane().add(lblTusRutas);
		
		JLabel lblBicicis = new JLabel("Bicicis:");
		lblBicicis.setBounds(11, 71, 60, 17);
		Usuario.getContentPane().add(lblBicicis);
		
		tableRutas = new JTable();
		tableRutas.setBounds(594, 28, 317, 163);
		Usuario.getContentPane().add(tableRutas);
		
		JLabel lblBonos = new JLabel("Bonos:");
		lblBonos.setBounds(1016, 27, 60, 17);
		Usuario.getContentPane().add(lblBonos);
		
		tableBonos = new JTable();
		tableBonos.setBounds(1075, 26, 354, 165);
		Usuario.getContentPane().add(tableBonos);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(1075, 259, 105, 27);
		Usuario.getContentPane().add(btnComprar);
		
		JButton btnMasInfo = new JButton("Mas Info");
		btnMasInfo.setBounds(1324, 259, 105, 27);
		Usuario.getContentPane().add(btnMasInfo);
		
		JLabel lblSeleccionarBici = new JLabel("Seleccionar Bici:");
		lblSeleccionarBici.setBounds(12, 291, 113, 17);
		Usuario.getContentPane().add(lblSeleccionarBici);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(123, 286, 142, 26);
		Usuario.getContentPane().add(comboBox_1);
	}
	public JFrame getFrame() {
	    return Usuario;
	}
}
