package com.darkorbit

interface MenuInitializationCommand : ProtocolPacket {
	var categories: MutableList<MenuCategoryInitializationCommand>
	var itemBarPosition: String
	var slotBars: MutableList<SlotBarInitializationCommand>
}
