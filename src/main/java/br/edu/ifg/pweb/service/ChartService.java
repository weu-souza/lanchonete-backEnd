package br.edu.ifg.pweb.service;

import br.edu.ifg.pweb.dto.*;
import br.edu.ifg.pweb.entity.*;
import br.edu.ifg.pweb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ChartService {

    @Autowired
    private ChartRepository chartRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private LogService logService;

    @Transactional(readOnly = true)
    public List<ChartDTO> findAll(UserDetails userDetails) {
        List<Chart> list = chartRepository.findAll();
        logService.logAction("Searched all chart", userDetails.getUsername(), LocalDateTime.now());
        return list.stream()
                .map(x -> new ChartDTO(x))
                .collect(Collectors.toList());
    }

    @Transactional
    public ChartDTO insertProduct(ChartDTO dto, long id, UserDetails userDetails) {
        try {
            Chart entity = new Chart(dto);
            Product product = productRepository.findById(id);
            entity.setProduct(product);
            entity = chartRepository.save(entity);
            logService.logAction("Created new chart", userDetails.getUsername(), LocalDateTime.now());
            return new ChartDTO(entity);
        } catch (Exception e) {
            return null;
        }
    }
    @Transactional
    public ChartDTO insertOffer(ChartDTO dto, long id, UserDetails userDetails) {
        try {
            Chart entity = new Chart(dto);
            Offer offer = offerRepository.findById(id);
            entity.setOffer(offer);
            entity = chartRepository.save(entity);
            logService.logAction("Created new chart", userDetails.getUsername(), LocalDateTime.now());
            return new ChartDTO(entity);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean delete(Long id, UserDetails userDetails) {
        try {
            chartRepository.deleteById(id);
            logService.logAction("Deleted chart " + id, userDetails.getUsername(), LocalDateTime.now());
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
