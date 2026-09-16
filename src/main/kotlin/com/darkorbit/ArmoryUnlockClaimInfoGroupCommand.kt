package com.darkorbit

interface ArmoryUnlockClaimInfoGroupCommand : ProtocolPacket {
	var claimInfoCommandList: MutableList<ArmoryUnlockClaimInfoCommand>
	var group: Int
}
