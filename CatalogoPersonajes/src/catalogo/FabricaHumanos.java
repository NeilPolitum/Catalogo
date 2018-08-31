package catalogo;

public class FabricaHumanos extends FabricaAbstracta{

	@Override
	public AbstractoEscudo crearescudo() {
		// TODO Auto-generated method stub
		return new EscudoHombre();
	}

	@Override
	public AbstractoArma creararma() {
		// TODO Auto-generated method stub
		return new ArmaHombre();
	}

	@Override
	public AbstractoCuerpo crearcuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoHombre();
	}

}
