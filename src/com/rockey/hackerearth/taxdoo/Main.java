package com.rockey.hackerearth.taxdoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.nextLine());
    Set<Order> orders = new HashSet<>();
    String rows = scanner.nextLine();
    while (N > 0){
      String input = scanner.nextLine();
      String[] split = input.split(",");
      Order order = new Order(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]),
          Double.parseDouble(split[3]), split[4], split[5]);
      orders.add(order);
      N--;
    }

    List<Long> invoiceNumber = new ArrayList<>();
    List<Long> invoiceNumber1 = new ArrayList<>();
    for (Order order : orders
    ) {
      String[] split = order.getDescription().split(" ");
      for (String input : split
      ) {
        if (input.startsWith("Inv-")) {
          invoiceNumber.add(Long.valueOf(input.substring(4, input.length())));
        }else if(input.startsWith("inv-")){
          invoiceNumber1.add(Long.valueOf(input.substring(4, input.length())));
        }
      }
    }
    Collections.sort(invoiceNumber);
    for (Long l :invoiceNumber
    ) {
      System.out.println("Inv-"+l);
    }
    Collections.sort(invoiceNumber1);
    for (Long l :invoiceNumber1
    ) {
      System.out.println("inv-"+l);
    }

  }


}

class Order {

  private int id;
  private String date;
  private int quantity;
  private double price;
  private String currency;
  private String description;

  public Order(int id, String date, int quantity, double price, String currency,
      String description) {
    this.id = id;
    this.date = date;
    this.quantity = quantity;
    this.price = price;
    this.currency = currency;
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", date='" + date + '\'' +
        ", quantity=" + quantity +
        ", price=" + price +
        ", currency='" + currency + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return id == order.id &&
        quantity == order.quantity &&
        Double.compare(order.price, price) == 0 &&
        Objects.equals(date, order.date) &&
        Objects.equals(currency, order.currency) &&
        Objects.equals(description, order.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, quantity, price, currency, description);
  }
}
