package com.darkorbit

interface LMCollectExperiencePointsCommand : ProtocolPacket {
	var collectedAmount: Int
	var currentLevel: Int
	var priorityMode: LogMessengerPriorityModule
	var summedAmount: Int
}
