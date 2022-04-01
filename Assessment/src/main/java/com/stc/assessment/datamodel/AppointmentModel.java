package com.stc.assessment.datamodel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stc.assessment.repository.entity.Patient;
import lombok.Data;

import java.util.Date;

@Data
public class AppointmentModel {
	private long id;
	@JsonFormat(pattern = "yyyy-MM-dd") 
	private Date appointmentDate;

	private String cancellationReason;

	private Patient patient;
}
