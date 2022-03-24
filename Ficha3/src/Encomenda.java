import java.util.*;

public class Encomenda {
    private String nome;
    private String NIF;
    private String morada;
    private int nrEncomenda;
    private String data;
    private ArrayList<LinhaDeEncomenda> linhasEnc;

    public Encomenda(){
        this.nome = "";
        this.NIF = "";
        this.morada = "morada";
        this.nrEncomenda = 0;
        this.data = "";
        this.linhasEnc = new ArrayList<>();
    }

    public Encomenda(String nome, String NIF, String morada, int nrEncomenda, String data, ArrayList<LinhaDeEncomenda> linhasEnc) {
        this.nome = nome;
        this.NIF = NIF;
        this.morada = morada;
        this.nrEncomenda = nrEncomenda;
        this.data = data;
        this.linhasEnc = new ArrayList<>();
        for(LinhaDeEncomenda a : linhasEnc){
            this.linhasEnc.add(a.clone());
        }
    }

    public Encomenda(Encomenda umaEncomenda){
        this.nome = umaEncomenda.getNome();
        this.NIF = umaEncomenda.getNIF();
        this.morada = umaEncomenda.getMorada();
        this.nrEncomenda = umaEncomenda.getNrEncomenda();
        this.data = umaEncomenda.getData();
        this.linhasEnc = new ArrayList<>();
        for (LinhaDeEncomenda a : umaEncomenda.getLinhasEnc()){
            this.linhasEnc.add(a.clone());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNrEncomenda() {
        return nrEncomenda;
    }

    public void setNrEncomenda(int nrEncomenda) {
        this.nrEncomenda = nrEncomenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<LinhaDeEncomenda> getLinhasEnc() {
        return this.linhasEnc.stream().map(LinhaDeEncomenda::clone).toList();
    }

    public void setLinhasEnc(ArrayList<LinhaDeEncomenda> umaListEncomenda) {
        this.linhasEnc.clear();

        for(LinhaDeEncomenda le : umaListEncomenda){
            this.linhasEnc.add(le.clone());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encomenda encomenda = (Encomenda) o;
        return nrEncomenda == encomenda.nrEncomenda
                && Objects.equals(nome, encomenda.nome) && Objects.equals(NIF, encomenda.NIF)
                && Objects.equals(morada, encomenda.morada) && Objects.equals(data, encomenda.data)
                && this.linhasEnc.equals(encomenda.getLinhasEnc());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Encomenda{").append("\n");
        sb.append("nome='").append(nome).append('\'').append(", NIF='")
                .append(NIF).append('\'').append(", morada='")
                .append(morada).append('\'').append(", nrEncomenda=")
                .append(nrEncomenda).append(", data='")
                .append(data).append('\'')
                .append(", linhasEnc=" + this.linhasEnc.toString() + "\n" +
                        '}');
        return sb.toString();
    }

    public Encomenda clone(){
        return new Encomenda(this);
    }

    public double calculaValorTotal(){
        double total = 0;
        for(LinhaDeEncomenda v : this.linhasEnc){
            total += v.calculaValorLinhaEnc();
        }
        return total;
    }

    public double calculaValorDesconto(){
        double total = 0;
        for(LinhaDeEncomenda v : this.linhasEnc){
            total += v.calculaValorDesconto();
        }
        return total;
    }

    public double numeroTotalProdutos(){
        double total = 0;
        for(LinhaDeEncomenda v : this.linhasEnc){
            total += v.getQuantidade();
        }
        return total;
    }

    public boolean existeProdutoEncomenda(String refProduto){
        Iterator<LinhaDeEncomenda> it =this.linhasEnc.iterator();
        boolean flag = false;
        while(it.hasNext() && !flag){
            LinhaDeEncomenda a = it.next();
            if (a.getReferencia().equals(refProduto)){
                flag = true;
            }
        }

        return flag;
    }

    public void adicionaLinha(LinhaDeEncomenda linha){
        this.linhasEnc.add(linha);
    }

    public void removeProduto(String codProd){
        this.linhasEnc.removeIf(a -> a.getReferencia().equals(codProd));
    }
}
