class GrandParent {
    public String grandFatherName;
    public String grandMotherName;

    GrandParent(String F, String M) {
        grandFatherName = F;
        grandMotherName = M;
        System.out.println("Grandfather's name is " + grandFatherName +
                " Grandmother's name is " + grandMotherName);
    }
}
class Parent extends GrandParent{
        String FatherName;
        String MotherName;

    Parent(String F, String M) {
        super(F, M);
    }
        System.out.println("Father's name is",+FatherName+" Mother's name is "+MotherName);
        }
        public class Child extends Parent {
            Child(String F, String M) {
                super(F, M);
            }

            public static void main(String[] args) {
                Child(String FatherName, String MotherName, String grandFatherName, String grandMotherName) {
                    Child ob = new Child("Satish", "Kamakshi", "Vishnu", "Saraswati");
                    System.out.println(ob.FatherName + ";"ob.MotherName";"ob.grandFatherName";"ob.grandMotherName);

                }
            }
        }

