package com.springbootjpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity // 注明是实体类
@Table(name="MOVIE") //表名
public class Movie implements Serializable{
    private static final long serialVersionUID = 1L;

    // 主健
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // 说明此类中的属性对应表中的字段(字段名,长度,null)
//    @Column(name = "movie_name",length=100,nullable = false)
    @Column
    private String name;
    @Column
    private Double price;
    @Column(name="action_time")
    private Date actionTime;

    public Movie() {
    }

    public Movie(Integer id, String name, Double price, Date actionTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.actionTime = actionTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }
}
