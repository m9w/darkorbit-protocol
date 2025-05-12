package com.darkorbit

interface AddMapEntityCommand : ProtocolPacket {
	var hash: String
	var x: Int
	var y: Int
}
