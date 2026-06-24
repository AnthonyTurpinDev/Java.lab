package lab.exercises.structures;

public class TableauNotes {
    public static void main(String[] args) {
        int[] notes = {12, 15, 9, 18, 14};
        int somme = 0;

        for (int note : notes) {
            somme += note;
        }

        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
