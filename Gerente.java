public class Gerente extends Funcionario{

    public double senha;

    public double getSenha() {
        return senha;
    } public void setSenha(double senha) {
        this.senha = senha;
    } 
    
    public boolean autenticacao(double senhaInput){
        if (senhaInput == this.getSenha()){
            return true;
        }else{
            return false;
        }/* ouuu
        public void autentificacao(int senha){

        if(senha == getSenha()){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado");
        }
    }*/

    }
}  

