package io.shtanko.mavenclient.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Response {

  @SerializedName("docs")
  private List<Doc> docs;

  public List<Doc> getDocs() {
    return docs;
  }

  public void setDocs(List<Doc> docs) {
    this.docs = docs;
  }
}
