package catalogo;

public class FabricaElfos extends FabricaAbstracta {
	@Override
	public AbstractoEscudo crearescudo() {
		return new EscudoElfo();
	}

	@Override
	public AbstractoArma creararma() {
		return new ArmaElfo();
	}

	@Override
	public AbstractoCuerpo crearcuerpo() {
		return new CuerpoElfo();
	}
	

}
