package com.darkorbit

interface ArmoryUnlockLootShowCommand : ProtocolPacket {
	var bg: String
	var line: Int
	var lootAmount: Int
	var lootId: String
	var showShipIcon: Boolean
}
