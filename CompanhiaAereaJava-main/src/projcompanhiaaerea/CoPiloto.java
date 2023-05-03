package projcompanhiaaerea;

public class CoPiloto extends Funcionario {
    
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario + 1250);  
    }
    
}
