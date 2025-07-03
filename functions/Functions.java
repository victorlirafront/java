public class Functions {
    public static void main(String[] args){
        boolean isEvenResult = isEven(2);
        boolean isUnderAgeResult = isUnderAge(15);
        int numberOfStudentsResult = numberOfStudents(new String[]{"Mark", "Sarah", "Victor"});
        String[] callTeachersResult = callTeachers();

        System.out.println("Is this an even number ? " + isEvenResult);
        System.out.println("Is mark under age ? " + isUnderAgeResult);
        System.out.println("Number of students: " + numberOfStudentsResult);
        for (String teacher : callTeachersResult) {
            System.out.println("Teacher: " + teacher);
        }
    }

    public static String[] callTeachers (){
        String[] teachers = new String[]{"Verônica", "Claudia", "André"};
        return teachers;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isUnderAge(int number) {
        return number < 18;
    }

    public static int numberOfStudents (String[] students){
        return students.length;
    }
}