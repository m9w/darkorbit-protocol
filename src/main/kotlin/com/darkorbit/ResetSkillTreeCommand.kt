package com.darkorbit

interface ResetSkillTreeCommand : ProtocolPacket {
	var list: MutableList<SkillTreeInfoCommand>
	var logFiles: Int
	var researchPoints: Int
	var resetCount: Int
	var resetPrice: Int
	var stack: BaseStackCommand
	var success: Boolean
}
