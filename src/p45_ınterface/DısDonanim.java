package p45_ınterface;

public interface DısDonanim {
    public void ayna();
    public void kapi();
    public void kaporta();
String RENK="metalik";

public default String sisLambasi(){//bu method bildigin bodyli concrete olur
    return "Sisli havalarda dikkat et";
}
public static String boya(){
    return "Koyu renk boya gunes yanigi yapar";
}
}
