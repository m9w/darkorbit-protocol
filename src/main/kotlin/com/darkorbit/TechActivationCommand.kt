package com.darkorbit

interface TechActivationCommand : ProtocolPacket {
	var techType: TechTypeModule
	var userId: Int
}
