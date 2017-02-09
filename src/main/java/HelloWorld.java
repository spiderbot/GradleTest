

import java.util.List;

public class HelloWorld {

    private List<Holiday> holidays;
    private String message;
    private String[] arrayOfStrings;
   
    public String[] getArrayOfStrings() {
		return arrayOfStrings;
	}

	public void setArrayOfStrings(String[] arrayOfStrings) {
		this.arrayOfStrings = arrayOfStrings;
	}

	public void setMessage(String message) {
        this.message = message;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public List<Holiday> getHolidays() { 
    	return holidays; 
    }
    
    public void hello() {
        System.out.println("Hello! " + message);
    }
}
