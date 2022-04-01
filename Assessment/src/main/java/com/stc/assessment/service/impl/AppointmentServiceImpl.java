package com.stc.assessment.service.impl;

import com.stc.assessment.datamodel.AppointmentModel;
import com.stc.assessment.repository.AppointmentRepository;
import com.stc.assessment.repository.entity.Appointment;
import com.stc.assessment.service.AppointmentService;
import com.stc.assessment.service.mappers.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired AppointmentRepository appointmentRepository;
	@Autowired AppointmentMapper appointmentMapper;
	
	@Override
	public List<AppointmentModel> findAll() {
		return appointmentRepository.findAll().stream().map(appointment -> appointmentMapper.toModel(appointment)).collect(Collectors.toList());
	}

	@Override
	public List<AppointmentModel> findByPatientName(String patientName) {
		return appointmentRepository.findByPatientName(patientName).stream().map(appointment -> appointmentMapper.toModel(appointment)).collect(Collectors.toList());
	}

	@Override
	public void addAppointment(AppointmentModel appointmentModel) {
		Appointment appointment = appointmentMapper.toEntity(appointmentModel);
		appointmentRepository.save(appointment);
	}

	@Override
	public List<AppointmentModel> findByAppointmentDate(Date appointmentDate) {
		return appointmentRepository.findByAppointmentDate(appointmentDate).stream().map(appointment -> appointmentMapper.toModel(appointment)).collect(Collectors.toList());
	}

	@Override
	public void cancelAndLogReason(String reason, Long id) {
		Appointment appointment = appointmentRepository.getById(id);
		appointment.setCancellationReason(reason);
		appointmentRepository.save(appointment);
	}
}
