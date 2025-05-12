package com.darkorbit

interface MemberLeaveCommand : ProtocolPacket {
	var playerId: Int
	var reason: LeaveReason
}
