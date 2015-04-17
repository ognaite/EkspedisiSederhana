package ekspedisisederhana;

public class Pengirim {

    private String nama;
    private Alamat alamatPengirim = new Alamat();
    private String telpon;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamatPengirim() {
        return (alamatPengirim.getAlamat1()+",Kelurahan "+alamatPengirim.getKelurahan()+",Kecamatan "+alamatPengirim.getKecamatan());
    }

  
    public void setAlamatPengirim(String alamat1,String kelurahan,String kecamatan){
        this.alamatPengirim.setAlamat1(alamat1);
        this.alamatPengirim.setKelurahan(kelurahan);
        this.alamatPengirim.setKecamatan(kecamatan);
    }

    public String getTelpon(){
        return telpon;
    }
    
    public void setTelpon(String telpon){
        this.telpon = telpon;
    }
   
}
