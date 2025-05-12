package com.darkorbit

interface CooldownStartedCommand : ProtocolPacket {
	var seconds: Int
	var type: CooldownTypeModule
}
