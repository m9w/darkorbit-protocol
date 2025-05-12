package com.darkorbit

interface SkillTreeInfoCommand : ProtocolPacket {
	var curLevel: Int
	var id: String
}
