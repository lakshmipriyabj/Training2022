package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="lp_speaker_one2one")


@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Speaker {
    
	@Id
	@Column(name="speaker_id")
	int id;
	@Column(name="speaker_name")
	String FirstName;
	
	@Column(name="speaker_qualification")
	String qualification;
}
