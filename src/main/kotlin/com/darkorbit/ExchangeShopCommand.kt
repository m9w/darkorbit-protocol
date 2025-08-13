package com.darkorbit

interface ExchangeShopCommand : ProtocolPacket {
	var assets: MutableList<InventoryItemModule>
	var eventName: String
	var isVIP: Boolean
	var isVIPShop: Boolean
	var items: MutableList<ExchangesShopItem>
	var shopId: String
	var vipEndSeconds: Long
}
