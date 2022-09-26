package k2_enum;

enum Mevsimler{
    ILKBAHAR,
    YAZ,
    SONBAHAR,
    KIS;
}
class MevsimlerinAyKarsiligi{
    public static final int ILKBAHAR=0;
    public static final int YAZ=0;
    public static final int SONBAHAR=0;
    public static final int KIS=0;
    // enum yapisini kullanmazsak boyle bir sey
    // yapmak durumunda kalacaktik
}

public class C01_Enum {
    public static void main(String[] args) {
        Mevsimler ilkbaharMevsimi= Mevsimler.ILKBAHAR;
        Mevsimler yazMevsimi= Mevsimler.YAZ;
        Mevsimler sonbaharMevsimi= Mevsimler.SONBAHAR;
        Mevsimler kisMevsimi= Mevsimler.KIS;
        System.out.print(ilkbaharMevsimi+"\n"+yazMevsimi+
                "\n"+sonbaharMevsimi+"\n"+kisMevsimi);

    }
}
