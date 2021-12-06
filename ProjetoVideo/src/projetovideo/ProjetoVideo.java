package projetovideo;

public class ProjetoVideo {

    public static void main(String[] args) {
       Video video[] = new Video[3];
       video[0] = new Video("Apresentação TCC");
       video[1] = new Video("Aula de Geometria");
       video[2] = new Video("Aula de Python");
       
       Gafanhoto gafanhoto[] = new Gafanhoto[2];
       gafanhoto[0] = new Gafanhoto("Marllon", 17, "M","marllin");
       gafanhoto[1] = new Gafanhoto("Jullie", 23, "F", "jullie20");
       
       System.out.println(video[1].toString());
       System.out.println(gafanhoto[0].toString());
    }
    
}
