import java.util.Scanner;
public class Principal {
    public static void main(String[]args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Emanuelle");
        funcionario.setCPF("12345678.1");
        funcionario.setSalario(10.000);
        funcionario.setDepartamento("Tecnológia da Comunicação");

        Gerente gerente = new Gerente();
        gerente.setNome("Rosa Márcia");
        gerente.setSenha(123);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Funcionario: "+funcionario.getNome());
        System.out.println("CPF: "+funcionario.getCPF());
        System.out.println("Salário: "+funcionario.getSalario());
        System.out.println("Departamento: "+funcionario.getDepartamento());

        System.out.println("Digite sua senha de acesso numerica: " );
        if(gerente.autenticacao(sc.nextInt())){
            System.out.println("Acesso liberado."); 
            System.out.println("Olá Sra: "+gerente.getNome());
     }else{
         System.out.println("Senha incorreta.");
     }
    }   
}
