public class Principal
{
    public static void main(String[] args){
        
        // Entrada de dados do Shopping
        System.out.println("GERENCIADOR DE SHOPPING CENTER");
        String nomeShopping = Teclado.leString("Digite o nome do Shopping: ");
        int qtdLojas = Teclado.leInt("Digite a quantidade de lojas: ");
        System.out.println("Informações do endereço do shopping");
        String nomeDaRuaShopping = Teclado.leString("Digite o nome da rua: ");
        String cidadeShopping = Teclado.leString("Digite o nome da cidade: ");
        String estadoShopping = Teclado.leString("Digite o nome do estado: ");
        String paisShopping = Teclado.leString("Digite o nome do país: ");
        String cepShopping = Teclado.leString("Digite o CEP: ");
        String numeroShopping = Teclado.leString("Digite o número: ");
        String complementoShopping = Teclado.leString("Digite o complemento: ");
        Endereco enderecoShopping = new Endereco(nomeDaRuaShopping, cidadeShopping, estadoShopping, paisShopping, cepShopping, numeroShopping, complementoShopping);
        Shopping shopping = new Shopping(nomeShopping, enderecoShopping, qtdLojas);
        
            
        int entrada = 0;
        
        while(entrada != 6){            
            // Entrada de dados do menu
            System.out.println();
            System.out.println("-------MENU-------");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) remove uma loja");
            System.out.println("(4) remove um produto");
            System.out.println("(5) exibir informações");
            System.out.println("(6) sair");
            entrada = Teclado.leInt("Digite uma opção: ");
            
            // Validar entrada
            if(entrada == 6){
                break;
            }
            if(entrada != 1 && entrada != 2 && entrada != 3 && entrada != 4 && entrada != 5){
                System.out.println("\nOpção inválida\n");
                continue;
            }
            
            
            if(entrada == 1){
                // Valida número de lojas
                if(shopping.lojasPreenchidas() == qtdLojas){
                    System.out.println();
                    System.out.println("O shopping já tem o número máximo de lojas!");
                    continue;
                }
                
                // Entrada de dados da loja
                System.out.println();
                System.out.println("SELECIONE O TIPO DA LOJA");
                System.out.println("(1) Alimentação");
                System.out.println("(2) Bijuteria");
                System.out.println("(3) Cosméticos");
                System.out.println("(4) Informática");
                System.out.println("(5) Vestuário");
                System.out.println("(6) Outro");
                int tipoLoja = Teclado.leInt("Digite uma opção: ");
                
                System.out.println("Informações básicas da loja");
                String nomeDaLoja = Teclado.leString("Digite o nome da loja: ");
                int quantidadeFuncionarios = Teclado.leInt("Digite a quantidade de funcionários: ");
                double salarioBaseFuncionario = Teclado.leDouble("Digite o salário base dos funcionários: ");
                System.out.println("Informações do endereço da loja");
                String nomeDaRua = Teclado.leString("Digite o nome da rua: ");
                String cidade = Teclado.leString("Digite o nome da cidade: ");
                String estado = Teclado.leString("Digite o nome do estado: ");
                String pais = Teclado.leString("Digite o nome do país: ");
                String cep = Teclado.leString("Digite o CEP: ");
                String numero = Teclado.leString("Digite o número: ");
                String complemento = Teclado.leString("Digite o complemento: ");
                System.out.println("Informações da data de fundação da loja");
                int dia = Teclado.leInt("Digite o dia: ");
                int mes = Teclado.leInt("Digite o mês: ");
                int ano = Teclado.leInt("Digite o ano: ");
                int quantidadeProdutos = Teclado.leInt("Digite a quantidade de produtos da loja: ");
                
                // instanciando objetos
                Endereco enderecoLoja = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                Data dataFundacaoLoja = new Data(dia, mes, ano);
                
                if(tipoLoja == 1){
                    System.out.println("Informações da data de alvara da loja");
                    int diaAlvara = Teclado.leInt("Digite o dia: ");
                    int mesAlvara = Teclado.leInt("Digite o mês: ");
                    int anoAlvara = Teclado.leInt("Digite o ano: ");
                    Data dataAlvara = new Data(dia, mes, ano);
                    
                    Alimentacao alimentacaoLoja = new Alimentacao(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacaoLoja, dataAlvara, quantidadeProdutos);
                    if(shopping.insereLoja(alimentacaoLoja)){
                        System.out.println("Loja inserida com sucesso!");
                    }else{
                        System.out.println("Falha ao inserir loja!");
                    }
                }
                if(tipoLoja == 2){
                    double metaVendas = Teclado.leDouble("Digite a meta de vendas: ");
                    
                    Bijuteria bijuteriaLoja = new Bijuteria(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacaoLoja, metaVendas, quantidadeProdutos);
                    if(shopping.insereLoja((Loja)bijuteriaLoja)){
                        System.out.println("Loja inserida com sucesso!");
                    }else{
                        System.out.println("Falha ao inserir loja!");
                    }
                }
                if(tipoLoja == 3){
                    double taxaComercializacao = Teclado.leDouble("Digite a taxa de comercialização: ");
                    
                    Cosmetico cosmeticoLoja = new Cosmetico(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacaoLoja, taxaComercializacao, quantidadeProdutos);
                    if(shopping.insereLoja(cosmeticoLoja)){
                        System.out.println("Loja inserida com sucesso!");
                    }else{
                        System.out.println("Falha ao inserir loja!");
                    }
                }
                if(tipoLoja == 4){
                    double seguroEletronicos = Teclado.leDouble("Digite o valor do seguro de eletrônicos: ");
                    
                    Informatica informaticaLoja = new Informatica(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacaoLoja, seguroEletronicos, quantidadeProdutos);
                    if(shopping.insereLoja(informaticaLoja)){
                        System.out.println("Loja inserida com sucesso!");
                    }else{
                         System.out.println("Falha ao inserir loja!");
                    }
                }
                if(tipoLoja == 5){
                    int verificaProdutosImportados = Teclado.leInt("Produtos Importados? (1) SIM (2) NÃO: ");
                    boolean produtosImportados = verificaProdutosImportados == 1 ? true : false;
                    
                    Vestuario vestuarioLoja = new Vestuario(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacaoLoja, produtosImportados, quantidadeProdutos);
                    if(shopping.insereLoja(vestuarioLoja)){
                        System.out.println("Loja inserida com sucesso!");
                    }else{
                        System.out.println("Falha ao inserir loja!");
                    }
                }
                if(tipoLoja == 6){
                    Loja loja = new Loja(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacaoLoja, quantidadeProdutos);
                    if(shopping.insereLoja(loja)){
                        System.out.println("Loja inserida com sucesso!");
                    }else{
                        System.out.println("Falha ao inserir loja!");
                    }
                }
            }
            if(entrada == 2){
                // Valida Lojas Criadas
                if(shopping.naoExisteLojas()){
                    System.out.println();
                    System.out.println("Você precisa criar uma loja para inserir um produto!");
                    continue;
                }
                
                // Exibe Lojas Criadas
                System.out.println();
                System.out.println("SELECIONE UMA LOJA PARA ADICIONAR O PRODUTO");
                Loja[] lojas = shopping.getLojas();
                for(int i = 0; i < lojas.length; i++){
                    if(lojas[i] != null){
                        System.out.println("(" + (i + 1) + ")" +" - " + lojas[i].getNome());
                    }
                }
                int lojaSelecionada = Teclado.leInt("Digite a opção: ");
                
                // Valida Entrada
                if(lojaSelecionada < 1 || lojaSelecionada > shopping.lojasPreenchidas()){
                    System.out.println();
                    System.out.println("Opção Inválida!");
                    continue;
                }
                
                // Valida quantidade de produtos
                if(lojas[lojaSelecionada - 1].produtosPreenchidos()){
                    System.out.println();
                    System.out.println("A loja já tem o número máximo de produtos preenchidos!");
                    continue;
                }
                
                // Entrada de dados do produto
                System.out.println();
                System.out.println("Informações básicas do produto");
                String nomeDoProduto = Teclado.leString("Digite o nome do produto: ");
                double preco = Teclado.leDouble("Digite o preço do produto: ");
                System.out.println("Informações da data de validade do produto");
                int dia = Teclado.leInt("Digite o dia: ");
                int mes = Teclado.leInt("Digite o mês: ");
                int ano = Teclado.leInt("Digite o ano: "); 
                
                // instanciando objeto produto
                Data dataValidade = new Data(dia, mes, ano);
                Produto produto = new Produto(nomeDoProduto, preco, dataValidade);
                
                if(lojas[lojaSelecionada - 1].insereProduto(produto)){
                    System.out.println("Produto inserido com sucesso!");
                }else{
                    System.out.println("Falha ao inserir produto!");
                }
            }
            if(entrada == 3){
                // Valida Lojas Criadas
                if(shopping.naoExisteLojas()){
                    System.out.println();
                    System.out.println("Você precisa criar uma loja para excluir!");
                    continue;
                }
                
                System.out.println();
                // Entrada nome da loja
                String nomeLojaExcluir = Teclado.leString("Digite o nome da loja que deseja excluir: ");
                
                // Exclui loja
                if(shopping.removeLoja(nomeLojaExcluir)){
                    System.out.println("Loja excluída com sucesso!");
                }else{
                    System.out.println("Loja não encontrada!");
                }
            }
            if(entrada == 4){
                // Valida Lojas Criadas
                if(shopping.naoExisteLojas()){
                    System.out.println();
                    System.out.println("Você precisa criar uma loja para excluir algum produto!");
                    continue;
                }
                
                // Exibe Lojas Criadas
                System.out.println();
                System.out.println("SELECIONE UMA LOJA PARA EXCLUIR ALGUM PRODUTO");
                Loja[] lojas = shopping.getLojas();
                for(int i = 0; i < lojas.length; i++){
                    if(lojas[i] != null){
                        System.out.println("(" + (i + 1) + ")" +" - " + lojas[i].getNome());
                    }
                }
                int lojaSelecionada = Teclado.leInt("Digite a opção: ");
                
                // Valida Entrada
                if(lojaSelecionada < 1 || lojaSelecionada > shopping.lojasPreenchidas()){
                    System.out.println();
                    System.out.println("Opção Inválida!");
                    continue;
                }
                
                System.out.println();
                // Entrada nome do produto
                String nomeProdutoExcluir = Teclado.leString("Digite o nome do produto que deseja excluir: ");
                
                // Exclui loja
                if(lojas[lojaSelecionada - 1].removeProduto(nomeProdutoExcluir)){
                    System.out.println("Produto excluído com sucesso!");
                }else{
                    System.out.println("Produto não encontrado!");
                }   
            }
            if(entrada == 5){
                System.out.println(shopping.toString());
            }
        }
    }
}