package com.userj.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Setter;
import lombok.ToString;

@Setter //( 롬복 셋팅이 필요)
@ToString 
@Entity // 데이터 베이스와 매핑하게된다.
public class User {

	@Id // primary key키설정 (고유값이 된다.)
	@GeneratedValue // 자동으로 값을 1씩 증가시켜준다.
	private Long id;

	@Column(length = 20) // 최대 길이 20으로 설정
	@NotBlank // null, "", "(space)" 세가지 조건 값들을 허용하지 않는다.
	private String userId;
	private String password;
	private String name;
	private String email;
	
	
	public void update(User newUser) {
		this.password = newUser.password;
		this.name = newUser.name;
		this.email = newUser.email;
	}

	// setter.. toString 부분  
}