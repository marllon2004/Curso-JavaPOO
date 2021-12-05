package aula13;

public class Aula13 {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        
        dog.reagir("comidinha");
        dog.reagir("vem aqui");
        dog.reagir(07, 45);
        dog.reagir(21, 00);
        dog.reagir(true);
        dog.reagir(false);
        dog.reagir(2, 12.5f);
        dog.reagir(17, 4.5f);
    }
    
}
