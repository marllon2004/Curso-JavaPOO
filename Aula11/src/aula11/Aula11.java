package aula11;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula11 {

    public static void main(String[] args) {
        
        Locale localeBR = new Locale("pt", "BR");
        
        NumberFormat money = NumberFormat.getCurrencyInstance(localeBR);
        
        Visitante visitante1 = new Visitante();
        
        visitante1.setNome("Mauricio");
        visitante1.setIdade(26);
        visitante1.setSexo("M");
        System.out.println(visitante1.toString());
        System.out.println("------------------------");
        
        Aluno aluno1 = new Aluno();
        
        aluno1.setNome("Marllon");
        aluno1.setIdade(17);
        aluno1.setSexo("M");
        aluno1.setMatricula(19019);
        aluno1.setCurso("Desenvolvimento de Sistemas");
        System.out.println(aluno1.toString());
        aluno1.pagarMensalidade();
        System.out.println("------------------------");
        
        Bolsista bolsista1 = new Bolsista();
        
        bolsista1.setNome("Irineu");
        bolsista1.setBolsa(40.0f);
        bolsista1.setSexo("M");
        bolsista1.setIdade(19);
        System.out.println(bolsista1.toString());
        bolsista1.pagarMensalidade();
        System.out.println("------------------------");
        
        Professor prof1 = new Professor();
        
        prof1.setNome("Guanabara");
        prof1.setIdade(44);
        prof1.setSexo("M");
        prof1.setEspecialidade("Programação");
        prof1.setSalario(3144f);
        System.out.println("Salário sem aumento: "+ money.format(prof1.getSalario()));
        prof1.receberAumento(12);
        System.out.println(prof1.toString());
        System.out.println("Salário com aumento:" + money.format(prof1.getSalario()));
        System.out.println("------------------------");
        
        Tecnico tecnico1 = new Tecnico();
        
        tecnico1.setNome("Geovanna");
        tecnico1.setIdade(17);
        tecnico1.setMatricula(19020);
        tecnico1.setCurso("Contabilidade");
        tecnico1.setSexo("F");
        tecnico1.setRegistroProfissional(11221);
        System.out.println(tecnico1.toString());
        tecnico1.praticar();
    }
}