package com.caske2000.carnivores.proxy;

import com.caske2000.carnivores.entity.EntityBullet;
import com.caske2000.carnivores.entity.EntityUtahraptor;
import com.caske2000.carnivores.model.ModelBullet;
import com.caske2000.carnivores.model.ModelUtahraptor;
import com.caske2000.carnivores.render.RenderBullet;
import com.caske2000.carnivores.render.RenderEntityUtahraptor;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderers() {

		super.registerRenderers();

		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet(new ModelBullet(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityUtahraptor.class, new RenderEntityUtahraptor(new ModelUtahraptor(), 0));

	}

}