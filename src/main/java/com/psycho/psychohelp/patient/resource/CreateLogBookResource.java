package com.psycho.psychohelp.patient.resource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.psycho.psychohelp.patient.domain.model.entity.Patient;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateLogBookResource {

    @NotNull
    @Size(max = 200)
    private String logbookName = " LogBook Name";

    @NotNull
    @Size(max = 200)
    private String publicHistory = " Public History ";

    @NotNull
    @Size(max = 200)
    private String consultationReason = " LogBook Name";

    private Long patient_id;
}
