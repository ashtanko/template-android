package io.shtanko.mavenclient;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Response {

  @SerializedName("docs")
  @Expose
  private List<Doc> docs;

  public List<Doc> getDocs() {
    return docs;
  }

  public void setDocs(List<Doc> docs) {
    this.docs = docs;
  }
}
