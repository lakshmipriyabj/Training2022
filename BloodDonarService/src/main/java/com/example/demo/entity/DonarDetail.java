package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="laks_donar_detail")
public class DonarDetail {
	
	@Id
	@Column(name="donar_id")
	int donarId;
	
	@Column(name="donar_name")
	String donarName;
	
	@Column(name="mobile_number")
	long mobileNumber;
	
	@Column(name="blood_group")
	String bloodGroup;
	
	@Column(name="location")
	String location;

}
