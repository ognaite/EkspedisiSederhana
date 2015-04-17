package ekspedisisederhana;

public class Penerima {
    private String nama;
    private Alamat alamatPenerima = new Alamat();    
    private String telpon;

    public String getNama() {
        return nama;
    }

   public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamatPenerima() {
        return (alamatPenerima.getAlamat1()+", Kelurahan "+alamatPenerima.getKelurahan()+", Kecamatan "+alamatPenerima.getKecamatan());
    }

   public void setAlamatPenerima(String alamat1,String kelurahan,String kecamatan) {
        this.alamatPenerima.setAlamat1(alamat1);
        this.alamatPenerima.setKelurahan(kelurahan);
        this.alamatPenerima.setKecamatan(kecamatan);
    }
   
   public String getTelpon(){
       return telpon;
   }
   
   public void setTelpon(String telpon){
       this.telpon = telpon;
   }

   
}
