package FirstProgram;

import java.util.Scanner;

public class casePercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        int nilai = scanner.nextInt();
        String grade;

        switch (nilai/10){
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B+";
                break;
            case 7:
                grade = "B";
                break;
            default:
                grade = "F";
        }

        System.out.println("Grade adalah = " + grade);
    }
}
