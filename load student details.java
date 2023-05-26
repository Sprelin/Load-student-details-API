import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    // Assuming you have a CSV file with student details
    
    @GetMapping("/students")
    public List<Student> getStudents(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize) {
        List<Student> studentData = loadStudentDetails();

        int startIndex = (page - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, studentData.size());

        return studentData.subList(startIndex, endIndex);
    }

    private List<Student> loadStudentDetails() {
        // Load student details from the file (e.g., CSV, JSON)
        // Perform any necessary parsing or data processing
        // Return the data as a list or any other suitable format
        return null;
    }
}
