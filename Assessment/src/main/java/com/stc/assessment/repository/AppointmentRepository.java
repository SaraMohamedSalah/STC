package com.stc.assessment.repository;

import com.stc.assessment.repository.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	List<Appointment> findByPatientName(String patientName);
	List<Appointment> findByAppointmentDate(Date appointmentDate);
}
