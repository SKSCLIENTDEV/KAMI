package me.zeroeightsix.kami.module.modules.zeroeightysix.movement;

import me.zeroeightsix.kami.module.Module;

/**
 * Created by 086 on 23/08/2017.
 */
@Module.Info(name = "Strafe", description = "Automatically makes the player sprint", category = Module.Category.MOVEMENT, showOnArray = Module.ShowOnArray.OFF)
public class Strafe extends Module {

    @Override
    public void onUpdate() {
        try {
            if (!mc.player.collidedHorizontally && mc.player.moveForward > 0)
                mc.player.setSprinting(true);
            else
                mc.player.setSprinting(false);
        } catch (Exception ignored) {
        }
    }

}
