package com.darkorbit

interface ExpeditionClearanceTimeCommand : ProtocolPacket {
	var faction: FactionModule
	var seconds: Int
	var shipLootId: String
	var userId: Int
	var userName: String
}
