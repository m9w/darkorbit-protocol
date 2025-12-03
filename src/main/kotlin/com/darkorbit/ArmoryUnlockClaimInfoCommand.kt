package com.darkorbit

interface ArmoryUnlockClaimInfoCommand : ProtocolPacket {
	var canClaim: Boolean
	var claimed: Boolean
	var currentProgress: Int
	var desc: String
	var index: Int
	var lootAmount: Int
	var lootId: String
	var progressQuantity: Int
	var special: Boolean
}
