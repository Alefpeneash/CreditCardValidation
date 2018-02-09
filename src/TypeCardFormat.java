class TypeCardFormat{
  private String typeName;
  private int mfulNumQuan;
  private int lengths[];
  private int beginsOfNum[];

  TypeCardFormat(String typeName, int beginsOfNum[], int lengths[]){
    this.typeName = typeName;
    this.length = lengths;
    this.beginsOfNum = beginsOfNum;
    mfulNumQuan = Math.ceil(Math.log10(beginsOfNum[0]));
  }

  public String getTypeName(){
    return this.typeName;
  }

  public String getMfulNumQuan(){
    return this.mfulNumQuan;
  }

  public String getLengths(){
    return this.length;
  }

  public String getBeginsOfNum(){
    return this.beginsOfNum;
  }
}
