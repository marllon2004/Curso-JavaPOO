package aula11;

public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Praticando....");
    }

    @Override
    public String toString() {
        return "Tecnico{nome=" + nome + ", idade=" + idade + ", sexo=" + sexo  + ", registroProfissional=" + registroProfissional + '}';
    }
    
    // ---- SETTERS E GETTERS

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
