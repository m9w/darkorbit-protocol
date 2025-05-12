package com.darkorbit

interface MapEventEMPActivationCommand : ProtocolPacket {
	var activatorId: Int
	var x: Int
	var y: Int
}
