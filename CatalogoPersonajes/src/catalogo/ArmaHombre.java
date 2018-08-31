package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ArmaHombre extends AbstractoArma{
	public String Mostrar2(AbstractoArma hombre) {
		String resultado="mira esa arma de hombre";
		return resultado;
	}
	private ImageIcon ArmaHombre = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/espadaHombre.jpg")).getImage());
	public ImageIcon Mostrar() {
		return ArmaHombre;
	}

}