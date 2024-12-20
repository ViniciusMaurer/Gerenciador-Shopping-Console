public class Cosmetico extends Loja
{
    private double taxaComercializacao;
    
    // Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // Métodos GET
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    
    // Métodos SET
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // toString
    @Override
    public String toString(){
        return "\n" + "Loja: " + super.getNome() + "\n" +
            "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
            "Salario Base do Funcionário: " + super.getSalarioBaseFuncionario() + "\n" +
            "Data de fundação: " + super.getDataFundacao().toString() + "\n" +
            "Endereço: " + super.getEndereco().toString() + "\n" +
            "Taxa de Comercialização: " + taxaComercializacao + "\n" +
            super.getProdutosFormat();
    }
}
