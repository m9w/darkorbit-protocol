package com.darkorbit

interface ArgStackCommand : ProtocolPacket {
	var key: ArgKey
	var type: Int
	var value: String
	var value2: BaseStackCommand
}
