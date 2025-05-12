package com.darkorbit

interface HangarShipAutoBuyCpuAmmoRequest : ProtocolPacket {
	var ammoLootId: String
	var itemId: Long
}
