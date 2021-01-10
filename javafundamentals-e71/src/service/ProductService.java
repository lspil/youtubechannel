package service;

import annotations.Call;

public class ProductService {

  private int x; // 1000

  private ProductService() {

  }

  public void addProduct() {
    System.out.println("Adding product in the DB.");
  }

  @Call
  public void editingProduct() {
    System.out.println("Editing product in the DB.");
  }

  public void printX() {
    System.out.println(x); // 1000
  }
}
