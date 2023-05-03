package negocio;

public class StreetFighter {
    
    private boolean punch;
    private boolean kick;

    public StreetFighter() {
        this.punch = false;
        this.kick = false;
    }

    public boolean isPunch() {
        return punch;
    }

    public boolean isKick() {
        return kick;
    }

    public void doPunch() {
        System.out.println("Personagem atacou com soco.");
        this.punch = true;
    }

    public void undoPunch() {
        System.out.println("Personagem parou de atacar com soco.");
        this.punch = false;
    }

    public void doKick() {
        System.out.println("Personagem atacou com chute alto.");
        this.kick = true;
    }

    public void undoKick() {
        System.out.println("Personagem parou de atacar com chute alto.");
        this.kick = false;
    }
    
}
