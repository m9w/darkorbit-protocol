package com.darkorbit

interface ClanDiploInfoCommand : ProtocolPacket {
	var cdiId: Int
	var clanName: String
	var daysLeft: Int
	var desc: String
	var diploType: Int
	var fromClanId: Int
	var insertDate: String
}
