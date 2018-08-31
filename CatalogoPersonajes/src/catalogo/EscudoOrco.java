package catalogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EscudoOrco extends AbstractoEscudo{
	public String Mostrar2(AbstractoEscudo orco) {
		String resultado="mira ese escudo de orco";
		return resultado;
	}
	private ImageIcon EscudoOrco = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/escudoOrco.jpg")).getImage());
	public ImageIcon Mostrar() {
		return EscudoOrco;
	}
}
