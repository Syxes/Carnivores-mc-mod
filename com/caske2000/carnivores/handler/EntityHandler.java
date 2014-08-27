package com.caske2000.carnivores.handler;

import net.minecraft.entity.EntityList;

import com.caske2000.carnivores.Hunter;
import com.caske2000.carnivores.entity.EntityBullet;
import com.caske2000.carnivores.entity.EntityUtahraptor;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHandler {

	public static void init() {

		registerEntity();

	}

	public static void registerEntity() {

		int id;

		EntityRegistry.registerGlobalEntityID(EntityBullet.class, "Bullet", id = EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", id, Hunter.instance, 120, 1, true);

		createEntity(EntityUtahraptor.class, "Utahraptor", 64, 1, true, 0x7C7062, 0x584A3D);

	}

	public static void createEntity(Class entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendVelocityUpdates,
			int solidColour, int spotColour) {

		int randomID = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomID);
		EntityRegistry.registerModEntity(entityClass, entityName, randomID, Hunter.instance, trackingRange, updateFrequency, sendVelocityUpdates);

		createEgg(solidColour, spotColour, randomID);

	}

	// Use: createEgg(0x + HexCode, 0x + HexCode);
	public static void createEgg(int solidColour, int spotColour, int randomID) {

		EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColour, spotColour));
	}
}
