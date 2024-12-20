public class Shopping
{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    // Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }
    
    // Métodos GET
    public String getNome(){
        return nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Loja[] getLojas(){
        return lojas;
    }
    
    // Métodos SET
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    
    public boolean insereLoja(Loja loja){
        boolean insere = false;
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                insere = true;
                break;
            }
        }
        return insere;
    }
    
    public boolean removeLoja(String nomeLoja){
        boolean remove = false;
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome() != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)){
                lojas[i] = null;
                remove = true;
                break;
            }
        }
        return remove;
    }
    
    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidade = 0;
        if (tipoLoja != null) {
            tipoLoja = tipoLoja.toUpperCase();
            for(int i = 0; i < lojas.length; i++) {
                if(lojas[i] != null){
                    if (lojas[i] instanceof Cosmetico && tipoLoja.equalsIgnoreCase("COSMÉTICO")) {
                        quantidade++;
                    } else if (lojas[i] instanceof Vestuario && tipoLoja.equalsIgnoreCase("VESTUÁRIO")) {
                        quantidade++;
                    } else if (lojas[i] instanceof Bijuteria && tipoLoja.equalsIgnoreCase("BIJUTERIA")) {
                        quantidade++;
                    } else if (lojas[i] instanceof Alimentacao && tipoLoja.equalsIgnoreCase("ALIMENTAÇÃO")) {
                        quantidade++;
                    } else if (lojas[i] instanceof Informatica && tipoLoja.equalsIgnoreCase("INFORMÁTICA")) {
                        quantidade++;
                    }
                }
            }
        }
        return quantidade > 0 ? quantidade : -1;
    }
    
    public int lojasPreenchidas(){
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                contador++;
            }
        }
        return contador;
    }
    
    public boolean naoExisteLojas(){
        for (Loja loja : lojas) {
            if (loja != null) {
                return false;
            }
        }
        return true;
    }
    
    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaInformaticaMaiorSeguro = null;
        double maiorSeguro = 0;
        for(int i = 1; i < lojas.length; i++){
            if (lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica)lojas[i];
                if(lojaInformatica.getSeguroEletronicos() > maiorSeguro){
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaInformaticaMaiorSeguro = lojaInformatica;
                }
            }
        }
        return lojaInformaticaMaiorSeguro;
    }
    
    // ToString
    @Override
    public String toString(){
        String listaLojas = "";
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null){
                listaLojas += lojas[i].toString();
            }
        }
        
        return "\n" + "Shopping: " + nome + "\n" +
                "Endereco: " + endereco.toString() + "\n" +
                "\nLojas do Shopping:\n" + listaLojas + "\n";
    }
}
