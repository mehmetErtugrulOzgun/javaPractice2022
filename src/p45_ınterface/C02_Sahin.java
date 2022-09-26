package p45_ınterface;

public class C02_Sahin extends C01_Tofas implements IcDonanim, Lastik{
    @Override
    public void motor() {
        System.out.println("1.6 motor");
    }

    @Override
    public void yakit() {
        System.out.println("Tupsuz sahin olmaz");
    }

    @Override
    public void koltuk() {
        System.out.println("Sari koltuk kilifi cabuk kirlenir");
        System.out.println("Deri koltuk iyidir");
    }

    @Override
    public void ayna() {
        System.out.println("Aynasizlara dikkat et");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapili");
    }

    @Override
    public void kaporta() {
        System.out.println("Tabutun kapagi");
    }

    @Override
    public void ebat() {
        System.out.println("22inc lastik ebati vardir");
    }

    @Override
    public void jant() {
        System.out.println("BBS jant akar");
    }
}
