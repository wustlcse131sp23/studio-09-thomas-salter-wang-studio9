package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	private final Map<String, Student> universityDatabase;
	public UniversityDatabase() {
		this.universityDatabase= new HashMap<String, Student>();
	}
	public void addStudent(String accountName, Student student) {
		universityDatabase.put(accountName, student);
		
	}
	
	public int getStudentCount() {
		// TODO
		return universityDatabase.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		return universityDatabase.get(accountName).getFullName();
	}

	public double getTotalBearBucks() {
		
		double totalBearBucks = 0.0;
		for (int i = 0; i<universityDatabase.size(); i++) {
			
		}
		return null;
	}
}
