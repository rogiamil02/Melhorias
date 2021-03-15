public class Fita {
	
    private String titulo;
    private Tipo codigoDePreco;
    private int ValorPorTamanho;
    public Fita(String titulo, Tipo codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }
    
    public Fita(int ValorPorTamanho) {
    	this.ValorPorTamanho = ValorPorTamanho;
    }
    public String getTitulo() {
        return titulo;
    }

    public Tipo getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePrevo(Tipo codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
}