package com.stc.assessment.repository.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "PATIENT")
public class Patient implements Serializable {

	@Id
	private long id;

	@Column(name="NAME")
	private String name;
}