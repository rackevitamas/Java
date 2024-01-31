public class Kasztolas {

    public static void main(String[] args) {
        byte bit = 50;
        short keves = 150;
        int sok = 500000;
        int okt = 050;
        int hex = 0x102;
        long hosszu = 50000000000L;
        float lebegos = 5.0f;
        double dupla = 28.5d;
        float lebegosexpo = 5e0f;
        double duplaexpo = 28E5d;
        //System.out.println(bit, keves, sok, okt, hex, hosszu, lebegos, dupla, lebegosexpo, duplaexpo);
        double myDouble = 15.4d;
        float myFloat = (float) myDouble;
        long myLong = (long) myFloat;
        int myInt = (int) myLong;
        char myChar = (char) myInt;
        short myShort = (short) myChar;
        byte myByte = (byte) myShort;
        System.out.println(bit);
        System.out.println(keves);
        System.out.println(sok);
        System.out.println(okt);
        System.out.println(hex);
        System.out.println(hosszu);
        System.out.println(lebegos);
        System.out.println(dupla);
        System.out.println(lebegosexpo);
        System.out.println(duplaexpo);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myLong);
        System.out.println(myInt);
        System.out.println(myChar);
        System.out.println(myShort);
        System.out.println(myByte);
    }
}