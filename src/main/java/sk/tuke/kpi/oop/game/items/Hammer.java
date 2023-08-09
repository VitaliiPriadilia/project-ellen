package sk.tuke.kpi.oop.game.items;

import sk.tuke.kpi.gamelib.graphics.Animation;
import sk.tuke.kpi.oop.game.Reactor;
import sk.tuke.kpi.oop.game.Repairable;

public class Hammer extends BreakableTool<Repairable> implements Collectible{
    public Hammer(int countForUses){
        super(countForUses);
        setAnimation(new Animation("sprites/hammer.png"));
    }
    public Hammer(){
        this(1);
    }

    @Override
    public Class<Repairable> getUsingActorClass() {
        return Repairable.class;
    }

    @Override
    public void useWith(Repairable repairable) {
        if(repairable != null && repairable.repair()) {
            super.useWith(repairable);
        }
    }
}
