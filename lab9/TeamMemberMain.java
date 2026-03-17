public class TeamMemberMain {

    public static void main(String[] args) {

        Player player = new Player("Alex", "Forward");
        Coach coach = new Coach("John", "Head Coach");
        Doctor doctor = new Doctor("Sarah", "Team Doctor");

        player.displayInfo();
        player.play();

        System.out.println("----------------");

        coach.displayInfo();
        coach.train();

        System.out.println("----------------");

        doctor.displayInfo();
        doctor.heal();
    }
}

// Базовый класс
class TeamMember {

    String name;
    String role;

    TeamMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Role: " + role);
    }
}

// Игрок
class Player extends TeamMember {

    Player(String name, String role) {
        super(name, role);
    }

    void play() {
        System.out.println(name + " is playing in position: " + role);
    }
}

// Тренер
class Coach extends TeamMember {

    Coach(String name, String role) {
        super(name, role);
    }

    void train() {
        System.out.println(name + " is training the team as: " + role);
    }
}

// Врач
class Doctor extends TeamMember {

    Doctor(String name, String role) {
        super(name, role);
    }

    void heal() {
        System.out.println(name + " is healing injured players as: " + role);
    }
}