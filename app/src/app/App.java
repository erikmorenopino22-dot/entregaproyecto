package com.hibernate;

import java.awt.DefaultFocusTraversalPolicy;
import java.util.List;
import java.util.Scanner;

import com.formdev.flatlaf.FlatLightLaf;
import com.hibernate.dao.CiudadesDAO;
import com.hibernate.model.Ciudad;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTable;

public class App {

	private JFrame frame;
	private JTextField txtIdU;
	private JTextField txtNombreU;
	private JTextField txtEmailU;
	private JTextField txtContraseñaU;
	private JTable tableU;
	private JLabel lblIdR;
	private JLabel lblUsuario;
	private JLabel lblEstacinorigen;
	private JLabel lblEstacinDestino;
	private JLabel lblDuracin;
	private JLabel lblResea;
	private JTextField txtIdR;
	private JTextField txtUsuarioR;
	private JTextField txtEstaciónOR;
	private JTextField txtEstacionDR;
	private JTextField txtDuracionR;
	private JTextField txtReseñaR;
	private JTable tableR;
	private JLabel lblId_1;
	private JLabel lblNombre_1;
	private JLabel lblUbiccacin;
	private JLabel lblCapacidad;
	private JLabel lblPuestos;
	private JLabel lblBicicletas;
	private JTextField txtIdE;
	private JTextField txtNombreE;
	private JTextField txtUbiE;
	private JTextField txtCapacidadE;
	private JTextField txtPuestosE;
	private JTextField txtBicicletasE;
	private JTable tableE;
	private JLabel lblId_2;
	private JLabel lblTipo;
	private JLabel lblEstado;
	private JLabel lblUbicacinEstacion;
	private JTextField txtUbiB;
	private JTextField txtEstadoB;
	private JTextField txtTipoB;
	private JTextField txtIDB;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			        FlatLightLaf.setup(); 
			        UIManager.put("defaultFont", new Font("Segoe UI", Font.PLAIN, 14));
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
				
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(12, 267, 60, 17);
		frame.getContentPane().add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 296, 60, 17);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 325, 60, 17);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(12, 354, 94, 17);
		frame.getContentPane().add(lblContrasea);
		
		txtIdU = new JTextField();
		txtIdU.setEditable(false);
		txtIdU.setBounds(124, 265, 114, 21);
		frame.getContentPane().add(txtIdU);
		txtIdU.setColumns(10);
		
		txtNombreU = new JTextField();
		txtNombreU.setBounds(124, 294, 114, 21);
		frame.getContentPane().add(txtNombreU);
		txtNombreU.setColumns(10);
		
		txtEmailU = new JTextField();
		txtEmailU.setBounds(124, 323, 114, 21);
		frame.getContentPane().add(txtEmailU);
		txtEmailU.setColumns(10);
		
		txtContraseñaU = new JTextField();
		txtContraseñaU.setBounds(124, 352, 114, 21);
		frame.getContentPane().add(txtContraseñaU);
		txtContraseñaU.setColumns(10);
		
		tableU = new JTable();
		tableU.setBounds(12, 28, 277, 161);
		frame.getContentPane().add(tableU);
		
		lblIdR = new JLabel("Id:");
		lblIdR.setBounds(345, 267, 60, 17);
		frame.getContentPane().add(lblIdR);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(345, 296, 60, 17);
		frame.getContentPane().add(lblUsuario);
		
		lblEstacinorigen = new JLabel("EstaciónOrigen:");
		lblEstacinorigen.setBounds(345, 325, 129, 17);
		frame.getContentPane().add(lblEstacinorigen);
		
		lblEstacinDestino = new JLabel("Estación Destino:");
		lblEstacinDestino.setBounds(345, 354, 129, 17);
		frame.getContentPane().add(lblEstacinDestino);
		
		lblDuracin = new JLabel("Duración:");
		lblDuracin.setBounds(345, 385, 87, 17);
		frame.getContentPane().add(lblDuracin);
		
		lblResea = new JLabel("Reseña:");
		lblResea.setBounds(345, 414, 60, 17);
		frame.getContentPane().add(lblResea);
		
		txtIdR = new JTextField();
		txtIdR.setEditable(false);
		txtIdR.setBounds(492, 265, 114, 21);
		frame.getContentPane().add(txtIdR);
		txtIdR.setColumns(10);
		
		txtUsuarioR = new JTextField();
		txtUsuarioR.setBounds(492, 294, 114, 21);
		frame.getContentPane().add(txtUsuarioR);
		txtUsuarioR.setColumns(10);
		
		txtEstaciónOR = new JTextField();
		txtEstaciónOR.setBounds(492, 323, 114, 21);
		frame.getContentPane().add(txtEstaciónOR);
		txtEstaciónOR.setColumns(10);
		
		txtEstacionDR = new JTextField();
		txtEstacionDR.setBounds(492, 352, 114, 21);
		frame.getContentPane().add(txtEstacionDR);
		txtEstacionDR.setColumns(10);
		
		txtDuracionR = new JTextField();
		txtDuracionR.setBounds(492, 383, 114, 21);
		frame.getContentPane().add(txtDuracionR);
		txtDuracionR.setColumns(10);
		
		txtReseñaR = new JTextField();
		txtReseñaR.setBounds(492, 412, 114, 21);
		frame.getContentPane().add(txtReseñaR);
		txtReseñaR.setColumns(10);
		
		tableR = new JTable();
		tableR.setBounds(345, 28, 277, 161);
		frame.getContentPane().add(tableR);
		
		lblId_1 = new JLabel("Id:");
		lblId_1.setBounds(704, 267, 60, 17);
		frame.getContentPane().add(lblId_1);
		
		lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(704, 296, 60, 17);
		frame.getContentPane().add(lblNombre_1);
		
		lblUbiccacin = new JLabel("Ubicación:");
		lblUbiccacin.setBounds(704, 325, 76, 17);
		frame.getContentPane().add(lblUbiccacin);
		
		lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(704, 354, 76, 17);
		frame.getContentPane().add(lblCapacidad);
		
		lblPuestos = new JLabel("Puestos:");
		lblPuestos.setBounds(704, 385, 60, 17);
		frame.getContentPane().add(lblPuestos);
		
		lblBicicletas = new JLabel("Bicicletas:");
		lblBicicletas.setBounds(704, 414, 76, 17);
		frame.getContentPane().add(lblBicicletas);
		
		txtIdE = new JTextField();
		txtIdE.setEditable(false);
		txtIdE.setBounds(819, 265, 114, 21);
		frame.getContentPane().add(txtIdE);
		txtIdE.setColumns(10);
		
		txtNombreE = new JTextField();
		txtNombreE.setBounds(819, 294, 114, 21);
		frame.getContentPane().add(txtNombreE);
		txtNombreE.setColumns(10);
		
		txtUbiE = new JTextField();
		txtUbiE.setBounds(819, 323, 114, 21);
		frame.getContentPane().add(txtUbiE);
		txtUbiE.setColumns(10);
		
		txtCapacidadE = new JTextField();
		txtCapacidadE.setBounds(819, 352, 114, 21);
		frame.getContentPane().add(txtCapacidadE);
		txtCapacidadE.setColumns(10);
		
		txtPuestosE = new JTextField();
		txtPuestosE.setBounds(819, 383, 114, 21);
		frame.getContentPane().add(txtPuestosE);
		txtPuestosE.setColumns(10);
		
		txtBicicletasE = new JTextField();
		txtBicicletasE.setBounds(819, 412, 114, 21);
		frame.getContentPane().add(txtBicicletasE);
		txtBicicletasE.setColumns(10);
		
		tableE = new JTable();
		tableE.setBounds(716, 28, 277, 161);
		frame.getContentPane().add(tableE);
		
		lblId_2 = new JLabel("Id:");
		lblId_2.setBounds(1073, 267, 60, 17);
		frame.getContentPane().add(lblId_2);
		
		lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(1073, 296, 60, 17);
		frame.getContentPane().add(lblTipo);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(1073, 325, 60, 17);
		frame.getContentPane().add(lblEstado);
		
		lblUbicacinEstacion = new JLabel("Ubicación Estacion:");
		lblUbicacinEstacion.setBounds(1073, 354, 132, 17);
		frame.getContentPane().add(lblUbicacinEstacion);
		
		txtUbiB = new JTextField();
		txtUbiB.setBounds(1210, 352, 114, 21);
		frame.getContentPane().add(txtUbiB);
		txtUbiB.setColumns(10);
		
		txtEstadoB = new JTextField();
		txtEstadoB.setBounds(1210, 323, 114, 21);
		frame.getContentPane().add(txtEstadoB);
		txtEstadoB.setColumns(10);
		
		txtTipoB = new JTextField();
		txtTipoB.setBounds(1210, 294, 114, 21);
		frame.getContentPane().add(txtTipoB);
		txtTipoB.setColumns(10);
		
		txtIDB = new JTextField();
		txtIDB.setEditable(false);
		txtIDB.setBounds(1210, 263, 114, 21);
		frame.getContentPane().add(txtIDB);
		txtIDB.setColumns(10);
		
		table = new JTable();
		table.setBounds(1087, 28, 265, 161);
		frame.getContentPane().add(table);
	}

}
