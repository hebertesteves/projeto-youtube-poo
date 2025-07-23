public class ProjetoYoutube {
    public static void main(String[] args) {
        // Criando vídeos
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula 1 de POO");
        videos[1] = new Video("Aula 12 de PHP");
        videos[2] = new Video("Aula 10 de HTML");

        // Testando ações em um vídeo
        System.out.println("=== Teste direto no vídeo ===");
        videos[0].play();
        videos[0].like();
        videos[0].pause();
        System.out.println(videos[0]);

        // Criando gafanhotos (usuários)
        Gafanhoto[] gafanhotos = new Gafanhoto[2];
        gafanhotos[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        gafanhotos[1] = new Gafanhoto("Creuza", 18, "F", "creuzita");

        // Criando visualizações
        Visualizacao[] visualizacoes = new Visualizacao[2];

        System.out.println("\n=== Visualização 1 ===");
        visualizacoes[0] = new Visualizacao(gafanhotos[0], videos[1]);
        visualizacoes[0].avaliar(10);
        videos[1].like();
        System.out.println(visualizacoes[0]);

        System.out.println("\n=== Visualização 2 ===");
        visualizacoes[1] = new Visualizacao(gafanhotos[1], videos[2]);
        visualizacoes[1].avaliar(88.5); // Testando método com porcentagem
        videos[2].like();
        System.out.println(visualizacoes[1]);

        // Exibindo estado final dos vídeos e gafanhotos
        System.out.println("\n=== Estado Final dos Vídeos ===");
        for (Video v : videos) {
            System.out.println(v);
        }

        System.out.println("\n=== Estado Final dos Gafanhotos ===");
        for (Gafanhoto g : gafanhotos) {
            System.out.println(g);
        }
    }
}
