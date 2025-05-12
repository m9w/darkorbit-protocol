package com.darkorbit

interface CombatStateCommand : ProtocolPacket {
	var combatState: CombatStateType
}
