package iteratorstudent;

import java.util.Iterator;
import java.util.NoSuchElementException;



public class StudentIterator implements Iterator<Student>{
	private StudentGroup studentGroup;
	private int index = 0;
	
	//생성자
		public StudentIterator(StudentGroup studentGroup) {
			this.studentGroup = studentGroup;
			this.index = 0;
		}
		
		//다음 책이 있는지
		@Override
		public boolean hasNext() {
			if(index < studentGroup.getLength()) {
				return true;
			} else {
				return false;
			}
		}

		//다음 책을 가져올 때
		@Override
		public Student next() {
			if(!hasNext()) {
				throw new NoSuchElementException(); //예외 발생S
			}
			Student student = studentGroup.getStudentAt(index);
			index++;
			return student;
		}
}
