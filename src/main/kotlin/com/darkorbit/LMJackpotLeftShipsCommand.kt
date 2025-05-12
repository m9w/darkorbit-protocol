package com.darkorbit

interface LMJackpotLeftShipsCommand : ProtocolPacket {
	var leftShips: Int
	var priorityMode: LogMessengerPriorityModule
}
