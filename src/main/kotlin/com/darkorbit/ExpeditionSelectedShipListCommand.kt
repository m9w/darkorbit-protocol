package com.darkorbit

interface ExpeditionSelectedShipListCommand : ProtocolPacket {
	var selectedHangarId: Int
	var shipCommands: MutableList<ExpeditionShipCommand>
}
