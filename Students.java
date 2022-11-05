package Encapsulation;
//IN ENCAPULATION PRIVATE MODIFIER IS USED TO HIDE THE DATA AND IT CAN ONLY BEEN ACESS BY CREATING OBJECT FOR PRIVATE CLASS
//*AFTER CREATING OBJECT WE CANT CALL DIRECTLY....BUT BY USING GET SET METHOD WE CAN CALL THEM

public class Students {     //class is created and data is kept private
	private int studentId;
	private String studentName;
	private int mark1;
	private int mark2;
	private int totalMarks;

public Students(int sId, String sName) {     //constructer is Asigned to get value
		
		this.studentId = sId;               //its assigned get value
		this.studentName = sName;
	}


public void  setMarks(int m1, int m2) {     //method is assigned to get mark
	
	this.mark1 = m1;
	this.mark2 = m2;
	totalMarks=m1+m2;          
}


public int getTotalMarks () {    // getter and setter method is used to call class with object create in main class
	return this.totalMarks;       // void is not used so its return type so return used
}


public int getMar1 () {
	return this.mark1;
}
//getter and setter method is used to call class with object create in main class
//void is not used so its return type so return used
public int getMark2 () {
	
	return this.mark2;
}

public int getstudentId () {
	
	return this.studentId;
}

public String getstudentName () {
	
	return this.studentName;
}


public static void main(String[] args) {
	Students s1 = new Students(1, "AJITH");
	
	
	s1.setMarks(90, 80);
	System.out.println("     STUDENTS REPORT DETAILS");
	System.out.println("student-ID      "+s1.getstudentId());
	System.out.println("Student Name    "+s1.getstudentName());
	System.out.println("Subject mark1   "+s1.getMar1());
	System.out.println("Subject mark2   " +s1.getMark2());
	System.out.println("Total Mark      "+s1.getTotalMarks());
	
	Students s2 = new Students(2, "MANIVANNAN");
	s2.setMarks(87, 100);
	System.out.println("     STUDENTS REPORT DETAILS");
	System.out.println("student-ID      "+s2.getstudentId());
	System.out.println("Student Name    "+s2.getstudentName());
	System.out.println("Subject mark1   "+s2.getMar1());
	System.out.println("Subject mark2   " +s2.getMark2());
	System.out.println("Total Mark      "+s2.getTotalMarks());
	
	Students s3 = new Students(3, "KUMAR");
	s3.setMarks(44, 100);
	System.out.println("     STUDENTS REPORT DETAILS");
	System.out.println("student-ID      "+s3.getstudentId());
	System.out.println("Student Name    "+s3.getstudentName());
	System.out.println("Subject mark1   "+s3.getMar1());
	System.out.println("Subject mark2   " +s3.getMark2());
	System.out.println("Total Mark      "+s3.getTotalMarks());
}
}

 