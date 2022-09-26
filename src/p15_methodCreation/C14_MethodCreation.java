package p15_methodCreation;

public class C14_MethodCreation {
    public static void main(String[] args) {
        //  Bir oyun programinda oyuncuya level ve puanina gore bonus hesaplayan bir method yaziniz.
        //  Bonus eklendikten sonra oyuncu yeni puaniyla oyuna devam edece.
        //  Oyun icinde birden fazla defa bonus ekleme fonksiyonu kullanilabilir
        //  Bonus kurali:
        //  1-Ilk 10 level icin mevcut puan 1000den az ise 50 1000veya daha cok ise 100 bonus
        //  2-  11-50 level arasi mevcut puanin yuzde 10u kadar bonus
        //  3- 51.levelden itibaren puan 10.000den az ise 1000 bonus 10.000den cok ise mevcut puanin %15i kadar bonus

        int level=14;
        int puan=1450;

        puan += bonusHesaplamaMethodu(level,puan);
    }

    private static int bonusHesaplamaMethodu(int level, int puan) {
        int bonus=0;
        if (level<=10){
            //1-Ilk 10. level icin mevcut puan 1000den az ise 50 1000veya daha cok ise 100 bonus
            if (puan<1000){
                bonus=50;
            }
            else {
                bonus=100;
            }
        }
        else if (level<=50){
            //2-11.-50. level arasi mevcut puanin yuzde 10u kadar bonus
            bonus=puan*(10/100);
        }
        else {
            //3- 51.levelden itibaren puan 10.000den az ise 1000 bonus 10.000den cok ise mevcut puanin %15i kadar bonus
            if (puan<10000){
                bonus=1000;
            }
            else {
                bonus=puan*(15/100);
            }
        }
        return bonus;
    }
}
