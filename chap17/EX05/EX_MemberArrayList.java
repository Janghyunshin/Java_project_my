package chap17.EX05;

import java.util.ArrayList;

class Member {			// DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberID;
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
}

class MemberArrayList {			// MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� ���� �ȴ�.
	private ArrayList <Member> arrayList;
		
		//List<Member> aList = new ArrayList<Member>();
		//ArrayList<Member arrayList = new ArrayList<Member>();
	
	public MemberArrayList () {	// �⺻ ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {	//Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ� 
		// �ڵ� ��� 
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {	// �Ű� ���� 2���� �޾Ƽ� // Ư�� index ���ȣ�� ���� �߰�(����)
		arrayList.add(a, member);		// ���� �߻��� Ʈ���� ĳġ�� �ϸ�� 
		
		// �ڵ� ���
	}
	public Boolean removeMember (int memberID) {
		// ArrayList�� ����� memberId�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ� 
		
		for (int i = 0; i < arrayList.size() ; i++) {
			Member member = arrayList.get(i);	// �� �濡 ����� Member ��ü�� member ���������� �Ҵ�
			int temID = member.getMemberID();   // ��ü�� getMemberId(), ��ü ������ memberid
			
			if(temID == memberID) {
				arrayList.remove(i); // arrayList ���� ����� ��ü�� ����
				System.out.println("ȸ������ " + memberID + "�� ���� �Ǿ����ϴ�. ");
				return true;
			}
		}
		System.out.println(memberID +  "�� ���� ���� �ʽ��ϴ�. ");
		return false;
	}
	
	public void showAllmember() {
		// ��� ArrayList�� ����� ��� ����� ������ ��� �ϴ� �޼ҵ�
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)); 	// ������ Member ��ü ��ü�� ��� 
		}
	}
	
	public void showSize() {
		System.out.println(arrayList.size());
	}
}


public class EX_MemberArrayList {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList(); //  ��ü�� �����ϴ� ����  arrayList �ʵ尡 Ȱ��ȭ
			// �޼ҵ带 ȣ���ϱ� ���ؼ� ��ü ����
			// addMember(), addMember2(), removeMember(), showAllMember()
		
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);	// �� ��ü�� �����ؼ� ArrayList ���� 
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showSize();
		
		// Ư�� index �濡 �߰����� ����� �߰� 
		memberArrayList.addMember2(3, memberHong);
		
		// ��� ����� ���� ���
		memberArrayList.showAllmember();
		
		// Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(1003);
	}
}
