package negocio;

public class MaquinaRecebeuMoeda implements MaquinaState {

    @Override
    public MaquinaState insereMoeda() {
        return this;
    }

    @Override
    public MaquinaState ejetaMoeda() {
        return new MaquinaSemMoeda();
    }

    @Override
    public MaquinaState acionaAlavanca() {
        return new MaquinaGomaVendida();
    }

    @Override
    public MaquinaState entregaGoma() {
        return this;
    }

}
