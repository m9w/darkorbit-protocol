package com.darkorbit

interface ArmoryUnlockInfoCommand : ProtocolPacket {
	var claimInfoCommandList: MutableList<ArmoryUnlockClaimInfoCommand>
	var normal: ArmoryUnlockLootShowListCommand
	var special: ArmoryUnlockLootShowListCommand
}
