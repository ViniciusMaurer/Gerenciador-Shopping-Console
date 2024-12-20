public class Data
{
    private int dia;
    private int mes;
    private int ano;
    
    // Métodos Construtores
    public Data(int dia, int mes, int ano){
        // Validador data
        boolean validaData = false;
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        if(mes > 0 && mes <= 12 && dia > 0 && dia < 32 && ano > 0){
            if(dia <= diasPorMes[mes - 1]){
                validaData = true;
            }
            if(mes == 2 && dia == 29 && verificaAnoBissexto()){
                validaData = true;
            }
        }
        
        if(validaData){
            this.dia = dia; 
            this.mes = mes;
            this.ano = ano;
        }
        else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    // Métodos GET
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    // Métodos SET
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public boolean verificaAnoBissexto(){
        if(this.ano % 4 == 0 && (this.ano % 100 != 0 || this.ano % 400 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Método toString
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
}
