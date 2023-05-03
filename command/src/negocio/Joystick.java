package negocio;

public class Joystick {

    private Command botoes[];

    public Joystick() {
        this.botoes = new Command[2];
    }

    public void pressOnButton(int botaoNum) {
        this.botoes[botaoNum].execute();
    }

    public void pressOffButton(int botaoNum) {
        this.botoes[botaoNum].undo();
    }
    
    public Command[] getBotoes() {
        return botoes;
    }

    public void setBotoes(Command[] botoes) {
        this.botoes = botoes;
    }

    public void setBotao(int i, Command command) {
        this.botoes[i] = command;
    }

}
