package Operations;

import DB.Records;
import DB.Student;

public class Logics implements OperationFunctions
{

	@Override
	public void add(Student s) {
		
		Records.AL.add(s);
			
	}

	@Override
	public void delete(int rollno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int ct, String em, int rollno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchRollNo(int rollno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchCity(String city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStandard(int st) {
		// TODO Auto-generated method stub
		
	}

	
	public void display() {
		int i=1;
		for(Student s : Records.AL)
		{
			System.out.println(" # "+i);i++;
			System.out.println("\n\nRollNo: "+s.getRollNo());
			System.out.println("Name: "+s.getName());
			System.out.println("Contact: "+s.getContactNo());
			System.out.println("Email: "+s.getEmail());
			System.out.println("Standard: "+s.getStandard());
			System.out.println("City: "+s.getCity());
		}
		
	}
			
}
