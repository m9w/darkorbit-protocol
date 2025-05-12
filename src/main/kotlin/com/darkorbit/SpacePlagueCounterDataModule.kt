package com.darkorbit

interface SpacePlagueCounterDataModule : ProtocolPacket {
	var active: Boolean
	var currentValue: Int
	var maxValue: Int
}
