
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    // guides the program to execute this method before each test
    @Before
    // Initializing a variable can be done by adding 
    // to the test class a method ‘initialize’
    public void initialize() {
        management = new ExerciseManagement();
    }
            
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");        
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        
        // a method called assertTrue, which demands that the parameter 
        // it receives is finally evaluates as true.
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        
        assertTrue(management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
}
