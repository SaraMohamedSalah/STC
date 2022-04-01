package com.stc.assessment.service.mappers;

import com.stc.assessment.datamodel.AppointmentModel;
import com.stc.assessment.repository.entity.Appointment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {
	Appointment toEntity(AppointmentModel appointmentModel);
	AppointmentModel toModel(Appointment appointment);
}
