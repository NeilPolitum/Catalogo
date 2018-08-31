package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ArmaOrco extends AbstractoArma{
	public String Mostrar2(AbstractoArma orco) {
		String resultado="mira esa arma de orco";
		return resultado;
	}
	private ImageIcon ArmaOrco = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/Mandoble_orco.png")).getImage());
	public ImageIcon Mostrar() {
		return ArmaOrco;
	}
}
