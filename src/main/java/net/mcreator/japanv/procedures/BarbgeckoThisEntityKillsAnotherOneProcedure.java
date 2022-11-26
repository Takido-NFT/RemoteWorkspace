package net.mcreator.japanv.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.japanv.entity.BarbgeckoEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BarbgeckoThisEntityKillsAnotherOneProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BarbgeckoEntity) {
			((BarbgeckoEntity) entity).animationprocedure = "hurted";
		}
	}
}
