package aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float porcento){
        porcento = porcento / 100.0f;
        
        this.setSalario(salario + (porcento * salario));
    }

    @Override
    public String toString() {
        return "Professor{nome=" + nome + ", idade=" + idade + ", sexo=" + sexo  + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    
    // --- SETTERS E GETTERS
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
