package com.darkorbit

interface ExchangeShopCommand : ProtocolPacket {
	var assets: MutableList<InventoryItemModule>
	var eventName: String
	var items: MutableList<ExchangesShopItem>
	var shopId: String
}
