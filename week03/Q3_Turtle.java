<<<<<<< HEAD
public class Q3_Turtle {
    String species;
    int age;

    public Q3_Turtle(String species, int age) {
=======
public class Q3_Turtle{
    String species;
    int age;

    public Q3_Turtle(String species, int age){
>>>>>>> 46a63bc9f9ea1c131aad83694a3c66439701ab01
        this.species = species;
        this.age = age;
    }

<<<<<<< HEAD
    public void showDetails() {
        System.out.println("品種：" + species + "，年紀：" + age + "歲");
    }

    public static void main(String[] args) {
        Q3_Turtle myTurtle = new Q3_Turtle("綠蠵龜", 50);
        myTurtle.showDetails();
    }
=======
    public void showDetail(){
         System.out.println("This turtle's species is:" + species + "age: "+ age);
    }

    public static void main(String [] args){
      Q3_Turtle myTurtle = new Q3_Turtle("Green Turtle", 50);
      myTurtle.showDetail();

    }

>>>>>>> 46a63bc9f9ea1c131aad83694a3c66439701ab01
}