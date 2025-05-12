package com.darkorbit

interface EmperorSibelonBuffRingCommand : ProtocolPacket {
	var avatarId: Int
	var radius: Int
	var type: BuffType
	var x: Int
	var y: Int
}
