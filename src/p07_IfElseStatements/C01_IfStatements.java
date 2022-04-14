package p07_IfElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        //bir sart ve o sarta bagli sonuca odaklidir
        //birden fazla bagimsiz if cumlesi old. hepsinin body calisabilecegi gibi
        // hicbirisinin bodysi de calismayabilir

        int a=2;
        int b=3;

        if (a<b)
        {
            System.out.println("B sayisi, A sayisindan buyuktur."); //kod çalışır ama if bodysi çalışmaz
        }
        if (a>b)
        {
            System.out.println("A sayisi, B sayisindan buyuktur.");
        }
        if (a==b)
        {
            System.out.println("A sayisi ve B sayisi aynidir.");
        }
        if (a*b>0)
        {
            System.out.println("Iki sayinin carpimi pozitiftir");
        }
        if (a>100 && b>100)
        {
            System.out.println("A sayisi ve B sayisi 100den buyuktur");
        }

    }
}
