public class Informatica extends Loja
{
    private double seguroEletronicos;
    
    // Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    // Métodos GET
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    
    // Métodos SET
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
    // toString
    @Override
    public String toString(){
        return "\n" + "Loja: " + super.getNome() + "\n" +
            "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
            "Salario Base do Funcionário: " + super.getSalarioBaseFuncionario() + "\n" +
            "Data de fundação: " + super.getDataFundacao().toString() + "\n" +
            "Endereço: " + super.getEndereco().toString() + "\n" +
            "Seguro dos Eletrônicos: " + seguroEletronicos + "\n" +
            super.getProdutosFormat();
    }
}
