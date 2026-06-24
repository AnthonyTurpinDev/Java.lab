package lab.exercises.oop;

public class Etudiant {
    private int age;

    public Etudiant(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 120) {
            throw new IllegalArgumentException("L'âge doit être compris entre 5 et 120");
        }
        this.age = age;
    }
}
