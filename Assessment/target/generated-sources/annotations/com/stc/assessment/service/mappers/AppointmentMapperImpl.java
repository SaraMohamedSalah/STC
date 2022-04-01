package com.stc.assessment.service.mappers;

import com.stc.assessment.datamodel.AppointmentModel;
import com.stc.assessment.repository.entity.Appointment;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-01T21:00:26+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Override
    public Appointment toEntity(AppointmentModel appointmentModel) {
        if ( appointmentModel == null ) {
            return null;
        }

        Appointment appointment = new Appointment();

        appointment.setId( appointmentModel.getId() );
        appointment.setAppointmentDate( appointmentModel.getAppointmentDate() );
        appointment.setCancellationReason( appointmentModel.getCancellationReason() );
        appointment.setPatient( appointmentModel.getPatient() );

        return appointment;
    }

    @Override
    public AppointmentModel toModel(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentModel appointmentModel = new AppointmentModel();

        appointmentModel.setId( appointment.getId() );
        appointmentModel.setAppointmentDate( appointment.getAppointmentDate() );
        appointmentModel.setCancellationReason( appointment.getCancellationReason() );
        appointmentModel.setPatient( appointment.getPatient() );

        return appointmentModel;
    }
}
