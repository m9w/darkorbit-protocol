package com.darkorbit

interface QuantumFluidCoreDataListCommand : ProtocolPacket {
	var allModules: MutableList<QuantumFluidCoreData>
}
