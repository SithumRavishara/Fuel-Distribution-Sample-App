package com.sithum.fueldistributionsampleapp.DTO;

public class OrderDTO {

  int id;
  String name;
  int station_id;
  int capacity;
  String type;

  public OrderDTO() {
  }

  public OrderDTO(int id, String name, int station_id, int capacity, String type) {
    this.id = id;
    this.name = name;
    this.station_id = station_id;
    this.capacity = capacity;
    this.type = type;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStation_id() {
    return station_id;
  }

  public void setStation_id(int station_id) {
    this.station_id = station_id;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


}
