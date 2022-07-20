package api;

public class Trade {
  private Double price;
  private Double volume;
  private Double time;
  private String side;
  private String orderType;
  private String misc;

  public Trade(Double price, Double volume, Double time, String side, String orderType, String misc) {
    this.price = price;
    this.volume = volume;
    this.time = time;
    this.side = side;
    this.orderType = orderType;
    this.misc = misc;
  }

  public Double getTime() {
    return time;
  }
}