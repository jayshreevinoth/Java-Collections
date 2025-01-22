package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("****** Student Management System  *******");

        System.out.println("1. Add Student");
        System.out.println("2. Delete Student ");
        System.out.println("3. Update Grade");
        System.out.println("4. View all records");
        System.out.println("5. Search student by ID");
        System.out.println("6: Exit");
        while (true) {
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.err.println("Enter id:");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter name:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter grade:");
                    double studentGrade = scanner.nextDouble();
                    students.add(new Student(studentId, studentName, studentGrade));
                    System.out.println("Student added successfully");
                    break;
                case 2:
                    System.out.println("Enter id to remove the student record:");
                    int removeId = scanner.nextInt();
                    boolean removed = false;
                    for (Student s : students) {
                        if (s.getId() == removeId) {
                            students.remove(s);
                            removed = true;
                            System.out.println("Student record removed");
                            break;
                        }
                    }
                    if (removed == false) {
                        System.out.println("Student id not found");

                    }
                    break;
                case 3:
                    System.out.println("Enter id to update the student record:");
                    int updateId = scanner.nextInt();
                    boolean updated = false;
                    for (Student s : students) {
                        if (s.getId() == updateId) {
                            System.out.println("please enter the grade to be updated");
                            double updateGrade = scanner.nextDouble();
                            s.setGrade(updateGrade);
                            updated = true;
                            System.out.println("Grade updated");
                            break;
                        }
                    }
                    if (updated == false) {
                        System.out.println("Student id not found");
                        break;
                    }
                case 4:
                    if (students.isEmpty()) {
                        System.out.println("No records");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter id to view the student record:");
                    int enterId = scanner.nextInt();
                    boolean viewed = false;
                    for (Student s : students) {
                        if (s.getId() == enterId) {
                            viewed = true;
                            System.out.println(s);
                            break;
                        }
                    }
                    if (viewed == false) {
                        System.out.println("Student id not found");
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program");
                    scanner.close();
                    break;
                default:
                    System.out.println("Please select correct option");
                    scanner.close();
                    return;
            }
        }

    }
}

class Student {
    int id;
    String name;
    double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id: " + id + " name: " + name + " grade: " + grade;
    }
}