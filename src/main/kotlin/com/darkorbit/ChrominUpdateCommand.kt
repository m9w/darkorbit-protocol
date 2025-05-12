package com.darkorbit

interface ChrominUpdateCommand : ProtocolPacket {
	var currentAmt: Long
	var maxAmt: Long
}
