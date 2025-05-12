package com.darkorbit

interface JumpDeniedCommand : ProtocolPacket {
	var mandatoryLevel: Int
}
