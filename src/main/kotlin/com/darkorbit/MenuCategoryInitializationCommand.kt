package com.darkorbit

interface MenuCategoryInitializationCommand : ProtocolPacket {
	var categoryId: String
	var menuItems: MutableList<MenuItemInitializationCommand>
}
