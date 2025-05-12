package com.darkorbit

interface ChangeClanDescriptionCommand : ProtocolPacket {
	var desc: String
	var errorMsg: BaseStackCommand
	var success: Boolean
}
