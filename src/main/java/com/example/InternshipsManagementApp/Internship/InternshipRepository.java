package com.example.InternshipsManagementApp.Internship;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepository extends JpaRepository<Internship,Integer> {
 Internship findByDomain(Domain domain);
 Internship findByName(String name);
}
