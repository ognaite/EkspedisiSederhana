package ekspedisisederhana;

public class DetailPaket {
    private String jenisLayanan;
    private double berat;
    private int biaya;

    DetailPaket(int n,double berat){
              
           
        this.berat = berat;
        
        switch(n){
            case 1 : jenisLayanan = "Selaw";
                     if(this.berat<=5)
                         biaya = 10000;
                     else
                         biaya = 2000*(int)Math.ceil(this.berat);
                     break;
                
            case 2 : jenisLayanan = "Normal";
                     if(this.berat<=5)
                         biaya = 20000;
                     else
                         biaya = 4000*(int)Math.ceil(this.berat);
                     break;
                
            case 3 : jenisLayanan = "Cepat";
                     if(this.berat<=5)
                         biaya = 30000;
                     else
                         biaya = 6000*(int)Math.ceil(this.berat);
                     break;
        }
      
    }
    
    public String getJenisLayanan(){
        return jenisLayanan;
    }
    
    public double getBerat(){
        return berat;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
}
