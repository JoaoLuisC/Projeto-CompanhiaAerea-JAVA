package projcompanhiaaerea;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private final int codVoo;
    private static int qtdVoos;
    private String origem, destino, dataHoraSaida;
    Aeronave aviao;
    Aeroporto aeroporto;
    
    List<Passageiro> listaPassageiros = new ArrayList();
    
    Voo(Passageiro passageiro, Aeronave aeronave, Aeroporto aeroporto){
        Voo.qtdVoos = Voo.qtdVoos+1;
        this.codVoo = qtdVoos;
        this.aeroporto = aeroporto;
        this.aviao = aeronave;
    }
    
    
    public String getOrigem() {
        return origem;
    }

    public int getCodVoo() {
        return codVoo;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
    
    void mostraVoo(){
        System.out.println("Origem: " + this.getOrigem());
        System.out.println("Destino: " + this.getDestino());
        System.out.println("Data de Saida: " + this.getDataHoraSaida());
        System.out.println("Aeroporto: " + this.aeroporto.getNomeAeroporto());
        System.out.println("Aeronave: " + this.aviao.getNomeAviao());
        System.out.println("--------------------------");
        System.out.println("Passageiros do Voo:\n");
        for(Passageiro passageiro:listaPassageiros){
            passageiro.mostraPassageiro();
            System.out.println("-----------------------");
        }
    }
    
    void addPassageiro(Passageiro passageiro, Voo voo){
        voo.listaPassageiros.add(passageiro);
    }
    
}
