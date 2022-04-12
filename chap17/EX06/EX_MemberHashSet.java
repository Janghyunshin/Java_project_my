package chap17.EX06;

// p.jangwoo@gmail.com , ����Կ��Ե� ����
// HashSet���� ��ȯ
// Member Ŭ������ memberid �÷��� equals, hashCode() �������ؼ� ������ ��ü�� �ν�

// �߿� : Set�� �ߺ��� ���� ������ �� ����.
	// Wrapper Ŭ������ Integer, String, Double, float, Character, Byte, Short, Boolean
	// Wrapper Ŭ������ equals(), hashCode() �޼ҵ尡 ������ �Ǿ� �ִ�.
	// Ư�� ��ü�� ���� �� �� ��ü�� Set �� ������ ��� �� ��ü�� Object Ŭ������ equals(), hashCode() �� ������ ����� �Ѵ�.
	// ��ü�� Ư�� �ʵ��� ���� ���� �� �ߺ��� �ĺ��ϴ� �ʵ带 ����. 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {			// DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberID;		// Set�� ���� �ĺ���, memberid �ʵ��� ���� ���� �� ���� ��ü�̴� ��� ����
								// equals(), hashCode()
	private String memberName;
	
	public Member(int memberID, String memberName) {	// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString() {
			return memberName + " ȸ������ ���̵�� " + memberID + "�Դϴ�. ";
		}
	@Override			// member1.equals(member2)
	public boolean equals(Object obj) {		// ��ü�� ������ Object�� ��ĳ���� 
		if (obj instanceof Member) {	// �ٿ� ĳ���� �Ҷ� ��Ÿ�� ������ �����Ϸ���, Object�� Member ��ü�� ���� �Ǿ� ������ 
			Member member = (Member) obj; // obj�� Object�� ��ĳ���� �Ǿ �ٿ� ĳ���� 
			if (this.memberID == member.memberID) {		// this.memberid : member1 ��ü��, member.memberid  : member2
				return true;
			} else {
				return false;
			}
		}
		return false;	// obj�� member Ÿ���� �������� ���� �� 
	}
	@Override
	public int hashCode() { 	//memberid �ʵ��� ���� ������ �� ������ hashCode�� ����
		// return memberid; 
		// return this.memberid;	// �ϳ��� �ʵ常�� �������� hashCode()�� ����
		return Objects.hash(memberID);	// ���� ����
			// Objects.hashCode(memberid, memberName); �������� �ʵ带 �������� hashCode�� ������ �� �ִ�.
				// memberid, memberName �ʵ��� ���� ��� ������ ��� ������ hashCode();
	}
}

class MemberHashSet {			// MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� ���� �ȴ�.
	private Set <Member> hashSet;		// Set ���� : <Member>, �ʵ��� private (������, setter)
	
			//Set<Member> hashSet = new HashSet<member>();
		
		//List<Member> aList = new ArrayList<Member>();		���ʸ� Ÿ��Ŭ���� ��ü ����.
		//ArrayList<Member> arrayList = new ArrayList<member>();

	public MemberHashSet() {	// �⺻ ������ ȣ�� �� Set�� �������� Ȱ��ȭ.
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {	//Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ� 
		// �ڵ� ��� 
		hashSet.add(member);	// Member ��ü�� ��ǲ �޾� hashSet�� member ��ü�� ����, �ߺ� ����Ǹ� �ȵȴ�.
								// Member ��ü�� memberid �ʵ��� ���� ������ ���, ������ ��ü�̴ٶ�� ���� 
								// equals(), hashCode() �޼ҵ� ������ : memberid 
	}
	
	public Boolean removeMember (int memberID) { 	// memberid�� Member��ü ���� �ʵ��̹Ƿ� Set�� ����� ��ü�� �����;��Ѵ�.
		// Set�� index�� �������� �����Ƿ� �⺻ for���� ����� �� ����. 
		// ���� for ���� ����� �� �ְ�, iterator�� ����� �� �ִ�. 
		// iterator ����ؼ� remove
		
		Iterator<Member> iter = hashSet.iterator();	// iterator: ��ȸ��, 
		while (iter.hasNext()) {						// hasNext() : hashSet�� ���� �����Ҷ� true, false 
			Member member = iter.next();			// Next(); ���� �����ְ� ���� ������ �̵� 
			int tempID = member.getMemberID();		
			
			if(tempID == memberID) {
				hashSet.remove(member);
				return true;
			} 
		}
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return false;
	}
	
	public void showAllmember() {
		// iterator ����ؼ� 
		Iterator<Member> iter = hashSet.iterator(); // ���� ����
		while (iter.hasNext()) {
			Member member = iter.next();		// hashSet �� ���� ������ �´�.
			System.out.println(member);	// hashSet �� ��ü�� ���, toString() ������  : �ʵ��� ���� ��� 
		}
	}
	
	public void showsize() {
		System.out.println(hashSet.size());		// ���� ���� 
	}
}


public class EX_MemberHashSet {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet(); 
			//  ��ü�� �����ϴ� ����  arrayList �ʵ尡 Ȱ��ȭ
			// �޼ҵ带 ȣ���ϱ� ���ؼ� ��ü ����
			// addMember(), addMember2(), removeMember(), showAllMember()
		
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee2 = new Member(1001, "������");
		Member memberLee3 = new Member(1001, "������");
		
		memberHashSet.addMember(memberLee);	// �� ��ü�� �����ؼ� ArrayList ���� 
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		memberHashSet.addMember(memberLee3);
		
		memberHashSet.showsize();	//4�� ���
		
		// ��� ����� ���� ���
		memberHashSet.showAllmember();			// 4�� ���
		System.out.println("==========================");
		
		// Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(1003);
		
		memberHashSet.showAllmember();			// 3�� ��� 
	}
}
