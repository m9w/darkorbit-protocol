package com.darkorbit

interface AbilityStatusFullCommand : ProtocolPacket {
	var abilities: MutableList<AbilityStatusSingleCommand>
}
