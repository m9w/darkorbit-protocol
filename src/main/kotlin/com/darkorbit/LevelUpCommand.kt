package com.darkorbit

interface LevelUpCommand : ProtocolPacket {
	var newLevel: Int
	var uid: Int
}
