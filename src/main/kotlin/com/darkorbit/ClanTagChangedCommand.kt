package com.darkorbit

interface ClanTagChangedCommand : ProtocolPacket {
	var clanId: Int
	var clanTag: String
	var userId: Int
}
