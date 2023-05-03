package negocio;

public class CommandBtnBFifa23 implements Command {

    private Fifa23 fifa23;

    public CommandBtnBFifa23(Fifa23 fifa23) {
        this.fifa23 = fifa23;
    }

    @Override
    public void execute() {
        this.fifa23.tocar();
    }

    @Override
    public void undo() {
        this.fifa23.pararDeTocar();
    }

}
