package com.darkorbit

interface EpicFightMessageCommand : ProtocolPacket {
	var duration: Int
	var type: EpicFightMessageModule
}
