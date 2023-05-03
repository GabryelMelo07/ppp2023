package negocio;

public class MaquinaGomaVendida implements MaquinaState {

    @Override
    public MaquinaState insereMoeda() {
        return this;
    }

    @Override
    public MaquinaState ejetaMoeda() {
        return this;
    }

    @Override
    public MaquinaState acionaAlavanca() {
        return this;
    }

    @Override
    public MaquinaState entregaGoma() {
        return new MaquinaSemMoeda();
    }

}
