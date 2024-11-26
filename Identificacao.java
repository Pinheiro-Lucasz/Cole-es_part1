package Lista;

public class Identificacao implements Comparable<Identificacao>{
    public String nome;
    public String genero;

    public Identificacao(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public int compareTo(Identificacao identificacao) {
        return this.nome.compareTo(identificacao.getNome());
    }

}

