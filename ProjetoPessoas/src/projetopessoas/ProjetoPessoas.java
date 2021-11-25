package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Claudineide");          p1.setSexo("F");            p1.setIdade(39);
        p2.setNome("Marllon");              p2.setSexo("M");            p2.setIdade(17);
        p3.setNome("Guanabara");            p3.setSexo("M");            p3.setIdade(44);
        p4.setNome("Marcelo");              p4.setSexo("M");            p4.setIdade(46);
        
        p2.setCurso("Java POO");
        p3.setSalario(3000.84f);
        p4.setSetor("Cozinha");
        
        p3.ReceberAumento(239.77f);
        p4.mudarTrabalho();
        p2.cancelarMatricula();
        
        System.out.println(p1.toString());
        System.out.println("");
        
        System.out.println(p2.toString());
        System.out.println(p2.statusAluno()+ "\n");
        
        System.out.println(p3.toString());
        System.out.println(p3.statusProf()+ "\n");
        
        System.out.println(p4.toString());
        System.out.println(p4.statusFunc()+ "\n");
    }
    
}
