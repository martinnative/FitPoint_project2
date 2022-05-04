package com.web.projects.fitpoint.fitpoint.repository;

import com.web.projects.fitpoint.fitpoint.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
