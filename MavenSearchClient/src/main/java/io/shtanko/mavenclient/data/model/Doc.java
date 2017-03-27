package io.shtanko.mavenclient.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Doc {

  @SerializedName("id")

  private String id;
  @SerializedName("g")

  private String g;
  @SerializedName("a")

  private String a;
  @SerializedName("latestVersion")

  private String latestVersion;
  @SerializedName("repositoryId")

  private String repositoryId;
  @SerializedName("p")

  private String p;
  @SerializedName("timestamp")

  private Integer timestamp;
  @SerializedName("versionCount")

  private Integer versionCount;
  @SerializedName("text")

  private List<String> text;
  @SerializedName("ec")

  private List<String> ec;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getG() {
    return g;
  }

  public void setG(String g) {
    this.g = g;
  }

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public String getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(String latestVersion) {
    this.latestVersion = latestVersion;
  }

  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public String getP() {
    return p;
  }

  public void setP(String p) {
    this.p = p;
  }

  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public Integer getVersionCount() {
    return versionCount;
  }

  public void setVersionCount(Integer versionCount) {
    this.versionCount = versionCount;
  }

  public List<String> getText() {
    return text;
  }

  public void setText(List<String> text) {
    this.text = text;
  }

  public List<String> getEc() {
    return ec;
  }

  public void setEc(List<String> ec) {
    this.ec = ec;
  }
}
