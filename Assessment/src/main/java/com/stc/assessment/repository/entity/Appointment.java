package com.stc.assessment.repository.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "APPOINTMENT")
public class Appointment implements Serializable {

	@Id
	@SequenceGenerator(name="APPOINTMENT_SEQ_GENERATOR", sequenceName="APPOINTMENT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="APPOINTMENT_SEQ_GENERATOR")
	private long id;

	@Column(name="APPOINTMENT_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date appointmentDate;

	@Column(name="CANCELLATION_REASON")
	private String cancellationReason;
	
	@ManyToOne
	@JoinColumn(name="PATIENT_ID")
	private Patient patient;
}