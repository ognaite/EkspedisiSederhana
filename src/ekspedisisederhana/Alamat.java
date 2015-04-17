package ekspedisisederhana;

public class Alamat {
    private String alamat1;
    private String kelurahan;
    private String kecamatan;
    
    Alamat(){
        alamat1="";
        kelurahan="";
        kecamatan="";
    }
    public String getAlamat1() {
        return alamat1;
    }

   
    public void setAlamat1(String alamat1) {
        this.alamat1 = alamat1;
    }

    
    public String getKelurahan() {
        return kelurahan;
    }

    
    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

   
    public String getKecamatan() {
        return kecamatan;
    }

   
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
}
