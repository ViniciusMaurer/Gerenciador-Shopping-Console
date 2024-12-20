public class Alimentacao extends Loja
{
    private Data dataAlvara;
    
    // Construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }
    
    // Métodos GET
    public Data getDataAlvara(){
        return dataAlvara;
    }
    
    // Métodos SET
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    // toString
    @Override
    public String toString(){
        return "\n" + "Loja: " + super.getNome() + "\n" +
            "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
            "Salario Base do Funcionário: " + super.getSalarioBaseFuncionario() + "\n" +
            "Data de fundação: " + super.getDataFundacao().toString() + "\n" +
            "Endereço: " + super.getEndereco().toString() + "\n" +
            "Data do Alvara: " + dataAlvara.toString() + "\n" +
             super.getProdutosFormat();
    }
}
