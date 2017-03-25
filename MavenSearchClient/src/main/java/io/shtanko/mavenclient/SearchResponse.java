package io.shtanko.mavenclient;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResponse {

  @SerializedName("responseHeader")
  @Expose
  private ResponseHeader responseHeader;
  @SerializedName("response")
  @Expose
  private Response response;

  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }
}
