package projcompanhiaaerea;


public class Aeroporto {
    private String nomeAeroporto;
    private int codAeroporto;
    private static int qtdAeroportos;

    Aeroporto(){
        Aeroporto.qtdAeroportos = Aeroporto.qtdAeroportos+1;
        this.codAeroporto = qtdAeroportos;
    }
    
    public static int getQtdAeroportos() {
        return qtdAeroportos;
    }

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

    public int getCodAeroporto() {
        return codAeroporto;
    }

    public void setCodAeroporto(int codAeroporto) {
        this.codAeroporto = codAeroporto;
    }
    
    void mostraAeroporto(){
        System.out.println("Nome Aeroporto: " + this.getNomeAeroporto());
    }
    
    
}
