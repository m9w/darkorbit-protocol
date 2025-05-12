package com.darkorbit

interface ExpeditionShipListCommand : ProtocolPacket {
	var shipCommands: MutableList<ExpeditionShipCommand>
}
