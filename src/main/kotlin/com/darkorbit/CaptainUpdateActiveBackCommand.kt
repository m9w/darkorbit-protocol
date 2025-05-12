package com.darkorbit

interface CaptainUpdateActiveBackCommand : ProtocolPacket {
	var captainId: Int
	var errorId: BaseStackCommand
	var result: Boolean
}
