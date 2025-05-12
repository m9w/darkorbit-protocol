package com.darkorbit

interface QuantumFluidCoreRequest : ProtocolPacket {
	var ItemId: Long
	var type: ReqType
}
