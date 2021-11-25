package projetopessoas;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("Matrícula cancelada!");
    }

    public String statusAluno() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + '}';
    }
    
    // ------ SETTERS E GETTERS
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
