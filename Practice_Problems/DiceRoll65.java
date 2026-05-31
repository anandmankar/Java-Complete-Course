
public class DiceRoll65 {

    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        DiceRoll65 dice = new DiceRoll65();
        System.out.println(dice.roll()); 
    }
}
