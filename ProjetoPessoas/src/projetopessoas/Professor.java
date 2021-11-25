package projetopessoas;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    
    public void ReceberAumento(float aumento){
        this.setSalario(salario + aumento);
    }

    public String statusProf() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    //-------- SETTERS E GETTERS

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
