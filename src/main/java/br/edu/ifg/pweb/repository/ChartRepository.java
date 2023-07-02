package br.edu.ifg.pweb.repository;

import br.edu.ifg.pweb.entity.Category;
import br.edu.ifg.pweb.entity.Chart;
import br.edu.ifg.pweb.entity.Offer;
import br.edu.ifg.pweb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChartRepository extends JpaRepository<Chart, Long> {
}
