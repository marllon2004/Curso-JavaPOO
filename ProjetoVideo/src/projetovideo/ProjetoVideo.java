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
       
       /*System.out.println("LISTA DOS VÍDEOS ");
       System.out.println(video[0].toString());
       System.out.println(video[1].toString());
       System.out.println(video[2].toString());
       System.out.println("\nLISTA DOS GAFANHOTOS");
       System.out.println(gafanhoto[0].toString());
       System.out.println(gafanhoto[1].toString());*/
       
       Visualizacao visu[] = new Visualizacao[5];
       visu[0] = new Visualizacao(gafanhoto[1], video[2]);
       visu[0].avaliar();
       System.out.println(visu[0].toString());
       
       visu[1] = new Visualizacao(gafanhoto[1], video[0]);
       visu[1].avaliar(75.0f);
       System.out.println(visu[1].toString());
    }
    
}
