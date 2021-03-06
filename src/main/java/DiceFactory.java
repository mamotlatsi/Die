import java.util.ArrayList;

/**
 *
 */
public class DiceFactory implements SuperClass {
    private ArrayList<Integer> values = new ArrayList<>();
    private int sides;

    /**
     *
     * @param sides
     */
    DiceFactory(int sides) {
        this.sides = sides;
    }

    @Override
    public void makeDie() {
        for (int i = 1; i <= sides; ++i) {
            values.add(i);
        }
        System.out.println("Die : " + values);
    }
}
