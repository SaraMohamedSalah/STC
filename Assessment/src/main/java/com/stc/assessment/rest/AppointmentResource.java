package com.stc.assessment.rest;

import com.stc.assessment.datamodel.AppointmentModel;
import com.stc.assessment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("appointments")
public class AppointmentResource {

	@Autowired AppointmentService appointmentService;
	
	@GetMapping()
	List<AppointmentModel> findAll() {
		return appointmentService.findAll();
	}

	@GetMapping(params = "patientName")
	List<AppointmentModel> findByPatientName(@RequestParam String patientName) {
		return appointmentService.findByPatientName(patientName);
	}

	@PostMapping()
	void findByPatientName(@RequestBody AppointmentModel appointmentModel) {
		appointmentService.addAppointment(appointmentModel);
	}

	@GetMapping(params = "appointmentDate")
	List<AppointmentModel> findByPatientName(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date appointmentDate) {
		return appointmentService.findByAppointmentDate(appointmentDate);
	}

	@PutMapping("/{id}/cancel-with-reason")
	void findByPatientName(@RequestBody String reason, @PathVariable Long id) {
		appointmentService.cancelAndLogReason(reason, id);
	}

}
