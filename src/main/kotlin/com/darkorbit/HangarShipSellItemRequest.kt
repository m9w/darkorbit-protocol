package com.darkorbit

interface HangarShipSellItemRequest : ProtocolPacket {
	var itemList: MutableList<InventoryItemSellPack>
}
