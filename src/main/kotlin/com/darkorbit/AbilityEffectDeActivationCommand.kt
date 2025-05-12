package com.darkorbit

interface AbilityEffectDeActivationCommand : ProtocolPacket {
	var activatorId: Int
	var selectedAbilityId: Int
	var targetIds: MutableList<Int>
}
