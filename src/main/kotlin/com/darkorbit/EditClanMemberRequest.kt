package com.darkorbit

interface EditClanMemberRequest : ProtocolPacket {
	var memberId: Int
	var rankId: Int
}
