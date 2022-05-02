public class Dono  implements Cloneable {

    private String nomeDono;
    private Endereco endereco;

    public Dono(String nomeDono, Endereco endereco) {
        super();
        this.nomeDono = nomeDono;
        this.endereco = endereco;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public Dono clone() throws CloneNotSupportedException {
        Dono donoClone = (Dono) super.clone();
        donoClone.endereco = (Endereco) donoClone.endereco.clone();
        return donoClone;
    }


    @Override
    public String toString() {
        return "Dono{" +
                "nome='" + nomeDono + '\'' +
                ", endereço=" + endereco +
                '}';
    }
}
