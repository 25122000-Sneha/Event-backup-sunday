package com.wecp.eventmanagementsystem.repository;
import com.wecp.eventmanagementsystem.entity.Event;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    // extend jpa repository and add custom method if needed
   public  Optional<List<Event>> findAllByOrderByStatusDesc();
}
