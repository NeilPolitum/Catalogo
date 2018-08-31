package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ArmaElfo extends AbstractoArma{
	public String Mostrar2(AbstractoArma elfo) {
		String resultado="mira esa arma de elfo";
		return resultado;
	}
	 private ImageIcon ArmaELfo= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/armaElfo.png")).getImage());
	public ImageIcon Mostrar() {
		return ArmaELfo;
	}
}
