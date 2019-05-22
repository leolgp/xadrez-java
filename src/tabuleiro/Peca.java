package tabuleiro;
public class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;
    
    
    public Boolean movimentosPossiveis(){
        return null;
    }

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    
    
    
    
}
