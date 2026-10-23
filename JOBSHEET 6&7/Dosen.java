public class Dosen extends Pegawai {
    public String nidn;
    public String bidang;
    public String MataKuliah;

    public Dosen() {
        super();
        this.nidn = "-";
        this.bidang = "";
    }

    public Dosen(String nip, String nama, double gaji,
                 String nidn, String bidang) {
        super(nip, nama, gaji);
        this.nidn = nidn;
        this.bidang = bidang;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + "\nNIDN: " + nidn
                + "\nBidang: " + bidang;
    }

    }
