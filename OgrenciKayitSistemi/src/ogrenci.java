class Ogrenci {
    private int ogrenciNo;
    private String ogrenciTc;
    private String ad;
    private String soyad;
    private String sinif;
    private String ogretmen;
    private String veliAdSoyad;

    public Ogrenci(int ogrenciNo, String ogrenciTc, String ad, String soyad, String sinif, String ogretmen, String veliAdSoyad) {
        this.ogrenciNo = ogrenciNo;
        this.ogrenciTc = ogrenciTc;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
        this.ogretmen = ogretmen;
        this.veliAdSoyad = veliAdSoyad;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        // Öğrenci numarasını 6 basamaklı bağımsız bir sayı olarak ayarla
        if (String.valueOf(ogrenciNo).length() == 6) {
            this.ogrenciNo = ogrenciNo;
        } else {
            // 6 basamaklı değilse hata durumu veya varsayılan bir değer atıyoruz 
            
            this.ogrenciNo = 0; // Varsayılan değer
        }
    }

    public String getOgrenciTc() {
        return ogrenciTc;
    }

    public void setOgrenciTc(String ogrenciTc) {
    	// Öğrenci tcsini 11 basamaklı bağımsız bir sayı olarak ayarla
        if (ogrenciTc.length() == 11) {
            this.ogrenciTc = ogrenciTc;
        } else {
            // 11 basamaklı değilse hata durumu veya varsayılan bir değer atıyoruz 
            
            this.ogrenciTc = "0"; 
        }
    }

    public String getOgrenciAd() {
        return ad;
    }

    public void setOgrenciAd(String ad) {
        this.ad = ad;
    }

    public String getOgrenciSoyad() {
        return soyad;
    }

    public void setOgrenciSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getOgrenciSinif() {
        return sinif;
    }

    public void setOgrenciSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getOgrenciOgretmen() {
        return ogretmen;
    }

    public void setOgrenciOgretmen(String ogretmen) {
        this.ogretmen = ogretmen;
    }

    public String getOgrenciVeliAdSoyad() {
        return veliAdSoyad;
    }

    public void setOgrenciVeliAdSoyad(String veliAdSoyad) {
        this.veliAdSoyad = veliAdSoyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo=" + ogrenciNo +
                ", ogrenciTc='" + ogrenciTc + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif='" + sinif + '\'' +
                ", ogretmen='" + ogretmen + '\'' +
                ", veliAdSoyad='" + veliAdSoyad + '\'' +
                '}';
    }
}
