package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력시 오름차순으로 출력하도록 구현한다. TreeSet에 name 컬럼을
// 1. Comparable<E>의 compareTo() 메소드 재정의
	// 기존 객체의 수정이 필요
// 2. Comparator<E>의 compare() 구현
	// 기존의 객체를 수정없이 구현

class Abc {
	String name;		// <<== 컬럼이 정렬 컬럼. 오름차순 정렬: 가나다라....하
						// 홍길동, 이순신, 강감찬 	===> 강감찬, 이순신, 홍길동 
	int age;			// 나이
	
	public Abc (String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age ;
	}
}

class Abc_T implements Comparable<Abc_T> {
	String name;		// <<== 컬럼이 정렬 컬럼. 오름차순 정렬: 가나다라....하
	// 홍길동, 이순신, 강감찬 	===> 강감찬, 이순신, 홍길동 
	int age;			// 나이

	public Abc_T (String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Abc_T o) {
		if (this.name.charAt(0) < o.name.charAt(0)) {
			return -1;
		} else if (this.name.charAt(0) == o.name.charAt(0)) {
			return 0;	
		} else {
			return 1;
		}
		
	}
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age ;
	}
}

public class EX_TreeSetMethod_3 {
	public static void main(String[] args) {
		// 4. 방법 1. MyComparableClass 객체 크기 비교 : Comparable<E> 인터페이스의 compareTo() 재정의
		// 기존 객체의 수정이 필요. 다시 컴파일 
		TreeSet<Abc_T> treeSet1 = new TreeSet();
		Abc_T c1 = new Abc_T("홍길동", 30);
		Abc_T c2 = new Abc_T("이순신", 50);
		Abc_T c3 = new Abc_T("강감찬", 40);
		
		treeSet1.add(c1);
		treeSet1.add(c2);
		treeSet1.add(c3);
		
		System.out.println(treeSet1);
		System.out.println("===============");
		
		// 5. 방법 2. 기존의 객체를 수정하지 않고 TreeSet에 저장할 경우
		// TreeSet 생성자 내부에 Comparator<E> 인터페이스의 compare() 재정의해서 익명 객체로 구현 
		
		TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {
			
			@Override
			
			public int compare(Abc o1, Abc o2) {
				if (o1.name.charAt(0) < o2.name.charAt(0)) {
					return -1;
				} else if (o1.name.charAt(0) == o2.name.charAt(0)) {
					return 0;
				} else {
					return 1;
				}
			}
		});

		Abc abc1 = new Abc("홍길동", 30);
		Abc abc2 = new Abc("이순신", 50);
		Abc abc3 = new Abc("강감찬", 40);
		
		treeSet2.add(abc1);
		treeSet2.add(abc2);
		treeSet2.add(abc3);
		
		System.out.println(treeSet2);
		
	}
}
