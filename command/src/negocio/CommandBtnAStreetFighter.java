package negocio;

public class CommandBtnAStreetFighter implements Command {

    private StreetFighter streetFighter;

    public CommandBtnAStreetFighter(StreetFighter streetFighter) {
        this.streetFighter = streetFighter;
    }

    @Override
    public void execute() {
        this.streetFighter.doKick();
    }
    
    @Override
    public void undo() {
        this.streetFighter.undoKick();
    }
    
}
