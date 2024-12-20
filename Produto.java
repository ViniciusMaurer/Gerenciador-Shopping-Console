public class Produto
{
    private String nome;
    private double preco;
    private Data dataValidade;
    
    //Métodos Contrutores
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    // Métodos GET
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    
    // Métodos SET
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data data){
        if(data.getAno() > dataValidade.getAno()){
            return true;
        }
        else if(data.getAno() == dataValidade.getAno() && data.getMes() > dataValidade.getMes()){
            return true;
        }
        else if(data.getAno() == dataValidade.getAno() && data.getMes() == dataValidade.getMes() && data.getDia() > dataValidade.getDia()){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Método toString()
    @Override
    public String toString(){
        return "\n" + "Produto: " + nome + "\n" +
            "Preço: " + preco + "\n" +
            "Data de validade: " + dataValidade.toString() + "\n";
    }
}
