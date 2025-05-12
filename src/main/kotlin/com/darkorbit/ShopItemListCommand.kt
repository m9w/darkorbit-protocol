package com.darkorbit

interface ShopItemListCommand : ProtocolPacket {
	var category: String
	var currentShipLootId: String
	var itemList: MutableList<ShopItemCommand>
	var promptList: MutableList<ShopLabelPrompt>
}
