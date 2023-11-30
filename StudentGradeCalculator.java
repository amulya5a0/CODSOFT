import java.util.Scanner;

class StudentMarks {
    int n, i;
    float total, sum;
    float averagePercentage, x;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects = ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        for (i = 0; i < n; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + " : ");
            arr[i] = sc.nextInt();

            while (arr[i] < 0 || arr[i] > 100) {
                System.out.print("Invalid! Please enter valid marks for subject " + (i + 1) + " : ");
                arr[i] = sc.nextInt();
            }
        }

        
        sum = 0;

        for (i = 0; i < n; i++) {
            sum += arr[i];
        }
    }

    void calMarks() {
        total = sum;
        averagePercentage = total / n;
    }

    void calGrade() {
        x = averagePercentage;
        if (x >= 90) 
        {
            System.out.println("Grade: O");
        }
        else if (x >= 80 && x < 90) 
        {
            System.out.println("Grade: A+");
        } 
        else if (x >= 70 && x < 80) 
        {
            System.out.println("Grade: A");
        } 
        else if (x >= 60 && x < 70) 
        {
            System.out.println("Grade: B+");
        } 
        else if (x >= 50 && x < 60) 
        {
            System.out.println("Grade: B");
        } 
        else if (x >= 40 && x < 50) 
        {
            System.out.println("Grade: C");
        } 
        else 
        {
            System.out.println("Grade: FAIL");
        }
    }

    void displayData() {
        System.out.println("Total marks of the student = " + total);
        System.out.println("Average percentage of the student = " + averagePercentage);
    }
}

class StudentGradeCalculator {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.getData();
        s.calMarks();
        s.calGrade();
        s.displayData();
    }
}
