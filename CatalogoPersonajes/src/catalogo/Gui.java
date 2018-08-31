package catalogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends javax.swing.JFrame {

	private JFrame frame;

	public Gui() {
		initialize();
	}
	
	public void mostrar() {
		frame.setVisible(true);
	}

        private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnHombre = new JButton("Hombre");
		btnHombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				GuiHombre GuiHombre = new GuiHombre();
				GuiHombre.mostrar();
			}
		});
		btnHombre.setBounds(172, 85, 89, 23);
		panel.add(btnHombre);

		JButton btnOrco = new JButton("Orco");
		btnOrco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				GuiOrco guiO = new GuiOrco();
				guiO.mostrar();
			}
		});
		btnOrco.setBounds(172, 147, 89, 23);
		panel.add(btnOrco);

		JButton btnElfos = new JButton("Elfos");
		btnElfos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				GuiElfo GuiElfo= new GuiElfo();
				GuiElfo.mostrar();
			}
		});
		btnElfos.setBounds(172, 212, 89, 23);
		panel.add(btnElfos);

		JLabel lblCatalogoDePersonajes = new JLabel("Catalogo de personajes");
		lblCatalogoDePersonajes.setBounds(156, 24, 137, 14);
		panel.add(lblCatalogoDePersonajes);
	}
        
        public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
                            new Gui().setVisible(true);
			}
		});
	}
	
}
