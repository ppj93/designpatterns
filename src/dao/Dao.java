package dao;

import java.util.LinkedList;


public class Dao{
	
	
	
	public static void main(String[] args) {
		StudentDao s=new StudentDao();
		s.saveStudent(new Student(12));
		System.out.println(s.getStudent(2));
	}
}

interface IStudentDao {
	Student getStudent(int id);
	void saveStudent(Student s);
	LinkedList<Student> getStudents();
}

class Student {
	int id;
	
	public Student(int i){
		id=i;
	}
	
	public String toString(){
		return "Student with id " + id;
	}
}

class StudentDao implements IStudentDao {

	LinkedList<Student> students=new LinkedList<Student>();
	
	public StudentDao(){
		students.add(new Student(1));
		students.add(new Student(2));
		students.add(new Student(3));
	}
	
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).id == id)
				return students.get(i);
		}
		
		return null;
	}

	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		students.add(s);
	}

	@Override
	public LinkedList<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}
	
}
