package com.darkorbit

interface PassItemModule : ProtocolPacket {
	var amount: Int
	var level: Int
	var lootId: String
	var statusType: PassItemStatusType
}
