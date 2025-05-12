package com.darkorbit

interface LMColletJackpotCommand : ProtocolPacket {
	var collectedAmount: Float
	var priorityMode: LogMessengerPriorityModule
	var summedAmmount: Float
}
