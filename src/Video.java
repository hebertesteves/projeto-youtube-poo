public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (!this.getReproduzindo()) {
            System.out.println("O vídeo " + this.getTitulo()+ " está sendo reproduzido.");
            this.setReproduzindo(true);
        } else {
            System.out.println("Não é possível dar play, o vídeo " + this.getTitulo() + " já está em reprodução.");
        }
    }

    @Override
    public void pause() {
        if (this.getReproduzindo()) {
            System.out.println("O vídeo " + this.getTitulo() + " foi pausado.");
            this.setReproduzindo(false);
        } else {
            System.out.println("Não é possível dar pause, o vídeo " + this.getTitulo() + " está pausado.");
        }
    }

    @Override
    public void like() {
        System.out.println("O vídeo " + this.getTitulo() + " recebeu +1 like.");
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalhes do Vídeo:\n");
        sb.append("Título: ").append(this.getTitulo()).append("\n");
        sb.append("Avaliação: ").append(this.getAvaliacao()).append("\n");
        sb.append("Views: ").append(this.getViews()).append("\n");
        sb.append("Curtidas: ").append(this.getCurtidas()).append("\n");
        sb.append("Reproduzindo: ").append(this.getReproduzindo() ? "Sim" : "Não").append("\n");
        return sb.toString();
    }
}
