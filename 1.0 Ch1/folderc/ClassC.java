package folderc;

import foldera.ClassA;
import folderb.ClassB;

public class ClassC {
    public static void main(String ... args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        System.out.println(classA);
        System.out.println(classB);
    }
}