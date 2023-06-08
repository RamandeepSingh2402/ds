package summer2023;

class Student {
    public int rollNo;
    public String name;
    public Student (int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}


public class Arrays {
    public static void main(String[] args) {

        // Initializing one dimensional array
        int[] arr = new int[]{10,20,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }

        Student[] studentArr = new Student[5];

        studentArr[0] = new Student(1,"First student");
        studentArr[1] = new Student(2,"Second Student");
        studentArr[2] = new Student(3,"Third Student");
        studentArr[3] = new Student(4,"Fourth Student");
        studentArr[4] = new Student(5,"Fifth Student");

        System.out.println("\n");

        for(int i = 0; i<studentArr.length; i++) {
            System.out.println(studentArr[i].name + " has roll number: " + studentArr[i].rollNo);
        }

        // Initializing two-dimensional arrays
        int[][] twoDArr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Printing 2D Array
        System.out.print("Elements of 2D Array: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(twoDArr[i][j] + " ");
            }
            System.out.print("\t");
        }

    }
}
