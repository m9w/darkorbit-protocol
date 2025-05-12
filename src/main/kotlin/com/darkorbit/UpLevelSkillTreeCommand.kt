package com.darkorbit

interface UpLevelSkillTreeCommand : ProtocolPacket {
	var curLevel: Int
	var id: String
	var researchPoints: Int
	var stack: BaseStackCommand
	var success: Boolean
}
