package com.darkorbit

interface EditClanInfoRequest : ProtocolPacket {
	var clanHp: Int
	var clanName: String
	var clanTS: String
	var clanTag: String
	var newFraction: Int
	var recruitingStatus: Int
	var recuritingInfo: Int
}
