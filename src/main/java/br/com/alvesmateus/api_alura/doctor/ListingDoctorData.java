package br.com.alvesmateus.api_alura.doctor;

public record ListingDoctorData(
        String name,
        String email,
        String crm,
        Expertise expertise
) {

    public ListingDoctorData(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getExpertise());
    }

}
