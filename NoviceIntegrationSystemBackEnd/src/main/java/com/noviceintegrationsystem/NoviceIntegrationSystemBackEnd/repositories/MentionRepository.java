package com.noviceintegrationsystem.NoviceIntegrationSystemBackEnd.repositories;

import com.noviceintegrationsystem.NoviceIntegrationSystemBackEnd.entities.Mention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentionRepository extends JpaRepository<Mention, Long> {

}