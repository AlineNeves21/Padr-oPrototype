public class Endereco implements Cloneable {

    private String cidade;
    private String logradouro;
    private Integer numero;

    public Endereco(String cidade, String logradouro, Integer numero) {
        super();
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", número=" + numero +
                '}';
    }
}
