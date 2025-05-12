package com.darkorbit

interface ReloginCommand : ProtocolPacket {
	var delayInMillis: Int
	var mapID: Int
}
