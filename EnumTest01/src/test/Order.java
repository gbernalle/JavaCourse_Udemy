package test;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
  private Integer id;
  private Date moment;
  private OrderStatus status;

  public Order() {

  }
  
  public Order(Integer id, Date moment, OrderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getDate() {
    return moment;
  }

  public void setDate(Date moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", moment='" + getDate() + "'" +
      ", status='" + getStatus() + "'" +
      "}";
  }

}