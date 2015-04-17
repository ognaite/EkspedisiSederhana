package ekspedisisederhana;

public class Resi extends Exception {
    private Pengirim pengirim = new Pengirim();
    private Penerima penerima = new Penerima();
    private DetailPaket detailPaket;
    
    public void setPengirimNama(String nama){
        pengirim.setNama(nama);
    }
    
    public void setPengirimAlamat(String alamat1,String kelurahan,String kecamatan){
        pengirim.setAlamatPengirim(alamat1, kelurahan, kecamatan);
    }
    
    public void setPengirimTelpon(String telpon){
        pengirim.setTelpon(telpon);
    }
    
    public void setPenerimaNama(String nama){
        penerima.setNama(nama);
    }
    
    public void setPenerimaAlamat(String alamat1,String kelurahan,String kecamatan){
        penerima.setAlamatPenerima(alamat1, kelurahan, kecamatan);
    }
    
    public void setPenerimaTelpon(String telpon){
        penerima.setTelpon(telpon);
    }
    
    public void setDetailPaket(int jenisLayanan,double berat) {
            detailPaket = new DetailPaket(jenisLayanan,berat);
        
    }
    
    public void printResi(){
        System.out.println("Pengirim :\n" + pengirim.getNama());
        System.out.println(pengirim.getAlamatPengirim());
        System.out.println(pengirim.getTelpon()+"\n");
        
        System.out.println("Penerima :\n" + penerima.getNama());
        System.out.println(penerima.getAlamatPenerima());
        System.out.println(penerima.getTelpon()+"\n");
        
        System.out.println("Jenis Layanan : " + detailPaket.getJenisLayanan());
        System.out.println("Berat : " + detailPaket.getBerat() + " kg");
        System.out.println("Total Biaya : Rp. " + detailPaket.getBiaya());
    }
    
}
