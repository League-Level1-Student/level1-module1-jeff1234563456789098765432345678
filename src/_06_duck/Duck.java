package _06_duck;

public class Duck {
int numberOfriends;
String favoriteFoods;
static void quack() {System.out.println("Quak Quak Quak");}
static void waddle() {System.out.println("WADLE WADLE WADLE");}
Duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFoods = favoriteFood;
    this.numberOfriends = numberOfFriends;
}

}
