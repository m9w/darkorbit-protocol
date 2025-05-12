package com.darkorbit

interface CaptainUpgradPerkBackCommand : ProtocolPacket {
	var captainId: Int
	var errorId: BaseStackCommand
	var level: Int
	var perkId: Int
	var result: Boolean
}
