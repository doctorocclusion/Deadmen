package net.doctorocclusion.deadmen.entities;

import net.doctorocclusion.deadmen.Deadmen;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by Sam Sartor on 6/22/2016.
 */
public class DeadmenEntities {
	public static void init() {
		registerEntity(EntityDeaderman.class, "deaderman", 128, 3, true, 0xD8F8FF, 0xB3C9FB);
	}

	private static int nextId = 1;
	public static int registerEntity(Class<? extends Entity> entityClass, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggColor1, int eggColor2)
	{
		int id = nextId++;
		EntityRegistry.registerModEntity(entityClass, name, id, Deadmen.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		EntityRegistry.registerEgg(entityClass, eggColor1, eggColor2);
		return id;
	}
}
