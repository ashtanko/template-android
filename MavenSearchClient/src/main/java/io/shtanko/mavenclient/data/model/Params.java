package io.shtanko.mavenclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Params {
  @SerializedName("spellcheck")

  private String spellcheck;
  @SerializedName("fl")

  private String fl;
  @SerializedName("sort")

  private String sort;
  @SerializedName("indent")

  private String indent;
  @SerializedName("q")

  private String q;
  @SerializedName("qf")

  private String qf;
  @SerializedName("spellcheck.count")

  private String spellcheckCount;
  @SerializedName("wt")

  private String wt;
  @SerializedName("rows")

  private String rows;
  @SerializedName("version")

  private String version;
  @SerializedName("defType")

  private String defType;

  public String getSpellcheck() {
    return spellcheck;
  }

  public void setSpellcheck(String spellcheck) {
    this.spellcheck = spellcheck;
  }

  public String getFl() {
    return fl;
  }

  public void setFl(String fl) {
    this.fl = fl;
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getIndent() {
    return indent;
  }

  public void setIndent(String indent) {
    this.indent = indent;
  }

  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public String getQf() {
    return qf;
  }

  public void setQf(String qf) {
    this.qf = qf;
  }

  public String getSpellcheckCount() {
    return spellcheckCount;
  }

  public void setSpellcheckCount(String spellcheckCount) {
    this.spellcheckCount = spellcheckCount;
  }

  public String getWt() {
    return wt;
  }

  public void setWt(String wt) {
    this.wt = wt;
  }

  public String getRows() {
    return rows;
  }

  public void setRows(String rows) {
    this.rows = rows;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getDefType() {
    return defType;
  }

  public void setDefType(String defType) {
    this.defType = defType;
  }
}
