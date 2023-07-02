package br.edu.ifg.pweb.dto;

import br.edu.ifg.pweb.entity.Offer;

public class OfferDTO {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Double price;

    private String ingredients;

    private String imageName;

    public OfferDTO() {
    }

    public OfferDTO(Long id, String name, Double price, String ingredients, String imageName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.imageName = imageName;
    }

    public OfferDTO(Offer offer){
        setId(offer.getId());
        setName(offer.getName());
        setPrice(offer.getPrice());
        setIngredients(offer.getIngredients());
        setImageName(offer.getImageName());
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
