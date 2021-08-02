package br.com.adilsondjr.ms.msemail.repository;

import br.com.adilsondjr.ms.msemail.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
