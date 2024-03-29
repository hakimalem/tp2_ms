package com.esisba.msformation.repositories;

import com.esisba.msformation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface FormationRepository extends JpaRepository<Formation, Long> {
}
