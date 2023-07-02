package br.edu.ifg.pweb.entity;

import br.edu.ifg.pweb.dto.OfferDTO;

import javax.persistence.*;

@Entity
@Table(name = "tb_offers")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Double price;

    private String ingredients;
    @Column(length = 399999999)
    private String imageName;


    public Offer() {
    }

    public Offer(Long id, String name, Double price, String ingredients, String imageName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.imageName = imageName;

    }

    public Offer(OfferDTO offerDTO){
        setId(offerDTO.getId());
        setName(offerDTO.getName());
        setPrice(offerDTO.getPrice());
        setImageName(offerDTO.getImageName());
        setIngredients(offerDTO.getIngredients());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
