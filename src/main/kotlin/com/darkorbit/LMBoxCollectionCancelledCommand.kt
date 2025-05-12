package com.darkorbit

interface LMBoxCollectionCancelledCommand : ProtocolPacket {
	var priorityMode: LogMessengerPriorityModule
	var reason: LMBoxCollectionCancelledCommandReason
}
