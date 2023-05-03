package projcompanhiaaerea;

import java.util.Scanner;

public class ProjCompanhiaAerea {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //todos os scans ficaram comentados na fase de testes para a facilitação do mesmo.
        //no projeto final será para cadastrar cada objeto por métodos
        
        //--------------------------------------------------------
        
        Passageiro passageiro1 = new Passageiro(21.5);
        /*System.out.println("Cadastro Passageiro: ");
        System.out.println("Nome: ");
        passageiro1.setNome(scan.nextLine());
        System.out.println("Email: ");
        passageiro1.setEmail(scan.nextLine());
        System.out.println("Telefone: ");
        passageiro1.setTelefone(scan.nextLine());
        System.out.println("Data de Nascimento: ");
        passageiro1.setDataNascimento(scan.nextLine());
        System.out.println("CPF: ");
        passageiro1.setCpf(scan.nextInt());
        System.out.println("Peso da Bagagem: ");
        passageiro1.setPesoBagagem(scan.nextDouble()); */
        
        passageiro1.setNome("Passageiro 1");
        passageiro1.setCpf(111111111);
        passageiro1.setEmail("passageiro1@email.com");
        passageiro1.setTelefone("(35)90000-0000");
        passageiro1.setDataNascimento("25/03/2023");
        passageiro1.setPesoBagagem(20.8);
        System.out.println("Passageiro Cadastrado!");
        
        Passageiro passageiro2 = new Passageiro(19);
        passageiro2.setNome("Passageiro 2");
        passageiro2.setCpf(2222222);
        passageiro2.setEmail("passageiro2@email.com");
        passageiro2.setTelefone("(35)91111-2500");
        passageiro2.setDataNascimento("20/01/2010");
        passageiro2.setPesoBagagem(15.1);
        System.out.println("Passageiro Cadastrado!");
        
        //-------------------------------------------------------
        
        Funcionario funcionario1 = new Funcionario();
        /*System.out.println("Cadastro Funcionario:");
 
        
        System.out.println("Nome Funcionario:");
        funcionario1.setNome(scan.nextLine());
        System.out.println("Cargo:");
        funcionario1.setCargo(scan.nextLine());
        System.out.println("Data de Nascimento:");
        funcionario1.setDataNascimento(scan.nextLine());
        System.out.println("Data de Admissao:");
        funcionario1.setDataAdmissao(scan.nextLine());
        System.out.println("CPF:");
        funcionario1.setCpf(scan.nextInt());
        System.out.println("Salario:");
        funcionario1.setSalario(scan.nextDouble());*/
        
        funcionario1.setNome("Funcionario 1");
        funcionario1.setCargo("Guarda");
        funcionario1.setDataNascimento("01/05/1999");
        funcionario1.setDataAdmissao("05/04/2018");
        funcionario1.setCpf(12222222);
        funcionario1.setSalario(5500.50);
        System.out.println("Funcionario Cadastrado!");
        
        Piloto piloto1 = new Piloto();
        
        piloto1.setNome("Piloto 1");
        piloto1.setCargo("Piloto");
        piloto1.setDataNascimento("02/07/1959");
        piloto1.setDataAdmissao("06/08/2015");
        piloto1.setCpf(555555555);
        piloto1.setSalario(11500);
        System.out.println("Piloto Cadastrado!");
       
        //------------------------------------------------------
        
        Aeronave aviao1 = new Aeronave(piloto1);
        /*System.out.println("Cadastro Aeronave:");
        
        System.out.println("Nome da Aeronave:");
        aviao1.setNomeAviao(scan.nextLine());
        System.out.println("Qtd Assentos:");
        aviao1.setQtdAssento(scan.nextInt());
        System.out.println("Capacidade de Carga:");
        aviao1.setCapacidadeCarga(scan.nextDouble());
        System.out.println("Autonomia:");
        aviao1.setAutonomia(scan.nextDouble());*/
        
        aviao1.setNomeAviao("Avião 1");
        aviao1.setQtdAssento(250);
        aviao1.setCapacidadeCarga(6000);
        aviao1.setAutonomia(8000);
        System.out.println("Aviao Cadastrado!");
        
        //-------------------------------------------------------
        
        Aeroporto aeroporto1 = new Aeroporto();
        /*System.out.println("Cadastro Aeroporto:");
        
        System.out.println("Nome Aeroporto:");
        aeroporto1.setNomeAeroporto(scan.nextLine());*/
        
        aeroporto1.setNomeAeroporto("Aeroporto 1");
        System.out.println("Aeroporto Cadastrado!");
        
       
        //--------------------------------------------------------
        
        Voo voo1 = new Voo(passageiro1, aviao1, aeroporto1);
        /*System.out.println("Cadastro Voo:");
        
        System.out.println("Destino: ");
        voo1.setDestino(scan.nextLine());
        System.out.println("Origem:");
        voo1.setOrigem(scan.nextLine());
        System.out.println("Data/Hora Saida:");
        voo1.setDataHoraSaida(scan.nextLine());*/
        
        voo1.setDestino("Cancun");
        voo1.setOrigem("São Paulo");
        voo1.setDataHoraSaida("15/06/2023 20:00:00");
        System.out.println("Voo Cadastrado!");
        
        passageiro1.addVoo(voo1);
        passageiro2.addVoo(voo1);
        //--------------------------------------------------------
        
        System.out.println("\n\nTeste:");
        
        passageiro1.mostraPassageiro();
        System.out.println("\n");
        
        aviao1.mostraAeronave();
        System.out.println("\n");
        
        aeroporto1.mostraAeroporto();
        System.out.println("\n");
        
        funcionario1.mostraFuncionario();
        System.out.println("\n");
        
        voo1.mostraVoo();
        System.out.println("\n");
        
        piloto1.mostraFuncionario();
        System.out.println("\n");
        
        
    }
    
}
