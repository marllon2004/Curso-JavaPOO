package aula11;

public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa de " + this.getNome() +" está sendo renovada");
    }

    @Override
    public String toString() {
        return "Bolsista{nome=" + nome + ", idade=" + idade + ", sexo=" + sexo  + ", bolsa=" + bolsa + '}';
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("O aluno "+ this.getNome() +" é bolsista! Pagamento realizado!");
    }
    
    // ---- SETTERS E GETTERS

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
