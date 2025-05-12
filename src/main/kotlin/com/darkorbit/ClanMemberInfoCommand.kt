package com.darkorbit

interface ClanMemberInfoCommand : ProtocolPacket {
	var ep: Long
	var faction: Int
	var insertDate: String
	var mapName: String
	var maxPayout: Int
	var name: String
	var rank: Int
	var ranksId: Int
	var userId: Int
}
