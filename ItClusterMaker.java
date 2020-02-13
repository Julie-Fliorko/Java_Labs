package labs;

public class ItClusterMaker {
    public static void main(String[] args) {
        ItCluster defaultConstr = new ItCluster();
        ItCluster fourVarConstr = new ItCluster("Lviv", 100, "Ivan Ivan", "M");
        ItCluster allVarConstr = new ItCluster("Kyiv", 1000, "Petro Petro", "F", 36, "First", "Second", 01001);

        System.out.println("Default constructor event");
        System.out.println(defaultConstr);
        System.out.println("////////");
        System.out.println("4 variebles constructor event");
        System.out.println(fourVarConstr);
        System.out.println("////////");
        System.out.println("All variebles constructor event");
        System.out.println(allVarConstr);
        System.out.println("////////");

        ItCluster[] objects = new ItCluster[ItCluster.SIZE_OF_OBJECTS_ARRAY];
        for (int counter = 0; counter < ItCluster.SIZE_OF_OBJECTS_ARRAY; counter++) {
            objects[counter] = new ItCluster();
        }

        System.out.println("\n");
        System.out.println("///////Four objects created with the help of for loop///////");
        for (ItCluster objNumber : objects) {
            System.out.println(objNumber + "\n");
        }
    }
}

