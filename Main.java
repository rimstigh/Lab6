import java.lang.reflect.Constructor;

class Main {
  public static void main(String[] args) {
    //Declare and initialize a Tree object named tree1 using the default Constructor
    Tree tree1 = new Tree();

    //Declare and initialize a Tree object named tree2 using the parameters
    Tree tree2 = new Tree("maple", "broadleaf", true, "red");

    //call print on tree1 and tree2
    tree1.print();
    tree2.print();

    //Use the mutator methods to change tree1's name and type
    tree1.setTreeName("spruce");
    tree1.setTreeType("conifer");

    //call print on tree1 again
    tree1.print();
  }
}