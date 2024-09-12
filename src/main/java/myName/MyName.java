package myName;

public class MyName {
    public static String myName(String name1, String name2,char char1,char char2,char char3,int number){
      String namea = "Collins";
      String nameb = "Sitai";
      char chara= 'S';
      char charb ='M';
        char charc ='L';
        int date=20/24;
        final int Max =20 ;

        return( name1 + name2)+ (chara+ charb+charc) + number;

    }

    public static void main(String[] args) {
        //System.out.println();
        System.out.println(myName("Collins", "Sitai",'S','M','L',20));
    }
}
