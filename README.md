# Inheritance


The objective of this exercise to help students understand
·  	What is inheritance, types of inheritance
Inheritance is acquiring characters and behaviours from parent class to child class.
*single level inheritance
*multillevel inheritance
*hierarchial inheritance
*multiple inheritaance



·  	When it is used
It was used to avoid reusability of codee.


·  	How to apply inheritance
By linking two classes inheritance is followed.



·  	Rules to follow
 
Exercise:
Create a Student class (id, name, degree, college) and apply setters and getters for each member variables.
e.g setID(), getID(), setDegree(), getDegree() etc.
 
Create an “EngineeringStudent” class and extend Student class (This means Student is a parent class and EngineeringStudent is a child class. Due to this relationship, you can now access the above setters and getters of parent class in the child class.
 
Create an “ArtsAndScienceStudent” class and extend Student class.
 
Create an App Class which has main() and create object for EngineeringStudent and set all values. Please note for EngineeringStudent the degree you set as BE or BTECH.
Similarly create object for ArtsAndScienceStudent class and extend set all values. Please note for ArtsAndScienceStudent the degree you set as Bsc or BA.
 
Now add a behavior called displayStudentProfile() in both the child class to show the Student details. You will be able to do this because since you inherited Student class you have access to all the getter methods too. So in the display method simply accessing all the setters will get the data you need to show up.
 
If you are able to understand and complete the program then you are good at the inheritance basics.




From the above task, i get an idea that it was hierarchial inheritance.
It is just because student is a parent class whereas engineering and arts and science students are commonly linked to stdudent class.

