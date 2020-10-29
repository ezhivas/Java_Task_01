package task4;

public class main {

    public static void main(String[] args) {

        Man man1 = new Man("Sergey", "Kharkov", "white", 175,75, Boolean.TRUE);
        Woman woman1 = new Woman("Angy", "Kharkov", "white", 168,57, Boolean.TRUE);
        Woman woman2 = new Woman();


        System.out.println("Man`s name: " + man1.getName());
        System.out.println("Man`s hair color: " + man1.getHair_color());
        System.out.println("Man`s weight: " + man1.getWeight());
        System.out.println("Woman`s city: " + woman1.getCity());
        System.out.println("Woman`s height: " + woman1.getHeight());
        System.out.println("Woman Have a children: " + woman1.getChildren());


        System.out.println("Setting new men`s city");
        man1.setCity("Rome");
        System.out.println(man1.getCity());
        System.out.println("Setting new man`s salary");
        man1.salary=100;
        System.out.println(man1.salary);
        System.out.println("Woman`s salary for both of them");
        System.out.println(woman1.cash + " " + woman2.cash);

    }
}
