package dasturlash.uz;

public class Lesson {
    private Professor professor;
    private Assistant assistant;

    public Lesson(Professor professor, Assistant assistant) {
        this.professor = professor;
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                " professor=" + professor +
                ", assistant=" + assistant +
                '}';
    }
}
