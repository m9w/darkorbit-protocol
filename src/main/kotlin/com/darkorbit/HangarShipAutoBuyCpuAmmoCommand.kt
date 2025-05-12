package com.darkorbit

interface HangarShipAutoBuyCpuAmmoCommand : ProtocolPacket {
	var ammoLootId: String
	var cpuItemId: Long
	var errorMessage: BaseStackCommand
	var result: Int
}
