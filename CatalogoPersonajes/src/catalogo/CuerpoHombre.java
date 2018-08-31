package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CuerpoHombre extends AbstractoCuerpo{
	public String Mostrar2(AbstractoCuerpo hombre) {
		String resultado="mira ese cuerpo de hombre";
		return resultado;
	}
	private ImageIcon CuerpoHombre = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/hombre.jpeg")).getImage());
	public ImageIcon Mostrar() {
		return CuerpoHombre;
	}
}
