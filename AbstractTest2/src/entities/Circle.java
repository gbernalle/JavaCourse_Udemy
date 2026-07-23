package entities;

import entities.enums.Color;

public class Circle extends Shape {
  private Double radius;
  

  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }
  
  public Double getRadius() {
    return this.radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }
  
  @Override
  public final double area() {
    return Math.PI * Math.pow(getRadius(), 2);
  }
}
