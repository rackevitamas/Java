public class EnumJegyek {
    enum Jegyek {ELEGTELEN, ELEGSEGES, KOZEPES, JO, JELES}

    public static void main(String[] args) {
        Jegyek elegtelen = Jegyek.ELEGTELEN;    
        Jegyek elegseges = Jegyek.ELEGSEGES;    
        Jegyek kozepes = Jegyek.KOZEPES;    
        Jegyek jo = Jegyek.JO;    
        Jegyek jeles = Jegyek.JELES;
        double jegy = 1;
        Jegyek result;
        switch (jegy) {
            case jegy > 1 && jegy < 1.8:
                result = elegtelen;
                break;
            case jegy > 1.7 && jegy < 2.6:
                result = elegseges;
                break;
            case jegy > 2.5 && jegy < 3.6:
                result = kozepes;
                break;
            case jegy > 3.5 && jegy < 4.6:
                result = jo;
                break;
            case jegy > 4.5:
                result = jeles;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + jegy);
        }
        System.out.println(result);
    }
}
