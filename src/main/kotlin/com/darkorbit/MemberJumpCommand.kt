package com.darkorbit

interface MemberJumpCommand : ProtocolPacket {
	var fromMapId: Int
	var memberId: Int
	var toMapId: Int
}
