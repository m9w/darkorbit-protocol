package com.darkorbit

interface CooldownReachedCommand : ProtocolPacket {
	var type: CooldownTypeModule
}
