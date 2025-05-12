package com.darkorbit

interface ClanNewDiplomacyRequest : ProtocolPacket {
	var clanId: Int
	var desc: String
	var diploClanID: Int
	var diploForm: Int
	var diploId: Int
	var status: String
}
