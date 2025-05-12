package com.darkorbit

interface GalaxyGateBuilderMultiEnergyCommand : ProtocolPacket {
	var errorCode: GalaxyGateBuilderMultiEnergyCommandErrorCode
	var gateMode: String
	var gatePartIds: MutableList<Short>
	var items: MutableList<GalaxyGateBuilderItemModule>
	var money: Long
	var multiplier: Byte
	var samples: Long
	var spinamount_selected: Byte
}
