package com.darkorbit

interface AbilityStopCommand : ProtocolPacket {
	var activatorId: Int
	var selectedAbilityId: Int
	var targetIds: MutableList<Int>
}
