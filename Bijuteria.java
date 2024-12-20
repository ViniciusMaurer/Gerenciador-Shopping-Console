public class Bijuteria extends Loja
{
    private double metaVendas;
    
    // Construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }
    
    // Métodos GET
    public double getMetaVendas(){
        return metaVendas;
    }
    
    // Métodos SET 
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    // toString
    @Override
    public String toString(){
        return "\n" + "Loja: " + super.getNome() + "\n" +
            "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
            "Salario Base do Funcionário: " + super.getSalarioBaseFuncionario() + "\n" +
            "Data de fundação: " + super.getDataFundacao().toString() + "\n" +
            "Endereço: " + super.getEndereco().toString() + "\n" +
            "Meta de Vendas: " + metaVendas + "\n" +
            super.getProdutosFormat();
    }
}
