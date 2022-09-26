package k2_bisikletOrnegi;

public class C02_Bisiklet {
    int hiz=0;
    int vites=1;

    void VitesArttir()
    {
            HizArttir();
    }
    void HizArttir()
    {
        hiz +=10;
    }
    void VitesAzalt()
    {
        HizAzalt();
    }
    void HizAzalt()
    {
        hiz -=10;
    }
}
