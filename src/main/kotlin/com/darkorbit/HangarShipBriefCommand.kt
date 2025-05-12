package com.darkorbit

interface HangarShipBriefCommand : ProtocolPacket {
	var isActive: Boolean
	var isFavorite: Boolean
	var lootId: String
	var shipId: Long
}
