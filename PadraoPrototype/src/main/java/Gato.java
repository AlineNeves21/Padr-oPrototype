public class Gato implements Cloneable {

    private int cod;
    private String nome;
    private Dono dono;
    private String raca;
    private String cor;

    public Gato(int cod, String nome, Dono dono, String raca, String cor) {
        this.cod = cod;
        this.nome = nome;
        this.dono = dono;
        this.raca = raca;
        this.cor = cor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Gato clone() throws CloneNotSupportedException {
        Gato gatoClone = (Gato) super.clone();
        gatoClone.dono = (Dono) gatoClone.dono.clone();
        return gatoClone;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "código=" + cod +
                ", nome='" + nome + '\'' +
                ", dono=" + dono +
                ", raça='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
