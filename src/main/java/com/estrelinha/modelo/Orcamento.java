public class Orcamento {

    private Peca peca;
    private Material material;
    private Double gasto;
    private Double maoDeObra;



    
    @Deprecated
    public Orcamento(Peca peca, Material material, Double gasto, Double maoDeObra) {
        this.peca = peca;
        this.material = material;
        this.gasto = gasto;
        this.maoDeObra = maoDeObra;
    }

    public Peca getPeca() {
        return peca;
    }
    public void setPeca(Peca peca) {
        this.peca = peca;
    }


    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }


    public Double getGasto() {
        return gasto;
    }
    public void setGasto(Double gasto) {
        this.gasto = gasto;
    }


    public Double getMaoDeObra() {
        return maoDeObra;
    }
    public void setMaoDeObra(Double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((peca == null) ? 0 : peca.hashCode());
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        result = prime * result + ((gasto == null) ? 0 : gasto.hashCode());
        result = prime * result + ((maoDeObra == null) ? 0 : maoDeObra.hashCode());
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
        Orcamento other = (Orcamento) obj;
        if (peca == null) {
            if (other.peca != null)
                return false;
        } else if (!peca.equals(other.peca))
            return false;
        if (material == null) {
            if (other.material != null)
                return false;
        } else if (!material.equals(other.material))
            return false;
        if (gasto == null) {
            if (other.gasto != null)
                return false;
        } else if (!gasto.equals(other.gasto))
            return false;
        if (maoDeObra == null) {
            if (other.maoDeObra != null)
                return false;
        } else if (!maoDeObra.equals(other.maoDeObra))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Orcamento peca=" + peca + ", material=" + material + ", gasto=" + gasto + ", maoDeObra=" + maoDeObra + "";
    }
}
