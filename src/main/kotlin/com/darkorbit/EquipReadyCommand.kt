package com.darkorbit

interface EquipReadyCommand : ProtocolPacket {
	var ready: Boolean
}
