import java.util.Arrays;

public class Teacher extends Person {
    private String department;
    private String[] courses;
    
    public Teacher() {}
    
    public Teacher(String firstName, String lastName, String gender, 
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    
    public String getDepartment() { 
        return department; 
    }
    public void setDepartment(String department) { 
        this.department = department; 
    }
    
    public String[] getCourses() { 
        return courses; 
    }
    public void setCourses(String[] courses) { 
        this.courses = courses; 
    }
    
    public void printTeacher() {
        System.out.println("Teacher:");
        System.out.println("  First Name: " + getFirstName());
        System.out.println("  Last Name: " + getLastName());
        System.out.println("  Gender: " + getGender());
        System.out.println("  Department: " + department);
        System.out.println("  Courses: " + Arrays.toString(courses));
    }
    
    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) &&
               this.department.equals(t.department) &&
               Arrays.equals(this.courses, t.courses);
    }
}