package model;

import java.util.ArrayList;

public class Leiloeiro implements Subject {

    private ArrayList<Observer> vetObservers;
    private double maiorLance;
    private double lanceMinimo;
    private Licitante licitanteAtual;

    // Para instanciar um leiloeiro, informe o lance minímo para começar o leilão.
    public Leiloeiro(double lanceMinimo) {
        this.vetObservers = new ArrayList<>();
        this.lanceMinimo = lanceMinimo;
        this.maiorLance = 0;
    }

    public ArrayList<Observer> getVetObservers() {
        return vetObservers;
    }

    public double getLance() {
        return maiorLance;
    }

    public void setVetObservers(ArrayList<Observer> vetObservers) {
        this.vetObservers = vetObservers;
    }

    public void setLance(Licitante licitante, double lance) {
        if(lance > this.lanceMinimo && lance > this.maiorLance) {
            this.maiorLance = lance;
            this.licitanteAtual = licitante;
            this.notifyObservers();
        } else {
            throw new IllegalArgumentException("Valor do lance é menor ou igual ao atual.");
        }
    }
    
    @Override
    public void addObserver(Observer observer) {
        this.vetObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.vetObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < vetObservers.size(); i++) {
            this.vetObservers.get(i).update(this.licitanteAtual, this.maiorLance);
            System.out.println();
            System.out.println("==============================================================================");
        }
    }

}
