package com.stackroute.practice;

public class MemberVariable {

	Member member;

public MemberVariable(String name,int age,double salary){

 member = new Member(name,age,salary);
}

public Member getMember() {
	return member;
}

public void setMember(Member member) {
	this.member = member;
}

}
