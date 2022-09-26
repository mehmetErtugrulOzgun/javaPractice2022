package p35_encapsulation;

public class C05_RentAparments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    private int rent=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    public int kiraHesapla(int roomCount){
        if (roomCount==0){
            this.rent=1400;
        }
        else if (roomCount==1){
            this.rent=1700;
        }
        else if (roomCount==2){
            this.rent=2200;
        }
        else if (roomCount==3){
            this.rent=2700;
        }
        else {
            System.out.println("Gecersiz bir oda sayisi girdiniz");
        }
        return rent;
    }

    public int balconSor(boolean balconyOrNo){

        if (balconyOrNo==true){
            this.rent+=200;
        }
        return this.rent;
    }
}
