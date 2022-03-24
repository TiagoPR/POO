import java.util.Objects;

public class LinhaDeEncomenda {
    private String referencia;
    private String descricao;
    private double preçoAntesImp;
    private int quantidade;
    private static double IMPOSTO = 23;
    private static double DESCONTO = 10;

    public LinhaDeEncomenda() {
        this.referencia = "";
        this.descricao = "";
        this.preçoAntesImp = 0;
        this.quantidade = 0;
    }

    public LinhaDeEncomenda(String referencia, String descricao, double preçoAntesImp, int quantidade) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.preçoAntesImp = preçoAntesImp;
        this.quantidade = quantidade;
    }

    public LinhaDeEncomenda(LinhaDeEncomenda umaLinhaDeEncomenda){
        this.referencia = umaLinhaDeEncomenda.getReferencia();
        this.descricao = umaLinhaDeEncomenda.getDescricao();
        this.preçoAntesImp = umaLinhaDeEncomenda.getPreçoAntesImp();
        this.quantidade = umaLinhaDeEncomenda.getQuantidade();
    }

    public String getReferencia() {
        return referencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreçoAntesImp() {
        return preçoAntesImp;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static double getImposto() {
        return IMPOSTO;
    }

    public static double getDesconto() {
        return DESCONTO;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreçoAntesImp(double preçoAntesImp) {
        this.preçoAntesImp = preçoAntesImp;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void setImposto(int imposto) {
        LinhaDeEncomenda.IMPOSTO = imposto;
    }

    public static void setDesconto(int desconto) {
        LinhaDeEncomenda.DESCONTO = desconto;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinhaDeEncomenda that = (LinhaDeEncomenda) o;
        return that.getReferencia().equals(this.referencia) &&
                that.getDescricao().equals(this.descricao) &&
                that.getPreçoAntesImp() == this.preçoAntesImp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nReferencia: ").append(this.referencia)
                .append("\nDescrição: ").append(this.descricao)
                .append("\nPreço: ").append(this.preçoAntesImp).append("€")
                .append("\nQuantidade: ").append(this.quantidade)
                .append("\nImposto: ").append(LinhaDeEncomenda.IMPOSTO)
                .append("\nValor do desconto: ").append(LinhaDeEncomenda.DESCONTO).append("%");
        return sb.toString();
    }

    public LinhaDeEncomenda clone(){
        return new LinhaDeEncomenda(this);
    }

    public double calculaValorLinhaEnc(){
        return this.quantidade * (this.preçoAntesImp * (1+(LinhaDeEncomenda.IMPOSTO - LinhaDeEncomenda.DESCONTO)/100));
    }

    public double calculaValorDesconto(){
        return this.quantidade * (this.preçoAntesImp * (LinhaDeEncomenda.DESCONTO / 100));
    }
}
