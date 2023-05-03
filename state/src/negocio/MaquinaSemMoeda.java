package negocio;

public class MaquinaSemMoeda implements MaquinaState {

    @Override
    public MaquinaState insereMoeda() {
        return new MaquinaRecebeuMoeda();
    }

    @Override
    public MaquinaState ejetaMoeda() {
        return new MaquinaGomasAcabaram();
    }

    @Override
    public MaquinaState acionaAlavanca() {
        return this;
    }

    @Override
    public MaquinaState entregaGoma() {
        return this;
    }

}
