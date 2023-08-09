package sk.tuke.kpi.oop.game.items;
import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;
import sk.tuke.kpi.oop.game.characters.Alive;

import java.util.Objects;

public class Energy extends AbstractActor implements Usable<Alive> {
    public Energy(){
        setAnimation(new Animation("sprites/energy.png"));
    }

    @Override
    public Class<Alive> getUsingActorClass() {
        return Alive.class;
    }

    @Override
    public void useWith(Alive actor) {
        if(actor != null && actor.getHealth().getValue() != 100){
            actor.getHealth().restore();
            Objects.requireNonNull(getScene()).removeActor(this);
        }
    }
}
