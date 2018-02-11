package classes.card;

//Class that is used as the essence of the type definition format in the pseudo database
class TypeCardFormat{
  private String typeName;
  private int mfulNumQuan;
  private int[] lengths;
  private int[] beginsOfNum;

  TypeCardFormat(String typeName, int[] beginsOfNum, int[] lengths){
    this.typeName = typeName;
    this.lengths = lengths;
    this.beginsOfNum = beginsOfNum;
    this.mfulNumQuan = (int)Math.ceil(Math.log10(beginsOfNum[0]));
  }

  public String getTypeName(){
    return this.typeName;
  }

  public int getMfulNumQuan(){
    return this.mfulNumQuan;
  }

  public int[] getLengths(){
    return this.lengths;
  }

  public int[] getBeginsOfNum(){
    return this.beginsOfNum;
  }
}
