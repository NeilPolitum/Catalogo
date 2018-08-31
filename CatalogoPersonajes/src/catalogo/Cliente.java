package catalogo;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cliente {
	private AbstractoArma abstractoArma;
	private AbstractoEscudo abstractoEscudo;
	private AbstractoCuerpo abstractoCuerpo;

	// Constructor
	public Cliente(FabricaAbstracta fabrica) {
		abstractoArma = fabrica.creararma();
		abstractoEscudo = fabrica.crearescudo();
		abstractoCuerpo= fabrica.crearcuerpo();
	}
	public String Arma() {
		return abstractoArma.Mostrar2(abstractoArma);
	}
	public String Escudo() {
		return abstractoEscudo.Mostrar2(abstractoEscudo);
	}
	public String Cuerpo() {
		return abstractoCuerpo.Mostrar2(abstractoCuerpo);
	}
	public Image Arma1() {
		return abstractoArma.Mostrar().getImage();
	}
	public Image Escudo1() {
		return abstractoEscudo.Mostrar().getImage();
	}
	public Image Cuerpo1(){
		return abstractoCuerpo.Mostrar().getImage();
	}
	

}