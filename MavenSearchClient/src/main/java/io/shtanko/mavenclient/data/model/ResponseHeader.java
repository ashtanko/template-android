package io.shtanko.mavenclient.data.model;

import com.google.gson.annotations.SerializedName;

public class ResponseHeader {
  @SerializedName("status")

  private Integer status;
  @SerializedName("QTime")

  private Integer qTime;
  @SerializedName("params")

  private Params params;

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getqTime() {
    return qTime;
  }

  public void setqTime(Integer qTime) {
    this.qTime = qTime;
  }

  public Params getParams() {
    return params;
  }

  public void setParams(Params params) {
    this.params = params;
  }
}
