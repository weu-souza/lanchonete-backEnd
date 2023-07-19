package br.edu.ifg.pweb.repository;

import br.edu.ifg.pweb.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChartRepository extends JpaRepository<Chart, Long> {
    List<Chart> findByUser(User user);
}
