package Lecture_01.Ex007;

public class Healer extends BaseHero {

    private int heals;
    private int maxHeals;

    public Healer() {
        super(String.format("Hero_Healer #%d", ++number),
                r.nextInt(100, 200));
        this.maxHeals = r.nextInt(2, 10);
        this.heals = maxHeals;
        this.className = "Healer";
    }

    public String getInfo() {
        return String.format("%s  Heals: %d", super.getInfo(), this.heals);
    }

    public void Heal(BaseHero target) {
        int hp_healed = BaseHero.r.nextInt(20, 51);
        target.healed(hp_healed);
        this.heals--;
    }
}
