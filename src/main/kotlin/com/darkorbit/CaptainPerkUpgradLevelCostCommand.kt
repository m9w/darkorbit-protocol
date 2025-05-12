package com.darkorbit

interface CaptainPerkUpgradLevelCostCommand : ProtocolPacket {
	var amount: Int
	var lootId: String
}
