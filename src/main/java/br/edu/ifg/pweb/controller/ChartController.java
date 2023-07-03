package br.edu.ifg.pweb.controller;

import br.edu.ifg.pweb.dto.CategoryDTO;
import br.edu.ifg.pweb.dto.ChartDTO;
import br.edu.ifg.pweb.dto.OfferDTO;
import br.edu.ifg.pweb.dto.ProductDTO;
import br.edu.ifg.pweb.entity.Category;
import br.edu.ifg.pweb.entity.Chart;
import br.edu.ifg.pweb.entity.Product;
import br.edu.ifg.pweb.repository.ChartRepository;
import br.edu.ifg.pweb.repository.ProductRepository;
import br.edu.ifg.pweb.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/chart")
@CrossOrigin("*")
public class ChartController {

    @Autowired
    private ChartService chartService;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @PreAuthorize("hasAnyRole('user', 'admin')")
    public ResponseEntity<List<ChartDTO>> findAll(@AuthenticationPrincipal UserDetails userDetails) {
        List<ChartDTO> list = chartService.findAll(userDetails);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/product/{id}")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<ChartDTO> insertproduct(@PathVariable long id, @RequestBody ChartDTO dto, @AuthenticationPrincipal UserDetails userDetails) {
        dto = chartService.insertProduct(dto, id, userDetails);
        if (dto != null) {
            URI uri = ServletUriComponentsBuilder
                    .fromCurrentRequest().path("/{id}")
                    .buildAndExpand(dto.getId()).toUri();

            return ResponseEntity.created(uri).body(dto);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value = "/offer/{id}")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<ChartDTO> insertOffer(@PathVariable long id, @RequestBody ChartDTO dto, @AuthenticationPrincipal UserDetails userDetails) {
        dto = chartService.insertOffer(dto, id, userDetails);
        if (dto != null) {
            URI uri = ServletUriComponentsBuilder
                    .fromCurrentRequest().path("/{id}")
                    .buildAndExpand(dto.getId()).toUri();

            return ResponseEntity.created(uri).body(dto);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping(value = "/{id}")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<Long> delete(@PathVariable Long id, @AuthenticationPrincipal UserDetails userDetails) {
        if (chartService.delete(id, userDetails)) {
            URI uri = ServletUriComponentsBuilder
                    .fromCurrentRequest().path("/{id}")
                    .buildAndExpand(id).toUri();

            return ResponseEntity.created(uri).body(id);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
