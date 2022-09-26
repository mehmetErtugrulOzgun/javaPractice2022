package p35_encapsulation;

public class C01_AdemOglu {
    String name;
    String surName;
    private int age;//encap icin veriyi private yaptik
    //  attribute,properities hepsi default
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>0){
            this.age=age;
        }
        else {
            this.age=-age;
        }
    }
}
