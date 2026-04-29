package com.darkorbit

interface ArmoryUnlockInfoCommand : ProtocolPacket {
	var claimInfoCommandList: MutableList<ArmoryUnlockClaimInfoCommand>
	var eventRemainSeconds: Int
	var normal: ArmoryUnlockLootShowListCommand
	var special: ArmoryUnlockLootShowListCommand
}
