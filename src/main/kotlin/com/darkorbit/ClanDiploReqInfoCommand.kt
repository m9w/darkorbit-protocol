package com.darkorbit

interface ClanDiploReqInfoCommand : ProtocolPacket {
	var cdrId: Int
	var clanName: String
	var desc: String
	var diploType: Int
	var fromClanId: Int
	var insertDate: String
	var toClanId: Int
}
