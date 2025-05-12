package com.darkorbit

interface PlutusStatusCommand : ProtocolPacket {
	var lifes: Int
	var mode: Mode
	var timeLeft: Long
}
