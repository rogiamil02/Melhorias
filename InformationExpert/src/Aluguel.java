
public class Aluguel {
	private Fita fita;
    private int diasAlugada;
    private int ValorPorDia;
    
    public Aluguel(Fita fita, int diasAlugada, int ValorPorDia) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
        this.ValorPorDia = ValorPorDia;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public int getValorPorDia() {
    	return ValorPorDia;
    }
}
