public class Funcionario{

    private String nome;
    private String CPF;
    private double salario;
    private String departamento;

    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getSalario() {
        return salario;
    }public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double bonificacao(){
        return this.getSalario()+(this.getSalario()*0.1);
    }/* ouu
    public double bonificacao(){
        double conta = getSalario() * 10/100;
        return conta;
    }*/
    
}