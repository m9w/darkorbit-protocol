package com.darkorbit

interface UserMessageTargetInfoCommand : ProtocolPacket {
	var id: Int
	var message: String
	var used: Boolean
}
