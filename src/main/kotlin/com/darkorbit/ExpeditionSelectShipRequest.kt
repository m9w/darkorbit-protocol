package com.darkorbit

interface ExpeditionSelectShipRequest : ProtocolPacket {
	var hangarId: MutableList<Long>
}
