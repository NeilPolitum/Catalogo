package catalogo;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class GuiElfo extends javax.swing.JFrame {

	private JFrame frame;

	public GuiElfo() {
		initComponents();
	}
	public void mostrar() {
		frame.setVisible(true);
	}

	private void initComponents() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		FabricaAbstracta fabrica = new FabricaElfos();
		Cliente cliente = new Cliente(fabrica);
		
		
		JPanel panel1 = new JPanel();
		Graphics g = panel1.getGraphics();
		Image img = cliente.Arma1();
		g.drawImage(img, 26, 33, 197, 198, null);  
		


		JPanel panel2 = new JPanel();
		Graphics g1 = panel2.getGraphics();
		Image img1 = cliente.Cuerpo1();
		g.drawImage(img, 247, 11, 140, 121, null);
		
		
		JPanel panel3 = new JPanel();
		Graphics g2 = panel3.getGraphics();
		Image img2 = cliente.Escudo1();
		g.drawImage(img, 247, 133, 140, 118, null);

		
		JButton volver = new JButton("Volver");
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Gui Gui= new Gui();
				Gui.mostrar();
			}
		});
		volver.setBounds(172, 212, 89, 23);
		panel.add(volver);
	}
        
        public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
		public void run() {
                    new GuiElfo().setVisible(true);
		}
            });
	}

}
