package epicode.it.stream;

public class Dipendenti {
    private String nome;
    private Double stipendio;

    public String getNome() {
        return nome;
    }

    public Double getStipendio() {
        return stipendio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStipendio(Double stipendio) {
        this.stipendio = stipendio;
    }

    public Dipendenti(String nome, Double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public Dipendenti() {
    }
}
