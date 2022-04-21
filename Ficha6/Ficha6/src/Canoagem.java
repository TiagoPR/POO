public class Canoagem extends Atividade{
    public String emb;
    public double velVento;
    public double dirVento;
    public double dist;
    public int nVoltas;

    public Canoagem(){
        emb = "/na";
        velVento = 0;
        dirVento = 0;
        dist = 0;
        nVoltas = 0;
    }

    public Canoagem(Canoagem umaCanoa){
        emb = umaCanoa.getEmb();
        velVento = umaCanoa.getVelVento();
        dirVento = umaCanoa.getDirVento();
        dist = umaCanoa.getDist();
        nVoltas = umaCanoa.getnVoltas();
    }

    public String getEmb() {
        return emb;
    }

    public void setEmb(String emb) {
        this.emb = emb;
    }

    public double getVelVento() {
        return velVento;
    }

    public void setVelVento(double velVento) {
        this.velVento = velVento;
    }

    public double getDirVento() {
        return dirVento;
    }

    public void setDirVento(double dirVento) {
        this.dirVento = dirVento;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public int getnVoltas() {
        return nVoltas;
    }

    public void setnVoltas(int nVoltas) {
        this.nVoltas = nVoltas;
    }

    @Override
    public double valorCalorias() {
        return 0;
    }

    public Canoagem clone(){
        return new Canoagem(this);
    }
}
