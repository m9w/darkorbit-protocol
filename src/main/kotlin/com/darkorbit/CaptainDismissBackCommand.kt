package com.darkorbit

interface CaptainDismissBackCommand : ProtocolPacket {
	var captainId: Int
	var errorId: BaseStackCommand
	var result: Boolean
}
