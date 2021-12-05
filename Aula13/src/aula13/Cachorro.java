package aula13;

public class Cachorro extends Lobo{
    
    public void reagir(String frase){
        if(frase.equals("comidinha") || frase.equals("oii")){
            System.out.println("Abanando o rabo e latindo");
        }
        else{
            System.out.println("Rosnando");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Feliz");
        }
        else if(hora > 18){
            System.out.println("Tédio");
        }
        else{
            System.out.println("Dormindo");
        }
    }
    
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanando o rabo");
        }
        else{
            System.out.println("Rosnando e latindo");
        }
    }
    
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Filhote latindo");
            }
            else{
                System.out.println("Filhote abanando");
            }
        }
        else{
            if(peso > 10){
                System.out.println("Rosnando");
            }
            else{
                System.out.println("Ignorando");
            }
        }
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au! Au!");
    }
}
