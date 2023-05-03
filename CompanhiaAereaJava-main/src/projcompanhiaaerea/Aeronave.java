package projcompanhiaaerea;

public class Aeronave {
    private String nomeAviao, nomePiloto; 
    private int qtdAssento, codAeronave;
    private double autonomia, capacidadeCarga;
    private static int qtdAeronaves;
 

    Aeronave(Piloto piloto){
        Aeronave.qtdAeronaves = Aeronave.qtdAeronaves+1;
        this.codAeronave = qtdAeronaves;
        this.nomePiloto = piloto.getNome();
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }
    
    public static int getQtdAeronaves() {
        return qtdAeronaves;
    }

    public int getCodAeronave() {
        return codAeronave;
    }

    public void setCodAeronave(int codAeronave) {
        this.codAeronave = codAeronave;
    }

    public String getNomeAviao() {
        return nomeAviao;
    }

    public void setNomeAviao(String nomeAviao) {
        this.nomeAviao = nomeAviao;
    }

    public int getQtdAssento() {
        return qtdAssento;
    }

    public void setQtdAssento(int qtdAssento) {
        this.qtdAssento = qtdAssento;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    void mostraAeronave(){
        System.out.println("Nome da Aeronave: " + this.getNomeAviao());
        System.out.println("Qtd Assentos: " + this.getQtdAssento());
        System.out.println("Capacidade de Carga: " + this.getCapacidadeCarga() + "kg");
        System.out.println("Autonomia: " + this.getAutonomia() + "km");
        System.out.println("Piloto: " + this.getNomePiloto());
    }
    
}
