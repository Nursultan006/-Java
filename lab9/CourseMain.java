public class CourseMain {

    public static void main(String[] args) {

        ProgrammingCourse programming = new ProgrammingCourse("Java Basics", 12);
        MathCourse math = new MathCourse("Algebra", 10);
        HistoryCourse history = new HistoryCourse("World History", 8);

        programming.displayInfo();
        programming.startCourse();

        System.out.println("----------------");

        math.displayInfo();
        math.startCourse();

        System.out.println("----------------");

        history.displayInfo();
        history.startCourse();
    }
}

// Базовый класс
class Course {

    String name;
    int durationWeeks;

    Course(String name, int durationWeeks) {
        this.name = name;
        this.durationWeeks = durationWeeks;
    }

    void displayInfo() {
        System.out.println("Course: " + name + ", Duration: " + durationWeeks + " weeks");
    }

    void startCourse() {
        System.out.println("Course " + name + " has started");
    }
}

// Программирование
class ProgrammingCourse extends Course {

    ProgrammingCourse(String name, int durationWeeks) {
        super(name, durationWeeks);
    }

    @Override
    void startCourse() {
        System.out.println("Programming course " + name + " started. Prepare for coding!");
    }
}

// Математика
class MathCourse extends Course {

    MathCourse(String name, int durationWeeks) {
        super(name, durationWeeks);
    }

    @Override
    void startCourse() {
        System.out.println("Math course " + name + " started. Solve problems!");
    }
}

// История
class HistoryCourse extends Course {

    HistoryCourse(String name, int durationWeeks) {
        super(name, durationWeeks);
    }

    @Override
    void startCourse() {
        System.out.println("History course " + name + " started. Learn the past!");
    }
}