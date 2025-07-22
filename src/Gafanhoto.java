public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1.0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalhes do Gafanhoto: \n");
        sb.append("Login: ").append(this.getLogin()).append("\n");
        sb.append("Total de Videos Assistidos: ").append(this.getTotAssistido()).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }
}
