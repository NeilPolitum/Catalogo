package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EscudoElfo extends AbstractoEscudo{
	public String Mostrar2(AbstractoEscudo elfo) {
		String resultado="mira ese escudo de elfo";
		return resultado;
	}
	private ImageIcon EscudoElfo = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/escudoElfo.png")).getImage());
	public ImageIcon Mostrar() {
		return EscudoElfo;
	}
}
