import java.util.Arrays;

public class PhdStudent extends Student {
    private String department;
    private String[] courses;
    
    public PhdStudent() {}
    
    public PhdStudent(String firstName, String lastName, String gender, 
                      String studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
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
    
    public void printPhdStudent() {
        System.out.println("PhD Student:");
        System.out.println("  First Name: " + getFirstName());
        System.out.println("  Last Name: " + getLastName());
        System.out.println("  Gender: " + getGender());
        System.out.println("  Student ID: " + getStudentId());
        System.out.println("  Department: " + department);
        System.out.println("  Courses: " + Arrays.toString(courses));
    }
    
    public boolean equals(PhdStudent p) {
        if (p == null) return false;
        return super.equals(p) &&
               this.department.equals(p.department) &&
               Arrays.equals(this.courses, p.courses);
    }
}