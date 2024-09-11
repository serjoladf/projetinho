public class Moto extends Veiculos {

    private String cor;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void ligarFarol(){
        System.out.println("Farol ligado");
    }
}
