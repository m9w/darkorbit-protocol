package com.darkorbit

interface CPUInfoAimCommand : ProtocolPacket {
	var isActive: Boolean
	var possibleChargesLeft: Int
}
