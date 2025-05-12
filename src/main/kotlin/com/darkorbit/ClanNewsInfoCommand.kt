package com.darkorbit

interface ClanNewsInfoCommand : ProtocolPacket {
	var clanId: Int
	var clanName: String
	var clanNewsId: Int
	var context: String
	var insertDate: String
	var type: String
	var userId: Int
	var userName: String
}
