package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import controller.BarCtrl;
import controller.DoormanCtrl;
import controller.ShiftCtrl;
import database.DataAccessException;
import model.Bar;
import model.Doorman;
import model.Shift;
import database.ShiftDAO;
public class ShiftAssignmentSystemTest {

    @Test
    @DisplayName("Assign a shift to a doorman")
    public void testShiftAssignment() throws DataAccessException, SQLException {
        
    	// Arrange
    	ShiftCtrl shiftCtrl = new ShiftCtrl();
        
      //Valid inputs:
        LocalDate date = LocalDate.of(2023, 05, 16);
        int barId = 3;
        int shiftId = 5;
        int doormanId = 3;
        
        // Act 
        // Create a new shift
        List<Shift> shifts = shiftCtrl.getShiftsByDate(date);
        Shift shift = shifts.get(shiftId);
        
        // Retrieve an existing bar
        List<Bar> bars = shiftCtrl.getAllBars();
        
        Bar bar = bars.get(barId); // Choose the first bar in the list
        
        // Retrieve a list of available doormen for the shift date and bar
        List<Doorman> availableDoormen = shiftCtrl.getAvailableDoormenForShift(date, bar.getBarId());
        
        // Select the first available doorman for assignment
        Doorman doorman = availableDoormen.get(doormanId);
        
        // Assign the shift to the selected doorman
        boolean assignmentSuccessful = shiftCtrl.confirmShift(doorman.getEmployeeId(), shift.getShiftId());
        

        // Assert
        // Check if the assignment was successful
        Assertions.assertTrue(assignmentSuccessful, "Shift assignment failed");

        // Retrieve the updated shift from the database
       List<Shift> newShifts = shiftCtrl.getShiftsByDate(date);
       		Shift assignedShift = null;
    		   for (Shift newShift : newShifts) {
    			   if (newShift.getShiftId() == shift.getShiftId())
    				  assignedShift = newShift;
    		   }

        // Verify that the shift has been assigned to the doorman
        Assertions.assertEquals(doorman.getEmployeeId(), assignedShift.getDoormanId(), "Incorrect doorman assignment");
    }
    
    @Test
    @DisplayName("Assign a shift to a doorman")
    public void testShiftAssignmentForFail() throws DataAccessException, SQLException {
        
    	// Arrange
    	ShiftCtrl shiftCtrl = new ShiftCtrl();

        
      //Invalid inputs:
        LocalDate date = LocalDate.of(2023, 05, 31);
        int barId = 1000;
        int shiftId = 1000;
        int doormanId = 1000;
        
        // Act 
        // Create a new shift
        List<Shift> shifts = shiftCtrl.getShiftsByDate(date);
        Shift shift = shifts.get(shiftId);
        
        // Retrieve an existing bar
        List<Bar> bars = shiftCtrl.getAllBars();
        
        Bar bar = bars.get(barId); // Choose the first bar in the list
        
        // Retrieve a list of available doormen for the shift date and bar
        List<Doorman> availableDoormen = shiftCtrl.getAvailableDoormenForShift(date, bar.getBarId());
        
        // Select the first available doorman for assignment
        Doorman doorman = availableDoormen.get(doormanId);
        
        // Assign the shift to the selected doorman
        boolean assignmentSuccessful = shiftCtrl.confirmShift(doorman.getEmployeeId(), shift.getShiftId());
        

        // Assert
        // Check if the assignment was successful
        Assertions.assertTrue(assignmentSuccessful, "Shift assignment failed");

        // Retrieve the updated shift from the database
       List<Shift> newShifts = shiftCtrl.getShiftsByDate(date);
       		Shift assignedShift = null;
    		   for (Shift newShift : newShifts) {
    			   if (newShift.getShiftId() == shift.getShiftId())
    				  assignedShift = newShift;
    		   }

        // Verify that the shift has been assigned to the doorman
        Assertions.assertNotEquals(doorman.getEmployeeId(), assignedShift.getDoormanId(), "Incorrect doorman assignment");
    }
}