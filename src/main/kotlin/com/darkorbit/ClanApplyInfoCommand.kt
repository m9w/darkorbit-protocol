package com.darkorbit

interface ClanApplyInfoCommand : ProtocolPacket {
	var EP: Long
	var applyDesc: String
	var clanApplyId: Int
	var company: Int
	var insertDate: String
	var level: Int
	var userName: String
}
