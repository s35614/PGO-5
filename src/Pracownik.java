public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie,
                     String nazwisko, double stawkaBazowa){
    this.idPracownika = idPracownika;
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.stawkaBazowa = stawkaBazowa;

    }
    public String getIdPracownika(){
        return idPracownika;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public double getStawkaBazowa(){
        return stawkaBazowa;
    }
    //final
    public final String pobierzIdPracownika(){
        return idPracownika;
    }
    public double obliczKosztMiesieczny(){
        return stawkaBazowa;
    }
    public String przedstawSie(){
        return imie + " " + nazwisko;
    }
    @Override
    public String toString(){
        return "Pracownik: " + imie + " " + nazwisko + ", ID: " + idPracownika;
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Pracownik)) return false;

        Pracownik p = (Pracownik) obj;
        return this.idPracownika.equals(p.idPracownika);
    }
}
