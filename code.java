package firstProject;

class StudentC
{
 int id;
 String name;
 String degree;
 String college;
 
 public int getId()
 {
 return id;
 }
 public void setId(int newId)
 {
 this.id= newId;
 }
 public String getName()
 {
  return name;
 }
 public void setName(String newName)
 {
  this.name=newName;
 }
 public String getDegree() 
 {
  return degree;
 }
 public void setDegree(String newDegree)
 {
  this.degree=newDegree;
 }
 public String getCollege()
 {
  return college;
 }
 public void setCollege(String newCollege)
 {
  this.college=newCollege;
 }
}
class EngineeringStudent extends StudentC
{
	void displayStudentProfile()
	{
	  System.out.println("ID: "+getId()+"\nName: "+getName()+"\nDegree: "+getDegree()+"\nCollege: "+getCollege()); 
	}
}
class ArtAndScienceStudent extends StudentC
{
	void displayStudentProfile()
	{
      System.out.println("ID: "+getId()+"\nName: "+getName()+"\nDegree: "+getDegree()+"\nCollege: "+getCollege()+"\n");	
	}
}

class AppClass 
{
  public static void main(String[] args)
  {

    EngineeringStudent s1=new EngineeringStudent();
    
    
    s1.setId(1012);
    s1.setName("Karthi");
    s1.setDegree("BE");
    s1.setCollege("SASTRA");
    s1.displayStudentProfile();
   
    ArtAndScienceStudent s2=new  ArtAndScienceStudent();
    

   s2.setId(0707);
   s2.setName("Dhoni");
   s2.setDegree("Bsc");
   s2.setCollege("PANIMALAR");
   s2.displayStudentProfile();

  }
}
