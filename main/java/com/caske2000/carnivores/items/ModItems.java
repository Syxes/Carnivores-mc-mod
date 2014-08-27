package com.caske2000.carnivores.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final HunterItem ammo = new ItemAmmo();
	public static final HunterItem gun = new ItemGun();

	public static void init() {

		GameRegistry.registerItem(ammo, "ammo");
		GameRegistry.registerItem(gun, "gun");
	}

}
