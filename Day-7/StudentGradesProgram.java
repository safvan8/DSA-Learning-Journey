import java.util.Scanner;

public class StudentGradesProgram {
    public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		// Define a 3D array to store the student grades
        int studentGrades[][][] = new int[4][2][6];

        // Input: Read and store the student grades
        for(int year = 0; year < 4; year++) {
            for(int semester = 0; semester < 2; semester++) {
                for(int subject = 0; subject < 6; subject++) {
                    // Prompt the user to enter the marks for each subject
                    System.out.println("Enter year: " + (year + 1) + " Semester: " + (semester + 1) + " Subject " + (subject + 1) + " Marks: ");
                    studentGrades[year][semester][subject] = obj.nextInt();
                }
            }
        }

        // Output: Display the student grades
        System.out.println("Year\tSemester\tSub1\tSub2\tSub3\tSub4\tSub5\tSub6");
        for(int year = 0; year < 4; year++) {
            for(int semester = 0; semester < 2; semester++) {
                System.out.print((year + 1) + "\t" + (semester + 1) + "\t");
                for(int subject = 0; subject < 6; subject++) {
                    System.out.print(studentGrades[year][semester][subject] + "\t");
                }
                System.out.println();
            }
        }
    }
}
