package Encapsulation;
public class Student2 
{ 
 private String name; 
 private int phyMarks; 
 private int chemMarks; 
 private int bioMarks; 


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhyMarks() {
	return phyMarks;
}
public void setPhyMarks(int phyMarks) {
	this.phyMarks = phyMarks;
}
public int getChemMarks() {
	return chemMarks;
}
public void setChemMarks(int chemMarks) {
	this.chemMarks = chemMarks;
}
public int getBioMarks() {
	return bioMarks;
}
public void setBioMarks(int bioMarks) {
	this.bioMarks = bioMarks;
}
void marksRead() 
{ 
 System.out.println("Student's Name: " +name); 
 System.out.println("Marks in Physics: " +phyMarks); 
 System.out.println("Marks in Chemistry: " +chemMarks); 
 System.out.println("Marks in Biology: " +bioMarks); 

 int Totalmarks = phyMarks + chemMarks + bioMarks; 
 float percentage = (Totalmarks * 100)/300; 
System.out.println("Percentage of PCB: " +percentage); 
 } 
static class StudentMarks 
{ 
public static void main(String[] args) 
{ 
 Student2 st = new Student2(); 
 st.setName("Vivek"); 
 st.setPhyMarks(85); 
 st.setChemMarks(75); 
 st.setBioMarks(90); 
 st.marksRead(); 
 } 
}
}
