package com.stc.assessment.service;

import com.stc.assessment.datamodel.AppointmentModel;

import java.util.Date;
import java.util.List;

public interface AppointmentService {
	List<AppointmentModel> findAll();
	List<AppointmentModel> findByPatientName(String patientName);
	void addAppointment(AppointmentModel appointmentModel);
	List<AppointmentModel> findByAppointmentDate(Date appointmentDate);
	void cancelAndLogReason(String reason, Long id);
}
