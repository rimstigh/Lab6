class Tree {
  //Declare variables
  String treeName;
  String treeType;
  boolean losesLeaves;
  String leafColor;

  //Default constructor with no parameters
  Tree() {
    treeName = "";
    treeType = "";
    losesLeaves = false;
    leafColor = "";
  }

  //Constructor with four parameters
  Tree(String aTreeName, String aTreeType, boolean aLosesLeaves, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    losesLeaves = aLosesLeaves;
    leafColor = aLeafColor;
  }

  //Four mutator methods 
  void setTreeName(String theTreeName) {
    treeName = theTreeName;
  }
  void setTreeType(String theTreeType) {
    treeType = theTreeType;
  }
  void setLosesLeaves(boolean theLosesLeaves) {
    losesLeaves = theLosesLeaves;
  }
  void setLeafColor(String theLeafColor) {
    leafColor = theLeafColor;
  }

  //Four accessor methods 
  String getTreeName() {
    return treeName;
  }
  String getTreeType() {
    return treeType;
  }
  boolean getLosesLeaves() {
    return losesLeaves;
  }
  String getLeafColor() {
    return leafColor;
  }

  //Print function
  void print() {
    String losesLeavesStatus;
    if (losesLeaves == true) {
      losesLeavesStatus = "does";
    } else {
      losesLeavesStatus = "does not";
    }
    System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + losesLeavesStatus + " lose its leaves for the winter.");
  }
}