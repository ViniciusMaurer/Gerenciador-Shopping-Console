public class Vestuario extends Loja
{
    private boolean produtosImportados;
    
    // Construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }
    
    // Métodos GET
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    
    // Métodos SET
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    // toString
    @Override
    public String toString(){
        return "\n" + "Loja: " + super.getNome() + "\n" +
            "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
            "Salario Base do Funcionário: " + super.getSalarioBaseFuncionario() + "\n" +
            "Data de fundação: " + super.getDataFundacao().toString() + "\n" +
            "Endereço: " + super.getEndereco().toString() + "\n" +
            "Produtos Importados: " + produtosImportados + "\n" +
            super.getProdutosFormat();
    }
}
