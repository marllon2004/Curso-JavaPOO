package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private float altura;
    private float peso;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, float altura, float peso, int idade, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    public void apresentar(){
        System.out.println(" ----- APRESENTAÇÃO ----- ");
        System.out.println("LUTADOR: "+ this.getNome());
        System.out.println("ORIGEM: "+ this.getNacionalidade());
        System.out.println(this.getIdade() +" ANOS");
        System.out.println(this.getAltura() +"M DE ALTURA");
        System.out.println("PESO: "+ this.getPeso());
        System.out.println("VITÓRIAS: "+ this.getVitorias());
        System.out.println("DERROTAS: "+ this.getDerrotas());
        System.out.println("EMPATES: "+ this.getEmpates());
    }
    
    public void status(){
        System.out.println(" ----- STATUS DO LUTADOR ----- ");
        System.out.println("LUTADOR "+ this.getNome() +", "+ this.getCategoria() +", POSSUI "+ this.getVitorias() +" VITÓRIAS, "+ this.getDerrotas() +" DERROTAS E "+ this.getEmpates() +" EMPATES!");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //-------------- GETS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
}
