package tabuleiro;

public class Tabuleiro {
    
    private Integer linhas;
    private Integer colunas;    
    private Peca [][] pecas;

    public Tabuleiro(Integer linhas, Integer colunas) {
        if (linhas < 1 || colunas < 1){
            throw new ExcecaoTabuleiro("Erro de criação do tabuleiro: "
                    + "Tem que existir pelo menos uma linha e uma coluna.");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca [linhas][colunas];
    }

    public Integer getLinhas() {
        return linhas;
    }
    
    public Integer getColunas() {
        return colunas;
    }
    
    public Peca peca (Integer linha, Integer coluna){
        if(!posicaoExiste(linha,coluna)){
        throw new ExcecaoTabuleiro("Posição não existe.");
    }
        return pecas[linha][coluna];
}
    
    public Peca peca (Posicao posicao){
        if(!posicaoExiste(posicao)){
        throw new ExcecaoTabuleiro("Posição não existe.");
    }
        return pecas [posicao.getLinha()][posicao.getColuna()];
    }
    
    public void colocarPeca (Peca peca, Posicao posicao){
        if (temUmaPeca(posicao)){
            throw new ExcecaoTabuleiro("Já existe uma peça na posição " + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    
    public Boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(),posicao.getColuna());
    }
    
    private Boolean posicaoExiste(Integer linha, Integer coluna){
        return linha>=0 && linha<linhas && coluna>=0 && coluna<colunas;
    }
    
    public Boolean temUmaPeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
        throw new ExcecaoTabuleiro("Posição não existe.");
    }
        return peca(posicao) != null;
    }
    
}
