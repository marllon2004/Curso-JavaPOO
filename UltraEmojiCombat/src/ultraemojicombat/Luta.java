package ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1!= lutador2){
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        }
        else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            System.out.println(" ----- DESAFIADO ----- ");
            this.getDesafiado().apresentar();
            System.out.println(" ----- DESAFIANTE ----- ");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            System.out.println(" ----- RESULTADO DA LUTA -----");
            
            switch(vencedor){
                case 0:
                    System.out.println("EMPATE!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                    
                case 1:
                    System.out.println("O LUTADOR "+ this.getDesafiado().getNome() +" GANHOU A LUTA!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                    
                case 2:
                    System.out.println("O LUTADOR "+ this.getDesafiante().getNome() +" GANHOU A LUTA!");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
            System.out.println(" -------------------- ");
        }
        else{
            System.out.println("Luta impossível!");
        }
    }
    
    //------- SETERS E GETTERS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
