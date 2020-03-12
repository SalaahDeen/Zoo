public class Tiger {

    private String name;
    private String  favoriteFood;

    public Tiger(String n){
        this.name = n;
        this.favoriteFood = "meat";
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours ");
    }



    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " +  " Wants more " + food);
        } else {
            sleep();
        }
    }













}
