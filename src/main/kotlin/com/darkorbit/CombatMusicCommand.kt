package com.darkorbit

interface CombatMusicCommand : ProtocolPacket {
	var combatEvent: CombatEvent
}
