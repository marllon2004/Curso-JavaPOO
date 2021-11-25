package exerciciolivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPag(totPag);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setLeitor(leitor);
    }
    
    public void detalhes(){
        System.out.println(" ##### DETALHES DO LIVRO ##### ");
        System.out.println("Título: "+ this.getTitulo());
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Total de Páginas: "+ this.getTotPag());
        System.out.println("Página Atual: "+ this.getPagAtual());
        System.out.println("Livro está aberto? "+ this.getAberto());
        System.out.println("Nome do leitor: "+ this.getLeitor().getNome());
    }
    
    // --------- MÉTODOS DA INTERFACE PUBLICAÇÃO
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPag()){
            this.setPagAtual(this.pagAtual);
        }
        else{
            this.setPagAtual(p);
        }
    }

    @Override
    public void proximaPag() {
        this.setPagAtual(pagAtual++);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(pagAtual--);
    }
    
    //---------- SETTERS E GETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
