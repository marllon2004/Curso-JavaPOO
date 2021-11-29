package aula12;

public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sem som");
    }
    
    // ---- SETTERS E GETTERS

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
