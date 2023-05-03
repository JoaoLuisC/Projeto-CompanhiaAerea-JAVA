package projcompanhiaaerea;

public class Funcionario extends Pessoa{
    //campo cargo sera substituido por classes futuramente
    private String  cargo, dataAdmissao; 
    private int  codFuncionario;
    private double salario;
    private static int qtdFuncionarios;

    
    Funcionario(){
        Funcionario.qtdFuncionarios = Funcionario.qtdFuncionarios+1;
        this.codFuncionario = qtdFuncionarios;
    }
    
    public static int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    void mostraFuncionario(){
        System.out.println("Nome Funcionario: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Data de Admissao: " + this.getDataAdmissao());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salario: R$" + this.getSalario());
    }
}
