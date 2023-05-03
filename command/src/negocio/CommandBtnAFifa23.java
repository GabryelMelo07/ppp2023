package negocio;

public class CommandBtnAFifa23 implements Command {

    private Fifa23 fifa23;

    public CommandBtnAFifa23(Fifa23 fifa23) {
        this.fifa23 = fifa23;
    }

    @Override
    public void execute() {
        this.fifa23.correr();
    }

    @Override
    public void undo() {
        this.fifa23.pararDeCorrer();
    }

}
