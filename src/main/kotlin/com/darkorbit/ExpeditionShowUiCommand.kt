package com.darkorbit

interface ExpeditionShowUiCommand : ProtocolPacket {
	var param0: String
	var param1: String
	var type: UIType
}
