package com.example.ecom.logging.repositories;

import com.example.ecom.logging.entity.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEntryRepository extends JpaRepository<LogEntry,Long> {
}
