package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է½� ������������ ����ϵ��� �����Ѵ�. TreeSet�� name �÷���
// 1. Comparable<E>�� compareTo() �޼ҵ� ������
	// ���� ��ü�� ������ �ʿ�
// 2. Comparator<E>�� compare() ����
	// ������ ��ü�� �������� ����

class Abc {
	String name;		// <<== �÷��� ���� �÷�. �������� ����: �����ٶ�....��
						// ȫ�浿, �̼���, ������ 	===> ������, �̼���, ȫ�浿 
	int age;			// ����
	
	public Abc (String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + " ���� : " + age ;
	}
}

class Abc_T implements Comparable<Abc_T> {
	String name;		// <<== �÷��� ���� �÷�. �������� ����: �����ٶ�....��
	// ȫ�浿, �̼���, ������ 	===> ������, �̼���, ȫ�浿 
	int age;			// ����

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
		return "�̸� : " + name + " ���� : " + age ;
	}
}

public class EX_TreeSetMethod_3 {
	public static void main(String[] args) {
		// 4. ��� 1. MyComparableClass ��ü ũ�� �� : Comparable<E> �������̽��� compareTo() ������
		// ���� ��ü�� ������ �ʿ�. �ٽ� ������ 
		TreeSet<Abc_T> treeSet1 = new TreeSet();
		Abc_T c1 = new Abc_T("ȫ�浿", 30);
		Abc_T c2 = new Abc_T("�̼���", 50);
		Abc_T c3 = new Abc_T("������", 40);
		
		treeSet1.add(c1);
		treeSet1.add(c2);
		treeSet1.add(c3);
		
		System.out.println(treeSet1);
		System.out.println("===============");
		
		// 5. ��� 2. ������ ��ü�� �������� �ʰ� TreeSet�� ������ ���
		// TreeSet ������ ���ο� Comparator<E> �������̽��� compare() �������ؼ� �͸� ��ü�� ���� 
		
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

		Abc abc1 = new Abc("ȫ�浿", 30);
		Abc abc2 = new Abc("�̼���", 50);
		Abc abc3 = new Abc("������", 40);
		
		treeSet2.add(abc1);
		treeSet2.add(abc2);
		treeSet2.add(abc3);
		
		System.out.println(treeSet2);
		
	}
}
