package negocio;

public class Maquina {
    
    private MaquinaState estado;
    private int qtd_gomas;

    public Maquina() {
        this.estado = new MaquinaSemMoeda();
        this.qtd_gomas = 5;
    }

    public MaquinaState getEstado() {
        return estado;
    }

    public int getQtd_gomas() {
        return qtd_gomas;
    }

    public void setQtd_gomas(int qtd_gomas) {
        this.qtd_gomas = qtd_gomas;
    }

    @Override
    public String toString() {
        return this.getEstado().getClass().getSimpleName();
    }

    public void insereMoeda() {
        this.estado = this.estado.insereMoeda();
    }

    public void ejetaMoeda() {
        this.estado = this.estado.ejetaMoeda();
    }

    public void acionaAlavanca() {
        this.estado = this.estado.acionaAlavanca();
    }

    public void entregaGoma() {
        if(this.qtd_gomas > 0) {
            this.qtd_gomas -= 1;
            this.estado = this.estado.entregaGoma();
        } else {
            this.estado = this.estado.ejetaMoeda();
        }
    }
    
}
