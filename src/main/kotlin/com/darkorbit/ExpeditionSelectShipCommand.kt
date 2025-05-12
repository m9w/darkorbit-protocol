package com.darkorbit

interface ExpeditionSelectShipCommand : ProtocolPacket {
	var result: Boolean
	var stack: BaseStackCommand
}
