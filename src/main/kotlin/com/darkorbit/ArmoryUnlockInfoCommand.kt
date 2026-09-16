package com.darkorbit

interface ArmoryUnlockInfoCommand : ProtocolPacket {
	var canReset: Boolean
	var claimInfoGroupCommands: MutableList<ArmoryUnlockClaimInfoGroupCommand>
	var eventRemainSeconds: Int
	var normal: ArmoryUnlockLootShowListCommand
	var selectedClaimInfoGroupCommand: MutableList<ArmoryUnlockClaimInfoCommand>
	var selectedGroup: Int
	var specials: MutableList<ArmoryUnlockLootShowListCommand>
}
