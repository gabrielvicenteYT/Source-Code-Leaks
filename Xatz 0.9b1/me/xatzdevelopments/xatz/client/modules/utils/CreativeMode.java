package me.xatzdevelopments.xatz.client.modules.utils;

import org.lwjgl.input.Keyboard;

import me.xatzdevelopments.xatz.client.module.state.Category;
import me.xatzdevelopments.xatz.module.Module;
import net.minecraft.network.play.client.C01PacketChatMessage;

public class CreativeMode extends Module {

	public CreativeMode() {
		super("CreativeMode", Keyboard.KEY_NONE, Category.UTILS);
	}

	@Override
	public void onDisable() {

		super.onDisable();
	}

	@Override
	public void onEnable() {

		mc.thePlayer.sendQueue.addToSendQueue(new C01PacketChatMessage("/gamemode 1"));
		setToggled(false, true);

		super.onEnable();
	}

	@Override
	public void onUpdate() {

		super.onUpdate();
	}

}
