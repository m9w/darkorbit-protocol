package com.darkorbit

interface ArmoryUnlockClaimCommand : ProtocolPacket {
	var claimed: Boolean
	var index: Int
}
