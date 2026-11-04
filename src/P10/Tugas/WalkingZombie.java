package P10.Tugas;


public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += 10;
                break;
            case 2:
                health += 30;
                break;
            case 3:
                health += 40;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= 2;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data -\n"
                + super.getZombieInfo();
    }
}
