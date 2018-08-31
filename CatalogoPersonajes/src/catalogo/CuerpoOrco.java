package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CuerpoOrco extends AbstractoCuerpo{
	public String Mostrar2(AbstractoCuerpo orco) {
		String resultado="mira ese cuerpo de orco";
		return resultado;
	}
	private ImageIcon CuerpoOrco = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/orco.jpg")).getImage());
	public ImageIcon Mostrar() {
		return CuerpoOrco;
	}
}
