public class Peca {

    private String nome;
    private int quantidade;


    @Deprecated
    public Peca(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + quantidade;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Peca other = (Peca) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (quantidade != other.quantidade)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Peca nome=" + nome + ", quantidade=" + quantidade + "";
    }

    
    
    
}
