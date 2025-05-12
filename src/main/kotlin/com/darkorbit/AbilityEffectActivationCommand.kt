package com.darkorbit

interface AbilityEffectActivationCommand : ProtocolPacket {
	var activatorId: Int
	var isPersistent: Boolean
	var selectedAbilityId: Int
	var targetIds: MutableList<Int>
}
