package com.example.InternshipsManagementApp.Internship;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/internship")
@RequiredArgsConstructor
public class InternshipController {

    private final InternshipService internshipService;

    @GetMapping(path="{internshipId}")
    public Optional<Internship> getInternshipById(@PathVariable int internshipId)
    { return internshipService.getInternshipById(internshipId);}

    @GetMapping(path="/byDomain/{domain}")
    public Optional<Internship> getInternshipByDomain(@PathVariable Domain domain)
    { return internshipService.getInternshipByDomain(domain);}

    @GetMapping(path="/byName/{name}")
    public Optional<Internship> getInternshipByName(@PathVariable String name)
    { return internshipService.getInternshipByName(name);}

    @GetMapping
    public List<Internship> getAllInternships()
    {return internshipService.getAllInternships();}
    

    
    
    @PostMapping
    public Internship addInternship(@RequestBody Internship internship)
    {return internshipService.addInternship(internship);}

    @PutMapping(path="{internshipId}")
    public Internship updateIntership(@PathVariable int internshipId, @RequestBody Internship internshipUpdated  )
    { return internshipService.updateInternshipByID(internshipId,internshipUpdated);}


    @DeleteMapping(path="{internshipId}")
    public void deleteInternshipById(@PathVariable int internshipId)
    { internshipService.deleteInternshipById(internshipId);}
}
