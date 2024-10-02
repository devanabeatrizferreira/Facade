public class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(Burguer burguer, Sobremesa sobremesa, Bebida bebida) {
        this.burguer = burguer;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }

    public void mostrarItens() {
        if (burguer != null) {
            System.out.println("Burguer: " + burguer.getDescricao() + ", " + burguer.getGramas() + "g, R$" + burguer.getPreco());
        }
        if (sobremesa != null) {
            System.out.println("Sobremesa: " + sobremesa.getDescricao() + ", Tamanho: " + sobremesa.getTamanho() + ", R$" + sobremesa.getPreco());
        }
        if (bebida != null) {
            System.out.println("Bebida: " + bebida.getDescricao() + ", " + bebida.getMl() + "ml, R$" + bebida.getPreco());
        }
    }
}
