package br.edu.ifg.pweb.entity;

import br.edu.ifg.pweb.dto.ChartDTO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_charts")
public class Chart {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    private double price;
    @Column(length = 399999999)
    private String imageName;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String name;

    private String ingredients;


    public Chart() {
    }

    public Chart(Long id, double price, String imageName, String name, String ingredients, User user) {
        this.id = id;
        this.price = price;
        this.imageName = imageName;
        this.name = name;
        this.ingredients = ingredients;
        this.user = user;
    }

    public Chart(ChartDTO chartDTO) {
        setId(chartDTO.getId());
        setName(chartDTO.getName());
        setPrice(chartDTO.getPrice());
        setImageName(chartDTO.getImageName());
        setIngredients(chartDTO.getIngredients());
        setUser(getUser());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
