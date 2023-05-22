package arackiralamaprojesi;

import java.time.LocalDate;
import java.time.LocalTime;

public class AracTalebi {

    private String alinacakSehir;
    private LocalDate alinacakGun;
    private LocalTime alisSaati;
    private LocalDate teslimGunu;
    private LocalTime teslimSaati;

public AracTalebi(String alinacakSehir, LocalDate alinacakGun, LocalTime alisSaati, LocalDate teslimGunu, LocalTime teslimSaati){
    this.alinacakSehir=alinacakSehir;
    this.alinacakGun=alinacakGun;
    this.alisSaati=alisSaati;
    this.teslimGunu=teslimGunu;
    this.teslimSaati=teslimSaati;

}

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public LocalDate getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(LocalDate alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public LocalTime getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(LocalTime alisSaati) {
        this.alisSaati = alisSaati;
    }

    public LocalDate getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(LocalDate teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public LocalTime getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(LocalTime teslimSaati) {
        this.teslimSaati = teslimSaati;
    }
}
class Araba{
    private String marka;
    private String model;
    private String yakitTipi;
    private String vites;
    private double gunlukUcret;

    public Araba(String marka, String model, String yakitTipi, String vites, double gunlukUcret){
        this.marka=marka;
        this.model=model;
        this.yakitTipi=yakitTipi;
        this.vites=vites;
        this.gunlukUcret=gunlukUcret;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }
}
