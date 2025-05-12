package com.darkorbit

interface AbilityStatusSingleCommand : ProtocolPacket {
	var abilityTypeId: Int
	var isActivatable: Boolean
}
