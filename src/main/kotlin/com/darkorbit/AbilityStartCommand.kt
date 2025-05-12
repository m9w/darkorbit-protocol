package com.darkorbit

interface AbilityStartCommand : ProtocolPacket {
	var activatorId: Int
	var noStopCommand: Boolean
	var selectedAbilityId: Int
}
