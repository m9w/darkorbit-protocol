package com.darkorbit

interface UserInventoryModule : ProtocolPacket {
	var activeHappyUpgradeDiscount: Int
	var activePremiumDiscount: Int
	var activeRebateSubDiscount: Int
	var inventoryItemModules: MutableList<InventoryItemModule>
}
