package negocio;

public class CommandBtnBStreetFighter implements Command {

    private StreetFighter streetFighter;

    public CommandBtnBStreetFighter(StreetFighter streetFighter) {
        this.streetFighter = streetFighter;
    }

    @Override
    public void execute() {
        this.streetFighter.doPunch();
    }

    @Override
    public void undo() {
        this.streetFighter.undoPunch();
    }

}
