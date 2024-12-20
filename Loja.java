public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    // Métodos Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
        salarioBaseFuncionario = -1;
    }
    
    // Métodos GET
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    
    // Métodos SET
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    public double gastosComSalario(){
        if(salarioBaseFuncionario != -1){
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
        else{
            return salarioBaseFuncionario;
        }
    }
    
    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';
        } 
        else if (quantidadeFuncionarios <= 30){
            return 'M';
        }
        else{
            return 'G';
        }
    }
    
    public void imprimeProdutos(){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null){
                System.out.println(estoqueProdutos[i].toString());
            }
        } 
    }
    
    public boolean produtosPreenchidos(){
        for (Produto produto : estoqueProdutos) {
            if (produto == null) {
                return false;
            }
        }
        return true;
    }
    
    public boolean insereProduto(Produto produto){
        boolean insere = false;
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                insere = true;
                break;
            }
        }
        return insere;
    }
    
    public boolean removeProduto(String nomeProduto){
        boolean remove = false;
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome() != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null;
                remove = true;
            }
        }
        return remove;
    }
    
    public String getProdutosFormat(){
        String produtos = "";
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null){
                produtos += estoqueProdutos[i].toString();
            }
        }
        return produtos != "" ? "\nProdutos:\n" + produtos : "";
    }
    
    // ToString
    @Override
    public String toString(){
        return "\n" + "Loja: " + nome + "\n" +
            "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
            "Salario Base do Funcionário: " + salarioBaseFuncionario + "\n" +
            "Data de fundação: " + dataFundacao.toString() + "\n" +
            "Endereço: " + endereco.toString() +
             getProdutosFormat() + "\n";
    }
}
