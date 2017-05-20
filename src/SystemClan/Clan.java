package SystemClan;

public class Clan {
   private int peringkat;
   private String namaclan;
   private int level;
   private int kekuatan;
   private int jumlahanggota;

    public Clan(int peringkat, String namaclan, int level, int kekuatan, int jumlahanggota) { //deklarasi variabel
        this.peringkat = peringkat;
        this.namaclan = namaclan;
        this.level = level;
        this.kekuatan = kekuatan;
        this.jumlahanggota = jumlahanggota;
    }

    public int getPeringkat() { //method getter
        return peringkat;
    }
    public String getNamaclan() {
        return namaclan;
    }
    public int getLevel() {
        return level;
    }
    public int getKekuatan() {
        return kekuatan;
    }
    public int getJumlahanggota() {
        return jumlahanggota;
    }
}
