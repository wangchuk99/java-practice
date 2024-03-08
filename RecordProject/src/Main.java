public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            Student s = new Student("S92300" + i,
//                    switch (i) {
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Chador";
//                        case 4 -> "Pema";
//                        case 5 -> "Dema";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass");
//            System.out.println(s);
//        }

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Chador";
                        case 4 -> "Pema";
                        case 5 -> "Dema";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1987", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bob", "10/12/1988", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", JAVA OCP exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", JAVA OCP exam 829");  no setters in record

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());


    }
}
