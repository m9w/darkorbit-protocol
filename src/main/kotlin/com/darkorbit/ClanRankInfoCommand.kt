package com.darkorbit

interface ClanRankInfoCommand : ProtocolPacket {
	var clanId: Int
	var rankId: Int
	var rankName: String
	var rights: MutableList<String>
}
