package com.darkorbit

interface CaptainPerkCommand : ProtocolPacket {
	var level: Int
	var levelMax: Int
	var perkDrain: Int
	var perkId: Int
	var perkModifier: Float
	var perkTypeId: String
	var upgradLevelList: MutableList<CaptainPerkUpgradLevelCommand>
}
