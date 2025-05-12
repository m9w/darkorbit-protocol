package com.darkorbit

interface ClanFilterSearchRequest : ProtocolPacket {
	var desc: Boolean
	var factionType: Int
	var lookup: String
	var memberType: Int
	var orderType: Int
	var range: Int
	var rankType: Int
	var recruitionType: Int
	var start: Int
}
