package com.darkorbit

interface ClanDeleteOpenDiploRequest : ProtocolPacket {
	var diploId: Int
	var toClanId: Int
}
