package com.darkorbit

interface TechDeactivationCommand : ProtocolPacket {
	var techType: TechTypeModule
	var userId: Int
}
