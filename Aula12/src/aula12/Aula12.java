package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        PeixePalhaco peixePalhaco = new PeixePalhaco();
        Arara arara = new Arara();
        
        canguru.locomover();
        cachorro.emitirSom();
    }
    
}
