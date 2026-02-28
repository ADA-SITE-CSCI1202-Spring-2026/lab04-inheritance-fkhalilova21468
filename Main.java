public class Main {
    public static void main(String[] args) {
        
        // Test Cases - Person
        System.out.println("--- Testing Person ---");
        Person p1 = new Person("John", "Doe", "Male");
        Person p2 = new Person("John", "Doe", "Male");
        Person p3 = new Person("Jane", "Smith", "Female");
        
        // Person Output
        p1.printPerson();
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));
        
        // Test Cases - Teacher
        System.out.println("\n--- Testing Teacher ---");
        String[] courses1 = {"Mathematics", "Physics", "Chemistry"};
        Teacher t1 = new Teacher("Jane", "Smith", "Female", "Science", courses1);
        
        String[] courses2 = {"Mathematics", "Physics", "Chemistry"};
        Teacher t2 = new Teacher("Jane", "Smith", "Female", "Science", courses2);
        
        String[] courses3 = {"Mathematics", "Biology"};
        Teacher t3 = new Teacher("Jane", "Smith", "Female", "Science", courses3);
        
        // Teacher Output
        t1.printTeacher();
        System.out.println("t1 equals t2: " + t1.equals(t2));
        System.out.println("t1 equals t3: " + t1.equals(t3));
        
        // Test Cases - Student
        System.out.println("\n--- Testing Student ---");
        Student s1 = new Student("Bob", "Johnson", "Male", "S12345");
        Student s2 = new Student("Bob", "Johnson", "Male", "S12345");
        Student s3 = new Student("Bob", "Johnson", "Male", "S67890");
        
        // Student Output
        s1.printStudent();
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        
        // Test Cases - PHD Student
        System.out.println("\n--- Testing PhD Student ---");
        String[] phdCourses1 = {"Advanced Algorithms", "Research Methods", "AI Seminar"};
        PhdStudent ps1 = new PhdStudent("Alice", "Williams", "Female", "PHD001", 
                                        "Computer Science", phdCourses1);
        
        String[] phdCourses2 = {"Advanced Algorithms", "Research Methods", "AI Seminar"};
        PhdStudent ps2 = new PhdStudent("Alice", "Williams", "Female", "PHD001", 
                                        "Computer Science", phdCourses2);
        
        String[] phdCourses3 = {"Machine Learning", "Deep Learning"};
        PhdStudent ps3 = new PhdStudent("Alice", "Williams", "Female", "PHD001", 
                                        "Computer Science", phdCourses3);
        
        // PHD Student Output
        ps1.printPhdStudent();
        System.out.println("ps1 equals ps2: " + ps1.equals(ps2));
        System.out.println("ps1 equals ps3: " + ps1.equals(ps3));
    }
}