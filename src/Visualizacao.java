public class Visualizacao {
    private Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.video = filme;
        this.espectador.viuMaisUm();
        this.video.setViews(this.video.getViews() + 1);
        this.video.play();
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void avaliar() {
        int nota = 5;
        System.out.println("Você avaliou o video " + this.video.getTitulo() + " com nota " + nota);
        this.getVideo().setAvaliacao(nota);
    }

    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            System.out.println("Você avaliou o video " + this.video.getTitulo() + " com nota " + nota);
            this.getVideo().setAvaliacao(nota);
        } else {
            System.out.println("Valor inválido. Digite uma nota entre 0 e 10.");
        }
    }

    public void avaliar(double porc) {
        int nota = 0;
        if (porc <= 20) {
            nota = 3;
        } else if (porc <= 50) {
            nota = 5;
        } else if (porc <= 90) {
            nota = 8;
        } else {
            nota = 10;
        }

        System.out.println("Você avaliou o video " + this.video.getTitulo() + " com nota " + nota);
        this.video.setAvaliacao(nota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Visualização: \n");
        sb.append("Espectador: ").append(this.espectador.getNome()).append("\n");
        sb.append("Vídeo: ").append(this.video.getTitulo()).append("\n");
        sb.append("Avaliação atual: ").append(this.video.getAvaliacao()).append("\n");
        return sb.toString();
    }
}
