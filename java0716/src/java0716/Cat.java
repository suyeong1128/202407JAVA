package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Cat {
	private String breed;
	private String color;
	private int age;
	
//	public Cat(String breed) {
////		super();
////		this.breed = breed;
//		this(breed, "흰색", 10);
//	}
//
//	public Cat(String breed, String color) {
////		super();
////		this.breed = breed;
////		this.color = color;
//		this(breed, color, 10);
//	}
//
//	public Cat(String breed, String color, int age) {
//		super();
//		this.breed = breed;
//		this.color = color;
//		if(age > 9) {
//			this.age = age;
//		}
//	}
//
//	Cat() { //기본 생성자(Default Constructor
//		System.out.println("Cat()");
//	}
//	
//	Cat(int age) { //생성자
//	}

//	@Override
//	public String toString() {
//		return "고양이 [품종=" + breed + ", 색깔=" + color + ", 나이=" + age + "]";
//	}
	
}
