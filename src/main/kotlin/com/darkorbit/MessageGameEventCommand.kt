package com.darkorbit

interface MessageGameEventCommand : ProtocolPacket {
	var messageKey: String
	var replacementValue: String
	var wildCard: String
}
