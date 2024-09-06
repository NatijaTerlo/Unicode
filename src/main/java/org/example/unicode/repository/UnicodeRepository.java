package org.example.unicode.repository;

import org.example.unicode.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {

}
