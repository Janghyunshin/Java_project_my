package chap17.EX05;

import java.util.ArrayList;

class Member {			// DTO, VO : 각 계층간의 데이터를 받아서 전달해주는 클래스
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {	// 생성자를 통해서 필드의 값 할당
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
			return memberName + " 회원님의 아이디는 " + memberID + "입니다. ";
		}
}

class MemberArrayList {			// MemberArrayList를 객체화 하면 ArrayList 객체가 생성 된다.
	private ArrayList <Member> arrayList;
		
		//List<Member> aList = new ArrayList<Member>();
		//ArrayList<Member arrayList = new ArrayList<Member>();
	
	public MemberArrayList () {	// 기본 생성자
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {	//Member 객체를 받아서 맨 마지막 방에 값을 추가하는 메소드 
		// 코드 블락 
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {	// 매개 변수 2개를 받아서 // 특정 index 방번호에 값을 추가(삽입)
		arrayList.add(a, member);		// 예외 발생시 트라이 캐치로 하면됨 
		
		// 코드 블락
	}
	public Boolean removeMember (int memberID) {
		// ArrayList에 저장된 memberId를 검색해서 해당 객체를 삭제하는 메소드 
		
		for (int i = 0; i < arrayList.size() ; i++) {
			Member member = arrayList.get(i);	// 각 방에 저장된 Member 객체를 member 참조변수에 할당
			int temID = member.getMemberID();   // 객체의 getMemberId(), 객체 내부의 memberid
			
			if(temID == memberID) {
				arrayList.remove(i); // arrayList 방의 저장된 객체를 제거
				System.out.println("회원님의 " + memberID + "는 삭제 되었습니다. ");
				return true;
			}
		}
		System.out.println(memberID +  "가 존재 하지 않습니다. ");
		return false;
	}
	
	public void showAllmember() {
		// 모든 ArrayList에 저장된 모든 사용자 정보를 출력 하는 메소드
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)); 	// 각방의 Member 객체 자체를 출력 
		}
	}
	
	public void showSize() {
		System.out.println(arrayList.size());
	}
}


public class EX_MemberArrayList {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList(); //  객체를 생성하는 순간  arrayList 필드가 활성화
			// 메소드를 호출하기 위해서 객체 생성
			// addMember(), addMember2(), removeMember(), showAllMember()
		
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);	// 각 객체를 생성해서 ArrayList 저장 
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showSize();
		
		// 특정 index 방에 추가적인 사용자 추가 
		memberArrayList.addMember2(3, memberHong);
		
		// 모든 사용자 정보 출력
		memberArrayList.showAllmember();
		
		// 특정 id를 가진 사용자 제거
		memberArrayList.removeMember(1003);
	}
}
