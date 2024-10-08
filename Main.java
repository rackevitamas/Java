package zoo;

public class Main {
    public static void main(String[] args) {
        Bird myBird = new Bird("Kuli", "Golya", 3, false);
        myBird.setSound("Kelep");
        System.out.println("Neve: " + myBird.name + ", faj: " + myBird.breed + ", " + myBird.age + " éves, életmódja: " + myBird.getHabitat() + ", él a földön: " + myBird.isLandAnimal());
        Mammal myMammal = new Mammal("Lila", "Róka", 3, false);
        myBird.setSound("grrrr");
        System.out.println("Neve: " + myMammal.name + ", faj: " + myMammal.breed + ", " + myMammal.age + " éves, életmódja: " + myMammal.getHabitat() + ", él a földön: " + myMammal.isLandAnimal());
        Reptile myReptile = new Reptile("Bekker", "Kék nyílméregbéka", 2, false);
        myBird.setSound("Brekeke");
        System.out.println("Neve: " + myReptile.name + ", faj: " + myReptile.breed + ", " + myReptile.age + " éves, életmódja: " + myReptile.getHabitat() + ", él a földön: " + myReptile.isLandAnimal());
    }
    
}
