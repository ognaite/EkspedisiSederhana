package ekspedisisederhana;
/**
 
 Gambaran umum pada kasus ini adalah suatu usaha Ekspedisi yang bernama Sederhana yang mana usaha ini menyediakan jasa
 pengiriman barang dalam suatu kabupaten yang mana memiliki tiga pilihan layanan yaitu jenis Selaw (lambat), Normal, dan Cepat.
 Ekspedisi Sederhana ini menerapkan aturan mainnya yaitu biaya yang sama untuk semua daerah dalam kabupaten tersebut baik dekat
 maupun jauh, minimal kiriman 5 kg, dan pembulatan keatas untuk berat paket.
 
 */
public class EkspedisiSederhana {
    
    public static void main(String[]args) throws Exception{
        Resi R201504170001 = new Resi();
        
        R201504170001.setPengirimNama("Ahmad");
        R201504170001.setPengirimAlamat("Jl.Jeruk Gg.Asem No.99 RT.1 RW.2","Buahan","Tumbuhan");
        R201504170001.setPengirimTelpon("0896xxxxxx");
        
        R201504170001.setPenerimaNama("Fikri");
        R201504170001.setPenerimaAlamat("Jl.Tomat Gg.Rampai No.99 RT.2 RW.1","Sayuran","Tumbuhan");
        R201504170001.setPenerimaTelpon("0853xxxxxx");
       
        R201504170001.setDetailPaket(2,23.7);
        
        R201504170001.printResi();      
                
    }
    
}
