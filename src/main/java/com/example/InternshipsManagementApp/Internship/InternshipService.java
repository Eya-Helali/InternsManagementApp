package com.example.InternshipsManagementApp.Internship;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InternshipService {

    private final InternshipRepository internshipRepository;

    public Optional<Internship> getInternshipById(int internshipId)
    { return internshipRepository.findById(internshipId);}

    public Optional<Internship> getInternshipByDomain(Domain domain)
    { return Optional.ofNullable(internshipRepository.findByDomain(domain));}

    public Optional<Internship> getInternshipByName(String name)
    { return Optional.ofNullable(internshipRepository.findByName(name));}

    public Internship addInternship(Internship internship)
    {return internshipRepository.save(internship);}


    public Internship updateInternshipByID(int internshipId, Internship internshipUpdated)
    {   internshipUpdated.setInternshipId(internshipId);
        return internshipRepository.save(internshipUpdated);}


    public void deleteInternshipById(int internshipId)
    {internshipRepository.deleteById(internshipId);}

    public List<Internship> getAllInternships()
    { return internshipRepository.findAll();}

}

