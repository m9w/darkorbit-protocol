package com.darkorbit

interface LMMineExplodedCommand : ProtocolPacket {
	var hash: String
	var priorityMode: LogMessengerPriorityModule
}
