package com.darkorbit

interface EmoteActivationCommand : ProtocolPacket {
	var lootId: String
	var userId: Int
}
