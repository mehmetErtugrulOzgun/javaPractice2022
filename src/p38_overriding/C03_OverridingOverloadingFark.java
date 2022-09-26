package p38_overriding;

public class C03_OverridingOverloadingFark {
    /*
    Overriding
    Parent classdaki bir METHODu child classa gore ozellestirip kullanmanin adidir.
    OVERRIDING KURALLARI
    1.  Overriding creat edilirken "method signature" (methodun ismi + parametresi)
    kesinlikle ASLA degistirilemez
    2.  Overriding creat edilirken "access modifier" belirli kurallara gore degistirilebilirler
    3.  Overriding creat edilirken "return type" belirli kurallara gore degistirilebilir
    4.  Overriding creat edilirken "method body" genelde degistirilir ama degistirilmez ise CTE vermez
    (amelelik olur overriding amaci body creat etmek)
    5.  Overriding creat edilirken "parent - child" relationship sarttir.Inheritance olmadan overriding olmaz.
    6.  "Overriden method" : parent classda ki methpddur (uzerine yazilan)
    7.  "Overridining method" : child classda ki methoddur.(uzerine yazdirandir)
    8.  "Overridining method" child in AccMo ya "Overriddden method " parent ile ayni yada daha genis olmali
    Child class parent classin eisimini daraltamaz ama genisletebilir.
    9.  "Overriding method" childin return type void ise "Overriden method" (parent) return type void olmali
     kendinden olmayani kabul etmez
    10. "Overridining methodu" child return type Wrapper classdan ise "Overridden metho" parent return type
    olmali kendinden olmayani kabul etmez
    11. "Overriding method" childin return type ile "Overridden method" parent return arasinda is-A
    (child____>parent relationship) iliskisi olmali
    12. Static methodlar overriding edilemezler
    13. Private methodlar overriding edilemezler.
    14. Final methodlar overriding edilemezler.
    15. "Polymorphism" ---------> "overloading" ve "overriding" den olusan yapiya denir.
    "overloading"-----> public void yemek(){......}
                        public void yemek(String tatli){......}
                        public void yemek(String tatli, int ucret){......}

     "overridding"-----> public void icemek(){syso(gazoz)}
                         public void icmek(){syso(dark ve sek bir kahve)}
                         public void icmek(){syso(ucret)}

    "overloading" ile "overriding" arasinda ki farklar :

    1-) "overloading"de method signiture(name+parametre) degistirilir (parametre degisir)
        "overriding"de method signature(name+parametre) asla degistirilmez.

    2-) "overloading"de inheritance gerekmez
        "overriding"de inheritance olmadan overriding yapilmaz

    3-) "overloading"de body genellikle degistirilmeden kullanilir.
        "overriding"de body hemen hemen her zaman degistirilir.

    4-) Static methodlar overriding edilemezler ama overloading edilebilirler.
        Private methodlar overriding edilemezler ama overloading edilebilirler.

    5-) overloading Compile Time Polymorphismdir ------>static
        overriding Run Time Polymorphismdir------>dinamik

     */

}
