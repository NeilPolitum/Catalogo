package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EscudoHombre extends AbstractoEscudo{
	public String Mostrar2(AbstractoEscudo hombre) {
		String resultado="mira ese escudo de hombre";
		return resultado;
	}
	private ImageIcon EscudoHombre= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/escudoHombre.png")).getImage());
	public ImageIcon Mostrar() {
		return EscudoHombre;
	}
}
