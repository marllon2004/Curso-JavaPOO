package exerciciolivro;

public class ExercicioLivro {

    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];
        
        pessoa[0] = new Pessoa("Marllon", 17, "M");
        pessoa[1] = new Pessoa("Maria", 25, "F");
        
        livro[0] = new Livro("Livro de PHP", "João", 158, pessoa[0]);
        livro[1] = new Livro("Livro de JavaScript", "Domingos", 460, pessoa[1]);
        livro[2] = new Livro("Livro de Java POO", "Guanabara", 30, pessoa[0]);
        
        livro[0].abrir();
        livro[0].folhear(19);
        livro[0].detalhes();
        
        livro[2].detalhes();
    }
    
}
