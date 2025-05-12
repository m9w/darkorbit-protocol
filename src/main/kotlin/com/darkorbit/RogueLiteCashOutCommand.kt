package com.darkorbit

interface RogueLiteCashOutCommand : ProtocolPacket {
	var chanceUpList: MutableList<InventoryItemModule>
	var confirmedList: MutableList<InventoryItemModule>
}
