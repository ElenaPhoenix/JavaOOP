package units;

public class Thief extends BaseHero {
    int trick; // хитрость
    int chance;

    public Thief(String name) {
        super(150, name, "разбойник", 6, 3, 20, new int[]{8, 12});
        // trick=this.damage*2;
        chance=50;
    }
}