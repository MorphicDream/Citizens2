package net.citizensnpcs.trait;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import net.citizensnpcs.api.persistence.Persist;
import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.trait.TraitName;

@TraitName("gamemodetrait")
public class GameModeTrait extends Trait {
    @Persist
    private GameMode mode;

    public GameModeTrait() {
        super("gamemodetrait");
    }

    @Override
    public void run() {
        if (npc.isSpawned() && npc.getEntity() instanceof Player && mode != null) {
            ((Player) npc.getEntity()).setGameMode(mode);
        }
    }

    public void setGameMode(GameMode mode) {
        this.mode = mode;
    }
}
