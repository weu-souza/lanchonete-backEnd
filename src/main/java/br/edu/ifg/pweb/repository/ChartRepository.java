package br.edu.ifg.pweb.repository;

import br.edu.ifg.pweb.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Repository
public interface ChartRepository extends JpaRepository<Chart, Long> {

    @Modifying
    @Query("DELETE  FROM  Chart where user.id = :id")
    void deleteByUser(@Param(value = "id") long id);

    List<Chart> findByUser(User user);
}
