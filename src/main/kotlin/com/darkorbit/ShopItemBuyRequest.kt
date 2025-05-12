package com.darkorbit

interface ShopItemBuyRequest : ProtocolPacket {
	var action: String
	var amount: Int
	var buyCategory: String
	var category: String
	var level: String
	var lootId: String
	var petName: String
}
