package catalogo;

public class FabricaOrcos extends FabricaAbstracta {
	
	@Override
	public AbstractoEscudo crearescudo() {
		// TODO Auto-generated method stub
		return new EscudoOrco();
	}
	@Override
	public AbstractoArma creararma() {
		// TODO Auto-generated method stub
		return new ArmaOrco();
	}
	@Override
	public AbstractoCuerpo crearcuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoOrco();
	}

}
