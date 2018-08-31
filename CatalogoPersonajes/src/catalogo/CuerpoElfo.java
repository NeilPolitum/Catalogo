package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CuerpoElfo extends AbstractoCuerpo{
	public String Mostrar2(AbstractoCuerpo elfo) {
		String resultado="mira ese cuerpo de elfo";
		return resultado;
	}
	private ImageIcon CuerpoElfo = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/elfo.jpg")).getImage());
	public ImageIcon Mostrar() {
		return CuerpoElfo;
	}
}
