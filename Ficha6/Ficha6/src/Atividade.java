public abstract class Atividade{
    private String id;
    private String descricao;
    private String dataRealizada;
    private int tempo;

    public Atividade(){
        id = "/na";
        descricao = "/na";
        dataRealizada = "/na";
        tempo = 0;
    }

    public Atividade(String id, String descricao, String dataRealizada, int tempo) {
        this.id = id;
        this.descricao = descricao;
        this.dataRealizada = dataRealizada;
        this.tempo = tempo;
    }

    public Atividade(Atividade umaAtividade){
        this.id = umaAtividade.getId();
        this.descricao = umaAtividade.getDescricao();
        this.dataRealizada = umaAtividade.getDataRealizada();
        this.tempo = umaAtividade.getTempo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataRealizada() {
        return dataRealizada;
    }

    public void setDataRealizada(String dataRealizada) {
        this.dataRealizada = dataRealizada;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public abstract double valorCalorias();

    public abstract Atividade clone();
}
