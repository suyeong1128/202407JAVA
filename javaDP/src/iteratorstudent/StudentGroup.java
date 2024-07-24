package iteratorstudent;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

	private Student[] students;
	private int last = 0;
	
	//반복자 책들을 모두 가져올 수 있도록 준비
	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(this);
	}
	
	//생성자
	public StudentGroup(int maxsize) {
		this.students = new Student[maxsize];
	}
	
	//해당 인덱스의 책을 리턴
	public Student getStudentAt(int index) {
		return students[index];
	}
	
	//책을 추가
	public void appendStudent(Student student) {
		this.students[last] = student;
		last++;
	}
	
	//책들의 총 건수 
	public int getLength() {
		return last;
	}
}
