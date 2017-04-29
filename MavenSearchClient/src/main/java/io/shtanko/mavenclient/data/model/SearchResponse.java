package io.shtanko.mavenclient.data.model;

import com.google.gson.annotations.SerializedName;

public class SearchResponse {

  @SerializedName("responseHeader")
  private ResponseHeader responseHeader;

  @SerializedName("response")
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
