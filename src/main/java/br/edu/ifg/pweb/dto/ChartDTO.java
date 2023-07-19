package br.edu.ifg.pweb.dto;

import br.edu.ifg.pweb.entity.Chart;
import br.edu.ifg.pweb.entity.Offer;
import br.edu.ifg.pweb.entity.Product;
import br.edu.ifg.pweb.entity.User;

import java.util.ArrayList;
import java.util.List;

public class ChartDTO {
    private static final long serialVersionUID = 1L;

    private Long id;


    private double price;

    private String imageName;


    private String name;
    private String ingredients;
    private User userID;

    public ChartDTO(Long id, double price, String imageName, String name, String ingredients,User userId) {
        this.id = id;
        this.price = price;
        this.imageName = imageName;
        this.name = name;
        this.ingredients = ingredients;
        this.userID = userId;
    }

    public ChartDTO(Chart chart) {
        setId(chart.getId());
        setName(chart.getName());
        setPrice(chart.getPrice());
        setImageName(chart.getImageName());
        setIngredients(chart.getIngredients());
        setUserID(chart.getUser());
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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }
}
