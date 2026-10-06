package com.daozheng2026.ironmanmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

public
class IronManAbilities {
    public static void activateRepulsorRays(PlayerEntity player) {
        Vec3d lookVec = player.getRotationVec(1.0f);
        player.addVelocity(lookVec.x * 0.5, lookVec.y * 0.5, lookVec.z * 0.5);
        player.velocityModified = true;
    }

    public static void activateFlight(PlayerEntity player) {
        if (player.isSneaking()) {
            player.setVelocity(player.getVelocity().x, -0.2, player.getVelocity().z);
        } else {
            player.setVelocity(player.getVelocity().x, 0.1, player.getVelocity().z);
        }
        player.velocityModified = true;
    }

    public static void registerAbilities() {
        // Register abilities here
    }
}
