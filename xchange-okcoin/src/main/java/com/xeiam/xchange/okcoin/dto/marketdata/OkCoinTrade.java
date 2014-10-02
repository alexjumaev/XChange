package com.xeiam.xchange.okcoin.dto.marketdata;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OkCoinTrade {

  private final Date date;
  private final BigDecimal price;
  private final BigDecimal amount;
  private final String tid;
  private final String type;

  public OkCoinTrade(@JsonProperty("date") final long date, @JsonProperty("price") final BigDecimal price, @JsonProperty("amount") final BigDecimal amount, @JsonProperty("tid") final String tid,
      @JsonProperty("type") final String type) {

    this.date = new Date(date * 1000);
    this.price = price;
    this.amount = amount;
    this.tid = tid;
    this.type = type;
  }

  public Date getDate() {

    return date;
  }

  public BigDecimal getPrice() {

    return price;
  }

  public BigDecimal getAmount() {

    return amount;
  }

  public String getTid() {

    return tid;
  }

  public String getType() {

    return type;
  }

}