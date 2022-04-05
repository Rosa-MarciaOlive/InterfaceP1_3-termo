public class Principal {
    public static void main(String[]args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rosa Márcia");
        funcionario.setCPF("12345678.1");
        funcionario.setSalario(10.000);
        funcionario.setDepartamento("Tecnológia da Comunicação");

        Gerente gerente = new Gerente();
        gerente.setSenha(123);

        System.out.println("Nome do Funcionario: "+funcionario.getNome());
        System.out.println("CPF: "+funcionario.getCPF());
        System.out.println("Salário: "+funcionario.getSalario());
        System.out.println("Departamento: "+funcionario.getDepartamento());

        System.out.println("Digite sua senha de acesso numerica: " +gerente.getSenha());

    }   
}
