package com.darkorbit

interface ExpeditionJumpTargetLevelCommand : ProtocolPacket {
	var result: Boolean
	var stack: BaseStackCommand
}
