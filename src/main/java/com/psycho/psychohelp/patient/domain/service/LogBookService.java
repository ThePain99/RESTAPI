package com.psycho.psychohelp.patient.domain.service;

import com.psycho.psychohelp.patient.domain.model.entity.LogBook;
import com.psycho.psychohelp.patient.domain.model.entity.Patient;
import com.psycho.psychohelp.patient.resource.CreatePatientResource;
import lombok.extern.java.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LogBookService {
    List<LogBook> getAll();
    LogBook getById(Long logBookId);
    LogBook create(LogBook request, Patient patientRequest);
    LogBook update(Long logbookId, LogBook request);
    ResponseEntity<?> delete(Long patientId);
}
