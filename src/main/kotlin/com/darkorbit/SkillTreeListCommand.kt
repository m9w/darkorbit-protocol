package com.darkorbit

interface SkillTreeListCommand : ProtocolPacket {
	var list: MutableList<SkillTreeInfoCommand>
	var logFiles: Int
	var required: Int
	var researchPoints: Int
	var resetCount: Int
	var resetPrice: Int
}
