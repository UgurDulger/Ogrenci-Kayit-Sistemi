 class Veli {
    private int kayitNo;
    private String ad;
    private String soyad;
    private String telefon;

    public Veli(int kayitNo, String ad, String soyad, String telefon) {
        this.kayitNo = kayitNo;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
    }

    public int getVeliKayitNo() {
        return kayitNo;
    }

    public void setVeliKayitNo(int kayitNo) {
    	// Veli kayıt numarası 5 basamaklı bağımsız bir sayı olarak ayarlıyoruz
        if (String.valueOf(kayitNo).length() == 5) {
            this.kayitNo = kayitNo;
        } else {
            // 5 basamaklı değilse hata durumu veya varsayılan bir değer atıyoruz 
            
            this.kayitNo = 0; // Varsayılan değer
        }
    }

    public String getVeliAd() {
        return ad;
    }

    public void setVeliAd(String ad) {
        this.ad = ad;
    }

    public String getVeliSoyad() {
        return soyad;
    }

    public void setVeliSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getVeliTelefon() {
        return telefon;
    }

    public void setVeliTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Veli{" +
                "kayitNo=" + kayitNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
